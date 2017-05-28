/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * ProgramAfter4 <br />
 * Java008 問4の解答例 <br />
 * <br />
 * 社員情報を配列からリストへ格納 <br />
 * String配列のデータを社員情報リストに格納し、設定した情報を表示する。 <br />
 * 更新履歴 2017/05/28 林 花織：新規作成 <br />
 */
public class ProgramAfter4 {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramAfter4() {
    // 行うべき処理なし。
    super();
  }

  /**
   * 社員情報を配列からリストへ格納 <br />
   * String配列のデータを社員情報リストに格納する。 <br />
   * また社員情報リストに設定した情報を表示する。 <br />
   *
   * @param args 起動時引数
   */
  public static void main( String[] args ) {

    // 社員情報
    String[][] array = {
        {
            "00001", "一郎", "鈴木"
        },
        {
            "00002", "一郎", "鈴木"
        },
        {
            "00003", "三郎", "鈴木"
        }
    };

    // 社員情報リスト
    List<Member> list = new ArrayList<Member>();
    // リストに追加
    for ( int i = 0; i < array.length; i++ ) {
      list.add( new Member( array[i][0], array[i][1], array[i][2] ) );
    }

    // リストに設定した情報を表示
    for ( int i = 0; i < list.size(); i++ ) {
      list.get( i ).showinfo();

    }
  }
}
