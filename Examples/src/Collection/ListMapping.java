
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * コレクションの応用的な使い方 <br />
 * リストとマップを組み合わせた文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ListMapping {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // マップのvalueに配列を用いることで、
    // 『任意のkeyに紐づく複数の値』という所謂"DB的な構造"を容易に実現できる。

    // マップを宣言
    // リンクハッシュマップ型・・・keyとvalueのマッピングとして値を保持する。順序は格納順が維持される。
    LinkedHashMap<String, ArrayList<String>> testTable = new LinkedHashMap<String, ArrayList<String>>();

    // リストを宣言
    ArrayList<String> list = new ArrayList<String>();
    list.add( "山田" );
    list.add( "太郎" );
    list.add( "日本" );
    testTable.put( "1", list );

    // リストを初期化
    list = new ArrayList<String>();
    list.add( "ビル" );
    list.add( "ゲイツ" );
    list.add( "マイクロソフト" );
    testTable.put( "2", list );

    list = new ArrayList<String>();
    list.add( "スティーブ" );
    list.add( "ジョブ" );
    list.add( "アップル" );
    testTable.put( "3", list );


    // 要素を取り出す際は、keyを指定した上で、配列の要素数を指定する。
    System.out.println( testTable.get( "1" ).get( 0 ) );
    System.out.println( testTable.get( "1" ).get( 1 ) );
    System.out.println( testTable.get( "1" ).get( 2 ) );

    System.out.println( "" );


    // Iteratorの適用例。
    Iterator<String> it = testTable.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      //配列を丸ごとprintlnに投げると全量が表示される。
      System.out.println( "LinkedHashMap:" + testTable.get( key ) );
    }

    System.out.println( "" );


    // 更に要素個々に取り出すと以下の通り。
    it = testTable.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      for ( String value : testTable.get( key ) ) {
        // Iteratorで配列を取り出し、配列から一時変数に展開して末尾までループ。
        System.out.println( value );
      }
    }


    /** 上記以外にもプリミティブな型が用意されている。詳細はとほほ等を参照のこと。 **/
  }
}
