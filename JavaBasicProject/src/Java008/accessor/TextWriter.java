/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008.accessor;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Java007.Member;

/**
 * TextWriter <br />
 * Java008 問5の解答例（クラス分割版） <br />
 * <br />
 * 出力ファイル編集処理 <br />
 * リストに引数を出力ファイルに出力する。 <br />
 * 更新履歴 2015/11/01 山本 高志：新規作成 <br />
 */
public class TextWriter {

  /** 出力ファイルパスを定数化 */
  private static final String OUTPUT_FILE_PATH = "./run/file/output.txt";

  /**
   * コンストラクタ <br />
   * インスタンス生成時に渡されたリストをファイルに書き込む <br />
   *
   * @param list 社員情報リスト
   * @throws FileNotFoundException ファイルパス例外
   * @throws IOException 入出力例外
   */
  public TextWriter( List<Member> list ) throws FileNotFoundException, IOException {

    System.out.println( "ファイル書き込み処理を開始します。" );

    // ファイルパスを指定
    PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter( OUTPUT_FILE_PATH ) ) );

    // 出力ファイルに書き出す
    for ( int i = 0; i < list.size(); i++ ) {
      pw.print( "行数：[" + ( i + 1 ) + "] " );
      pw.print( "社員No：[" + list.get( i ).getId() + "] " );
      pw.println( "名前：[" + list.get( i ).getSecondName() + "　" + list.get( i ).getFirstName()
          + "]" );
    }

    // ファイルをクローズする
    pw.close();
    System.out.println( "ファイル書き込み処理が完了しました。" );
  }
}
