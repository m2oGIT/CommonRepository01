
package BasicClass;

/**
 * 比較文のサンプル <br />
 * 等号比較とequals()の違い <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SampleEquals {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public SampleEquals() {
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

    /** プリミティブ（primitive）な型の値の比較 **/
    // プリミティブな型の値の比較は、"==" で行う。

    // int型
    int num1 = 10;
    int num2 = 10;

    if ( num1 == num2 ) {
      System.out.println( "num1 と num2 は 同じ値です。" );
    } else {
      System.out.println( "num1 と num2 は 異なる値です。" );
    }

    // long型
    long num3 = 3000000000000000000L;
    long num4 = 4000000000000000000L;

    if ( num3 == num4 ) {
      System.out.println( "num3 と num4 は 同じ値です。" );
    } else {
      System.out.println( "num3 と num4 は 異なる値です。" );
    }

    // double型
    double num5 = 5.55555;
    double num6 = 6.66666;

    if ( num5 == num6 ) {
      System.out.println( "num5 と num6 は 同じ値です。" );
    } else {
      System.out.println( "num5 と num6 は 異なる値です。" );
    }

    // char：文字型
    char ch1 = 'a';
    char ch2 = 'あ';

    if ( ch1 == ch2 ) {
      System.out.println( "ch1 と ch2 は 同じ値です。" );
    } else {
      System.out.println( "ch1 と ch2 は 異なる値です。" );
    }

    // boolean：真偽型（真偽値。true または false。内部的には 1 または 0 と同義。）
    boolean flg1 = true;
    boolean flg2 = false;

    if ( flg1 == flg2 ) {
      System.out.println( "flg1 と flg2 は 同じ値です。" );
    } else {
      System.out.println( "flg1 と flg2 は 異なる値です。" );
    }

    // なお、if文の条件内でbooleanの"==true"比較は省略可能。頻出する表記。

    if ( flg1 ) { // if ( flg1 == true ) { と同義。
      System.out.println( "flg1 は trueです。" );
    } else {
      System.out.println( "flg1 は falseです。" );
    }

    // 異なる型での比較はコンパイルエラーとなる。
    // if ( ch1 == flg1 ) {
    // System.out.println( "num1 と num2 は 同じ値です。" );
    // } else {
    // System.out.println( "num1 と num2 は 異なる値です。" );
    // }
    // int⇔longのように暗黙で変換され比較可能な型もあるが、
    // 暗黙の変換は「桁が小さい方の型に寄せる（メモリoverflow対策）」ルールである場合が多く、
    // 桁落ちの可能性も考慮すると型は揃えた方が良い。


    /** オブジェクト型の値の比較 **/
    // オブジェクト型の値の比較は、"equals()メソッド で行う。
    // オブジェクト型に""==" を用いた場合、「アドレスが同一か？」の比較になり、値の比較とは別の意味になる。
    // 原則String型を含むオブジェクト型に対する値の比較はequals()メソッドで行うこと。

    // String：文字列型
    String str1 = "abcdefgあいうえおＡＢＣＤＥＦＧ";
    String str2 = "abcdefgあいうえおＡＢＣＤＥＦＧ";

    if ( str1.equals( str2 ) ) {
      System.out.println( "str1 と str2 は 同じ値です。" );
    } else {
      System.out.println( "str1 と str2 は 異なる値です。" );
    }

    // String：文字列型
    // new（インスタンス初期化）を行い、明示的に別アドレスに同じ値を格納する。
    String str3 = new String( "abcdefgあいうえおＡＢＣＤＥＦＧ" );
    String str4 = new String( "abcdefgあいうえおＡＢＣＤＥＦＧ" );

    // "=="比較でもコンパイルは通るが、値の比較はされない。
    // newせず値を格納した場合は、最適化により同一アドレスが参照される（"=="で同一と判定される）。
    // が、可読性が下がるため、オブジェクト型の値の比較は"equals()メソッド で行う。
    if ( str3 == str4 ) {
      System.out.println( "str3 と str4 は 同じ値です。" );
    } else {
      System.out.println( "str3 と str4 は 異なる値です。" );
    }

  }
}
