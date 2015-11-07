/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Inheritance;


/**
 * 継承の使い方 <br />
 * 通常クラスからの抽象先クラスのサンプル <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class NomalExtendsSample extends ExtendsSample {

  /** 抽象クラス以外も継承可能。但し、複数クラスを同時継承（多重継承）はコンパイルエラーとなる */


  /** 継承先でコンストラクタを追加で定義できる他、基本的な機能はabstractクラスからの継承と同じ。 */

  /**
   * デフォルトコンストラクタ <br />
   * 文字列を表示します。 <br />
   */
  public NomalExtendsSample() {

    // 継承先でコンストラクタを定義した場合、
    // 親クラスのコンストラクタ⇒継承先のコンストラクタの順で実行される。
    System.out.println( "通常クラスから継承したクラスのコンストラクタ" );

  }


}
