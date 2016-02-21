/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * ProgramAfter3 <br />
 * Java008 問3の解答例 <br />
 * <br />
 * 社員情報の画面表示と変更 <br />
 * 社員情報を設定し、画面に表示する。 <br />
 * また社員情報の変更、取得を行なう。 <br />
 * 更新履歴 2015/11/01 林 花織：新規作成 <br />
 */
public class ProgramAfter3 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfter3() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 社員情報の画面表示と変更 <br />
   * 社員情報（社員No、名前、姓）を設定し、画面に表示する。 <br />
   * また社員情報の変更、取得を行なう。 <br />
   * （下記プログラムでは名前の変更と取得を行なっている）
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // 社員クラス
    Member member1 = new Member( "00001", "一郎", "鈴木" );
    // 社員情報を表示
    member1.showinfo();
    // 名前を表示
    System.out.println( "名前、変更前：" + member1.getFirstName() );
    // 名前を変更
    member1.setFirstName( "花子" );
    // 名前を表示
    System.out.println( "名前、変更後：" + member1.getFirstName() );
    System.out.println();
    // 社員情報を表示
    member1.showinfo();

  }
}
