/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package MySQL006;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import MySQL004.PropertyLoader;

/**
 * DB演習問題（MySQL006） <br />
 * 引数で渡されたSQLを実行するプログラムの実装例（DBアクセッサの実装） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class DBAccessor {

  /** SELECT文のPrefix */
  private static final String SELECT = "SELECT";

  /** INSERT文のPrefix */
  private static final String INSERT = "INSERT";

  /** UPDATE文のPrefix */
  private static final String UPDATE = "UPDATE";

  /** DELETE文のPrefix */
  private static final String DELETE = "DELETE";

  /** ローダーのインスタンス */
  private static PropertyLoader loader = null;

  /** DB接続プロパティのパス */
  private static final String DB_CONNECT_PROP = "run/properties/dbConnect.properties";

  /** SQLプロパティのパス */
  private static final String SQL_PROP = "run/properties/sql.properties";

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public DBAccessor() {
    // 行うべき処理なし。
  }

  /**
   * DBコネクション生成メソッド<br />
   * 指定された接続情報でDBに接続します。 <br />
   *
   * @param conn 接続前コネクション
   * @throws ClassNotFoundException ドライバロード例外
   * @throws IllegalAccessException 想定外アクセス例外
   * @throws InstantiationException ドライバインスタンス生成例外
   * @throws SQLException SQL例外
   * @return Connection 接続済みコネクション
   */
  public Connection createConnection( Connection conn )
      throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

    try {
      // プロパティファイルを読み込む。
      loader = new PropertyLoader( DB_CONNECT_PROP );
    } catch ( IOException e ) {
      e.printStackTrace();
    }

    // 接続先DBの指定文字列
    String url = loader.getValue( "url-info" );

    // ドライバをロード。
    Class.forName( loader.getValue( "driver-name" ) ).newInstance();

    // DB接続情報をセット。
    Properties props = new Properties();
    props.put( "user", loader.getValue( "user-id" ) );
    props.put( "password", loader.getValue( "pass-word" ) );
    props.put( "useUnicode", loader.getValue( "use-unicode" ) );
    props.put( "characterEncoding", loader.getValue( "char-code" ) );

    // 接続情報を元に、コネクションを生成。
    conn = DriverManager.getConnection( url, props );
    System.out.println( "コネクションを生成しました。" );

    // コネクションを返却。
    return conn;
  }

  /**
   * SQL生成メソッド<br />
   * 引数を元にSQLを生成します。 <br />
   *
   * @param args 起動時引数
   * @return createdQuery 作成済みのSQL文
   */
  public String createQuery( String[] args ) {

    try {
      // プロパティファイルを読み込む。
      loader = new PropertyLoader( SQL_PROP );
    } catch ( IOException e ) {
      e.printStackTrace();
    }

    // SQL格納用の変数
    String createdQuery = "";

    // 第１引数の値で分岐
    switch ( args[0] ) {
      case SELECT:
        createdQuery = loader.getValue( "SELECT-ALL" );
        break;
      case INSERT:
        createdQuery = loader.getValue( "INSERT-SINGLE" );
        break;
      case UPDATE:
        createdQuery = loader.getValue( "UPDATE-SINGLE" );
        break;
      case DELETE:
        createdQuery = loader.getValue( "DELETE-SINGLE" );
        break;
      default:
        createdQuery = "arags was unexpected";
    }
    // 生成したSQLを返却する
    return createdQuery;
  }

  /**
   * パラメーターバインドメソッド<br />
   * 引数を元にパラメーターバインドを行います。 <br />
   *
   * @param pstmt プリペアードステートメント
   * @param args 起動時引数
   * @throws SQLException SQL例外
   */
  public void setParamObject( PreparedStatement pstmt, String[] args ) throws SQLException {

    // INSERT文の場合
    if ( args[0].toUpperCase().startsWith( INSERT ) ) { // 小文字記述を考慮し、大文字に変換
      simpleDataBind( pstmt, args );
      System.out.println( "パラメータをバインドしました。" );

      // UPDATE文の場合
    } else if ( args[0].toUpperCase().startsWith( UPDATE ) ) {
      pstmt.setObject( 1, args[4] );
      pstmt.setObject( 2, args[1] );
      pstmt.setObject( 3, args[2] );
      pstmt.setObject( 4, args[3] );
      System.out.println( "パラメータをバインドしました。" );

      // DELETE文の場合
    } else if ( args[0].toUpperCase().startsWith( DELETE ) ) {
      simpleDataBind( pstmt, args );
      System.out.println( "パラメータをバインドしました。" );

      // 上記以外はバインドしない
    } else {
      System.out.println( "バインド処理をスキップしました。" );
    }
  }

  /**
   * パラメーターバインドメソッド<br />
   * 単純なバインド処理をループ可。 <br />
   *
   * @param pstmt プリペアードステートメント
   * @param args 起動時引数
   * @throws SQLException SQL例外
   */
  public void simpleDataBind( PreparedStatement pstmt, String[] args ) throws SQLException {

    // 起動引数分、バインドを実行する
    for( int i = 1; i < args.length; i++ ) {
      pstmt.setObject( i, args[i] );
    }

  }

  /**
   * SQL実行メソッド<br />
   * 指定されたSQLを実行します。 <br />
   *
   * @param pstmt 作成済みのステートメント
   * @param sqlStr 起動引数から生成されたSQL文
   * @throws SQLException SQL例外
   */
  public void execStatement( PreparedStatement pstmt, String sqlStr ) throws SQLException {

    // 結果格納用の変数
    ResultSet rs = null;
    int count = 0;

    // 参照系の場合
    if ( sqlStr.toUpperCase().startsWith( SELECT ) ) { // 大文字固定だが、念のため変換

      // SQLを実行
      rs = pstmt.executeQuery();
      System.out.println( "実行SQL : " + sqlStr + ";" );
      // 結果を表示
      dispResult( rs );

      // 更新系の場合
    } else if ( sqlStr.toUpperCase().startsWith( INSERT )
        || sqlStr.toUpperCase().startsWith( UPDATE )
        || sqlStr.toUpperCase().startsWith( DELETE ) ) {

      // SQLを実行
      count = pstmt.executeUpdate();
      System.out.println( "実行SQL : " + sqlStr + ";" );
      // 結果を表示
      System.out.println( "更新が完了しました。" + count + " 件を更新しました。" );

      // 上記以外はSQLを実行しない
    } else {
      System.out.println( "SQLは SELECT or INSERT or UPDATE or DELETE を指定してください。" );
    }

    // 検索結果のクローズ。
    if ( rs != null ) {
      rs.close();
    }
  }

  /**
   * 検索結果表示メソッド<br />
   * ResultSetを展開してコンソールに表示します。 <br />
   *
   * @param rs 検索結果
   * @throws SQLException SQL例外
   */
  private void dispResult( ResultSet rs ) throws SQLException {

    // カウント用変数
    int i = 1;
    // 検索結果を末尾まで表示する。
    if ( rs != null ) {
      System.out.println( "SQL実行結果" );
      while ( rs.next() ) {
        System.out.println( "[" + i + "件目]" );
        // カラムごとに値を取り出す。
        System.out.println( "STAFF_NO    : " + rs.getString( "STAFF_NO" ) );
        System.out.println( "OFFICE_CD   : " + rs.getString( "OFFICE_CD" ) );
        System.out.println( "STAFF_NAME  : " + rs.getString( "STAFF_NAME" ) );
        System.out.println( "WORK_TIME   : " + rs.getDouble( "WORK_TIME" ) );
        System.out.println( "CREATE_DATE : " + rs.getString( "CREATE_DATE" ) );
        System.out.println( "" );
        i++;
      }
    }
  }

}
