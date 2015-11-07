
package Inheritance;

/**
 * 継承の使い方 <br />
 * 継承を利用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class InheritSample {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 抽象クラス自体は、インスタンスを生成できない。
    // AbstractSample org = new AbstractSample();
    ExtendsSample ext = new ExtendsSample();

    // 引き継いだメソッドを実行。
    ext.displayMsg();


    // 引き継いだメンバ変数を更新することも可能。
    ext.changeMsg( "継承先でメッセージを更新しました。" );

    // メンバ変数の値を確認。
    ext.displayMsg();


    // 継承先で追加したメソッドを実行。
    ext.clearMsg();

    // メンバ変数の値を確認。
    ext.displayMsg();


    // 継承先で編集したメソッドを実行。
    ext.displayDate();

    // 継承先で編集したメソッドのオリジナルを実行。
    ext.orgDisplayDate();

    /** クラスの共通する内容を切り出すことで、全体のコード量が減り、改修漏れ等も防げるため保守性が向上する。 **/

    /** 業務プログラムでは、類似する構成のクラスを複数作成する際に、雛形としてabstractクラスを使用する。 **/
    /** Webアプリの画面ロジックやバッチ処理のentityが良い例。 **/
    /** 改修時にabstractクラスのみ直せば、自動的に継承先の全クラスに適用される。 **/

    // 抽象クラス自体は、インスタンスを生成できない。
    NomalExtendsSample next = new NomalExtendsSample();

  }
}
