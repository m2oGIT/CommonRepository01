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
 * �����񃆁[�e�B���e�B�e�X�g�N���X <br />
 * �����񑀍�Ɋւ��郆�[�e�B���e�B�̃e�X�g�N���X�ł��B <br />
 * �X�V���� 2016/07/23 �R�{ ���u�F�V�K�쐬 <br />
 */
public class StringUtiltest {

  /**
   * �e�X�g�O���s���\�b�h <br />
   * �e�X�g�O���s����郁�\�b�h <br />
   *
   * @throws java.lang.Exception ���s����O
   */
  @Before
  public void setUp() throws Exception {
    // �e�X�g�J�n�O�Ɏ��s����������������ꍇ�͋L�q����B
    // ����͍s���ׂ������Ȃ��B
  }

  /**
   * �e�X�g����s���\�b�h <br />
   * �e�X�g����s����郁�\�b�h <br />
   *
   * @throws java.lang.Exception ���s����O
   */
  @After
  public void tearDown() throws Exception {
    // �e�X�g�J�n��Ɏ��s����������������ꍇ�͋L�q����B
    // ����͍s���ׂ������Ȃ��B
  }

  /**
   * {@link Utility.StringUtil#isNecessary(java.lang.String)} �̂��߂̃e�X�g�E���\�b�h�B
   */
  @Test
  public void testIsNecessary() {

    // �e�X�g�Ώۃ��\�b�h��JUnit��assert�n���\�b�h�ɓK�p����B
    // assert�̊��Ғl�ɑ��Ⴊ�������ꍇ�AJUnit�E�B���h�E��"���s"�ƕ\�������B

    // �e�X�g���̕���͋ɗ͑S�Ėԗ����������ǂ��B
    // ���̍ہA���Ғl�ƌ��ʒl���R���\�[���ɕ\������Ƃ�蒚�J�i���̗�ł͊J�n�I���̂݁j�B

    System.out.println( "isNecessary(java.lang.String)�̃e�X�g�J�n" );
    // �e�X�g�P�[�X1-1 �K�{�`�F�b�N�i����n�j
    assertTrue( StringUtil.isNecessary( "����������" ) );
    assertTrue( StringUtil.isNecessary( "����������" ) );
    assertTrue( StringUtil.isNecessary( "1234567890" ) );
    assertTrue( StringUtil.isNecessary( "ABCDEFGHIJ" ) );
    // �e�X�g�P�[�X1-2 �K�{�`�F�b�N�i�ُ�n�j
    assertFalse( StringUtil.isNecessary( null ) );
    assertFalse( StringUtil.isNecessary( "" ) );
    assertFalse( StringUtil.isNecessary( new String() ) );
    System.out.println( "isNecessary(java.lang.String)�̃e�X�g�I��" );

  }

  /**
   * {@link Utility.StringUtil#isNumChar(char)} �̂��߂̃e�X�g�E���\�b�h�B
   */
  @Test
  public void testIsNumChar() {

    System.out.println( "isNumChar(char)�̃e�X�g�J�n" );
    // �e�X�g�P�[�X2-1 ���p���l�����`�F�b�N�i����n�j
    assertTrue( StringUtil.isNumChar( '1' ) );
    assertTrue( StringUtil.isNumChar( '5' ) );
    assertTrue( StringUtil.isNumChar( '0' ) );
    // �e�X�g�P�[�X2-2 ���p���l�����`�F�b�N�i�ُ�n�j
    assertFalse( StringUtil.isNumChar( '-' ) );
    assertFalse( StringUtil.isNumChar( 'a' ) );
    assertFalse( StringUtil.isNumChar( '��' ) );
    System.out.println( "isNumChar(char)�̃e�X�g�I��" );
  }

  /**
   * {@link Utility.StringUtil#isNumString(java.lang.String)} �̂��߂̃e�X�g�E���\�b�h�B
   */
  @Test
  public void testIsNumString() {

    System.out.println( "isNumString(java.lang.String)�̃e�X�g�J�n" );
    // �e�X�g�P�[�X3-1 ���p���l�����`�F�b�N�i����n�j
    assertTrue( StringUtil.isNumString( "12345" ) );
    assertTrue( StringUtil.isNumString( "00000" ) );
    assertTrue( StringUtil.isNumString( "��" ) ); // false�ł��ǂ��C������B
    // �e�X�g�P�[�X3-2 ���p���l�����`�F�b�N�i�ُ�n�j
    assertFalse( StringUtil.isNumString( "-12345" ) ); // true�ł��ǂ��C������B
    assertFalse( StringUtil.isNumString( "00.00" ) );
    assertFalse( StringUtil.isNumString( "1234a56789" ) );
    assertFalse( StringUtil.isNumString( "�P�Q�R�S�T" ) );
    System.out.println( "isNumString(java.lang.String)�̃e�X�g�I��" );
  }

  /**
   * {@link Utility.StringUtil#isNumber(java.lang.String)} �̂��߂̃e�X�g�E���\�b�h�B
   */
  @Test
  public void testIsNumber() {

    System.out.println( "isNumber(java.lang.String)�̃e�X�g�J�n" );
    // �e�X�g�P�[�X4-1 ���p���l�����`�F�b�N�i����n�j
    assertTrue( StringUtil.isNumber( "12345" ) );
    assertTrue( StringUtil.isNumber( "00000" ) );
    assertTrue( StringUtil.isNumber( "-12345" ) ); // ���K�\���ł����true�ƂȂ�B
    // �e�X�g�P�[�X4-2 ���p���l�����`�F�b�N�i�ُ�n�j
    assertFalse( StringUtil.isNumber( "��" ) ); // ���K�\���ł����false�ƂȂ�B
    assertFalse( StringUtil.isNumber( "00.00" ) );
    assertFalse( StringUtil.isNumber( "1234a56789" ) );
    assertFalse( StringUtil.isNumber( "�P�Q�R�S�T" ) );
    System.out.println( "isNumber(java.lang.String)�̃e�X�g�I��" );
  }
}
