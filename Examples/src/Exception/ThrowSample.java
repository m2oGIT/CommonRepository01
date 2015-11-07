
package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 例外処理の書き方(応用編) <br />
 * 例外に関する応用的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ThrowSample {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    /** throw/throwsを使うことで、より高度な制御が可能。 **/
    /** ただ、自由度が高い分やや取っつきにくさもあり、Javaの特徴でありつつ弱点の一つともいわれる。 **/

    // 例外の発生する処理を実行。
    // subMethodA(); //実行時エラーが発生する。

    // 例外の発生する処理を実行。
    // subMethodB(); //throws宣言でFileNotFoundExceptionを委譲されており、try～catchを記述しないとコンパイルエラー

    // 例外の発生する処理を実行。
    // subMethodC();//throws宣言でExceptionを委譲されており、try～catchを記述しないとコンパイルエラー


    // 例外処理を実装していないエラーがmainメソッドに到達しcatchされないと、
    // 実行中の処理が強制終了する（＝mainメソッドが最上位のため "エラーを処理しきれなかった状態" となる）。
    // この行まで到達できない。
    System.out.println( "メインメソッドの末尾に到達しました。" );


    // throw/throwsを使用することで、例外処理の記述を特定クラスの特定メソッドに集約（委譲）することができる。

    // 業務プログラムでは、例外クラスを自前で用意⇒例外発生時は自前の例外クラスに集約⇒これをログ出力メソッドに渡す⇒例外情報をログに出力する

    // といった実装が良く採られる。

    // throw/throwsで集約（委譲）することで、例外処理の記述箇所が個々のプログラムに散らばることを防ぎ、

    // 一元管理が可能になる。＝システム／アプリ内で統一性をもって例外に対応できる。
  }

  /**
   * サブメソッドその１<br />
   * 例外が発生するメソッド（throws無し）。 <br />
   **/
  private static void subMethodA() {

    // 意図的にnullを格納した変数を用意。
    String str = null;
    // null値の参照。
    str.length();
    // 強制的に呼び出し元へ例外が投げられる。
  }

  /**
   * サブメソッドその２<br />
   * 例外が発生するメソッド（throws宣言あり）。 <br />
   *
   * @throws FileNotFoundException ファイルパスエラー
   **/
  private static void subMethodB() throws FileNotFoundException { // throwsで例外発生時には上位へ投げる宣言
    FileReader obj = new FileReader( "filename.txt" );
    // throws宣言した例外は当該メソッドではtry～catchを記述せず、上位（呼び出し元）に委譲する。
  }

  /**
   * サブメソッドその３<br />
   * 例外が発生するメソッド（throw/throws宣言あり）。 <br />
   *
   * @throws Exception 例外
   **/
  private static void subMethodC() throws Exception {

    try {
      FileReader obj = new FileReader( "filename.txt" );

    } catch ( FileNotFoundException e ) {

      // catchした例外を別の例外としてthrowし直す
      System.out.println( "FileNotFoundExceptionが発生しました。Exceptionに置き換えてthrowします。" );
      Exception e2 = e;
      throw e2; // throwで例外を上位に投げる。
    }
  }

}
