
package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * コレクションクラスの使い方 <br />
 * 拡張された配列を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class CollectionClass {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    // 動的に要素数を変更可能な配列が、ライブラリクラスに用意されている。

    // 宣言時に"<>"（ジェネリック、ジェネリクスと呼ばれる要素型の指定）でセットする型を指定する。
    // <?>でワイルドカード指定可能だが、型の不一致が起きやすく、バグの温床となるため推奨されない。

    // また、クラスなので使用時はimportが必要。

    /** リスト型 */
    // ArrayList：アレイリスト型・・・コレクションの中で最も基本となる配列
    ArrayList<String> list = new ArrayList<String>();
    list.add( "ひとつめの要素" );
    list.add( "ふたつめの要素" );
    list.add( "みっつめの要素" );

    // 通常for文
    for ( int i = 0; i < list.size(); i++ ) {
      System.out.println( "list[" + i + "]：" + list.get( i ) ); // 要素の取得は.get(インデックス)で行う。
    }

    // 拡張for文（配列の要素分、繰り返す）
    for ( String value : list ) { // 一時変数に配列の値を展開し、末尾まで繰り返すイメージ。
      System.out.println( "ArrayList:" + value );
    }
    System.out.println( "" );


    /** セット型 */
    // ハッシュセット型・・・要素の重複が許されず、順序の保障が無い。
    HashSet<String> hset = new HashSet<String>();

    hset.add( "AAA" );
    hset.add( "BBB" );
    hset.add( "CCC" );
    hset.add( "AAA" );

    // 要素を取り出す際は、iterator（イテレータ）を使用する。
    // iterator＝数直線上で値を指す矢印、目盛りのイメージ。
    // iteratorのインスタンスに適用したいコレクションのインスタンスを代入する。
    Iterator<String> it = hset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "HashSet:" + it.next() );
    }

    System.out.println( "" );


    // ツリーセット型・・・要素の重複が許されず、順序は辞書順にソートされる。
    TreeSet<String> tset = new TreeSet<String>();

    tset.add( "AAA" );
    tset.add( "BBB" );
    tset.add( "CCC" );
    tset.add( "AAA" );

    // 要素を取り出す際は、iterator（イテレータ）を使用する。
    it = tset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "TreeSet:" + it.next() );
    }

    System.out.println( "" );


    // リンクセット型・・・要素の重複が許されず、順序は格納順が維持される。
    LinkedHashSet<String> lset = new LinkedHashSet<String>();

    lset.add( "AAA" );
    lset.add( "BBB" );
    lset.add( "CCC" );
    lset.add( "AAA" );

    // 要素を取り出す際は、iterator（イテレータ）を使用する。
    it = lset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "LinkedHashSet:" + it.next() );
    }

    System.out.println( "" );


    /** マップ型 */
    // ハッシュマップ型・・・keyとvalueのマッピングとして値を保持する。順序の保障が無いが、keyを指定するので影響は小さい。
    HashMap<String, String> hmap = new HashMap<String, String>();

    hmap.put( "1", "ひとつめのvalue" );
    hmap.put( "2", "ふたつめのvalue" );
    hmap.put( "3", "みっつめのvalue" );
    hmap.put( "4", "ひとつめのvalue" );

    // 要素を取り出す際は、keyを指定する。
    System.out.println( hmap.get( "1" ) );

    // 要素をすべて取り出す際は、iterator（イテレータ）を使用する。
    it = hmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "HashMap:" + hmap.get( key ) );
    }

    System.out.println( "" );


    // ツリーマップ型・・・keyとvalueのマッピングとして値を保持する。順序はkeyの辞書順にソートされる。
    TreeMap<String, String> tmap = new TreeMap<String, String>();

    tmap.put( "1", "value①" );
    tmap.put( "2", "value②" );
    tmap.put( "3", "value③" );
    tmap.put( "4", "value④" );

    // 要素を取り出す際は、keyを指定する。
    System.out.println( tmap.get( "1" ) );

    // 要素をすべて取り出す際は、iterator（イテレータ）を使用する。
    it = tmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "TreeMap:" + tmap.get( key ) );
    }

    System.out.println( "" );


    // リンクハッシュマップ型・・・keyとvalueのマッピングとして値を保持する。順序は格納順が維持される。
    LinkedHashMap<String, String> lmap = new LinkedHashMap<String, String>();

    lmap.put( "1", "ひとつめのvalue" );
    lmap.put( "2", "ふたつめのvalue" );
    lmap.put( "3", "みっつめのvalue" );
    lmap.put( "4", "ひとつめのvalue" );

    // 要素を取り出す際は、keyを指定する。
    System.out.println( lmap.get( "1" ) );

    // 要素をすべて取り出す際は、iterator（イテレータ）を使用する。
    it = lmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "LinkedHashMap:" + lmap.get( key ) );
    }

    System.out.println( "" );


    /**
     * 特にArrayListやMapは使用頻度が高い。要素はオブジェクト型のみ指定可能である点にも注意。
     **/

    // <>にintを指定するとコンパイルエラーとなる。
    // ArrayList<int> intList = new ArrayList<int>();

    // 整数を扱いたい場合は、intを拡張したクラス（ラッパークラス）のIntegerを指定する。
    ArrayList<Integer> integerList = new ArrayList<Integer>();

    // ラッパークラスはnewで宣言する。
    integerList.add( new Integer( 1234567890 ) );
    // オートボクシング(Autoboxing)機能といって、ラッパークラスにプリミティブな型の値も格納できる。
    // Java5.0以降は、このAutoboxingで以下のようなシンプルな書き方も可能となった。
    integerList.add( 1234567890 );

    // 同様に以下のラッパークラスが用意されている。
    byte b = 12;
    Byte ob = new Byte(b); // バイト型

    short s = 32;
    Short os = new Short(s); // ショート型

    long l = 153L;
    Long ol = new Long(l); // ロング型

    float f = 3.24F;
    Float of = new Float(f); // 固定小数点型

    double d = 7.6;
    Double od = new Double(d); // 固定小数点型

  }
}
