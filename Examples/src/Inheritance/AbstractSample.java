/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 継承の使い方 <br />
 * 抽象クラスのサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public abstract class AbstractSample {

  protected String msg = "親クラスのメンバ変数";

  /**
   * デフォルトコンストラクタ <br />
   * 文字列を表示します。 <br />
   */
  public AbstractSample() {
    System.out.println( "親クラスのコンストラクタ" );
  }

  /**
   * メッセージ表示<br />
   * メンバ変数の値を表示します。 <br />
   */
  public void displayMsg() {
    System.out.println( msg );
  }

  /**
   * メッセージ更新<br />
   * メンバ変数の値を更新します。 <br />
   *
   * @param msg 更新するメッセージ
   */
  public void changeMsg( String msg ) {
    this.msg = msg;
  }

  /**
   * 本日日付表示<br />
   * 本日日付を表示します。 <br />
   *
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
    System.out.println( "今日は" + sdf.format( new Date() ) + "です。" );

  }

}
