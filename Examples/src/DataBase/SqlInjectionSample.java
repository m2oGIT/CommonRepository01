
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * SQLインジェクションの実例（Statement） <br />
 * Statementクラスの持つ脆弱性のサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SqlInjectionSample {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // インジェクション（Injection）は「注入、流入」といった意味。
    // プログラム仕様の欠陥を突き、開発者の意図しないSQLを実行する。
    // Statementクラスには「特定のパラメータ時にWHERE句以下の条件指定が無視される」という欠陥がある。

    // DB関連インスタンスを生成。
    Statement stmt = null;
    Connection conn = null;
    // ResultSetは検索結果格納用のライブラリクラス。
    ResultSet rs = null;

    // 例えば以下のように、Select文を「パラメータ」と「パラメータ以外(本体)」で分けて保持し、
    // パラメータの値はWeb画面等から入力された内容を格納するロジックであるとする。

    // 入力されたパラメータが開発者の想定内の値であれば問題ない。
    // String inputParam = "'あいうえお'";

    // 以下のように、SQL文に埋め込むことで特別な意味を持つ文字列をパラメータとして入力する。
    String inputParam = "' OR 'a' = 'a";

    // 本体とパラメータを結合し、1本のSQL文にする。
    String sqlSelect =
        "SELECT * FROM moeiwast_eiwatest_DB01.testTable WHERE name ='" + inputParam + "'";


    // 接続先DBの指定文字列。
    String url = "jdbc:mysql://m2o-eiwa.1strentalserver.info:3306/moeiwast_eiwatest_DB01";

    try {
      // ドライバをロードする。
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // Propertiesクラスへのセット。
      Properties props = new Properties();
      props.put( "user", "moeiwast_user01" );
      props.put( "password", "zaq12wsx_user01" );
      props.put( "useUnicode", "true" ); // 省略すると日本語が文字化けする。
      props.put( "characterEncoding", "SJIS" ); // 省略すると日本語が文字化けする。

      // 接続情報を元に、コネクションを生成。
      conn = DriverManager.getConnection( url, props );

      // コネクションからステートメント（SQL実行用オブジェクト）を生成。
      stmt = conn.createStatement();

      // SQLを実行。
      rs = stmt.executeQuery( sqlSelect );

      // 検索結果を表示する。（SQLインジェクションにより、全件が抽出されてしまう。）
      if ( rs != null ) {
        while ( rs.next() ) {

          // 値を取り出す。
          System.out.println( rs.getInt( "id" ) );
          System.out.println( rs.getString( "name" ) );
          System.out.println( rs.getString( "createdate" ) );
          System.out.println( rs.getString( "client" ) );
          System.out.println( rs.getString( "address" ) );
          System.out.println( "" );
        }
      }

      // 検索結果のクローズ。
      if ( rs != null ) {
        rs.close();
      }
      // ステートメントをクローズする。
      stmt.close();

      // エラー発生時はエラーの内容を表示。
    } catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException:" + e.getMessage() );
    } catch ( SQLException e ) {
      System.out.println( "SQLException:" + e.getMessage() );
    } catch ( Exception e ) {
      System.out.println( "Exception:" + e.getMessage() );

    } finally {
      try {
        // コネクションをクローズ。
        if ( conn != null ) {
          conn.close();
        }
      } catch ( SQLException e ) {
        System.out.println( "SQLException:" + e.getMessage() );
      }
    }

    /** この例の場合、文字列結合後の条件句は次のようになる。WHERE name ='' OR 'a' = 'a'。 **/
    /** 「nameが空文字 OR 'a' = 'a' である場合」つまり、OR以下が「常に真」となり、 **/
    /** WHERE句指定が無いのと同義に解釈され、強引にテーブル上の全件が抽出される。 **/

    /** 一方のPreparedStatementは「?」の仲介により、シングルクォテーションを用いない記法となることから、 **/
    /** この問題を回避できる（setObject()に同様の文字列をセットしSelect文を実行しても、検索結果はゼロ件となる）。 **/


    /** 他に脆弱性を突いたセキュリティ攻撃としては、以下が知られている。 **/
    /**  ・XSS（クロスサイトスクリプティング：Webページに悪意のあるスクリプトを埋め込む） **/
    /**  ・バッファオーバーフロー（意図的にメモリ領域のオーバーフローを引き起こし、悪意のあるコードを実行する） **/
    /**  ・DOS攻撃（Denial of Services attack：大量のトラフィックを送信し、サービスを停止させる） **/

    /** これらセキュリティホールへの対策として、 **/
    /**  「入力チェックを作りこむ ＝ 不正な値は初めから内部に入れさせない」 **/
    /**  「サニタイジング（無害化、無効化） ＝ 不正な値を無害な値に変換する（PreparedStatement）」 **/
    /**  「JavaScriptによる画面操作の制御」 など、アプリの設計時点でセキュリティについて意識・検討することが重要である。**/

    /**  ⇒ セキュリティの脆さを表現した有名な言葉 "WeakestRink"（鎖＝安全性は最も耐久度の弱い箇所で切れる）に留意すること。**/

  }
}
