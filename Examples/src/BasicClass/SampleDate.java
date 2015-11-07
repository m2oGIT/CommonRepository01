
package BasicClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日付型の使い方 <br />
 * Date型を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SampleDate {

  /**
   * メインメソッド<br />
   * 処理を起動します。 <br />
   *
   * @param args 実行時引数
   */
  public static void main( String[] args ) {

    /** 日付を扱う場合は、Date型を使用する。 **/
    // Dateに限らず、オブジェクト型はimportが必要。
    // String型等の頻出する一部クラスのみはデフォルトでimportされている。

    // オブジェクト型はnewでインスタンスを生成する（初期化される）。
    // dateの場合は、初期化処理で現在日時（マシン日付）が取得される。
    Date date = new Date();
    System.out.println( String.valueOf( date ) ); // ただしデフォルトは欧米記法。


    /** SimpleDateFormat：日付のフォーマットをカスタマイズするライブラリクラス。 **/

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss.SSS" ); // インスタンス生成時に体裁を指定。
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // 指定フォーマットで表示する。

    sdf = new SimpleDateFormat( "yyyy年MM月dd日 HH時mm分ss秒SSSﾐﾘ秒" ); // 日本語を混ぜることも可能。
    formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // 指定フォーマットで表示する


    // 和暦表示はもうひと手間。
    Locale locale = new Locale( "ja", "JP", "JP" ); // ロケーションを指定。
    sdf = new SimpleDateFormat( "GGGGyyyy年MM月dd日 HH時mm分ss秒SSSﾐﾘ秒", locale );
    formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // 指定フォーマットで表示する

    // 曜日を算出したい場合など、より高度な日付処理用に「Calendar」クラスも用意されている。
    // パフォーマンスはDateより劣るため、場面次第で使い分ける。

    /** SimpleDateFormatの定数（yyyyが西暦年である、等）は APIマニュアルに記載されている。 **/

  }
}
