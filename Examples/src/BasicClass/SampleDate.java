
package BasicClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * ���t�^�̎g���� <br />
 * Date�^���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SampleDate {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    /** ���t�������ꍇ�́ADate�^���g�p����B **/
    // Date�Ɍ��炸�A�I�u�W�F�N�g�^��import���K�v�B
    // String�^���̕p�o����ꕔ�N���X�݂̂̓f�t�H���g��import����Ă���B

    // �I�u�W�F�N�g�^��new�ŃC���X�^���X�𐶐�����i�����������j�B
    // date�̏ꍇ�́A�����������Ō��ݓ����i�}�V�����t�j���擾�����B
    Date date = new Date();
    System.out.println( String.valueOf( date ) ); // �������f�t�H���g�͉��ċL�@�B


    /** SimpleDateFormat�F���t�̃t�H�[�}�b�g���J�X�^�}�C�Y���郉�C�u�����N���X�B **/

    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss.SSS" ); // �C���X�^���X�������ɑ̍ق��w��B
    String formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // �w��t�H�[�}�b�g�ŕ\������B

    sdf = new SimpleDateFormat( "yyyy�NMM��dd�� HH��mm��ss�bSSS�ؕb" ); // ���{��������邱�Ƃ��\�B
    formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // �w��t�H�[�}�b�g�ŕ\������


    // �a��\���͂����ЂƎ�ԁB
    Locale locale = new Locale( "ja", "JP", "JP" ); // ���P�[�V�������w��B
    sdf = new SimpleDateFormat( "GGGGyyyy�NMM��dd�� HH��mm��ss�bSSS�ؕb", locale );
    formatedDate = sdf.format( date );
    System.out.println( formatedDate ); // �w��t�H�[�}�b�g�ŕ\������

    // �j�����Z�o�������ꍇ�ȂǁA��荂�x�ȓ��t�����p�ɁuCalendar�v�N���X���p�ӂ���Ă���B
    // �p�t�H�[�}���X��Date����邽�߁A��ʎ���Ŏg��������B

    /** SimpleDateFormat�̒萔�iyyyy������N�ł���A���j�� API�}�j���A���ɋL�ڂ���Ă���B **/

  }
}
