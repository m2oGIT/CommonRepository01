/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FileReadWriteTest <br />
 * Java006 ��2�̉𓚗� <br />
 * �����E�N���������̏������ݏ��� <br />
 * <br />
 * /practice/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A <br />
 * ���s���ɗ^����������ƁA���s���̓�����ǉ������ŏ������ޏ������쐬����B <br />
 * �܂�����N���X���ɁA��L�̑Ώۃt�@�C����ǂݍ��݁A���e���R���\�[���ɕ\�����鏈�����쐬����B <br
 * * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class FileReadWriteTest {

  /** �t�@�C���p�X��萔�� */
  private static final String FILE_PATH = "./run/file/text.txt";

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public FileReadWriteTest() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �����E�N���������̏������ݏ��� <br />
   * /practice/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A <br />
   * ���s���ɗ^����������ƁA���s���̓�����ǉ������ŏ������ޏ������쐬����B <br />
   * �܂�����N���X���ɁA��L�̑Ώۃt�@�C����ǂݍ��݁A���e���R���\�[���ɕ\�����鏈�����쐬����B <*
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    // �t�@�C���������ݗp�N���X�̃C���X�^���X��錾
    PrintWriter pw = null;

    try {

      // �ǉ��������݂Ńt�@�C���p�X���w��
      // ��΃p�X�w��
      // pw = new PrintWriter( new BufferedWriter( new FileWriter(
      // "C:/workspace44/JavaBasicProject/run/file/text.txt", true ) ) );

      // ���΃p�X�w��
      pw = new PrintWriter( new BufferedWriter( new FileWriter(
          FILE_PATH, true ) ) );

      // ���ݓ������擾
      Date now = new Date();
      // ���t�̃t�H�[�}�b�g
      SimpleDateFormat sdf1 = new SimpleDateFormat( "yyyy'/'MM'/'dd'/' HH:mm:ss " );
      // ���s���̓�������������
      pw.println( sdf1.format( now ) + args[0] );

    } catch ( IOException e ) {
      System.out.println( "�o�̓G���[�ł��B" );
    } finally {
      // �t�@�C�������
      pw.close();
    }

    // �t�@�C���ǂݍ��ݗp�N���X�̃C���X�^���X��錾
    BufferedReader br = null;
    try {

      // �ǂݍ��ރt�@�C���p�X���w��
      // ��΃p�X�w��
      // br = new BufferedReader( new FileReader(
      // "C:/workspace44/JavaBasicProject/run/file/text.txt" ) );

      // ���΃p�X�w��
      br = new BufferedReader( new FileReader(
          FILE_PATH ) );

      // �ǂݍ��ݗp�̕�����ϐ����`
      String str = "";

      // �ǂݎ�茋�ʂ��R���\�[���ɕ\������
      while ( ( str = br.readLine() ) != null ) {
        System.out.println( str );
      }
    } catch ( IOException e ) {
      System.out.println( "���͎���O���������܂����B" );

    } finally {
      // �t�@�C�������
      try {
        br.close();
      } catch ( IOException e ) {
        System.out.println( "�t�@�C���N���[�Y�ŗ�O���������܂����B" );
      }
    }
  }
}
