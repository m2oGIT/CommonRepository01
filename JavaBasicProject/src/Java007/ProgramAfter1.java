/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * ProgramAfter1 <br />
 * Java007 ��1�̉𓚗� <br />
 * <br />
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N <br />
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N���s�Ȃ��B <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class ProgramAfter1 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter1() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �Ј����̉�ʕ\���Ɠ��������`�F�b�N <br />
   * �Ј����i�Ј�No�A���O�A���j����l���ݒ肵�A��ʕ\�����s�Ȃ��B <br />
   * �܂����������`�F�b�N���s���A���茋�ʂ���ʕ\������B <br />
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";
    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";
    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";


    // �Ј�����\���i��l�ځj
    showinfo( id1, firstName1, secondName1 );
    // �Ј�����\���i��l�ځj
    showinfo( id2, firstName2, secondName2 );
    // �Ј�����\���i�O�l�ځj
    showinfo( id3, firstName3, secondName3 );
    // ���������`�F�b�N�i��l�ڂƓ�l�ځj
    checkName( id1, firstName1, secondName1, id2, firstName2, secondName2 );
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    checkName( id1, firstName1, secondName1, id3, firstName3, secondName3 );
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    checkName( id2, firstName2, secondName2, id3, firstName3, secondName3 );

  }

  /**
   * �Ј�����\�� <br />
   * �Ј����i�Ј�No�A���A���A�����j��\������B <br />
   *
   * @param id �Ј�No
   * @param firstName ��
   * @param secondName ��
   */
  public static void showinfo( String id, String firstName, String secondName ) {

    // �Ј�No��\��
    System.out.println( "�Ј�No�F" + id );
    // ����\��
    System.out.println( "���@�@�F" + secondName );
    // ����\��
    System.out.println( "���@�@�F" + firstName );
    // ������\��
    System.out.println( "�����@�F" + secondName + " " + firstName );
    // ���s
    System.out.println( "" );

  }

  /**
   * ���������`�F�b�N <br />
   * ���Ɛ������ꂼ�ꓙ���������肵�A���茋�ʂ���ʕ\������B <br />
   *
   * @param id1 �Ј�No(��l��)
   * @param firstName1 ��(��l��)
   * @param secondName1 ��(��l��)
   * @param id2 �Ј�No(��l��)
   * @param firstName2 ��(��l��)
   * @param secondName2 ��(��l��)
   */
  public static void checkName( String id1, String firstName1, String secondName1,
      String id2, String firstName2, String secondName2 ) {

    if ( secondName1.equals( secondName2 ) && firstName1.equals( firstName2 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA" + "�Ј�No=[" + id2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA" + "�Ј�No=[" + id2 + "]�͓��������ł͂���܂���B" );

    }
  }
}
