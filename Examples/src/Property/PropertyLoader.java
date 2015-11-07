/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * プロパティファイルの使い方 <br />
 * Propertiesクラスを使用したプロパティの実装方法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class PropertyLoader {

  /** プロパティオブジェクト */
  private Properties conf = null;

  /**
   * デフォルトコンストラクタ <br />
   * プロパティファイルのパスを設定します。 <br />
   *
   * @throws IOException 入出力例外
   */
  public PropertyLoader() throws IOException {

    // インスタンスを生成。
    conf = new Properties();

    // ①InputStreamを利用してファイルを読み込む場合。＝相対パスまたは絶対パスで記述する。
    InputStream inputStream = new FileInputStream(
        "C:\\eclipse44\\workspace44\\Examples\\run\\properties\\standardprop.properties" );
    conf.load( inputStream );
    inputStream.close();

    // ②クラスローダーを使用してファイルを読み込む場合。＝クラスパスが通っている必要がある。
    conf.load( this.getClass().getResourceAsStream( "/standardprop.properties" ) );

  }

  /**
   * 格納値の取得<br />
   * 指定されたkeyに紐づく値を返却します。 <br />
   *
   * @param key キー値
   * @return 取得した値
   */
  public String getValue( String key ) {
    // keyに紐づく値を取得。
    return conf.getProperty( key );
  }

}
