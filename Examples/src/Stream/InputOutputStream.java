
package Stream;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �W�����o�͂̎g���� <br />
 * stdin/stdout���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class InputOutputStream {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public InputOutputStream() {
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

    // Unix�����Unix����h������OS�́B
    // �W������ (standard input)�A�W���o�� (standard output)�A�W���G���[�o�� (standard error) ��
    // 3�̓��o�̓`���l�����C���^�[�t�F�[�X�Ƃ��Ď������Ă���B
    // Java�̃��C�u�����N���X�ɂ͂����W�����o�͂��T�|�[�g����@�\���p�ӂ���Ă���B


    /** �W������ (standard input/stdin) */
    // ���_�C���N�g���Ȃ�����A�W�����͂̓v���O�������N�������[���̃L�[�{�[�h�ɂȂ��Ă���B
    int i = 0;
    System.out.print( "�������͂��Ă��������BEnter�����ŏI�����܂��B>" );

    // ���̓X�g���[���̃C���X�^���X�����Ő����B
    InputStreamReader input = null;

    try {
      // InputStreamReader�N���X��System.in��n�����ƂŁA�R���\�[�����͑҂��ƂȂ�B
      input = new InputStreamReader( System.in );

      // while�̏�����true�ɂ���ƁA�������[�v�ƂȂ�ibreak���B�܂ŌJ��Ԃ��j�B
      while ( true ) {
        // read()�ŃL�[�{�[�h������͂��ꂽ���e���P�����ǂݎ��B
        i = input.read();
        // ���s�R�[�h�Ń��[�v���I������B
        if ( i == '\n' ) {
          break;
        }
        // ���s�R�[�h�ȊO�Ȃ�P�����o�͂���B
        System.out.print( ( char ) i );

      }
      System.out.print( '\n' );


    } catch ( IOException e ) {

      // �G���[���̓X�^�b�N�g���[�X���o�́B
      System.out.println( e );

    } finally {

      // Stream�͎g�p��ɃN���[�Y����B
      // �J�����܂܂ł��v���O�����I������Java���Öق�close�����s���Ă���邪�A�����I�ɋL�q����̂�����@�B
      try {
        input.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }


    /** �W���o�� (standard output/stdout) */
    // ���_�C���N�g���Ȃ�����A�W���o�͂̓v���O�������N�������[���̃f�B�X�v���C�ɂȂ��Ă���B

    // System.out.print()�E�E�E���s�Ȃ��o��
    System.out.print( 'a' );
    System.out.print( 'b' );
    System.out.print( 'c' );
    System.out.print( '\n' );
    // System.out.println()�E�E�E���s���̏o��
    System.out.println( 'a' );
    System.out.println( 'b' );
    System.out.println( 'c' );


    /** �W���G���[�o�� (standard error/stderr) */
    // ���_�C���N�g���Ȃ�����A�W���G���[�o�͂̓v���O�������N�������[���̃f�B�X�v���C�ɂȂ��Ă���B
    // ���s����ƕ����邪�AJava�ł͏o�͏������W���o�͂��D�悳���B
    // �܂��Aeclipse�ł͐ԕ����ŃR���\�[���ɕ\�������B

    // System.err.print()�E�E�E���s�Ȃ��G���[�o��
    System.err.print( 'e' );
    System.err.print( 'r' );
    System.err.print( 'r' );
    System.err.print( '\n' );
    // System.err.println()�E�E�E���s���̃G���[�o��
    System.err.println( 'e' );
    System.err.println( 'r' );
    System.err.println( 'r' );


    /** �{���̓G���[�n�̏o�͂̂��߂ɕW���G���[�o�͂����݂��Ă��邪�A */
    /** Java�ł͕\�����̐���̌��ˍ�������A����n���G���[�n�����K�I�ɕW���o�͂�p����ꍇ�������B */
    /** �i�����I��System.err���g�p���Ă���v���O������]�茩�����Ȃ��B�j */
  }
}
