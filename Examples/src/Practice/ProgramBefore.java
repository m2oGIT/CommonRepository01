
package Practice;

/**
 * �v���~�e�B�u�Ȍ^�̎g���� <br />
 * �v���~�e�B�u�Ȍ^���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ProgramBefore {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramBefore() {
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
    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";

    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";

    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";

    // �Ј�����\��(��l��)
    System.out.println( "�Ј�No:" + id1 );
    System.out.println( "��       :" + secondName1 );
    System.out.println( "��       :" + firstName1 );
    System.out.println( "����    :" + secondName1 + "" + firstName1 );
    System.out.println( "" );

    // �Ј�����\��(��l��)
    System.out.println( "�Ј�No:" + id2 );
    System.out.println( "��       :" + secondName2 );
    System.out.println( "��       :" + firstName2 );
    System.out.println( "����    :" + secondName2 + "" + firstName2 );
    System.out.println( "" );

    // �Ј�����\��(�O�l��)
    System.out.println( "�Ј�No:" + id3 );
    System.out.println( "��       :" + secondName3 );
    System.out.println( "��       :" + firstName3 );
    System.out.println( "����    :" + secondName3 + "" + firstName3 );
    System.out.println( "" );


    // ���������`�F�b�N(��l�ڂƓ�l��)
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł͂���܂���" );
    }

    // ���������`�F�b�N(��l�ڂƓ�l�ځj
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł͂���܂���" );
    }
    // ���������`�F�b�N(��l�ڂƎO�l�ځj
    if ( secondName1.equals( secondName3 )
        && firstName1.equals( firstName3 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id3 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id3 + "]�͓��������ł͂���܂���" );
    }
    // ���������`�F�b�N(��l�ڂƎO�l�ځj
    if ( secondName2.equals( secondName3 )
        && firstName2.equals( firstName3 ) ) {
      System.out.println( "�Ј�No=[" + id2 + "]�ƁA�Ј�No=[" + id3 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id2 + "]�ƁA�Ј�No=[" + id3 + "]�͓��������ł͂���܂���" );
    }
  }
}
