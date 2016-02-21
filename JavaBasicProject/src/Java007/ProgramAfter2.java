/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * ProgramAfter2 <br />
 * Java007 問2の解答例 <br />
 * <br />
 * 社員情報の画面表示と同姓同名チェック <br />
 * 社員情報の画面表示と同姓同名チェックを行なう。 <br />
 * 更新履歴 2015/11/01 林 花織：新規作成 <br />
 */
public class ProgramAfter2 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfter2() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 社員情報の画面表示と同姓同名チェック <br />
   * 社員情報（社員No、名前、姓）を一人ずつ設定し、画面表示を行なう。 <br />
   * また同姓同名チェックを行い、判定結果を画面表示する。 <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // 一人目
    Member member1 = new Member( "00001", "一郎", "鈴木" );
    // 二人目
    Member member2 = new Member( "00002", "一郎", "鈴木" );
    // 三人目
    Member member3 = new Member( "00003", "三郎", "鈴木" );

    // 社員情報を表示（一人目）
    member1.showinfo();
    // 社員情報を表示（二人目）
    member2.showinfo();
    // 社員情報を表示（三人目）
    member3.showinfo();

    // 同姓同名チェック（一人目と二人目）
    member1.checkName( member2 );
    // 同姓同名チェック（一人目と三人目）
    member1.checkName( member3 );
    // 同姓同名チェック（二人目と三人目）
    member2.checkName( member3 );

  }
}
