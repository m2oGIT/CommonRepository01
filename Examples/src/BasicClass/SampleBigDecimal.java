
package BasicClass;

import java.math.BigDecimal;

/**
 * BigDecimalの使い方 <br />
 * オブジェクト型の実数値を使用した基本的な文法 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class SampleBigDecimal {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public SampleBigDecimal() {
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


    /** BigDecimal：オブジェクト型の実数値 丸めの懸念無しで使用できるため、使用頻度が高い。 **/

    // BigDeCimal型の値を2つ用意。
    BigDecimal bd1 = new BigDecimal( "0.01" );
    BigDecimal bd2 = new BigDecimal( "1.00" );

    // 加算
    BigDecimal ad = bd1.add( bd2 );
    System.out.println( "bd1 + bd2 の計算結果は " + ad + "です。" );

    // 減算
    BigDecimal sr = bd1.subtract( bd2 );
    System.out.println( "bd1 - bd2 の計算結果は " + sr + "です。" );

    // 乗算
    BigDecimal mp = bd1.multiply( bd2 );
    System.out.println( "bd1 * bd2 の計算結果は " + mp + "です。" );

    // 除算
    BigDecimal dv = bd1.divide( bd2 );
    System.out.println( "bd1 / bd2 の計算結果は " + dv + "です。" );


    /** BigDecimalにはscale（精度）という概念がある。 **/

    // 例えば、以下の値のscaleは"2"となる。
    BigDecimal bd3 = new BigDecimal( "2.50" );
    BigDecimal bd4 = new BigDecimal( "0.00" );

    System.out.println( bd3 );
    System.out.println( bd4 );

    // scaleを増やす
    bd4 = bd3.setScale( 100 );
    System.out.println( bd4 );

    // scaleを減らす　桁落ち時のルール（丸めモード）を指定する。

    bd4 = bd3.setScale( 0, BigDecimal.ROUND_HALF_UP ); // 四捨五入
    System.out.println( bd4 );
    bd4 = bd3.setScale( 0, BigDecimal.ROUND_UP ); // 切り上げ
    System.out.println( bd4 );
    bd4 = bd3.setScale( 0, BigDecimal.ROUND_DOWN ); // 切り捨て
    System.out.println( bd4 );

    /** 丸めモードの定数は他にも用意されている。 APIマニュアルを参照のこと。 **/
  }
}
