/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Static;

/**
 * staticの使い方 <br />
 * staticのサンプル（呼び出される側） <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public final class MyCar1 {

  /** 数値型のメンバー変数 */
  // static（静的）宣言を付与することで、メモリに静的に展開される。
  private static int num = 0;

  /**
   * デフォルトコンストラクタ <br />
   * 初期処理なし。 <br />
   */
  private MyCar1() {
    // コンストラクタをprivateで宣言すると、
    // 「コンストラクタが決して実行されない＝newできない＝インスタンス化を禁止する」
    // という宣言になる。staticメンバを持つクラスはインスタンス化を禁止した方が親切。
    // staticメンバも持つクラスもpublicコンストラクタを宣言可能だが、
    super();
  }

  // staticメンバも持つクラスもpublicコンストラクタを宣言可能だが、
  // 保守性の観点から、staticメンバと非staticなメンバは同一クラスに記述すべきではなく、
  // クラス設計から見直すべき。
//  /**
//   * デフォルトコンストラクタ <br />
//   * 初期処理なし。 <br />
//   */
//  public MyCar1() {
//    super();
//  }

  /**
   * numのgetter<br />
   * numの値を返却します。 <br />
   *
   * @return num 現在の数値
   */
  public static int getNum() {
    return num;
  }

  /**
   * numのsetter<br />
   * numの値を設定します。 <br />
   *
   * @param arg 設定する値
   */
  public static void setNum( int arg ) {
    num = arg;
  }

}
