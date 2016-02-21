/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008.accessor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * TextReader <br />
 * Java008 ��5�̉𓚗�i�N���X�����Łj <br />
 * <br />
 * ���̓t�@�C���ǂݍ��ݏ��� <br />
 * ���̓t�@�C���̎Ј�����ǂݎ��A���X�g�Ɋi�[����B <br />
 * �X�V���� 2015/11/01 �R�{ ���u�F�V�K�쐬 <br />
 */
public class TextReader {

  /** ���̓t�@�C���p�X��萔�� */
  private static final String INPUT_FILE_PATH = "./run/file/input.txt";

  /** �Ј���񃊃X�g */
  private List<Member> list = new ArrayList<Member>();

  /**
   * ���X�g�擾
   * @return list �Ј���񃊃X�g
   */
  public List<Member> getList() {
    return list;
  }

  /**
   * ���X�g�ݒ�
   * @param list �Ј���񃊃X�g
   */
  public void setList( List<Member> list ) {
    this.list = list;
  }

  /**
   * �R���X�g���N�^ <br />
   * �C���X�^���X�����Ɠ����ɓǂݍ��݁`���X�g�i�[�܂Ŏ��{���� <br />
   *
   * @throws FileNotFoundException �t�@�C���p�X��O
   * @throws IOException ���o�͗�O
   */
  public TextReader() throws FileNotFoundException, IOException {

    System.out.println( "�t�@�C���ǂݍ��ݏ������J�n���܂��B" );

    // �t�@�C���p�X���w��
    BufferedReader br = new BufferedReader( new FileReader( INPUT_FILE_PATH ) );

    // �ǂݍ��ݗp�̕ϐ���������
    String str = "";
    // �t�@�C���̖����܂Ń��X�g�Ɋi�[����
    while ( ( str = br.readLine() ) != null ) {
      String[] cols = str.split( "," );
      list.add( new Member( cols[0], cols[1], cols[2] ) );
    }
    // �t�@�C�����N���[�Y����
    br.close();
    System.out.println( "�t�@�C���ǂݍ��ݏ������������܂����B" );
  }
}
