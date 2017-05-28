/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ArrayToCollectionTest <br />
 * Java005 問4の解答例 <br />
 * 最大値取得処理 <br />
 * <br />
 * コンソールより入力回数を含む整数を入力させ、最大値をコンソール出力する <br />
 * ただし、整数以外の入力があった場合は、エラーメッセージを表示し、処理を終了する <br />
 * 更新履歴 2017/05/16 山本 高志：新規作成 <br />
 */
public class ArrayToCollectionTestExtends {

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public ArrayToCollectionTestExtends() {
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

    // コンソール入力用クラスのインスタンスを宣言
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    // 入力回数を格納する変数
    int InputNum = 0;

    // 入力内容を格納する配列
    ArrayList<Integer> array = new ArrayList<Integer>();

    // 入力指示を表示
    System.out.println( "入力回数を指定してください。" );
    System.out.println();

    // 入力した文字列をString型変数に格納する
    String str = br.readLine();

    try {
      // 入力内容が整数の時、配列に格納
      InputNum = Integer.parseInt( str );

      // 入力指示を表示
      System.out.println( "整数を" + InputNum + "回入力してください。" );
      System.out.println();

      // 指定回数だけ繰り返す
      for ( int i = 0; i < InputNum; i++ ) {
        // 入力した文字列をString型変数に格納する
        str = br.readLine();
        array.add( Integer.parseInt( str ) );
      }
    } catch ( NumberFormatException e ) {
      System.out.println( "整数ではありません。処理を終了します。" );
      // 例外発生時は処理を抜ける。
      return;
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
