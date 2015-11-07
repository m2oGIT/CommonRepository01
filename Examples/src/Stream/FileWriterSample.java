
package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * �t�@�C���������݃N���X�̎g���� <br />
 * FileWriter�N���X���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class FileWriterSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public FileWriterSample() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �t�@�C���̏������݂��A��p�̃��C�u�����N���X��g�ݍ��킹�čs���B

    // �������ރt�@�C���̃p�X�i���΃p�X�j
    String outputFileName = "run/output/outfile.txt";
    // �������ރt�@�C���̃p�X�i��΃p�X�w����j
    // String inputFileName = "C:\\eclipse\\workspace\\Examples\\run\\output\\outfile.txt";

    // �t�@�C���I�u�W�F�N�g�̐���
    File outputFile = new File( outputFileName );

    // �o�̓X�g���[���̃C���X�^���X�����Ő����i�����̃N���X��g�ݍ��킹�Ď�������j
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    PrintWriter pw = null;

    try {

      // �o�̓X�g���[���̐����i��^�����Ƃ��ė������ėǂ��j
      fos = new FileOutputStream( outputFile, false ); // ��������false�ior�ȗ��j�Łu�㏑�����[�h�v
      // fos = new FileOutputStream( outputFile, true ); //��������true�Łu�ǉ��������݃��[�h�v
      osw = new OutputStreamWriter( fos );
      pw = new PrintWriter( osw );

      // �t�@�C���ւ̏������݁i�����ɂ̓t�@�C���o�b�t�@�ւ̏������݂܂Łj
      pw.println( "�t�@�C���o�͂̃T���v��������" );
      pw.println( "abcdefg" );
      pw.println( "�P�Q�R�S�T�U�V�W�X�O" );

      // �o�b�t�@�̃t���b�V���i������������t�@�C���ւ̏����o���j
      // �N���[�Y�����̒��ňÖق̃t���b�V�����s���邪�A�����I�ɋL�q����̂�����@�B
      pw.flush();

      // �G���[���������ꍇ�́A�X�^�b�N�g���[�X���o��
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finally�u���b�N�ɖ����I�ȃN���[�Y�������L�q����B
      pw.close();
    }


    /** �o�̓t�@�C���ւ̏����o�����A��͂�o�b�`�����Ŏg���@������B **/
  }
}
