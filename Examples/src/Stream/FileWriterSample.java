
package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ファイル書き込みクラスの使い方 <br />
 * FileWriterクラスを使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class FileWriterSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public FileWriterSample() {
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

    // ファイルの書き込みも、専用のライブラリクラスを組み合わせて行う。

    // 書き込むファイルのパス（相対パス）
    String outputFileName = "run/output/outfile.txt";
    // 書き込むファイルのパス（絶対パス指定も可）
    // String inputFileName = "C:\\eclipse\\workspace\\Examples\\run\\output\\outfile.txt";

    // ファイルオブジェクトの生成
    File outputFile = new File( outputFileName );

    // 出力ストリームのインスタンスを仮で生成（これらのクラスを組み合わせて実装する）
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    PrintWriter pw = null;

    try {

      // 出力ストリームの生成（定型文言として理解して良い）
      fos = new FileOutputStream( outputFile, false ); // 第二引数にfalse（or省略）で「上書きモード」
      // fos = new FileOutputStream( outputFile, true ); //第二引数にtrueで「追加書き込みモード」
      osw = new OutputStreamWriter( fos );
      pw = new PrintWriter( osw );

      // ファイルへの書き込み（厳密にはファイルバッファへの書き込みまで）
      pw.println( "ファイル出力のサンプル文字列" );
      pw.println( "abcdefg" );
      pw.println( "１２３４５６７８９０" );

      // バッファのフラッシュ（メモリから実ファイルへの書き出し）
      // クローズ処理の中で暗黙のフラッシュが行われるが、明示的に記述するのがお作法。
      pw.flush();

      // エラーがあった場合は、スタックトレースを出力
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finallyブロックに明示的なクローズ処理を記述する。
      pw.close();
    }


    /** 出力ファイルへの書き出し等、やはりバッチ処理で使う機会が多い。 **/
  }
}
