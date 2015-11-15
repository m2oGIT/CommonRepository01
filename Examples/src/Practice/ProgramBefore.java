
package Practice;

/**
 * プリミティブな型の使い方 <br />
 * プリミティブな型を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ProgramBefore {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ProgramBefore() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {
    // 社員No
    String id1 = "00001";
    // 名
    String firstName1 = "一郎";
    // 姓
    String secondName1 = "鈴木";

    // 社員No
    String id2 = "00002";
    // 名
    String firstName2 = "一郎";
    // 姓
    String secondName2 = "鈴木";

    // 社員No
    String id3 = "00003";
    // 名
    String firstName3 = "三郎";
    // 姓
    String secondName3 = "鈴木";

    // 社員情報を表示(一人目)
    System.out.println( "社員No:" + id1 );
    System.out.println( "姓       :" + secondName1 );
    System.out.println( "名       :" + firstName1 );
    System.out.println( "姓名    :" + secondName1 + "" + firstName1 );
    System.out.println( "" );

    // 社員情報を表示(二人目)
    System.out.println( "社員No:" + id2 );
    System.out.println( "姓       :" + secondName2 );
    System.out.println( "名       :" + firstName2 );
    System.out.println( "姓名    :" + secondName2 + "" + firstName2 );
    System.out.println( "" );

    // 社員情報を表示(三人目)
    System.out.println( "社員No:" + id3 );
    System.out.println( "姓       :" + secondName3 );
    System.out.println( "名       :" + firstName3 );
    System.out.println( "姓名    :" + secondName3 + "" + firstName3 );
    System.out.println( "" );


    // 同姓同名チェック(一人目と二人目)
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名ではありません" );
    }

    // 同姓同名チェック(一人目と二人目）
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名ではありません" );
    }
    // 同姓同名チェック(一人目と三人目）
    if ( secondName1.equals( secondName3 )
        && firstName1.equals( firstName3 ) ) {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id3 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id3 + "]は同姓同名ではありません" );
    }
    // 同姓同名チェック(二人目と三人目）
    if ( secondName2.equals( secondName3 )
        && firstName2.equals( firstName3 ) ) {
      System.out.println( "社員No=[" + id2 + "]と、社員No=[" + id3 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id2 + "]と、社員No=[" + id3 + "]は同姓同名ではありません" );
    }
  }
}
