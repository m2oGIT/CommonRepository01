/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test09 <br />
 * Java002 問3の解答例 <br />
 * 加算処理 <br />
 * 1～実行時引数までの数値をループで回して、加算する <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class Test09 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test09() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * 1～実行時引数までの数値をループで回して、加算する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 実行時引数をString型からint型へ型変換する
    // 実行時引数なし　もしくは数値以外の場合は例外が発生する
    int num = Integer.parseInt( args[0] );
    // 合計
    int sum = 0;
    // 1～実行時引数までの数値をループで回して、加算する
    for ( int i = 1; i <= num; i++ ) {
      sum += i;
      // お好みで途中経過の表示を。
      System.out.println( "i: " + i + " sum: " + sum );

    }

    // 合計の表示
    System.out.println( "1～" + num + "までの合計は" + sum + "です。" );

  }
}
