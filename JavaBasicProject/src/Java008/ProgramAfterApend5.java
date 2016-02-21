/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.FileNotFoundException;
import java.io.IOException;

import Java008.accessor.TextReader;
import Java008.accessor.TextWriter;

/**
 * ProgramAfterApend5 <br />
 * Java008 問5の解答例（クラス分割版） <br />
 * <br />
 * 出力ファイル編集処理 <br />
 * 更新履歴 2015/11/01 山本 高志：新規作成 <br />
 */
public class ProgramAfterApend5 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfterApend5() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 出力ファイル編集処理 <br />
   * 社員情報を読み書きする。 <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    try {
      // インスタンス生成、警告は非表示とする。
      TextReader txtred = new TextReader();
      @SuppressWarnings("unused")
      TextWriter txtwrt = new TextWriter( txtred.getList() );

    } catch ( FileNotFoundException e ) {
      System.out.println( "ファイルが見つかりません。" );
    } catch ( IOException e ) {
      System.out.println( "入出力例外が発生しました。" );
    }
  }
}
