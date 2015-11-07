
package Interface;

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

    // Interfaceクラス自体は、インスタンスを生成できない。
    // InterfaceSample org = new InterfaceSample();
    ImplementsSample ipm = new ImplementsSample();

    // 実装したメソッドを実行。
    ipm.displayMsg();

    // 実装したメソッドを実行。
    ipm.changeMsg( "継承先でメッセージを更新しました。" );

    // メンバ変数の値を確認。
    ipm.displayMsg();

    // 実装したメソッドを実行。
    ipm.displayDate();

    // 実装先クラスで追加したメソッドを実行。
    ipm.displayTime();


    /** やはりクラスの共通する内容を切り出すことで、全体のコード量が減り、改修漏れ等も防げるため保守性が向上する。 **/

    /** 但し、abstractクラスとは異なり、各メソッドの内容は実装先クラスに一任される。 **/
    /** よってinterfaceの名の通り、インターフェースを複数クラス間で共有したい場合にinterfaceクラスを使用する。 **/
  }
}
