
package Property;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * プロパティファイルの使い方 <br />
 * Propertiesクラスを使用したプロパティの実装方法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class PropertiesSample {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public PropertiesSample() {
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

    // Java旧来のプロパティ機能であるPropertiesクラスでの応用例。

    // 自作ローダーのインスタンスを生成。
    PropertyLoader loader = null;

    try {
      // 初期化処理の中でプロパティファイルを読み込む。
      loader = new PropertyLoader();
      //呼び出し側からパスを指定する場合は引数ありコンストラクタを利用する
      //loader = new PropertyLoader( "run/properties/standardprop.properties" );
    } catch ( IOException e ) {
      e.printStackTrace();
    }

    // keyに紐づくvalueを取得する。
    System.out.println( loader.getValue( "key-1" ) );
    System.out.println( loader.getValue( "key-2" ) );
    System.out.println( loader.getValue( "key-3" ) );


    /** Java初期から使用されているプロパティの実装方法。 **/
    /** 特に理由がなければ、Propertiesクラスで実装して問題ない。 **/
  }


}
