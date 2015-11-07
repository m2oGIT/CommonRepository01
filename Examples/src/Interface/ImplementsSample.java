/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Interface;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * �C���^�[�t�F�[�X�����̎g���� <br />
 * �C���^�[�t�F�[�X�����������N���X�̃T���v�� <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ImplementsSample implements InterfaceSample {


  /** �C���^�[�t�F�[�X�����N���X�̓R���X�g���N�^���`�\ */
  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * �������\�����܂��B <br />
   */
  public ImplementsSample() {
    System.out.println( "�C���^�[�t�F�[�X�����N���X�̃R���X�g���N�^" );
  }

  /** �C���^�[�t�F�[�X�����N���X�͎������̑S�Ẵ��\�b�h��`����������K�v������B */

  /**
   * ���b�Z�[�W�\��<br />
   * �����o�ϐ��̒l��\�����܂��B <br />
   */
  public void displayMsg() {
    System.out.println( MSG );
  }

  /**
   * ���b�Z�[�W�X�V<br />
   * �����o�ϐ��̒l���X�V���܂��B <br />
   *
   * @param msg �X�V���郁�b�Z�[�W
   */
  public void changeMsg( String msg ) {
    // �C���^�[�t�F�[�X�̃����o�ϐ��͍X�V�s�B
    // this.MSG = msg;
    System.out.println( "�C���^�[�t�F�[�X�̃����o�ϐ��͍X�V�ł��܂���B" );
  }

  /**
   * �{�����t�\��<br />
   * �{�����t��\�����܂��B <br />
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
    System.out.println( "������" + sdf.format( new Date() ) + "�ł��B" );

  }

  /** �C���^�[�t�F�[�X�����N���X�Ń����o��ǉ����邱�Ƃ��\�B */

  /**
   * �{�������\��<br />
   * �{��������\�����܂��B <br />
   */
  public void displayTime() {

    SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss" );
    System.out.println( "���ݎ�����" + sdf.format( new Date() ) + "�ł��B" );

  }

}
