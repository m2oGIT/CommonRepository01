
package Constructor;


/**
 * コンストラクタの使い方 <br />
 * コンストラクタのサンプル（実装側） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ConstructorSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ConstructorSample() {
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

    //自作クラスのコンストラクタを呼び出す。
    MyCar1 mycar1 = new MyCar1();
    System.out.println( "mycar1.getNum(): " + mycar1.getNum() ); // 初期処理なし。


    //自作クラスのコンストラクタを呼び出す。
    MyCar2 mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // 初期処理あり。


    //自作クラスのコンストラクタを呼び出す。
    MyCar3 mycar3 = new MyCar3();
    System.out.println( "mycar3.getNum(): " + mycar3.getNum() ); // 初期処理として初期処理なしクラスの値を設定。


    // 例えばmycar2のnumを適当な値で書き換える。
    mycar2.setNum( -999999999 );
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() );

    // newすることでコンストラクタが再度実行される。
    mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() );


    /**明示的な初期化の他、
     * インスタンス生成時に必ず実行したい処理をコンストラクタに記述しておくと良い。**/
  }
}
