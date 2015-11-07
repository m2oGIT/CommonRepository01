
package Static;


/**
 * staticの使い方 <br />
 * staticのサンプル（実装側） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class StaticSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public StaticSample() {
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

    // 自作クラス（static）を呼び出す。
    // MyCar1 mycar1 = new MyCar1();
    System.out.println( "MyCar1.getNum(): " + MyCar1.getNum() ); // staticなメソッドはクラス名.メソッド名で直接アクセス。

    MyCar1.setNum( 55555555 );
    System.out.println( "MyCar1.getNum(): " + MyCar1.getNum() ); // 値は常に一つの物を共用する。


    // 自作クラス（非static）を呼び出す。
    MyCar2 mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // 非staticなメソッドはインスタンス経由でアクセス。
    // System.out.println( "mycar1.getNum(): " + MyCar2.getNum() ); //直接参照はコンパイルエラーとなる。


    // 新規インスタンスを生成
    MyCar2 mycar3 = new MyCar2();
    // インスタンスmycar2のnumを更新
    mycar2.setNum( 0 );
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // 非staticな値はインスタンスごとに保持される。
    System.out.println( "mycar3.getNum(): " + mycar3.getNum() ); // 別のインスタンスにおける状態は他のインスタンスに影響しない。



    /**
     * 使い分けの目安として、 「Utilityのような全体で共通のメンバを１つ使い回せば事足りる場合」は「static」で宣言し。
     * それ以外の場合（あるいはインスタンス毎に値を保持したい場合）は「非static」で宣言する、と考える。
     **/
  }
}
