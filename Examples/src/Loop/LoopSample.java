
package Loop;

/**
 * ���[�v���̎g���� <br />
 * for/while/do while���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class LoopSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    /** for�� **/

    // �ł��V���v���^��{�I��Java�̌J��Ԃ����B
    for ( int i = 0; i < 10; i++ ) {
      System.out.println( "i�̒l��\�����܂��B " + i );
    }

    System.out.print( "\n" );


    /** while�� **/

    // �p�����������m�ł���ꍇ�ɃV���v���ɕ\�L�ł���B
    int i = 0;
    while ( i < 10 ) {
      System.out.println( "i�̒l��\�����܂��B " + i );
      i++;
    }

    System.out.print( "\n" );


    /** do while�� **/

    // �p���������J��Ԃ�������ɕ]������B�������𖞂������Ɋւ�炸�A�Œ�P��͎��s�����B
    i = 0;
    do {
      System.out.println( "i�̒l��\�����܂��B " + i );
      i++;
    } while ( i < 0 );

    System.out.print( "\n" );


    /** �����I�Ƀ��[�v���甲����ꍇ��"break;"�A�J��Ԃ����p������ꍇ��"continue;"���L�q����B **/
  }
}
