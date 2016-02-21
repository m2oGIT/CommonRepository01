/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * ProgramAfter5 <br />
 * Java008 問5の解答例 <br />
 * <br />
 * 出力ファイル編集処理 <br />
 * 入力ファイルの社員情報を読み取り、リストに格納する。 <br />
 * リストに格納した社員情報をもとに、出力ファイルに出力する。 <br />
 * 更新履歴 2015/11/01 林 花織：新規作成 <br />
 */
public class ProgramAfter5 {

  /** 入力ファイルパスを定数化 */
  private static final String INPUT_FILE_PATH = "./run/file/input.txt";
  /** 出力ファイルパスを定数化 */
  private static final String OUTPUT_FILE_PATH = "./run/file/output.txt";

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfter5() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 出力ファイル編集処理 <br />
   * 入力ファイルから1行ずつ読み取り、ファイルの最後になるまで、リストに格納する。 <br />
   * リストに格納した社員情報をもとに、出力ファイルに出力する。 <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    try {

      System.out.println( "ファイル読み込み処理を開始します。" );

      // 読み込むファイルパスを指定
      // 絶対パス指定
      // BufferedReader br = new BufferedReader(
      // new FileReader( "C:/workspace44/JavaBasicProject/run/file/input.txt" ) );

      // 相対パス指定
      BufferedReader br = new BufferedReader(
          new FileReader( INPUT_FILE_PATH ) );

      // 読み込み用の文字列変数を定義
      String str;
      // 社員情報リスト
      List<Member> list = new ArrayList<Member>();

      // ファイルの末尾まで、読み取り結果をリストに格納する
      while ( ( str = br.readLine() ) != null ) {
        // split()で区切り文字分割
        String[] cols = str.split( "," );
        // Memberクラスのインスタンスをリストに格納
        list.add( new Member( cols[0], cols[1], cols[2] ) );
      }

      // 入力ファイルをクローズする
      br.close();

      System.out.println( "ファイル読み込み処理が完了しました。" );
      System.out.println( "ファイル書き込み処理を開始します。" );

      // 上書き書き込みでファイルパスを指定
      // 絶対パス指定
      // PrintWriter pw = new PrintWriter( new BufferedWriter(
      // new FileWriter( "C:/workspace44/JavaBasicProject/run/file/output.txt" ) ) );

      // 相対パス指定
      PrintWriter pw = new PrintWriter( new BufferedWriter(
          new FileWriter( OUTPUT_FILE_PATH ) ) );

      // リストに格納した社員情報をもとに、出力ファイルに書き出す
      for ( int i = 0; i < list.size(); i++ ) {
        pw.print( "行数：[" + ( i + 1 ) + "] " );
        pw.print( "社員No：[" + list.get( i ).getId() + "] " );
        pw.println( "名前：[" + list.get( i ).getSecondName() + "　" + list.get( i ).getFirstName()
            + "]" );
      }

      // 出力ファイルをクローズする
      pw.close();
      System.out.println( "ファイル書き込み処理が完了しました。" );

    } catch ( IOException e ) {
      System.out.println( "入出力例外が発生しました。" );

    }
  }
}
