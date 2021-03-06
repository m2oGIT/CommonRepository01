
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * ローカルDB接続版 <br />
 * DBアクセッサの使い方（PreparedStatement） <br />
 * PreparedStatementクラスを使用した基本的な文法 <br />
 * 更新履歴 2016/07/23 山本 高志：新規作成 <br />
 */
public class PreparedStatementSample_Local {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public PreparedStatementSample_Local() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // PreparedStatementクラスは最も使用頻度の高いDBアクセスクラス。
    // 業務プログラムでは通常こちらを使用する。

    // DB関連インスタンスを生成。
    PreparedStatement pstmt = null;
    Connection conn = null;
    // ResultSetは検索結果格納用のライブラリクラス。
    ResultSet rs = null;
    int count = 0;

    // SQL文を文字列で記述する。
    // PreparedStatementはvalueを一旦「?」で仮置きして仲介させる点が特徴（Statementクラスの持つ脆弱性への対策）。
    String sqlSelect = "SELECT * FROM moeiwast_eiwatest_DB01.test_table";
    String sqlInsert = "insert into moeiwast_eiwatest_DB01.test_table"
        + " ( INT_NUM, NAME_STR, DBL_NUM, CREATE_DATE ) values ( ?, ?, ?, ? )";

    // 接続先DBの指定文字列（DB製品ごとに原則定型）。
    // ローカルDBを接続先とする場合。
    String url = "jdbc:mysql://localhost:3306/moeiwast_eiwatest_DB01";

    try {
      // ドライバ（opt/mysql-connector-java-5.1.36-bin.jar）をロードする。
      // eclipseのプロジェクト＞プロパティー＞ビルドパス＞ライブラリからドライバjarの格納先を設定しておくこと。
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // MySQLの場合、以下のように文字コード指定を含む接続情報を
      // PropertiesクラスにセットしてConnectionクラスに渡す。
      Properties props = new Properties();

      props.put( "useUnicode", "true" ); // 省略すると日本語が文字化けする。
      props.put( "characterEncoding", "SJIS" ); // 省略すると日本語が文字化けする。
      // �AローカルDBを接続先とする場合。
      props.put( "user", "root" );
      props.put( "password", "root" );


      // 接続情報を元に、コネクションを生成。
      conn = DriverManager.getConnection( url, props );

      // コネクションからステートメント（SQL実行用オブジェクト）を生成。
      pstmt = conn.prepareStatement( sqlSelect );
      // pstmt = conn.prepareStatement( sqlInsert );


      // パラメータオブジェクトをセット。仮置きしていた「?」から具体的な値に置き換えている。
      // ローカルDBのtest_tableを接続先とする場合。
      // pstmt.setObject( 1, 54321 );
      // pstmt.setObject( 2, "サンプルコードから登録" );
      // pstmt.setObject( 3, 123.123 );
      // pstmt.setObject( 4, "2016/07/23" );

      // SQLを実行。
      // 参照系（Select）と更新系でメソッドが異なる。
      rs = pstmt.executeQuery();
      // count = pstmt.executeUpdate();


      // 検索結果を表示する。（executeQuery実行時）
      // ResultSetは表形式のオブジェクト。
      // デフォルトは"0行目(データなし)"を指しており、rs.next()を実行する度に1行進む。
      if ( rs != null ) {
        while ( rs.next() ) {

          // カラムの型に合わせてgetInt()/getStringで値を取り出す。
          System.out.println( rs.getInt( "INT_NUM" ) );
          System.out.println( rs.getString( "NAME_STR" ) );
          System.out.println( rs.getString( "DBL_NUM" ) );
          System.out.println( rs.getString( "CREATE_DATE" ) );
          System.out.println( "" );
        }
      }

      // 更新件数を表示する。（executeUpdate実行時）
      if ( count != 0 ) {
        System.out.println( "更新が完了しました。" + count + " 件を更新しました。" );
      }


      // Streamと同様、末尾で明示的にクローズ処理を記述するのがお作法。
      // 検索結果のクローズ。
      if ( rs != null ) {
        rs.close();
      }
      // ステートメントをクローズする。
      pstmt.close();

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

    /** 使用するライブラリクラスの種類が多く丸暗記が難しいため、サンプルを元にコピー作成でも問題ない。 **/
  }
}
