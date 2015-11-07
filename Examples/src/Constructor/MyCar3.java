/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Constructor;

/**
 * コンストラクタの使い方 <br />
 * コンストラクタのサンプル（呼び出される側） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class MyCar3 {

  /** 数値型のメンバー変数 */
  private int num = 0;

  /**
   * デフォルトコンストラクタ <br />
   * 初期処理なし。 <br />
   */
  public MyCar3() {
    // インスタンス生成時に行いたい処理があればコンストラクタに記述する。
    // この例では、メンバ変数に他クラスの値を設定している。
    this.num = new MyCar1().getNum();
  }

  /**
   * numのgetter<br />
   * numの値を返却します。 <br />
   *
   * @return num 現在の数値
   */
  public int getNum() {
    return num;
  }

  /**
   * numのsetter<br />
   * numの値を設定します。 <br />
   *
   * @param num 設定する値
   */
  public void setNum( int num ) {
    this.num = num;
  }

}
