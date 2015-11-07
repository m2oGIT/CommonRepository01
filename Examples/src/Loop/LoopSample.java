
package Loop;

/**
 * ループ文の使い方 <br />
 * for/while/do whileを使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class LoopSample {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    /** for文 **/

    // 最もシンプル／基本的なJavaの繰り返し文。
    for ( int i = 0; i < 10; i++ ) {
      System.out.println( "iの値を表示します。 " + i );
    }

    System.out.print( "\n" );


    /** while文 **/

    // 継続条件が明確である場合にシンプルに表記できる。
    int i = 0;
    while ( i < 10 ) {
      System.out.println( "iの値を表示します。 " + i );
      i++;
    }

    System.out.print( "\n" );


    /** do while文 **/

    // 継続条件を繰り返し処理後に評価する。＝条件を満たすかに関わらず、最低１回は実行される。
    i = 0;
    do {
      System.out.println( "iの値を表示します。 " + i );
      i++;
    } while ( i < 0 );

    System.out.print( "\n" );


    /** 強制的にループから抜ける場合は"break;"、繰り返しを継続する場合は"continue;"を記述する。 **/
  }
}
