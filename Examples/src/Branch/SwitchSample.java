
package Branch;

/**
 * selectの基本的の使い方 <br />
 * select文を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SwitchSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public SwitchSample() {
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

    // 評価対象
    int num = 1;

    // 構文的に分岐の条件が見やすい。
    switch ( num ) {
      case 1:
        System.out.println( "numは 1です。" );
        break; // break;を書かないと、合致した以降のcaseが全て実行されてしまう。
      case 2:
        System.out.println( "numは 2です。" );
        break;
      case 3:
        System.out.println( "numは 3です。" );
        break;
      default: //if分でのelseに相当。
        System.out.println( "numは その他の値です。" );
    }


    // 評価対象
    String str = "aaa";

    //JDK6.0まで評価対象はint型のみ許容されていた。
    //JDK7.0からString型も使用可能となった。
    //ただし、6.0以前の旧来の実行環境で動かすとエラーになるので注意。
    //double等のプリミティブ型、BigDecimal等の一連のオブジェクト型は7.0以降も使用不可。
    switch ( str ) {
      case "aaa":
        System.out.println( "strは \"aaa\"です。" );
        break;
      case "bbb":
        System.out.println( "strは \"bbb\"です。" );
        break;
      case "ccc":
        System.out.println( "strは \"ccc\"です。" );
        break;
      default:
        System.out.println( "strは その他の値です。" );
    }

    /** if文とswitch文どちらを使うかは基本的には好みの問題。**/
    /** switch文には型の制約があることから、業務プログラムでは圧倒的にif文が多い。 **/
     }
}
