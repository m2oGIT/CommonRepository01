
package Branch;

/**
 * ifの基本的の使い方 <br />
 * if文を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class IfSample {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 評価対象
    int num = 1;

    // COBOLのEVALUATEと考え方は同じ。
    if ( num == 1 ) {
      System.out.println( "numは 1 です。" );

    } else if ( num == 2 ) {
      System.out.println( "numは 2 です。" );

    } else {
      System.out.println( "numは その他の値 です。" );
    }

    // 評価対象
    String str = "aaa";

    if ( "aaa".equals( str ) ) {
      System.out.println( "strは \"aaa\" です。" );

    } else if ( "bbb".equals( str ) ) {
      System.out.println( "strは \"bbb\" です。" );

    } else {
      System.out.println( "strは その他の値 です。" );
    }

    // "aaa".equals( str ) でも str.equals( "aaa" ) でも結果は同じ。
    // 後者の場合、strがnullの際にNullPointerExceptionが発生し、例外が発生する。
    // 前者の場合、strがnullでもNullPointerExceptionは発生しない。
    // strがnullであることを検知する必要があるロジックなら後者。それ以外は前者で実装する。

    // 評価対象
    num = 1;

    // "!"（NOT）は条件を反転させる。
    if ( !( num == 1 ) ) {
      System.out.println( "numは 1 ではありません。" );

    } else if ( !( num == 2 ) ) {
      System.out.println( "numは 2 ではありません。" );

    } else {
      System.out.println( "numは その他の値 です。" );
    }

    // "!="で"=="の否定を表す。
    if ( num != 1 ) {
      System.out.println( "numは 1 ではありません。" );

    } else if ( num != 2 ) {
      System.out.println( "numは 2 ではありません。" );

    } else {
      System.out.println( "numは その他の値 です。" );
    }

    // 複合も可能（反対の反対は賛成）。
    if ( !( num != 1 ) ) {
      System.out.println( "numは 1 です。" );

    } else if ( !( num != 2 ) ) {
      System.out.println( "numは 2 です。" );

    } else {
      System.out.println( "numは その他の値 です。" );
    }

  }
}
