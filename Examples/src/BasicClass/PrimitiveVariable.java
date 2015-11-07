
package BasicClass;

/**
 * プリミティブな型の使い方 <br />
 * プリミティブな型を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class PrimitiveVariable {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public PrimitiveVariable() {
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

    // プリミティブ（primitive）：原子の、始祖の、という意味。
    // 最もシンプル／基本的なJavaの変数の型が用意されている。
    // 数値型の演算は +(和算)、-（減算）、*（乗算）、/（除算） で行う。

    // int：整数型（4バイト符号付整数。-2147483648～2147483647）
    int num1 = 10;
    int num2 = 20;
    int sum1 = num1 + num2;
    System.out.println( "num1 + num2 の計算結果は " + sum1 + "です。" );

    // long：整数型（8バイト符号付整数。約-922京～約922京）
    long num3 = 3000000000000000000L; // 末尾に"L"を明記する。省略時は暗黙でint値に変換される。
    long num4 = 4000000000000000000L;
    long sum2 = num3 + num4;
    System.out.println( "num3 + num4 の計算結果は " + sum2 + "です。" );

    // double：実数型（8バイト浮動小数点数）
    double num5 = 5.55555;
    double num6 = 6.66666;
    double sum3 = num5 + num6;
    System.out.println( "num5 + num6 の計算結果は " + sum3 + "です。" );

    // 但し、double型は特定の演算時に丸め誤差（byte換算できない演算を丸める）が発生し得るため、
    // Javaで実数値を扱う場合はオブジェクト型（クラス型とも言う）である「BigDecimal」を使用する場合が多い。


    // char：文字型（2バイトUNICODE文字。'\u0000'～'\uffff'）
    char ch1 = 'a'; // 半角or全角の１文字だけを格納できる。
    char ch2 = 'あ';
    System.out.println( "ch1は " + ch1 + "です。" + "ch2は " + ch2 + "です。" );

    // String：文字列型（通常、文字を扱う場合はString型を用いる。）
    String str1 = "abcdefgあいうえおＡＢＣＤＥＦＧ";
    String str2 = "1234567890";
    String str3 = str1 + str2; // "+"演算子で文字列を結合できる。
    System.out.println( "str1 + str2 の結合結果は " + str3 + "です。" );

    // 厳密にはStringはオブジェクト型だが、特例的にプリミティブ型とほぼ同等の扱いになっている。


    // boolean：真偽型（真偽値。true または false。内部的には 1 または 0 と同義。）
    boolean flg1 = true;
    boolean flg2 = false;
    System.out.println( "flg1は " + flg1 + "です。" + "flg2は " + flg2 + "です。" );


    /** 上記以外にもプリミティブな型が用意されている。詳細はとほほ等を参照のこと。 **/
  }
}
