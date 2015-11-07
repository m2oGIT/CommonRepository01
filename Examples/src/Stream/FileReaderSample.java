
package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ファイル読み込みクラスの使い方 <br />
 * FileReaderクラスを使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class FileReaderSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public FileReaderSample() {
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

    // ファイルの読み込みは、専用のライブラリクラスを組み合わせて行う。

    // 読み込むファイルのパス（相対パス）
    String inputFileName = "run/input/infile.txt";
    // 読み込むファイルのパス（絶対パス指定も可）
    // String inputFileName = "C:\\eclipse\\workspace\\Examples\\run\\input\\infile.txt";

    // ファイルオブジェクトの生成
    File inputFile = new File( inputFileName );

    // 入力ストリームのインスタンスを仮で生成（これらのクラスを組み合わせて実装する）
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {

      // 入力ストリームの生成（定型文言として理解して良い）
      fis = new FileInputStream( inputFile );
      isr = new InputStreamReader( fis );
      br = new BufferedReader( isr );

      // テキストファイルからの読み込み
      String msg;
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }

      // エラー時は、スタックトレースを出力
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {

      // finallyブロックに明示的なクローズ処理を記述する。
      try {
        br.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }


    /** 入力ファイルの読み込み等、特にバッチ処理で使う機会が多い。 **/
  }
}
