/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test08 <br />
 * Java002 ��2�̉𓚗� <br />
 * ���Z���� <br />
 * 1�`100�܂ł̐��l�����[�v�ŉ񂵁A��̏ꍇ�͉��Z���� <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test08 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test08() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`100�܂ł̐��l�����[�v�ŉ񂷁B��̏ꍇ�A���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���v
    int sum = 0;
    // 1�`100�܂ł̐��l�����[�v�ŉ�
    for ( int i = 1; i <= 100; i++ ) {
      // ��̏ꍇ�A���Z����
      // ��](%)���u1�v�Ȃ��A�u0�v�Ȃ�����A�Ƃ������W�b�N�B
      if ( i % 2 == 1 ) {
        sum += i;
        // ���D�݂œr���o�߂̕\�����B
        System.out.println( "i: " + i + " sum: " + sum );
      }
    }

    // ���v��\��
    System.out.println( "1�`100�܂ł̊�̍��v��" + sum + "�ł��B" );

  }
}
