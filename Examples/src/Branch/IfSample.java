
package Branch;

/**
 * if�̊�{�I�̎g���� <br />
 * if�����g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class IfSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �]���Ώ�
    int num = 1;

    // COBOL��EVALUATE�ƍl�����͓����B
    if ( num == 1 ) {
      System.out.println( "num�� 1 �ł��B" );

    } else if ( num == 2 ) {
      System.out.println( "num�� 2 �ł��B" );

    } else {
      System.out.println( "num�� ���̑��̒l �ł��B" );
    }

    // �]���Ώ�
    String str = "aaa";

    if ( "aaa".equals( str ) ) {
      System.out.println( "str�� \"aaa\" �ł��B" );

    } else if ( "bbb".equals( str ) ) {
      System.out.println( "str�� \"bbb\" �ł��B" );

    } else {
      System.out.println( "str�� ���̑��̒l �ł��B" );
    }

    // "aaa".equals( str ) �ł� str.equals( "aaa" ) �ł����ʂ͓����B
    // ��҂̏ꍇ�Astr��null�̍ۂ�NullPointerException���������A��O����������B
    // �O�҂̏ꍇ�Astr��null�ł�NullPointerException�͔������Ȃ��B
    // str��null�ł��邱�Ƃ����m����K�v�����郍�W�b�N�Ȃ��ҁB����ȊO�͑O�҂Ŏ�������B

    // �]���Ώ�
    num = 1;

    // "!"�iNOT�j�͏����𔽓]������B
    if ( !( num == 1 ) ) {
      System.out.println( "num�� 1 �ł͂���܂���B" );

    } else if ( !( num == 2 ) ) {
      System.out.println( "num�� 2 �ł͂���܂���B" );

    } else {
      System.out.println( "num�� ���̑��̒l �ł��B" );
    }

    // "!="��"=="�̔ے��\���B
    if ( num != 1 ) {
      System.out.println( "num�� 1 �ł͂���܂���B" );

    } else if ( num != 2 ) {
      System.out.println( "num�� 2 �ł͂���܂���B" );

    } else {
      System.out.println( "num�� ���̑��̒l �ł��B" );
    }

    // �������\�i���΂̔��΂͎^���j�B
    if ( !( num != 1 ) ) {
      System.out.println( "num�� 1 �ł��B" );

    } else if ( !( num != 2 ) ) {
      System.out.println( "num�� 2 �ł��B" );

    } else {
      System.out.println( "num�� ���̑��̒l �ł��B" );
    }

  }
}
