/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Constructor;

/**
 * �R���X�g���N�^�̎g���� <br />
 * �R���X�g���N�^�̃T���v���i�Ăяo����鑤�j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class MyCar3 {

  /** ���l�^�̃����o�[�ϐ� */
  private int num = 0;

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * ���������Ȃ��B <br />
   */
  public MyCar3() {
    // �C���X�^���X�������ɍs����������������΃R���X�g���N�^�ɋL�q����B
    // ���̗�ł́A�����o�ϐ��ɑ��N���X�̒l��ݒ肵�Ă���B
    this.num = new MyCar1().getNum();
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
