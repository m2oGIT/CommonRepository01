/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * ProgramAfter4 <br />
 * Java008 ��4�̉𓚗� <br />
 * <br />
 * �Ј�����z�񂩂烊�X�g�֊i�[ <br />
 * String�z��̃f�[�^���Ј���񃊃X�g�Ɋi�[���A�ݒ肵������\������B <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class ProgramAfter4 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter4() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �Ј�����z�񂩂烊�X�g�֊i�[ <br />
   * String�z��̃f�[�^���Ј���񃊃X�g�Ɋi�[����B <br />
   * �܂��Ј���񃊃X�g�ɐݒ肵������\������B <br />
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    // �Ј����
    String[][] array = {
        {
            "00001", "��Y", "���"
        },
        {
            "00002", "��Y", "���"
        },
        {
            "00003", "�O�Y", "���"
        }
    };

    // �Ј���񃊃X�g
    List<Member> list = new ArrayList<Member>();
    // ���X�g�ɒǉ�
    for ( int i = 0; i < array.length; i++ ) {
      list.add( new Member( array[i][0], array[i][1], array[i][2] ) );
    }

    // ���X�g�ɐݒ肵������\��
    for ( int i = 0; i < list.size(); i++ ) {
      list.get( i ).showinfo();

    }
  }
}
