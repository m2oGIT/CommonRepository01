/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test05 <br />
 * Java001 ��5�̉𓚗� <br />
 *
 * �R���\�[���\�� <br />
 * �R���\�[���ɕ\������ <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test05 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test05() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * �����̕�������N���������ɓn���āA�R���\�[���ɕ\������ <br />
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    // �N���������ŗ^�����C�ӂ̕������\������
    // �N���������̓��j���[�́u���s�\���v���u�����v������́B
    // �X�̕������"" "" "" �E�E�E�ň͂ނ��ƁB
    System.out.println( args[0] );
    System.out.println( args[1] );

    // �Ȃ��A�N���������̗v�f���͓��I�ł���A�N�����Ɋ�n���ꂽ���Ŋm�肷��B
    System.out.println( args.length );

    // ���̓����𗘗p���A���_��ɃR�[�f�B���O����Ȃ�ȉ��̒ʂ�B
    for ( int i = 0; i < args.length; i++ ) {
      System.out.println( args[i] );
    }
  }
}
