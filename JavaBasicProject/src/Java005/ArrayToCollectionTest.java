/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ArrayToCollectionTest <br />
 * Java005 ��1�`��2�̉𓚗� <br />
 * �ő�l�擾���� <br />
 * <br />
 * �R���\�[�����A��������͂����A�ő�l���R���\�[���o�͂��� <br />
 * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
 * �X�V���� 2015/10/04 �� �ԐD�F�V�K�쐬 <br />
 */
public class ArrayToCollectionTest {

  /** �J��Ԃ��񐔂�萔�� */
  private static final int REPEAT_NUM = 5;

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ArrayToCollectionTest() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N������ <br />
   * �R���\�[�����A��������͂����A�ő�l���R���\�[���o�͂��� <br />
   * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
   *
   * @param args ���s������
   * @throws IOException IO�G���[
   */
  public static void main( String[] args ) throws IOException {

    // ���͎w����\��
    System.out.println( "������" + REPEAT_NUM + "����͂��Ă��������B" );
    System.out.println();

    // �R���\�[�����͗p�N���X�̃C���X�^���X��錾
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    // ���͓��e���i�[����z��
    ArrayList<Integer> array = new ArrayList<Integer>();

    // �w��񐔂����J��Ԃ�
    for ( int i = 0; i < REPEAT_NUM; i++ ) {

      // ���͂����������String�^�ϐ��Ɋi�[����
      String str = br.readLine();

      // ���͓��e�������̎��A�z��Ɋi�[
      // ���͓��e�������ȊO�̎��A�G���[���b�Z�[�W��\�����A�������I��
      try {
        array.add( Integer.parseInt( str ) );
      } catch ( NumberFormatException e ) {
        System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
      }

    }

    // �ő�l���i�[����ϐ�
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
    // ���v�l���i�[����ϐ�
    int sum = 0;
    // ���͂������������v����
    for ( int value : array ) {
      sum += value;
    }

    // ���v�l��\��
    System.out.println( "���v�l��" + sum );

    // ���ϒl���i�[����ϐ�
    double ave = 0.0;
    // ���͂��������̕��ϒl�����߂�
    ave = sum / array.size();

    // ���ϒl��\��
    System.out.println( "���ϒl��" + ave );
  }
}
