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
 * ���t���[�e�B���e�B�N���X <br />
 * ���t����Ɋւ��郆�[�e�B���e�B�N���X�ł��B <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class DateUtil {

  /** ���P�[�����w�肷��B */
  private static Locale locale = new Locale( "ja", "JP", "JP" );

  /** ���e����a����t�̃t�H�[�}�b�g���w�肷��B */
  private static DateFormat japaseseFormat = new SimpleDateFormat( "GGGGy�NMM��dd��", locale );

  /** ���e���鐼����t�̃t�H�[�}�b�g���w�肷��B */
  private static DateFormat annoDominiformat = new SimpleDateFormat( "yyyy/MM/dd" );

  /** TimeStamp�ϊ����̃t�H�[�}�b�g���w�肷��B */
  private static DateFormat annoDominiformatLD = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );


  /**
   * ���t�`�F�b�N<br />
   * �s�����t�̏ꍇ��false��Ԃ��܂��B <br />
   *
   * @param value �Ώۂ̕�����
   * @return �`�F�b�N����
   */
  public static boolean isDate( String value ) {

    try {
      // ���t�̑Ó����`�F�b�N�̐��x��"����"���w��B
      annoDominiformat.setLenient( false );
      annoDominiformat.parse( value );
    } catch ( ParseException e ) {
      // �ϊ����s���͕s�����t�B
      return false;
    }
    // �ϊ��ɐ�������ΐ��������t�Ƃ݂Ȃ��B
    return true;
  }


  /**
   * �a��ϊ�<br />
   * ����\�L��a��\�L�ɕϊ����܂��B <br />
   *
   * @param value �Ώۂ̕�����
   * @return ���������t�F�ϊ����� �s�����t�Fnull��ԋp
   */
  public static String formatJP( String value ) {

    // ���t�̑Ó����`�F�b�N�̐��x��"����"���w��B
    annoDominiformat.setLenient( false );
    Date date = null;

    try {
      // �����񂩂���t�^�֕ϊ��B
      date = annoDominiformat.parse( value );
    } catch ( ParseException e ) {
      // �s�����t
      return null;
    }

    // �t�H�[�}�b�g��K�p��������Ƃ��ĕԋp�B
    return japaseseFormat.format( date.getTime() );

  }


  /**
   * ����ϊ�<br />
   * �a��\�L�𐼗�\�L�ɕϊ����܂��B <br />
   *
   * @param value �Ώۂ̕�����
   * @return ���������t�F�ϊ����� �s�����t�Fnull��ԋp
   */
  public static String formatAD( String value ) {

    // ���t�̑Ó����`�F�b�N�̐��x��"����"���w��B
    japaseseFormat.setLenient( false );
    Date date = null;

    try {
      // �����񂩂���t�^�֕ϊ��B
      date = japaseseFormat.parse( value );
    } catch ( ParseException e ) {
      // �s�����t
      return null;
    }

    // �t�H�[�}�b�g��K�p��������Ƃ��ĕԋp�B
    return annoDominiformat.format( date );

  }


  /**
   * TimeStamp�^�ւ̕ϊ�<br />
   * ������^����TimeStamp�^�֕ϊ����܂��B <br />
   *
   * @param value �Ώۂ̕�����
   * @return ���������t�F�ϊ����� �s�����t�Fnull��ԋp
   */
  public static Timestamp formatTS( String value ) {

    // ���t�̑Ó����`�F�b�N�̐��x��"����"���w��B
    annoDominiformatLD.setLenient( false );
    Long dateTimeLong = null;

    try {
      // �����񂩂�TimeStamp�^�֕ϊ��B
      dateTimeLong = annoDominiformatLD.parse( value ).getTime();
      return new Timestamp( dateTimeLong );
    } catch ( ParseException e ) {
      // �s�����t
      return null;
    }
  }

}
