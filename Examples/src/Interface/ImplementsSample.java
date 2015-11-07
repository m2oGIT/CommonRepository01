/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Interface;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * インターフェース実装の使い方 <br />
 * インターフェースを実装したクラスのサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ImplementsSample implements InterfaceSample {


  /** インターフェース実装クラスはコンストラクタを定義可能 */
  /**
   * デフォルトコンストラクタ <br />
   * 文字列を表示します。 <br />
   */
  public ImplementsSample() {
    System.out.println( "インターフェース実装クラスのコンストラクタ" );
  }

  /** インターフェース実装クラスは実装元の全てのメソッド定義を実装する必要がある。 */

  /**
   * メッセージ表示<br />
   * メンバ変数の値を表示します。 <br />
   */
  public void displayMsg() {
    System.out.println( MSG );
  }

  /**
   * メッセージ更新<br />
   * メンバ変数の値を更新します。 <br />
   *
   * @param msg 更新するメッセージ
   */
  public void changeMsg( String msg ) {
    // インターフェースのメンバ変数は更新不可。
    // this.MSG = msg;
    System.out.println( "インターフェースのメンバ変数は更新できません。" );
  }

  /**
   * 本日日付表示<br />
   * 本日日付を表示します。 <br />
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
    System.out.println( "今日は" + sdf.format( new Date() ) + "です。" );

  }

  /** インターフェース実装クラスでメンバを追加することが可能。 */

  /**
   * 本日時刻表示<br />
   * 本日時刻を表示します。 <br />
   */
  public void displayTime() {

    SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss" );
    System.out.println( "現在時刻は" + sdf.format( new Date() ) + "です。" );

  }

}
