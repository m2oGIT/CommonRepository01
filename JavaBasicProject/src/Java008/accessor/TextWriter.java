/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008.accessor;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Java007.Member;

/**
 * TextWriter <br />
 * Java008 ��5�̉𓚗�i�N���X�����Łj <br />
 * <br />
 * �o�̓t�@�C���ҏW���� <br />
 * ���X�g�Ɉ������o�̓t�@�C���ɏo�͂���B <br />
 * �X�V���� 2015/11/01 �R�{ ���u�F�V�K�쐬 <br />
 */
public class TextWriter {

  /** �o�̓t�@�C���p�X��萔�� */
  private static final String OUTPUT_FILE_PATH = "./run/file/output.txt";

  /**
   * �R���X�g���N�^ <br />
   * �C���X�^���X�������ɓn���ꂽ���X�g���t�@�C���ɏ������� <br />
   *
   * @param list �Ј���񃊃X�g
   * @throws FileNotFoundException �t�@�C���p�X��O
   * @throws IOException ���o�͗�O
   */
  public TextWriter( List<Member> list ) throws FileNotFoundException, IOException {

    System.out.println( "�t�@�C���������ݏ������J�n���܂��B" );

    // �t�@�C���p�X���w��
    PrintWriter pw = new PrintWriter( new BufferedWriter( new FileWriter( OUTPUT_FILE_PATH ) ) );

    // �o�̓t�@�C���ɏ����o��
    for ( int i = 0; i < list.size(); i++ ) {
      pw.print( "�s���F[" + ( i + 1 ) + "] " );
      pw.print( "�Ј�No�F[" + list.get( i ).getId() + "] " );
      pw.println( "���O�F[" + list.get( i ).getSecondName() + "�@" + list.get( i ).getFirstName()
          + "]" );
    }

    // �t�@�C�����N���[�Y����
    pw.close();
    System.out.println( "�t�@�C���������ݏ������������܂����B" );
  }
}
