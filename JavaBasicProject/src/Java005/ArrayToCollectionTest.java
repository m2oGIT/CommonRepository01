/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ArrayToCollectionTest <br />
 * Java005 問1～問2の解答例 <br />
 * 最大値取得処理 <br />
 * <br />
 * コンソールより、整数を入力させ、最大値をコンソール出力する <br />
 * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する <br />
 * 更新履歴 2015/10/04 林 花織：新規作成 <br />
 */
public class ArrayToCollectionTest {

  /** 繰り返し回数を定数化 */
  private static final int REPEAT_NUM = 5;

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ArrayToCollectionTest() {
    // 行うべき処理なし。
    super();
  }

  /**
   * メインメソッド 処理を起動する <br />
   * コンソールより、整数を入力させ、最大値をコンソール出力する <br />
   * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する <br />
   *
   * @param args 実行時引数
   * @throws IOException IOエラー
   */
  public static void main( String[] args ) throws IOException {

    // 入力指示を表示
    System.out.println( "整数を" + REPEAT_NUM + "回入力してください。" );
    System.out.println();

    // コンソール入力用クラスのインスタンスを宣言
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    // 入力内容を格納する配列
    ArrayList<Integer> array = new ArrayList<Integer>();

    // 指定回数だけ繰り返す
    for ( int i = 0; i < REPEAT_NUM; i++ ) {

      // 入力した文字列をString型変数に格納する
      String str = br.readLine();

      // 入力内容が整数の時、配列に格納
      // 入力内容が整数以外の時、エラーメッセージを表示し、処理を終了
      try {
        array.add( Integer.parseInt( str ) );
      } catch ( NumberFormatException e ) {
        System.out.println( "整数ではありません。処理を終了します。" );
      }

    }

    // 最大値を格納する変数
    int max = 0;
    // 最大値を求める
    for ( int value : array ) {
      if ( max < value ) {
        max = value;
      }
    }

    // 最大値を表示
    System.out.println( "最大値は" + max );

    // 問2より追加の実装
    // 合計値を格納する変数
    int sum = 0;
    // 入力した整数を合計する
    for ( int value : array ) {
      sum += value;
    }

    // 合計値を表示
    System.out.println( "合計値は" + sum );

    // 平均値を格納する変数
    double ave = 0.0;
    // 入力した整数の平均値を求める
    ave = sum / array.size();

    // 平均値を表示
    System.out.println( "平均値は" + ave );
  }
}
