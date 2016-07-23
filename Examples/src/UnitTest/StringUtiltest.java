/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package UnitTest;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Utility.StringUtil;

/**
 * 文字列ユーティリティテストクラス <br />
 * 文字列操作に関するユーティリティのテストクラスです。 <br />
 * 更新履歴 2016/07/23 山本 高志：新規作成 <br />
 */
public class StringUtiltest {

  /**
   * テスト前実行メソッド <br />
   * テスト前実行されるメソッド <br />
   *
   * @throws java.lang.Exception 実行時例外
   */
  @Before
  public void setUp() throws Exception {
    // テスト開始前に実行したい処理がある場合は記述する。
    // 今回は行うべき処理なし。
  }

  /**
   * テスト後実行メソッド <br />
   * テスト後実行されるメソッド <br />
   *
   * @throws java.lang.Exception 実行時例外
   */
  @After
  public void tearDown() throws Exception {
    // テスト開始後に実行したい処理がある場合は記述する。
    // 今回は行うべき処理なし。
  }

  /**
   * {@link Utility.StringUtil#isNecessary(java.lang.String)} のためのテスト・メソッド。
   */
  @Test
  public void testIsNecessary() {

    // テスト対象メソッドをJUnitのassert系メソッドに適用する。
    // assertの期待値に相違があった場合、JUnitウィンドウに"失敗"と表示される。

    // テスト元の分岐は極力全て網羅した方が良い。
    // その際、期待値と結果値をコンソールに表示するとより丁寧（この例では開始終了のみ）。

    System.out.println( "isNecessary(java.lang.String)のテスト開始" );
    // テストケース1-1 必須チェック（正常系）
    assertTrue( StringUtil.isNecessary( "あいうえお" ) );
    assertTrue( StringUtil.isNecessary( "あいうえお" ) );
    assertTrue( StringUtil.isNecessary( "1234567890" ) );
    assertTrue( StringUtil.isNecessary( "ABCDEFGHIJ" ) );
    // テストケース1-2 必須チェック（異常系）
    assertFalse( StringUtil.isNecessary( null ) );
    assertFalse( StringUtil.isNecessary( "" ) );
    assertFalse( StringUtil.isNecessary( new String() ) );
    System.out.println( "isNecessary(java.lang.String)のテスト終了" );

  }

  /**
   * {@link Utility.StringUtil#isNumChar(char)} のためのテスト・メソッド。
   */
  @Test
  public void testIsNumChar() {

    System.out.println( "isNumChar(char)のテスト開始" );
    // テストケース2-1 半角数値文字チェック（正常系）
    assertTrue( StringUtil.isNumChar( '1' ) );
    assertTrue( StringUtil.isNumChar( '5' ) );
    assertTrue( StringUtil.isNumChar( '0' ) );
    // テストケース2-2 半角数値文字チェック（異常系）
    assertFalse( StringUtil.isNumChar( '-' ) );
    assertFalse( StringUtil.isNumChar( 'a' ) );
    assertFalse( StringUtil.isNumChar( 'あ' ) );
    System.out.println( "isNumChar(char)のテスト終了" );
  }

  /**
   * {@link Utility.StringUtil#isNumString(java.lang.String)} のためのテスト・メソッド。
   */
  @Test
  public void testIsNumString() {

    System.out.println( "isNumString(java.lang.String)のテスト開始" );
    // テストケース3-1 半角数値文字チェック（正常系）
    assertTrue( StringUtil.isNumString( "12345" ) );
    assertTrue( StringUtil.isNumString( "00000" ) );
    assertTrue( StringUtil.isNumString( "あ" ) ); // falseでも良い気がする。
    // テストケース3-2 半角数値文字チェック（異常系）
    assertFalse( StringUtil.isNumString( "-12345" ) ); // trueでも良い気がする。
    assertFalse( StringUtil.isNumString( "00.00" ) );
    assertFalse( StringUtil.isNumString( "1234a56789" ) );
    assertFalse( StringUtil.isNumString( "１２３４５" ) );
    System.out.println( "isNumString(java.lang.String)のテスト終了" );
  }

  /**
   * {@link Utility.StringUtil#isNumber(java.lang.String)} のためのテスト・メソッド。
   */
  @Test
  public void testIsNumber() {

    System.out.println( "isNumber(java.lang.String)のテスト開始" );
    // テストケース4-1 半角数値文字チェック（正常系）
    assertTrue( StringUtil.isNumber( "12345" ) );
    assertTrue( StringUtil.isNumber( "00000" ) );
    assertTrue( StringUtil.isNumber( "-12345" ) ); // 正規表現であればtrueとなる。
    // テストケース4-2 半角数値文字チェック（異常系）
    assertFalse( StringUtil.isNumber( "あ" ) ); // 正規表現であればfalseとなる。
    assertFalse( StringUtil.isNumber( "00.00" ) );
    assertFalse( StringUtil.isNumber( "1234a56789" ) );
    assertFalse( StringUtil.isNumber( "１２３４５" ) );
    System.out.println( "isNumber(java.lang.String)のテスト終了" );
  }
}
