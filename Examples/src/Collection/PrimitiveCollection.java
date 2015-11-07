
package Collection;

/**
 * プリミティブな配列の使い方 <br />
 * プリミティブな配列を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class PrimitiveCollection {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 最もシンプル／基本的なJavaの配列。
    // 通常の変数宣言に配列であることを意味する"[]"を付与する。
    // 宣言時に要素数を指定する必要がある。

    // int：整数型
    int[] ary1 = new int[5];
    ary1[0] = 0; // 要素数はゼロ起算。
    ary1[1] = 10;
    ary1[2] = 20;
    ary1[3] = 30;
    ary1[4] = 40;

    for ( int i = 0; i < ary1.length; i++ ) {
      System.out.println( "ary1[" + i + "]：" + ary1[i] );
    }

    System.out.println( "" );

    // あるいは以下のような宣言も可能だが、宣言時に要素数を指定する点は同じ。
    int[] ary2 = {
        0, 100, 200, 300, 400
    };

    for ( int i = 0; i < ary2.length; i++ ) {
      System.out.println( "ary2[" + i + "]：" + ary2[i] );
    }

    System.out.println( "" );

    // int型以外にも適用可能。
    char[] ary3 = {
        '春', '夏', '秋', '冬'
    };

    for ( int i = 0; i < ary3.length; i++ ) {
      System.out.println( "ary4[" + i + "]：" + ary3[i] );
    }

    System.out.println( "" );

    // オブジェクト型も同様に配列化が可能。
    String[] ary4 = {
        "日本", "アメリカ", "フランス", "ドイツ", "中国"
    };

    for ( int i = 0; i < ary4.length; i++ ) {
      System.out.println( "ary3[" + i + "]：" + ary4[i] );
    }

    System.out.println( "" );

    // []を複数宣言することで多次元配列となる。
    // プログラムの可読性が下がるため、使用時は慎重に使う。
    int[][] ary5 = new int[2][2];
    ary5[0][0] = 0;
    ary5[0][1] = 10;
    ary5[1][0] = 20;
    ary5[1][1] = 30;

    //次元数に比例し、indexの制御が煩雑になる。
    for ( int i = 0; i < ary5.length; i++ ) {
      for ( int j = 0; j < ary5.length; j++ ) {
        System.out.println( "ary5[" + i + "][" + j + "]：" + ary5[i][j] );
      }
    }

    System.out.println( "" );

    /**
     * 「動的に要素数を変更できない」というデメリットがあるため、 主に簡易(プリミティブ)なロジックで使用される。
     **/
  }
}
