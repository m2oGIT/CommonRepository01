/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Interface;


/**
 * �C���^�[�t�F�[�X�̎g���� <br />
 * �C���^�[�t�F�[�X�N���X�̃T���v�� <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public interface InterfaceSample {

  /** Interface�N���X��final��������public static �ȊO�̃����o�ϐ������ĂȂ� */
  String MSG = "Interface�N���X�̃����o�ϐ�";

  /** Interface�N���X�̓R���X�g���N�^�����ĂȂ� */
  // /**
  // * �f�t�H���g�R���X�g���N�^ <br />
  // * �������\�����܂��B <br />
  // */
  // public InterfaceSample() {
  // System.out.println( "Interface�N���X�̃R���X�g���N�^" );
  // }

  /** Interface�N���X�̓��\�b�h�̖{�������ĂȂ� */
  // /**
  // * ���b�Z�[�W�\��<br />
  // * �����o�ϐ��̒l��\�����܂��B <br />
  // */
  // public void displayMsg() {
  // System.out.println( msg );
  // }

  /**
   * ���b�Z�[�W�\��<br />
   * �����o�ϐ��̒l��\�����܂��B <br />
   */
  void displayMsg();

  /**
   * ���b�Z�[�W�X�V<br />
   * �����o�ϐ��̒l���X�V���܂��B <br />
   *
   * @param msg �X�V���郁�b�Z�[�W
   */
  void changeMsg( String msg );

  /**
   * �{�����t�\��<br />
   * �{�����t��\�����܂��B <br />
   */
  void displayDate();

}
