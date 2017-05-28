/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * ArrayToCollectionTest <br />
 * Java005 ��4�̉𓚗� <br />
 * �ő�l�擾���� <br />
 * <br />
 * �R���\�[�������͉񐔂��܂ސ�������͂����A�ő�l���R���\�[���o�͂��� <br />
 * �������A�����ȊO�̓��͂��������ꍇ�́A�G���[���b�Z�[�W��\�����A�������I������ <br />
 * �X�V���� 2017/05/16 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ArrayToCollectionTestExtends {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ArrayToCollectionTestExtends() {
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

    // �R���\�[�����͗p�N���X�̃C���X�^���X��錾
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

    // ���͉񐔂��i�[����ϐ�
    int InputNum = 0;

    // ���͓��e���i�[����z��
    ArrayList<Integer> array = new ArrayList<Integer>();

    // ���͎w����\��
    System.out.println( "���͉񐔂��w�肵�Ă��������B" );
    System.out.println();

    // ���͂����������String�^�ϐ��Ɋi�[����
    String str = br.readLine();

    try {
      // ���͓��e�������̎��A�z��Ɋi�[
      InputNum = Integer.parseInt( str );

      // ���͎w����\��
      System.out.println( "������" + InputNum + "����͂��Ă��������B" );
      System.out.println();

      // �w��񐔂����J��Ԃ�
      for ( int i = 0; i < InputNum; i++ ) {
        // ���͂����������String�^�ϐ��Ɋi�[����
        str = br.readLine();
        array.add( Integer.parseInt( str ) );
      }
    } catch ( NumberFormatException e ) {
      System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
      // ��O�������͏����𔲂���B
      return;
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
