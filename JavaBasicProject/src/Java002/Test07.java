/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test07 <br />
 * Java002 ��1�̉𓚗� <br />
 * ���Z���� <br />
 * 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test07 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test07() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���v
    int sum = 0;
    // 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for ( int i = 1; i <= 100; i++ ) {
      sum += i;
      // ���D�݂œr���o�߂̕\�����B
      System.out.println( "i: " + i + " sum: " + sum );
    }

    // ���v�̕\��
    System.out.println( "1�`100�܂ł̍��v��" + sum + "�ł��B" );

  }

  /**
   * Java002 ��5�̉𓚗� <br />
   * ���������[�v�ŉ񂵂āA���Z���� <br />
   *
   * @param num1 ������
   * @param num2 ������
   * @return sum �v�Z����
   */
  public static int addNum( int num1, int num2 ) {

    // ���v
    int sum = 0;
    // 1�`100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for ( int i = num1; i <= num2; i++ ) {
      sum += i;
      // ���D�݂œr���o�߂̕\�����B
      System.out.println( "i: " + i + " sum: " + sum );
    }

    // ���v�����l��Ԃ�
    return sum;
  }
}
