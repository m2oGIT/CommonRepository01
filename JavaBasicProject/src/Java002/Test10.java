/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test10 <br />
 * Java002 ��5�̉𓚗� <br />
 * ���Z���� <br />
 * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test10 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test10() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���s��������String�^����int�^�֌^�ϊ�����
    int num1 = Integer.parseInt( args[0] );
    int num2 = Integer.parseInt( args[1] );

    // Test07�ɐV�K���\�b�h���쐬�����ꍇ�́A�ȉ��̒ʂ�B
    int sum = Test07.addNum( num1, num2 );
    System.out.println( "" );

    // Test10�ɐV�K���\�b�h���쐬�����ꍇ�́A�ȉ��̒ʂ�B
    sum = addNum( num1, num2 );
    System.out.println( "" );

    System.out.println( num1 + "�`" + num2 + "�܂ł̍��v��" + sum + "�ł��B" );
  }

  /**
   * �n���ꂽ2��ނ̐����̊Ԃ̐������ׂč��v���� <br />
   *
   * @param num1 ������
   * @param num2 ������
   * @return sum �v�Z����
   */
  public static int addNum( int num1, int num2 ) {

    // ���v
    int sum = 0;
    // num1�`num2�܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for ( int i = num1; i <= num2; i++ ) {
      sum += i;
      // ���D�݂œr���o�߂̕\�����B
      System.out.println( "i: " + i + " sum: " + sum );

    }

    // ���v�����l��Ԃ�
    return sum;

  }
}
