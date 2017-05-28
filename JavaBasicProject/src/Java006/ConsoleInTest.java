
package Java006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ConsoleInTest <br />
 * Java006 問1の解答例 <br />
 * 文字列の表示処理 <br />
 * <br />
 * コンソールから入力された複数行の文字列をため込み、 <br />
 * あらかじめ定義された終了文字（end）が入力された場合に、一括で出力する処理を作成する。 <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class ConsoleInTest {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ConsoleInTest() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 文字列の表示処理 <br />
   * コンソールから入力された複数行の文字列をため込み、 <br />
   * あらかじめ定義された終了文字（end）が入力された場合に、一括で出力する処理を作成する。 <br />
   *
   * @param args 起動時引数
   * @throws IOException 入出力例外
   */
  public static void main( String[] args ) throws IOException {

    // 入力指示を画面に表示する
    System.out.println( "文字列を入力してください。" );
    System.out.println( "endの入力で終了します。" );
    System.out.println();

    // コンソール入力用クラスのインスタンスを宣言
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    // 入力した文字列をString型変数に格納する
    String str = br.readLine();
    // 入力した文字列を溜め込むためのStringBufferを宣言
    StringBuffer sb = new StringBuffer();

    // 入力した文字列が"end"と一致するまで、StringBufferに溜め込む
    while ( !str.equals( "end" ) ) {
      // 文字列をsbの最後尾に追加する
      sb.append( str );
      // 入力した文字列をstrに読み込む
      str = br.readLine();
    }

    // 溜めた文字列の出力
    System.out.println( "溜めた文字列を出力します。" + sb );

  }
}
