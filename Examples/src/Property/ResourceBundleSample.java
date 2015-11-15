
package Property;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * プロパティファイルの使い方 <br />
 * ResourceBundleクラスを使用したプロパティの実装方法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class ResourceBundleSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ResourceBundleSample() {
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

    // Java6.0で拡張されたResourceBundleクラスでの実装例。

    // プロパティファイル（もしくはrunフォルダ）のパスをクラスパス変数に追加する必要がある。
    // eclipseの場合は、「プロジェクト」＞「プロパティー」＞「Javaのビルドパス」から追加。

    // 現在の環境でのクラスパス設定は以下の１行を実行すると確認できる。
    System.out.println( "CLASSPATH：" + System.getProperty( "java.class.path" ) );

    // ResourceBundleクラスのインスタンスを生成。
    ResourceBundle bundle = null;

    try {
      // 読み込むファイル名を指定。拡張子はpropertiesに固定され、コード上は記述不要。
      bundle = ResourceBundle.getBundle( "resourceprop" );
    } catch ( MissingResourceException e ) {
      e.printStackTrace();
      return;
    }

    try {
      // keyに紐づくvalueを取得する。
      System.out.println( bundle.getString( "key-1" ) );
      System.out.println( bundle.getString( "key-2" ) );
      System.out.println( bundle.getString( "key-3" ) );
    } catch ( MissingResourceException e ) {
      e.printStackTrace();
      return;
    }


    /** Streamを使うかバンドルを使うかの違いで、こちらはクラスパスや拡張子の制約がある分、やや癖がある。 **/
    /** 発生する例外（MissingResourceException）がRuntimeExceptionを継承しており、実行時例外となる点も注意。 **/
    /** 従来のPropertiesクラスとどちらを使うかは、状況次第。 **/

  }
}
