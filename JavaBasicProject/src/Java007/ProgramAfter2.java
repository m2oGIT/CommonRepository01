/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * ProgramAfter2 <br />
 * Java007 ��2�̉𓚗� <br />
 * <br />
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N <br />
 * �Ј����̉�ʕ\���Ɠ��������`�F�b�N���s�Ȃ��B <br />
 * �X�V���� 2015/11/01 �� �ԐD�F�V�K�쐬 <br />
 */
public class ProgramAfter2 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter2() {
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

    // ��l��
    Member member1 = new Member( "00001", "��Y", "���" );
    // ��l��
    Member member2 = new Member( "00002", "��Y", "���" );
    // �O�l��
    Member member3 = new Member( "00003", "�O�Y", "���" );

    // �Ј�����\���i��l�ځj
    member1.showinfo();
    // �Ј�����\���i��l�ځj
    member2.showinfo();
    // �Ј�����\���i�O�l�ځj
    member3.showinfo();

    // ���������`�F�b�N�i��l�ڂƓ�l�ځj
    member1.checkName( member2 );
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    member1.checkName( member3 );
    // ���������`�F�b�N�i��l�ڂƎO�l�ځj
    member2.checkName( member3 );

  }
}
