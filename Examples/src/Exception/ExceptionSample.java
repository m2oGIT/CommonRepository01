
package Exception;

/**
 * 例外処理の書き方 <br />
 * 例外に関する基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ExceptionSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ExceptionSample() {
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

    /** エラー処理はtry/catch/finallyで制御する。 **/

    // 意図的にnullを格納した変数を用意。
    String str = null;

    try { // 例外の発生し得る範囲をtry{}で囲む

      // null値の参照。
      str.length();

    } catch ( NullPointerException e ) { // 例外の種類をcatch()で指定し、{}に処理を記述する

      System.out.println( "NullPointerExceptionが発生しました。" );
      e.printStackTrace();

    } catch ( NumberFormatException e ) { // catch()は複数記述可能。＝例外の種類次第で対応処理を呼び分ける。

      System.out.println( "NumberFormatExceptionが発生しました。" );
      e.printStackTrace();

    } finally { // 例外の発生有無に関わらず実行する処理をfinally{}に記述

      System.out.println( " finallyブロックです。\n" );

    }


    try {

      // null値の参照。
      str.length();

    } catch ( Exception e ) {
      // 例外の種類に"Exception"を指定するとすべての種類の例外にヒットする。
      // が、通常は発生し得る例外の種類（と対応方法）を、設計ないしはコーディング時に予測・検討して実装すべき。
      // よって"Exception"での指定は「想定外の例外が発生した場合」という保険程度に考える。

      System.out.println( "何らかのExceptionが発生しました。" );
    }

  }

}
