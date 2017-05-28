/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test03 <br />
 * Java001 問3の解答例 <br />
 *
 * コンソール表示 <br />
 * コンソールに表示する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
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

    // コンソールに文字列を出力（方法①）
    // 一番スタンダードな方法。
    System.out.println( "2017年06月23日(Fri)" );
    System.out.println( "Javaの演習問題です。" );
    System.out.println( "eclipseで色々と試行錯誤しながら進めてみましょう。" );
    System.out.println( "よろしくお願いします。" );
    System.out.println( "" );

    // コンソールに文字列を出力（方法②）
    // 特に文字列の変数が多い場合などは、StringBuilderで結合して一括出力する方法も良く使う。
    StringBuilder sb = new StringBuilder();
    sb.append( "2017年06月23日(Fri)\n" );
    sb.append( "Javaの演習問題です。\n" );
    sb.append( "eclipseで色々と試行錯誤しながら進めてみましょう。\n" );
    sb.append( "よろしくお願いします。" );

    System.out.println( sb );
    System.out.println( "" );

    // コンソールに文字列を出力（方法③）
    // 単純に文字列を "+" で結合して一括出力しても同じ結果が得られる。
    String str = "";
    str += "2017年06月23日(Fri)\n";
    str += "Javaの演習問題です。\n";
    str += "eclipseで色々と試行錯誤しながら進めてみましょう。\n";
    str += "よろしくお願いします。";

    System.out.println( str );
    System.out.println( "" );

    //メソッド内の本文の先頭行と末尾行に空行を挿入すると、
    //可読性が上がる。以降の各クラスとも同様。

  }
}
