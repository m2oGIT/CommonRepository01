/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * Test13 <br />
 * Java003 ��3�̉𓚗� <br />
 * �u*�v�̊K�i <br />
 * �u*�v�̊K�i����ʕ\������ <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test13 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test13() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N������ <br />
   * �u*�v�̊K�i����ʕ\������ <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���d���[�v�Ŏ�������p�^�[���i���ϓI�ȃ��W�b�N�j

    // �u*�v�̊K�i��10�i�쐬����
    for ( int i = 1; i <= 10; i++ ) {

      // i��j���������Ȃ�܂Łu*�v���o�͂���
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( "*" );
      }
      // i��j��菬�����Ƃ����s����
      System.out.println();
    }


    // �P�ƃ��[�v�Ŏ�������p�^�[���@�i���W�b�N�Ƃ��Ă͂����炪���V���v���j

    // ������ǉ��p�̕ϐ���錾
    StringBuilder sb = new StringBuilder();

    // �u*�v��1��������Ƃ��Ēǉ�����
    for ( int i = 1; i <= 10; i++ ) {
      sb.append( "*" );
      // �ǉ����ʂ�1�s���\������
      System.out.println( sb );
    }


    // �P�ƃ��[�v�Ŏ�������p�^�[���A�iStringBuilder���g�p���Ȃ��ꍇ�j

    // ������ϐ���錾
    String str = "";

    // �u*�v��1��������Ƃ��Č�������
    for ( int i = 1; i <= 10; i++ ) {
      str += "*";
      // �������ʂ�1�s���\������
      System.out.println( str );
    }

  }
}
