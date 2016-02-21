/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008.accessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * TextReader <br />
 * Java008 問5の解答例（クラス分割版） <br />
 * <br />
 * 入力ファイル読み込み処理 <br />
 * 入力ファイルの社員情報を読み取り、リストに格納する。 <br />
 * 更新履歴 2015/11/01 山本 高志：新規作成 <br />
 */
public class TextReader {

  /** 入力ファイルパスを定数化 */
  private static final String INPUT_FILE_PATH = "./run/file/input.txt";

  /** 社員情報リスト */
  private List<Member> list = new ArrayList<Member>();

  /**
   * リスト取得
   * @return list 社員情報リスト
   */
  public List<Member> getList() {
    return list;
  }

  /**
   * リスト設定
   * @param list 社員情報リスト
   */
  public void setList( List<Member> list ) {
    this.list = list;
  }

  /**
   * コンストラクタ <br />
   * インスタンス生成と同時に読み込み～リスト格納まで実施する <br />
   *
   * @throws FileNotFoundException ファイルパス例外
   * @throws IOException 入出力例外
   */
  public TextReader() throws FileNotFoundException, IOException {

    System.out.println( "ファイル読み込み処理を開始します。" );

    // ファイルパスを指定
    BufferedReader br = new BufferedReader( new FileReader( INPUT_FILE_PATH ) );

    // 読み込み用の変数を初期化
    String str = "";
    // ファイルの末尾までリストに格納する
    while ( ( str = br.readLine() ) != null ) {
      String[] cols = str.split( "," );
      list.add( new Member( cols[0], cols[1], cols[2] ) );
    }
    // ファイルをクローズする
    br.close();
    System.out.println( "ファイル読み込み処理が完了しました。" );
  }
}
