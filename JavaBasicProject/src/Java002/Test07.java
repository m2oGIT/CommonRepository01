/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test07 <br />
 * Java002 問1の解答例 <br />
 * 加算処理 <br />
 * 1～100までの数値をループで回して、加算する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class Test07 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test07() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * 1～100までの数値をループで回して、加算する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 合計
    int sum = 0;
    // 1～100までの数値をループで回して、加算する
    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
      // お好みで途中経過の表示を。
      System.out.println( "i: " + i + " sum: " + sum );
    }

    // 合計の表示
    System.out.println( "1～100までの合計は" + sum + "です。" );

  }

  /**
   * Java002 問5の解答例 <br />
   * 引数をループで回して、加算する <br />
   *
   * @param num1 第一引数
   * @param num2 第二引数
   * @return sum 計算結果
   */
  public static int addNum( int num1, int num2 ) {

    // 合計
    int sum = 0;
    // 1～100までの数値をループで回して、加算する
    for ( int i = num1; i <= num2; i++ ) {
      sum += i;
      // お好みで途中経過の表示を。
      System.out.println( "i: " + i + " sum: " + sum );
    }

    // 合計した値を返す
    return sum;
  }
}
