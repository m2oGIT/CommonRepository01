/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Static;

/**
 * static�̎g���� <br />
 * static�̃T���v���i�Ăяo����鑤�j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class MyCar2 {

  /** ���l�^�̃����o�[�ϐ� */
  // �ʏ��static�i�ÓI�j�錾��t�^���Ȃ��B�i����static�j
  private int num = 0;

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * ���������Ȃ��B <br />
   */
  public MyCar2() {
    // �C���X�^���X�����inew�j���ɍs����������������΃R���X�g���N�^�ɋL�q����B
    // ���̗�ł́A�����o�ϐ��ɒl��ݒ肵�Ă���B
    this.num = 1234567890;
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
