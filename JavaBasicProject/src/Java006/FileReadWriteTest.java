/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FileReadWriteTest <br />
 * Java006 問2の解答例 <br />
 * 日時・起動時引数の書き込み処理 <br />
 * <br />
 * /practice/run/file/text.txtというファイルに対し、 <br />
 * 実行時に与えた文字列と、実行時の日時を追加書込で書き込む処理を作成する。 <br />
 * また同一クラス内に、上記の対象ファイルを読み込み、内容をコンソールに表示する処理を作成する。 <br
 * * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class FileReadWriteTest {

  /** ファイルパスを定数化 */
  private static final String FILE_PATH = "./run/file/text.txt";

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public FileReadWriteTest() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 日時・起動時引数の書き込み処理 <br />
   * /practice/run/file/text.txtというファイルに対し、 <br />
   * 実行時に与えた文字列と、実行時の日時を追加書込で書き込む処理を作成する。 <br />
   * また同一クラス内に、上記の対象ファイルを読み込み、内容をコンソールに表示する処理を作成する。 <*
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // ファイル書き込み用クラスのインスタンスを宣言
    PrintWriter pw = null;

    try {

      // 追加書き込みでファイルパスを指定
      // 絶対パス指定
      // pw = new PrintWriter( new BufferedWriter( new FileWriter(
      // "C:/workspace44/JavaBasicProject/run/file/text.txt", true ) ) );

      // 相対パス指定
      pw = new PrintWriter( new BufferedWriter( new FileWriter(
          FILE_PATH, true ) ) );

      // 現在日時を取得
      Date now = new Date();
      // 日付のフォーマット
      SimpleDateFormat sdf1 = new SimpleDateFormat( "yyyy'/'MM'/'dd'/' HH:mm:ss " );
      // 実行時の日時を書き込む
      pw.println( sdf1.format( now ) + args[0] );

    } catch ( IOException e ) {
      System.out.println( "出力エラーです。" );
    } finally {
      // ファイルを閉じる
      pw.close();
    }

    // ファイル読み込み用クラスのインスタンスを宣言
    BufferedReader br = null;
    try {

      // 読み込むファイルパスを指定
      // 絶対パス指定
      // br = new BufferedReader( new FileReader(
      // "C:/workspace44/JavaBasicProject/run/file/text.txt" ) );

      // 相対パス指定
      br = new BufferedReader( new FileReader(
          FILE_PATH ) );

      // 読み込み用の文字列変数を定義
      String str = "";

      // 読み取り結果をコンソールに表示する
      while ( ( str = br.readLine() ) != null ) {
        System.out.println( str );
      }
    } catch ( IOException e ) {
      System.out.println( "入力時例外が発生しました。" );

    } finally {
      // ファイルを閉じる
      try {
        br.close();
      } catch ( IOException e ) {
        System.out.println( "ファイルクローズで例外が発生しました。" );
      }
    }
  }
}
