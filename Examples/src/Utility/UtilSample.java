
package Utility;

/**
 * ���샆�[�e�B���e�B�N���X�̎g���� <br />
 * ����̃��[�e�B���e�B�N���X���Ăяo���܂��B <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class UtilSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public UtilSample() {
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


    // �K�{�`�F�b�N
    System.out.println( "isNecessary �����������F" + StringUtil.isNecessary( "����������" ) );
    System.out.println( "isNecessary �󕶎��F" + StringUtil.isNecessary( "" ) );


    // ���l�����`�F�b�N
    System.out.println( "isNumChar 0�F" + StringUtil.isNumChar( '0' ) );
    System.out.println( "isNumChar 9�F" + StringUtil.isNumChar( '9' ) );
    System.out.println( "isNumChar a�F" + StringUtil.isNumChar( 'a' ) );
    System.out.println( "isNumChar �O�F" + StringUtil.isNumChar( '�O' ) );


    // ���l������`�F�b�N�i�����R�[�h�l�ł̎����j
    System.out.println( "isNumString 1234567890�F" + StringUtil.isNumString( "1234567890" ) );
    System.out.println( "isNumString 1�P�Q�R�S�T�U�V�W�X�O�F" + StringUtil.isNumString( "�P�Q�R�S�T�U�V�W�X�O" ) );
    System.out.println( "isNumString 1abcdefg�F" + StringUtil.isNumString( "abcdefg" ) );
    //System.out.println( "�󕶎��F" + StringUtil.isNumString( "" ) ); //null�`�F�b�N���K�{�ƂȂ�


    // ���l������`�F�b�N�i���K�\���ł̎����j
    System.out.println( "isNumber 1234567890�F" + StringUtil.isNumber( "1234567890" ) );
    System.out.println( "isNumber �P�Q�R�S�T�U�V�W�X�O�F" + StringUtil.isNumber( "�P�Q�R�S�T�U�V�W�X�O" ) );
    System.out.println( "isNumber abcdefg�F" + StringUtil.isNumber( "abcdefg" ) );
    System.out.println( "isNumber �󕶎��F" + StringUtil.isNumber( "" ) );


    // ���t�`�F�b�N
    System.out.println( "isDate 2016/01/01�F" + DateUtil.isDate( "2016/01/01" ) );
    System.out.println( "isDate 2016/01/32�F" + DateUtil.isDate( "2016/01/32" ) );
    System.out.println( "isDate 20160101�F" + DateUtil.isDate( "20160101" ) );
    System.out.println( "isDate �󕶎��F" + DateUtil.isDate( "" ) );


    // �a��ϊ�
    System.out.println( "formatJP 2016/01/01�F" + DateUtil.formatJP( "2016/01/01" ) );
    System.out.println( "formatJP 2016/01/32�F" + DateUtil.formatJP( "2016/01/32" ) );
    System.out.println( "formatJP 20160101�F" + DateUtil.formatJP( "20160101" ) );
    System.out.println( "formatJP �󕶎��F" + DateUtil.formatJP( "" ) );


    // ����ϊ�
    System.out.println( "formatAD ����28�N01��01���F" + DateUtil.formatAD( "����28�N01��01��" ) );
    System.out.println( "formatAD ����28�N01��32���F" + DateUtil.formatAD( "����28�N01��32��" ) );
    System.out.println( "formatAD ����28�N1��1���F" + DateUtil.formatAD( "����28�N1��1��" ) );
    System.out.println( "formatAD �󕶎��F" + DateUtil.formatAD( "" ) );


    // TimeStamp�^�ϊ�
    System.out.println( "formatTS 2016/01/01 06:15:30�F" + DateUtil.formatTS( "2016/01/01 06:15:30" ) );
    System.out.println( "formatTS 2016/01/32 06:15:30�F" + DateUtil.formatTS( "2016/01/32 06:15:30" ) );
    System.out.println( "formatTS 2016/1/1�F" + DateUtil.formatTS( "2016/1/1" ) );
    System.out.println( "formatTS �󕶎��F" + DateUtil.formatTS( "" ) );


    /** �`�F�b�N������ϊ������ȂǁA���ʂ��Ă悭�g�����������ʉ����Ă����C���[�W�B **/
  }
}
