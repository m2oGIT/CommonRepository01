/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java001;

/**
 * Test03 <br />
 * Java001 ��3�̉𓚗� <br />
 *
 * �R���\�[���\�� <br />
 * �R���\�[���ɕ\������ <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test03 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test03() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N�����܂��B <br />
   * �R���\�[���ɕ\������ <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �R���\�[���ɕ�������o�́i���@�@�j
    // ��ԃX�^���_�[�h�ȕ��@�B
    System.out.println( "2017�N06��23��(Fri)" );
    System.out.println( "Java�̉��K���ł��B" );
    System.out.println( "eclipse�ŐF�X�Ǝ��s���낵�Ȃ���i�߂Ă݂܂��傤�B" );
    System.out.println( "��낵�����肢���܂��B" );
    System.out.println( "" );

    // �R���\�[���ɕ�������o�́i���@�A�j
    // ���ɕ�����̕ϐ��������ꍇ�Ȃǂ́AStringBuilder�Ō������Ĉꊇ�o�͂�����@���ǂ��g���B
    StringBuilder sb = new StringBuilder();
    sb.append( "2017�N06��23��(Fri)\n" );
    sb.append( "Java�̉��K���ł��B\n" );
    sb.append( "eclipse�ŐF�X�Ǝ��s���낵�Ȃ���i�߂Ă݂܂��傤�B\n" );
    sb.append( "��낵�����肢���܂��B" );

    System.out.println( sb );
    System.out.println( "" );

    // �R���\�[���ɕ�������o�́i���@�B�j
    // �P���ɕ������ "+" �Ō������Ĉꊇ�o�͂��Ă��������ʂ�������B
    String str = "";
    str += "2017�N06��23��(Fri)\n";
    str += "Java�̉��K���ł��B\n";
    str += "eclipse�ŐF�X�Ǝ��s���낵�Ȃ���i�߂Ă݂܂��傤�B\n";
    str += "��낵�����肢���܂��B";

    System.out.println( str );
    System.out.println( "" );

    //���\�b�h���̖{���̐擪�s�Ɩ����s�ɋ�s��}������ƁA
    //�ǐ����オ��B�ȍ~�̊e�N���X�Ƃ����l�B

  }
}
