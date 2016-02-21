/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ArrayTest <br />
 * Java004 ��1�`��2�̉𓚗�i�g��for���Ŏ��������ꍇ�j <br />
 * �g��for���̓��[�v����p�̕ϐ���index�\�L�����点�邪�A����ݐ[���̂͒ʏ��for���B <br />
 * �ǂ�����g�����͏󋵂�v���O���}�̍D�݂Ŕ��f�����ꍇ�������B <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class ArrayTestExtends {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ArrayTestExtends() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N������ <br />
   * �R���\�[�����A������5����͂����A�ő�l���R���\�[���o�͂��� <br />
   * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
   *
   * @param args ���s������
   * @throws IOException IO�G���[
   */
  public static void main( String[] args ) throws IOException {

    // ���͎w����\��
    System.out.println( "������5����͂��Ă��������B" );
    System.out.println();

    // ���͓��e��ǂݍ��ނ��߂̃o�b�t�@�[
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    // ���͓��e���i�[����z��
    int[] array = new int[5];

    // ������5�����
    for ( int i = 0; i < 5; i++ ) {
      // ���͓��e��str�Ɋi�[
      String str = br.readLine();
      // ���͓��e�������̎��A�z��Ɋi�[
      // ���͓��e�������ȊO�̎��A�G���[���b�Z�[�W��\�����A�������I��
      try {
        array[i] = Integer.parseInt( str );
      } catch ( NumberFormatException e ) {
        System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
      }
    }

    // �ő�l
    int max = 0;
    // �ő�l�����߂�
    for ( int value : array ) {
      if ( max < value ) {
        max = value;
      }
    }

    // �ő�l��\��
    System.out.println( "�ő�l��" + max );
    // ��2���ǉ��̎���
    // ���v�l
    int sum = 0;
    // ���͂���5�̐��������v����
    for ( int value : array ) {
      sum += value;
    }

    // ���v�l��\��
    System.out.println( "���v�l��" + sum );

    // ���ϒl
    double ave = 0.0;
    // ���͂���5�̐����̕��ϒl�����߂�
    ave = sum / array.length;
    // ���ϒl��\��
    System.out.println( "���ϒl��" + ave );

  }
}