/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test02 <br />
 * Java001 ��1�̉𓚗� <br />
 *
 * �R���\�[���ɕ�������o�� <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test02 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test02() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �R���\�[���ɕ�������o��
    System.out.println( "Hello Wolrd!!" );
    System.out.println( "" );

    // �R���\�[���ɕ�������o�́i���@�@�j
    // ��ԃX�^���_�[�h�ȕ��@�B
    System.out.println( "�悤����Java�׋���ցB" );
    System.out.println( "�����2�ڂ�Java�v���O�����ł��B" );
    System.out.println( "��x�̎��s�ŕ����s�R���\�[���o�͂��Ă݂܂��傤�B" );
    System.out.println( "" );

    // �R���\�[���ɕ�������o�́i���@�A�j
    // ���ɕ�����̕ϐ��������ꍇ�Ȃǂ́AStringBuilder�Ō������Ĉꊇ�o�͂�����@���ǂ��g���B
    StringBuilder sb = new StringBuilder();
    sb.append( "�悤����Java�׋���ցB\n" );
    sb.append( "�����2�ڂ�Java�v���O�����ł��B\n" );
    sb.append( "��x�̎��s�ŕ����s�R���\�[���o�͂��Ă݂܂��傤�B" );

    System.out.println( sb );
    System.out.println( "" );

    // �R���\�[���ɕ�������o�́i���@�B�j
    // �P���ɕ������ "+" �Ō������Ĉꊇ�o�͂��Ă��������ʂ�������B
    String str = "";
    str += "�悤����Java�׋���ցB\n";
    str += "�����2�ڂ�Java�v���O�����ł��B\n";
    str += "��x�̎��s�ŕ����s�R���\�[���o�͂��Ă݂܂��傤�B";

    System.out.println( str );
    System.out.println( "" );

    // ���s�������̏o��
    System.out.println( args[0] );

  }

}
