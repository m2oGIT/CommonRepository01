
package Utility;

/**
 * 自作ユーティリティクラスの使い方 <br />
 * 自作のユーティリティクラスを呼び出します。 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class UtilSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public UtilSample() {
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


    // 必須チェック
    System.out.println( "isNecessary あいうえお：" + StringUtil.isNecessary( "あいうえお" ) );
    System.out.println( "isNecessary 空文字：" + StringUtil.isNecessary( "" ) );


    // 数値文字チェック
    System.out.println( "isNumChar 0：" + StringUtil.isNumChar( '0' ) );
    System.out.println( "isNumChar 9：" + StringUtil.isNumChar( '9' ) );
    System.out.println( "isNumChar a：" + StringUtil.isNumChar( 'a' ) );
    System.out.println( "isNumChar ０：" + StringUtil.isNumChar( '０' ) );


    // 数値文字列チェック（文字コード値での実装）
    System.out.println( "isNumString 1234567890：" + StringUtil.isNumString( "1234567890" ) );
    System.out.println( "isNumString 1１２３４５６７８９０：" + StringUtil.isNumString( "１２３４５６７８９０" ) );
    System.out.println( "isNumString 1abcdefg：" + StringUtil.isNumString( "abcdefg" ) );
    //System.out.println( "空文字：" + StringUtil.isNumString( "" ) ); //nullチェックが必須となる


    // 数値文字列チェック（正規表現での実装）
    System.out.println( "isNumber 1234567890：" + StringUtil.isNumber( "1234567890" ) );
    System.out.println( "isNumber １２３４５６７８９０：" + StringUtil.isNumber( "１２３４５６７８９０" ) );
    System.out.println( "isNumber abcdefg：" + StringUtil.isNumber( "abcdefg" ) );
    System.out.println( "isNumber 空文字：" + StringUtil.isNumber( "" ) );


    // 日付チェック
    System.out.println( "isDate 2016/01/01：" + DateUtil.isDate( "2016/01/01" ) );
    System.out.println( "isDate 2016/01/32：" + DateUtil.isDate( "2016/01/32" ) );
    System.out.println( "isDate 20160101：" + DateUtil.isDate( "20160101" ) );
    System.out.println( "isDate 空文字：" + DateUtil.isDate( "" ) );


    // 和暦変換
    System.out.println( "formatJP 2016/01/01：" + DateUtil.formatJP( "2016/01/01" ) );
    System.out.println( "formatJP 2016/01/32：" + DateUtil.formatJP( "2016/01/32" ) );
    System.out.println( "formatJP 20160101：" + DateUtil.formatJP( "20160101" ) );
    System.out.println( "formatJP 空文字：" + DateUtil.formatJP( "" ) );


    // 西暦変換
    System.out.println( "formatAD 平成28年01月01日：" + DateUtil.formatAD( "平成28年01月01日" ) );
    System.out.println( "formatAD 平成28年01月32日：" + DateUtil.formatAD( "平成28年01月32日" ) );
    System.out.println( "formatAD 平成28年1月1日：" + DateUtil.formatAD( "平成28年1月1日" ) );
    System.out.println( "formatAD 空文字：" + DateUtil.formatAD( "" ) );


    // TimeStamp型変換
    System.out.println( "formatTS 2016/01/01 06:15:30：" + DateUtil.formatTS( "2016/01/01 06:15:30" ) );
    System.out.println( "formatTS 2016/01/32 06:15:30：" + DateUtil.formatTS( "2016/01/32 06:15:30" ) );
    System.out.println( "formatTS 2016/1/1：" + DateUtil.formatTS( "2016/1/1" ) );
    System.out.println( "formatTS 空文字：" + DateUtil.formatTS( "" ) );


    /** チェック処理や変換処理など、共通してよく使う処理を共通化しておくイメージ。 **/
  }
}
