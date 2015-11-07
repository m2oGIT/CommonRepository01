
package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �t�@�C���ǂݍ��݃N���X�̎g���� <br />
 * FileReader�N���X���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class FileReaderSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public FileReaderSample() {
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

    // �t�@�C���̓ǂݍ��݂́A��p�̃��C�u�����N���X��g�ݍ��킹�čs���B

    // �ǂݍ��ރt�@�C���̃p�X�i���΃p�X�j
    String inputFileName = "run/input/infile.txt";
    // �ǂݍ��ރt�@�C���̃p�X�i��΃p�X�w����j
    // String inputFileName = "C:\\eclipse\\workspace\\Examples\\run\\input\\infile.txt";

    // �t�@�C���I�u�W�F�N�g�̐���
    File inputFile = new File( inputFileName );

    // ���̓X�g���[���̃C���X�^���X�����Ő����i�����̃N���X��g�ݍ��킹�Ď�������j
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {

      // ���̓X�g���[���̐����i��^�����Ƃ��ė������ėǂ��j
      fis = new FileInputStream( inputFile );
      isr = new InputStreamReader( fis );
      br = new BufferedReader( isr );

      // �e�L�X�g�t�@�C������̓ǂݍ���
      String msg;
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }

      // �G���[���́A�X�^�b�N�g���[�X���o��
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {

      // finally�u���b�N�ɖ����I�ȃN���[�Y�������L�q����B
      try {
        br.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }


    /** ���̓t�@�C���̓ǂݍ��ݓ��A���Ƀo�b�`�����Ŏg���@������B **/
  }
}
