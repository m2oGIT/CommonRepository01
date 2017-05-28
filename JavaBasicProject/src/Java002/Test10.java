/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test10 <br />
 * Java002 問5の解答例 <br />
 * 加算処理 <br />
 * 渡された2種類の整数の間の数をすべて合計する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class Test10 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test10() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * 渡された2種類の整数の間の数をすべて合計する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 実行時引数をString型からint型へ型変換する
    int arg1 = Integer.parseInt( args[0] );
    int arg2 = Integer.parseInt( args[1] );
    
    // 第一引数と第二引数の大小関係に影響させない考慮（三項演算子）
    int num1 = arg1 <= arg2 ? arg1 : arg2;
    int num2 = arg1 >= arg2 ? arg1 : arg2;

    // Test07に新規メソッドを作成した場合は、以下の通り。
    int sum = Test07.addNum( num1, num2 );
    System.out.println( "" );

    // Test10に新規メソッドを作成した場合は、以下の通り。
    sum = addNum( num1, num2 );
    System.out.println( "" );

    System.out.println( num1 + "～" + num2 + "までの合計は" + sum + "です。" );
  }

  /**
   * 渡された2種類の整数の間の数をすべて合計する <br />
   *
   * @param num1 第一引数
   * @param num2 第二引数
   * @return sum 計算結果
   */
  public static int addNum( int num1, int num2 ) {

    // 合計
    int sum = 0;
    // num1～num2までの数値をループで回して、加算する
    for ( int i = num1; i <= num2; i++ ) {
      sum += i;
      // お好みで途中経過の表示を。
      System.out.println( "i: " + i + " sum: " + sum );

    }

    // 合計した値を返す
    return sum;

  }
}
