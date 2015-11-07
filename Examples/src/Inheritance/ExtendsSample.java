/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �p���̎g���� <br />
 * ���ې�N���X�̃T���v�� <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ExtendsSample extends AbstractSample {

  /** �p�����i�e�N���X�j�̃����o�������I�Ɉ����p���ł���B */


  /** �p����ŃR���X�g���N�^��ǉ��Œ�`�ł���B */

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * �������\�����܂��B <br />
   */
  public ExtendsSample() {

    // �p����ŃR���X�g���N�^���`�����ꍇ�A
    // �e�N���X�̃R���X�g���N�^�ˌp����̃R���X�g���N�^�̏��Ŏ��s�����B
    System.out.println( "�p����N���X�̃R���X�g���N�^" );

  }


  /** �p����Ń����o�i�@�\�j��ǉ��E�ҏW���邱�Ƃ��ł���B */

  /**
   * ���b�Z�[�W�폜<br />
   * �ǉ����\�b�h�F�����o�ϐ��̒l���폜���܂��B <br />
   */
  public void clearMsg() {
    this.msg = "�i���b�Z�[�W�͍폜����܂����B�j";
  }


  /**
   * �{�����t�\��<br />
   * �ҏW���\�b�h�F�{�����t�i�����b���݁j��\�����܂��B <br />
   *
   */
  public void displayDate() {

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    System.out.println( "������" + sdf.format( new Date() ) + "�ł��B" );

  }


  /**
   * �{�����t�\��<br />
   * �ҏW�O���\�b�h�F�{�����t�i�����b�����j��\�����܂��B <br />
   *
   */
  public void orgDisplayDate() {

    // "super."�Őe�N���X�̃����o�ɃA�N�Z�X�ł���B�iprivate�X�R�[�v�̃����o�̓A�N�Z�X�s�B�j
    super.displayDate();

  }

}
