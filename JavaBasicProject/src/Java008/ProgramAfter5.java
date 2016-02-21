/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * ProgramAfter5 <br />
 * Java008 ��5�̉𓚗� <br />
 * <br />
 * �o�̓t�@�C���ҏW���� <br />
 * ���̓t�@�C���̎Ј�����ǂݎ��A���X�g�Ɋi�[����B <br />
 * ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏo�͂���B <br />
 * �X�V���� 2015/11/01 �� �ԐD�F�V�K�쐬 <br />
 */
public class ProgramAfter5 {

  /** ���̓t�@�C���p�X��萔�� */
  private static final String INPUT_FILE_PATH = "./run/file/input.txt";
  /** �o�̓t�@�C���p�X��萔�� */
  private static final String OUTPUT_FILE_PATH = "./run/file/output.txt";

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfter5() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �o�̓t�@�C���ҏW���� <br />
   * ���̓t�@�C������1�s���ǂݎ��A�t�@�C���̍Ō�ɂȂ�܂ŁA���X�g�Ɋi�[����B <br />
   * ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏo�͂���B <br />
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    try {

      System.out.println( "�t�@�C���ǂݍ��ݏ������J�n���܂��B" );

      // �ǂݍ��ރt�@�C���p�X���w��
      // ��΃p�X�w��
      // BufferedReader br = new BufferedReader(
      // new FileReader( "C:/workspace44/JavaBasicProject/run/file/input.txt" ) );

      // ���΃p�X�w��
      BufferedReader br = new BufferedReader(
          new FileReader( INPUT_FILE_PATH ) );

      // �ǂݍ��ݗp�̕�����ϐ����`
      String str;
      // �Ј���񃊃X�g
      List<Member> list = new ArrayList<Member>();

      // �t�@�C���̖����܂ŁA�ǂݎ�茋�ʂ����X�g�Ɋi�[����
      while ( ( str = br.readLine() ) != null ) {
        // split()�ŋ�؂蕶������
        String[] cols = str.split( "," );
        // Member�N���X�̃C���X�^���X�����X�g�Ɋi�[
        list.add( new Member( cols[0], cols[1], cols[2] ) );
      }

      // ���̓t�@�C�����N���[�Y����
      br.close();

      System.out.println( "�t�@�C���ǂݍ��ݏ������������܂����B" );
      System.out.println( "�t�@�C���������ݏ������J�n���܂��B" );

      // �㏑���������݂Ńt�@�C���p�X���w��
      // ��΃p�X�w��
      // PrintWriter pw = new PrintWriter( new BufferedWriter(
      // new FileWriter( "C:/workspace44/JavaBasicProject/run/file/output.txt" ) ) );

      // ���΃p�X�w��
      PrintWriter pw = new PrintWriter( new BufferedWriter(
          new FileWriter( OUTPUT_FILE_PATH ) ) );

      // ���X�g�Ɋi�[�����Ј��������ƂɁA�o�̓t�@�C���ɏ����o��
      for ( int i = 0; i < list.size(); i++ ) {
        pw.print( "�s���F[" + ( i + 1 ) + "] " );
        pw.print( "�Ј�No�F[" + list.get( i ).getId() + "] " );
        pw.println( "���O�F[" + list.get( i ).getSecondName() + "�@" + list.get( i ).getFirstName()
            + "]" );
      }

      // �o�̓t�@�C�����N���[�Y����
      pw.close();
      System.out.println( "�t�@�C���������ݏ������������܂����B" );

    } catch ( IOException e ) {
      System.out.println( "���o�͗�O���������܂����B" );

    }
  }
}
