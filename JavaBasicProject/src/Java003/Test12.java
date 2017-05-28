/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test12 <br />
 * Java003 問2の解答例 <br />
 * 実行日時表示処理 <br />
 * 実行した日時をyyyy/mm/dd HH:MM:SS で表示する <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class Test12 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Test12() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動する <br />
   * 実行した日時をyyyy/mm/dd HH:MM:SS で表示する <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 日付
    Date now = new Date();
    // 日付のフォーマット
    SimpleDateFormat sdf1 = new SimpleDateFormat( "yyyy'/'MM'/'dd'/' HH:mm:ss " );
    // 実行日時を表示する
    System.out.println( "実行日時は" + sdf1.format( now ) + "です。" );

  }
}
