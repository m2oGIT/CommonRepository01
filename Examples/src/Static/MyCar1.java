/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Static;

/**
 * static�̎g���� <br />
 * static�̃T���v���i�Ăяo����鑤�j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public final class MyCar1 {

  /** ���l�^�̃����o�[�ϐ� */
  // static�i�ÓI�j�錾��t�^���邱�ƂŁA�������ɐÓI�ɓW�J�����B
  private static int num = 0;

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * ���������Ȃ��B <br />
   */
  private MyCar1() {
    // �R���X�g���N�^��private�Ő錾����ƁA
    // �u�R���X�g���N�^�������Ď��s����Ȃ���new�ł��Ȃ����C���X�^���X�����֎~����v
    // �Ƃ����錾�ɂȂ�Bstatic�����o�����N���X�̓C���X�^���X�����֎~���������e�؁B
    // static�����o�����N���X��public�R���X�g���N�^��錾�\�����A
    super();
  }

  // static�����o�����N���X��public�R���X�g���N�^��錾�\�����A
  // �ێ琫�̊ϓ_����Astatic�����o�Ɣ�static�ȃ����o�͓���N���X�ɋL�q���ׂ��ł͂Ȃ��A
  // �N���X�݌v���猩�����ׂ��B
//  /**
//   * �f�t�H���g�R���X�g���N�^ <br />
//   * ���������Ȃ��B <br />
//   */
//  public MyCar1() {
//    super();
//  }

  /**
   * num��getter<br />
   * num�̒l��ԋp���܂��B <br />
   *
   * @return num ���݂̐��l
   */
  public static int getNum() {
    return num;
  }

  /**
   * num��setter<br />
   * num�̒l��ݒ肵�܂��B <br />
   *
   * @param arg �ݒ肷��l
   */
  public static void setNum( int arg ) {
    num = arg;
  }

}
