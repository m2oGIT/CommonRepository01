/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Constructor;

/**
 * コンストラクタの使い方 <br />
 * コンストラクタのサンプル（呼び出される側） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class MyCar1 {

  /** 数値型のメンバー変数 */
  private int num = 0;

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ（初期処理なし） <br />
   */
  public MyCar1() {
    // 特に行う処理がない場合はsuperクラスのコンストラクタを呼び出す。
    // Objectクラスのコンストラクタであり、実質何もしない。
    // 「初期処理は特に何もない」という明示的な宣言になる。省略も可能。
    super();
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
