
package Stream;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入出力の使い方 <br />
 * stdin/stdoutを使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class InputOutputStream {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public InputOutputStream() {
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

    // UnixおよびUnixから派生したOSは。
    // 標準入力 (standard input)、標準出力 (standard output)、標準エラー出力 (standard error) の
    // 3つの入出力チャネルをインターフェースとして実装している。
    // Javaのライブラリクラスにはこれら標準入出力をサポートする機能が用意されている。


    /** 標準入力 (standard input/stdin) */
    // リダイレクトしない限り、標準入力はプログラムを起動した端末のキーボードになっている。
    int i = 0;
    System.out.print( "何か入力してください。Enter押下で終了します。>" );

    // 入力ストリームのインスタンスを仮で生成。
    InputStreamReader input = null;

    try {
      // InputStreamReaderクラスにSystem.inを渡すことで、コンソール入力待ちとなる。
      input = new InputStreamReader( System.in );

      // whileの条件をtrueにすると、無限ループとなる（break到達まで繰り返す）。
      while ( true ) {
        // read()でキーボードから入力された内容を１文字読み取る。
        i = input.read();
        // 改行コードでループを終了する。
        if ( i == '\n' ) {
          break;
        }
        // 改行コード以外なら１文字出力する。
        System.out.print( ( char ) i );

      }
      System.out.print( '\n' );


    } catch ( IOException e ) {

      // エラー時はスタックトレースを出力。
      System.out.println( e );

    } finally {

      // Streamは使用後にクローズする。
      // 開いたままでもプログラム終了時にJavaが暗黙のcloseを実行してくれるが、明示的に記述するのがお作法。
      try {
        input.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }


    /** 標準出力 (standard output/stdout) */
    // リダイレクトしない限り、標準出力はプログラムを起動した端末のディスプレイになっている。

    // System.out.print()・・・改行なし出力
    System.out.print( 'a' );
    System.out.print( 'b' );
    System.out.print( 'c' );
    System.out.print( '\n' );
    // System.out.println()・・・改行つきの出力
    System.out.println( 'a' );
    System.out.println( 'b' );
    System.out.println( 'c' );


    /** 標準エラー出力 (standard error/stderr) */
    // リダイレクトしない限り、標準エラー出力はプログラムを起動した端末のディスプレイになっている。
    // 実行すると分かるが、Javaでは出力順序が標準出力より優先される。
    // また、eclipseでは赤文字でコンソールに表示される。

    // System.err.print()・・・改行なしエラー出力
    System.err.print( 'e' );
    System.err.print( 'r' );
    System.err.print( 'r' );
    System.err.print( '\n' );
    // System.err.println()・・・改行つきのエラー出力
    System.err.println( 'e' );
    System.err.println( 'r' );
    System.err.println( 'r' );


    /** 本来はエラー系の出力のために標準エラー出力が存在しているが、 */
    /** Javaでは表示順の制御の兼ね合いから、正常系もエラー系も慣習的に標準出力を用いる場合が多い。 */
    /** （明示的にSystem.errを使用しているプログラムを余り見かけない。） */
  }
}
