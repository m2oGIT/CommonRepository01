/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Interface;


/**
 * インターフェースの使い方 <br />
 * インターフェースクラスのサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public interface InterfaceSample {

  /** Interfaceクラスはfinalもしくはpublic static 以外のメンバ変数を持てない */
  String MSG = "Interfaceクラスのメンバ変数";

  /** Interfaceクラスはコンストラクタを持てない */
  // /**
  // * デフォルトコンストラクタ <br />
  // * 文字列を表示します。 <br />
  // */
  // public InterfaceSample() {
  // System.out.println( "Interfaceクラスのコンストラクタ" );
  // }

  /** Interfaceクラスはメソッドの本文を持てない */
  // /**
  // * メッセージ表示<br />
  // * メンバ変数の値を表示します。 <br />
  // */
  // public void displayMsg() {
  // System.out.println( msg );
  // }

  /**
   * メッセージ表示<br />
   * メンバ変数の値を表示します。 <br />
   */
  void displayMsg();

  /**
   * メッセージ更新<br />
   * メンバ変数の値を更新します。 <br />
   *
   * @param msg 更新するメッセージ
   */
  void changeMsg( String msg );

  /**
   * 本日日付表示<br />
   * 本日日付を表示します。 <br />
   */
  void displayDate();

}
