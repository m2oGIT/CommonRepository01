
package Collection;

/**
 * �v���~�e�B�u�Ȕz��̎g���� <br />
 * �v���~�e�B�u�Ȕz����g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class PrimitiveCollection {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �ł��V���v���^��{�I��Java�̔z��B
    // �ʏ�̕ϐ��錾�ɔz��ł��邱�Ƃ��Ӗ�����"[]"��t�^����B
    // �錾���ɗv�f�����w�肷��K�v������B

    // int�F�����^
    int[] ary1 = new int[5];
    ary1[0] = 0; // �v�f���̓[���N�Z�B
    ary1[1] = 10;
    ary1[2] = 20;
    ary1[3] = 30;
    ary1[4] = 40;

    for ( int i = 0; i < ary1.length; i++ ) {
      System.out.println( "ary1[" + i + "]�F" + ary1[i] );
    }

    System.out.println( "" );

    // ���邢�͈ȉ��̂悤�Ȑ錾���\�����A�錾���ɗv�f�����w�肷��_�͓����B
    int[] ary2 = {
        0, 100, 200, 300, 400
    };

    for ( int i = 0; i < ary2.length; i++ ) {
      System.out.println( "ary2[" + i + "]�F" + ary2[i] );
    }

    System.out.println( "" );

    // int�^�ȊO�ɂ��K�p�\�B
    char[] ary3 = {
        '�t', '��', '�H', '�~'
    };

    for ( int i = 0; i < ary3.length; i++ ) {
      System.out.println( "ary4[" + i + "]�F" + ary3[i] );
    }

    System.out.println( "" );

    // �I�u�W�F�N�g�^�����l�ɔz�񉻂��\�B
    String[] ary4 = {
        "���{", "�A�����J", "�t�����X", "�h�C�c", "����"
    };

    for ( int i = 0; i < ary4.length; i++ ) {
      System.out.println( "ary3[" + i + "]�F" + ary4[i] );
    }

    System.out.println( "" );

    // []�𕡐��錾���邱�Ƃő������z��ƂȂ�B
    // �v���O�����̉ǐ��������邽�߁A�g�p���͐T�d�Ɏg���B
    int[][] ary5 = new int[2][2];
    ary5[0][0] = 0;
    ary5[0][1] = 10;
    ary5[1][0] = 20;
    ary5[1][1] = 30;

    //�������ɔ�Ⴕ�Aindex�̐��䂪�ώG�ɂȂ�B
    for ( int i = 0; i < ary5.length; i++ ) {
      for ( int j = 0; j < ary5.length; j++ ) {
        System.out.println( "ary5[" + i + "][" + j + "]�F" + ary5[i][j] );
      }
    }

    System.out.println( "" );

    /**
     * �u���I�ɗv�f����ύX�ł��Ȃ��v�Ƃ����f�����b�g�����邽�߁A ��ɊȈ�(�v���~�e�B�u)�ȃ��W�b�N�Ŏg�p�����B
     **/
  }
}
