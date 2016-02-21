/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test08 <br />
 * Java002 問2の解答例 <br />
 * 加算処理 <br />
 * 1～100までの数値をループで回し、奇数の場合は加算する <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class Test08 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test08() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * 1～100までの数値をループで回す。奇数の場合、加算する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 合計
    int sum = 0;
    // 1～100までの数値をループで回す
    for ( int i = 1; i <= 100; i++ ) {
      // 奇数の場合、加算する
      // 剰余(%)が「1」なら奇数、「0」なら偶数、というロジック。
      if ( i % 2 == 1 ) {
        sum += i;
        // お好みで途中経過の表示を。
        System.out.println( "i: " + i + " sum: " + sum );
      }
    }

    // 合計を表示
    System.out.println( "1～100までの奇数の合計は" + sum + "です。" );

  }
}
