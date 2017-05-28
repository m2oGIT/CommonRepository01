/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test04 <br />
 * Java001 問4の解答例 <br />
 *
 * コンソール表示 <br />
 * コンソールに表示する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class Test04 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test04() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * コンソールに表示する <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // 起動時引数で与えた任意の文字列を表示する
    System.out.println( args[0] );

  }
}
