/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Constructor;

/**
 * �R���X�g���N�^�̎g���� <br />
 * �R���X�g���N�^�̃T���v���i�Ăяo����鑤�j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class MyCar1 {

  /** ���l�^�̃����o�[�ϐ� */
  private int num = 0;

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^�i���������Ȃ��j <br />
   */
  public MyCar1() {
    // ���ɍs���������Ȃ��ꍇ��super�N���X�̃R���X�g���N�^���Ăяo���B
    // Object�N���X�̃R���X�g���N�^�ł���A�����������Ȃ��B
    // �u���������͓��ɉ����Ȃ��v�Ƃ��������I�Ȑ錾�ɂȂ�B�ȗ����\�B
    super();
  }

  /**
   * num��getter<br />
   * num�̒l��ԋp���܂��B <br />
   *
   * @return num ���݂̐��l
   */
  public int getNum() {
    return num;
  }

  /**
   * num��setter<br />
   * num�̒l��ݒ肵�܂��B <br />
   *
   * @param num �ݒ肷��l
   */
  public void setNum( int num ) {
    this.num = num;
  }

}
