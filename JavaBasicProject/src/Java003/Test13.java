/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * Test13 <br />
 * Java003 問3の解答例 <br />
 * 「*」の階段 <br />
 * 「*」の階段を画面表示する <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class Test13 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test13() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動する <br />
   * 「*」の階段を画面表示する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 多重ループで実装するパターン（直観的なロジック）

    // 「*」の階段を10段作成する
    for ( int i = 1; i <= 10; i++ ) {

      // iとjが等しくなるまで「*」を出力する
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( "*" );
      }
      // iがjより小さいとき改行する
      System.out.println();
    }


    // 単独ループで実装するパターン①（ロジックとしてはこちらがよりシンプル）

    // 文字列追加用の変数を宣言
    StringBuilder sb = new StringBuilder();

    // 「*」を1つずつ文字列として追加する
    for ( int i = 1; i <= 10; i++ ) {
      sb.append( "*" );
      // 追加結果を1行ずつ表示する
      System.out.println( sb );
    }


    // 単独ループで実装するパターン②（StringBuilderを使用しない場合）

    // 文字列変数を宣言
    String str = "";

    // 「*」を1つずつ文字列として結合する
    for ( int i = 1; i <= 10; i++ ) {
      str += "*";
      // 結合結果を1行ずつ表示する
      System.out.println( str );
    }

  }
}
