/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �p���̎g���� <br />
 * ���ۃN���X�̃T���v�� <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public abstract class AbstractSample {

  protected String msg = "�e�N���X�̃����o�ϐ�";

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * �������\�����܂��B <br />
   */
  public AbstractSample() {
    System.out.println( "�e�N���X�̃R���X�g���N�^" );
  }

  /**
   * ���b�Z�[�W�\��<br />
   * �����o�ϐ��̒l��\�����܂��B <br />
   */
  public void displayMsg() {
    System.out.println( msg );
  }

  /**
   * ���b�Z�[�W�X�V<br />
   * �����o�ϐ��̒l���X�V���܂��B <br />
   *
   * @param msg �X�V���郁�b�Z�[�W
   */
  public void changeMsg( String msg ) {
    this.msg = msg;
  }

  /**
   * �{�����t�\��<br />
   * �{�����t��\�����܂��B <br />
   *
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
    System.out.println( "������" + sdf.format( new Date() ) + "�ł��B" );

  }

}
