
package Branch;

/**
 * select�̊�{�I�̎g���� <br />
 * select�����g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SwitchSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public SwitchSample() {
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

    // �]���Ώ�
    int num = 1;

    // �\���I�ɕ���̏��������₷���B
    switch ( num ) {
      case 1:
        System.out.println( "num�� 1�ł��B" );
        break; // break;�������Ȃ��ƁA���v�����ȍ~��case���S�Ď��s����Ă��܂��B
      case 2:
        System.out.println( "num�� 2�ł��B" );
        break;
      case 3:
        System.out.println( "num�� 3�ł��B" );
        break;
      default: //if���ł�else�ɑ����B
        System.out.println( "num�� ���̑��̒l�ł��B" );
    }


    // �]���Ώ�
    String str = "aaa";

    //JDK6.0�܂ŕ]���Ώۂ�int�^�̂݋��e����Ă����B
    //JDK7.0����String�^���g�p�\�ƂȂ����B
    //�������A6.0�ȑO�̋����̎��s���œ������ƃG���[�ɂȂ�̂Œ��ӁB
    //double���̃v���~�e�B�u�^�ABigDecimal���̈�A�̃I�u�W�F�N�g�^��7.0�ȍ~���g�p�s�B
    switch ( str ) {
      case "aaa":
        System.out.println( "str�� \"aaa\"�ł��B" );
        break;
      case "bbb":
        System.out.println( "str�� \"bbb\"�ł��B" );
        break;
      case "ccc":
        System.out.println( "str�� \"ccc\"�ł��B" );
        break;
      default:
        System.out.println( "str�� ���̑��̒l�ł��B" );
    }

    /** if����switch���ǂ�����g�����͊�{�I�ɂ͍D�݂̖��B**/
    /** switch���ɂ͌^�̐��񂪂��邱�Ƃ���A�Ɩ��v���O�����ł͈��|�I��if���������B **/
     }
}
