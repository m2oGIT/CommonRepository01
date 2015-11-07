
package BasicClass;

import java.math.BigDecimal;

import Inheritance.ExtendsSample;
import Inheritance.NomalExtendsSample;

/**
 * 型の応用的な使い方 <br />
 * プリミティブな型とオブジェクト型を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SampleExtraVariable {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    /** 型の変換は、変換用メソッドがあればそれを、なければキャストで行う。 */

    // 整数型⇒文字列型への変換
    int num1 = 100;
    String str1 = "";
    // str1 = num1; // これはコンパイルエラー。
    str1 = String.valueOf( num1 ); // 文字列型への変換はStringクラスのvalueOf()メソッドを実行する。

    // 変換結果の確認
    System.out.println( "str1：" + str1 );


    // 文字列型⇒整数型への変換
    String str2 = "123456";
    int num2 = 10;
    // str2 = num2; // これはコンパイルエラー。
    num2 = Integer.parseInt( str2 ); // 数値型への変換はIntegerクラスのparseInt()メソッドを実行する。

    // 変換結果の確認
    System.out.println( "num2：" + num2 );


    // 整数型⇒実数型
    int num3 = 300;
    BigDecimal bd1 = BigDecimal.ZERO;
    // bd = num3; // これはコンパイルエラー。
    bd1 = BigDecimal.valueOf( num3 ); // 実数型への変換はBigDecimalクラスのvalueOf()メソッドを実行する。

    // 変換結果の確認
    System.out.println( "bd1：" + bd1 );


    // 実数型⇒文字列
    BigDecimal bd2 = new BigDecimal( "0.9876543210" );
    String str3 = "";
    String str4 = "";
    // str3 = bd2; // これはコンパイルエラー。
    str3 = String.valueOf( bd2 ); // Stringクラスの変換メソッドを実行する。
    str4 = bd2.toPlainString(); // BigDecimalクラスの変換メソッドを実行する。

    // 変換結果の確認
    System.out.println( "str3：" + str3 );
    System.out.println( "str4：" + str4 );



    /** 型の変換は、変換用メソッドがあればそれを、なければキャストで行う。 */

    // 例として、Object型から変数に格納された型への明示的な変換。
    Object obj1 = "オブジェクト文字列";
    String str5 = "";
    str5 = ( String ) obj1;
    System.out.println( "str5：" + str5 );

    // Object型自体は、キャスト不要でどんな型の値も代入可能。
    // 一見、便利に見えるが裏を返すと「不正な値を代入してもコンパイルエラーにならない。」ということ。
    Object obj2 = null;
    String str6 = "文字列型に格納された文字列";
    obj2 = str6;
    System.out.println( "obj2：" + obj2 );

    // ロジック観点では、「その変数に何型の値が格納されているのか」が保証されなくなってしまうため、
    // あえてObject型にすべき明確かつ必要十分な理由がない限りは、使用すべきではない。

    // 以下はキャストとObject型の誤用に起因した実行時エラーの例。
    // Integer.parseInt( ( String )obj2 );



    /** 参考までに、継承関係にあるクラスのインスタンス同士は変換なしで代入可能 */
    ExtendsSample ext = new ExtendsSample();
    NomalExtendsSample next = new NomalExtendsSample();
    // 共通のメンバを保持している、という継承の前提になりたつ代入。
    // 例えば、「同一の抽象クラスを継承した画面オブジェクト間で、インスタンごと受け渡したい」といった場面で便利。
    ext = next;
    ext.displayDate();


    /** なお、安易な型の変換は実行時エラーの温床となりやすい（特にキャストは強引に変換してしまうこともある）。 **/
    /** 考え方としては、初めから型変換の少ないロジックを組むことがベスト。 **/
  }
}
