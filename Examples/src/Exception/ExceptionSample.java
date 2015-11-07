
package Exception;

/**
 * ��O�����̏����� <br />
 * ��O�Ɋւ����{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ExceptionSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ExceptionSample() {
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

    /** �G���[������try/catch/finally�Ő��䂷��B **/

    // �Ӑ}�I��null���i�[�����ϐ���p�ӁB
    String str = null;

    try { // ��O�̔���������͈͂�try{}�ň͂�

      // null�l�̎Q�ƁB
      str.length();

    } catch ( NullPointerException e ) { // ��O�̎�ނ�catch()�Ŏw�肵�A{}�ɏ������L�q����

      System.out.println( "NullPointerException���������܂����B" );
      e.printStackTrace();

    } catch ( NumberFormatException e ) { // catch()�͕����L�q�\�B����O�̎�ގ���őΉ��������Ăѕ�����B

      System.out.println( "NumberFormatException���������܂����B" );
      e.printStackTrace();

    } finally { // ��O�̔����L���Ɋւ�炸���s���鏈����finally{}�ɋL�q

      System.out.println( " finally�u���b�N�ł��B\n" );

    }


    try {

      // null�l�̎Q�ƁB
      str.length();

    } catch ( Exception e ) {
      // ��O�̎�ނ�"Exception"���w�肷��Ƃ��ׂĂ̎�ނ̗�O�Ƀq�b�g����B
      // ���A�ʏ�͔����������O�̎�ށi�ƑΉ����@�j���A�݌v�Ȃ����̓R�[�f�B���O���ɗ\���E�������Ď������ׂ��B
      // �����"Exception"�ł̎w��́u�z��O�̗�O�����������ꍇ�v�Ƃ����ی����x�ɍl����B

      System.out.println( "���炩��Exception���������܂����B" );
    }

  }

}
