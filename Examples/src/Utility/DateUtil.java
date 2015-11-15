/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Utility;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日付ユーティリティクラス <br />
 * 日付操作に関するユーティリティクラスです。 <br />
 * 更新履歴 2015/10/28 山本 高志：新規作成 <br />
 */
public class DateUtil {

  /** ロケールを指定する。 */
  private static Locale locale = new Locale( "ja", "JP", "JP" );

  /** 許容する和暦日付のフォーマットを指定する。 */
  private static DateFormat japaseseFormat = new SimpleDateFormat( "GGGGy年MM月dd日", locale );

  /** 許容する西暦日付のフォーマットを指定する。 */
  private static DateFormat annoDominiformat = new SimpleDateFormat( "yyyy/MM/dd" );

  /** TimeStamp変換元のフォーマットを指定する。 */
  private static DateFormat annoDominiformatLD = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );


  /**
   * 日付チェック<br />
   * 不正日付の場合はfalseを返します。 <br />
   *
   * @param value 対象の文字列
   * @return チェック結果
   */
  public static boolean isDate( String value ) {

    try {
      // 日付の妥当性チェックの精度は"厳密"を指定。
      annoDominiformat.setLenient( false );
      annoDominiformat.parse( value );
    } catch ( ParseException e ) {
      // 変換失敗時は不正日付。
      return false;
    }
    // 変換に成功すれば正しい日付とみなす。
    return true;
  }


  /**
   * 和暦変換<br />
   * 西暦表記を和暦表記に変換します。 <br />
   *
   * @param value 対象の文字列
   * @return 正しい日付：変換結果 不正日付：nullを返却
   */
  public static String formatJP( String value ) {

    // 日付の妥当性チェックの精度は"厳密"を指定。
    annoDominiformat.setLenient( false );
    Date date = null;

    try {
      // 文字列から日付型へ変換。
      date = annoDominiformat.parse( value );
    } catch ( ParseException e ) {
      // 不正日付
      return null;
    }

    // フォーマットを適用し文字列として返却。
    return japaseseFormat.format( date.getTime() );

  }


  /**
   * 西暦変換<br />
   * 和暦表記を西暦表記に変換します。 <br />
   *
   * @param value 対象の文字列
   * @return 正しい日付：変換結果 不正日付：nullを返却
   */
  public static String formatAD( String value ) {

    // 日付の妥当性チェックの精度は"厳密"を指定。
    japaseseFormat.setLenient( false );
    Date date = null;

    try {
      // 文字列から日付型へ変換。
      date = japaseseFormat.parse( value );
    } catch ( ParseException e ) {
      // 不正日付
      return null;
    }

    // フォーマットを適用し文字列として返却。
    return annoDominiformat.format( date );

  }


  /**
   * TimeStamp型への変換<br />
   * 文字列型からTimeStamp型へ変換します。 <br />
   *
   * @param value 対象の文字列
   * @return 正しい日付：変換結果 不正日付：nullを返却
   */
  public static Timestamp formatTS( String value ) {

    // 日付の妥当性チェックの精度は"厳密"を指定。
    annoDominiformatLD.setLenient( false );
    Long dateTimeLong = null;

    try {
      // 文字列からTimeStamp型へ変換。
      dateTimeLong = annoDominiformatLD.parse( value ).getTime();
      return new Timestamp( dateTimeLong );
    } catch ( ParseException e ) {
      // 不正日付
      return null;
    }
  }

}
