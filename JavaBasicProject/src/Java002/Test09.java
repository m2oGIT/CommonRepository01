/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * Test09 <br />
 * Java002 ��3�̉𓚗� <br />
 * ���Z���� <br />
 * 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test09 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test09() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z���� <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���s��������String�^����int�^�֌^�ϊ�����
    // ���s�������Ȃ��@�������͐��l�ȊO�̏ꍇ�͗�O����������
    int num = Integer.parseInt( args[0] );
    // ���v
    int sum = 0;
    // 1�`���s�������܂ł̐��l�����[�v�ŉ񂵂āA���Z����
    for ( int i = 1; i <= num; i++ ) {
      sum += i;
      // ���D�݂œr���o�߂̕\�����B
      System.out.println( "i: " + i + " sum: " + sum );

    }

    // ���v�̕\��
    System.out.println( "1�`" + num + "�܂ł̍��v��" + sum + "�ł��B" );

  }
}
