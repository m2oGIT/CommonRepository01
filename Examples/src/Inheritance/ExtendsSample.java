/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 継承の使い方 <br />
 * 抽象先クラスのサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ExtendsSample extends AbstractSample {

  /** 継承元（親クラス）のメンバを自動的に引き継いでいる。 */


  /** 継承先でコンストラクタを追加で定義できる。 */

  /**
   * デフォルトコンストラクタ <br />
   * 文字列を表示します。 <br />
   */
  public ExtendsSample() {

    // 継承先でコンストラクタを定義した場合、
    // 親クラスのコンストラクタ⇒継承先のコンストラクタの順で実行される。
    System.out.println( "継承先クラスのコンストラクタ" );

  }


  /** 継承先でメンバ（機能）を追加・編集することもできる。 */

  /**
   * メッセージ削除<br />
   * 追加メソッド：メンバ変数の値を削除します。 <br />
   */
  public void clearMsg() {
    this.msg = "（メッセージは削除されました。）";
  }


  /**
   * 本日日付表示<br />
   * 編集メソッド：本日日付（時分秒込み）を表示します。 <br />
   *
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    System.out.println( "今日は" + sdf.format( new Date() ) + "です。" );

  }


  /**
   * 本日日付表示<br />
   * 編集前メソッド：本日日付（時分秒無し）を表示します。 <br />
   *
   */
  public void orgDisplayDate() {

    // "super."で親クラスのメンバにアクセスできる。（privateスコープのメンバはアクセス不可。）
    super.displayDate();

  }

}
