/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Test12 <br />
 * Java003 ��2�̉𓚗� <br />
 * ���s�����\������ <br />
 * ���s����������yyyy/mm/dd HH:MM:SS �ŕ\������ <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test12 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test12() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N������ <br />
   * ���s����������yyyy/mm/dd HH:MM:SS �ŕ\������ <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���t
    Date now = new Date();
    // ���t�̃t�H�[�}�b�g
    SimpleDateFormat sdf1 = new SimpleDateFormat( "yyyy'/'MM'/'dd'/' HH:mm:ss " );
    // ���s������\������
    System.out.println( "���s������" + sdf1.format( now ) + "�ł��B" );

  }
}
