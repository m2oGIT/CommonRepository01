/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * ProgramAfter3 <br />
 * Java008 ��3�̉𓚗� <br />
 * <br />
 * �Ј����̉�ʕ\���ƕύX <br />
 * �Ј�����ݒ肵�A��ʂɕ\������B <br />
 * �܂��Ј����̕ύX�A�擾���s�Ȃ��B <br />
 * �X�V���� 2015/11/01 �� �ԐD�F�V�K�쐬 <br />
 */
public class ProgramAfter3 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter3() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �Ј����̉�ʕ\���ƕύX <br />
   * �Ј����i�Ј�No�A���O�A���j��ݒ肵�A��ʂɕ\������B <br />
   * �܂��Ј����̕ύX�A�擾���s�Ȃ��B <br />
   * �i���L�v���O�����ł͖��O�̕ύX�Ǝ擾���s�Ȃ��Ă���j
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    // �Ј��N���X
    Member member1 = new Member( "00001", "��Y", "���" );
    // �Ј�����\��
    member1.showinfo();
    // ���O��\��
    System.out.println( "���O�A�ύX�O�F" + member1.getFirstName() );
    // ���O��ύX
    member1.setFirstName( "�Ԏq" );
    // ���O��\��
    System.out.println( "���O�A�ύX��F" + member1.getFirstName() );
    System.out.println();
    // �Ј�����\��
    member1.showinfo();

  }
}
