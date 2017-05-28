/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test05 <br />
 * Java001 問5の解答例 <br />
 *
 * コンソール表示 <br />
 * コンソールに表示する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class Test05 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test05() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * 複数の文字列を起動時引数に渡して、コンソールに表示する <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // 起動時引数で与えた任意の文字列を表示する
    // 起動時引数はメニューの「実行構成」＞「引数」から入力。
    // 個々の文字列は"" "" "" ・・・で囲むこと。
    System.out.println( args[0] );
    System.out.println( args[1] );

    // なお、起動時引数の要素数は動的であり、起動時に幾つ渡されたかで確定する。
    System.out.println( args.length );

    // この特性を利用し、より柔軟にコーディングするなら以下の通り。
    for ( int i = 0; i < args.length; i++ ) {
      System.out.println( args[i] );
    }
  }
}
