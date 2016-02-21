/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test03 <br />
 * Java001 問2の解答例 <br />
 *
 * コンソール表示 <br />
 * コンソールに表示する <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class Test03 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test03() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動します。 <br />
   * コンソールに表示する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 次の文字列が１度の実行で表示される
    System.out.println( "2015年11月01日(Sun)" );
    System.out.println( "Javaの演習問題です。" );
    System.out.println( "eclipseで色々と試行錯誤しながら進めてみましょう。" );
    System.out.println( "よろしくお願いします。" );

    //メソッド内の本文の先頭行と末尾行に空行を挿入すると、
    //可読性が上がる。以降の各クラスとも同様。

  }
}
