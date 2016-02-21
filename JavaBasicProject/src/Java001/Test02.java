/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test02 <br />
 * Java001 問1の解答例 <br />
 *
 * コンソールに文字列を出力 <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class Test02 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test02() {
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

    // コンソールに文字列を出力
    System.out.println( "Hello Wolrd!!" );
    System.out.println( "" );

    // コンソールに文字列を出力（方法①）
    // 一番スタンダードな方法。
    System.out.println( "ようこそJava勉強会へ。" );
    System.out.println( "これは2つ目のJavaプログラムです。" );
    System.out.println( "一度の実行で複数行コンソール出力してみましょう。" );
    System.out.println( "" );

    // コンソールに文字列を出力（方法②）
    // 特に文字列の変数が多い場合などは、StringBuilderで結合して一括出力する方法も良く使う。
    StringBuilder sb = new StringBuilder();
    sb.append( "ようこそJava勉強会へ。\n" );
    sb.append( "これは2つ目のJavaプログラムです。\n" );
    sb.append( "一度の実行で複数行コンソール出力してみましょう。" );

    System.out.println( sb );
    System.out.println( "" );

    // コンソールに文字列を出力（方法③）
    // 単純に文字列を "+" で結合して一括出力しても同じ結果が得られる。
    String str = "";
    str += "ようこそJava勉強会へ。\n";
    str += "これは2つ目のJavaプログラムです。\n";
    str += "一度の実行で複数行コンソール出力してみましょう。";

    System.out.println( str );
    System.out.println( "" );

    // 実行時引数の出力
    System.out.println( args[0] );

  }

}
