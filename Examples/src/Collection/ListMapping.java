
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * �R���N�V�����̉��p�I�Ȏg���� <br />
 * ���X�g�ƃ}�b�v��g�ݍ��킹�����@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ListMapping {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �}�b�v��value�ɔz���p���邱�ƂŁA
    // �w�C�ӂ�key�ɕR�Â������̒l�x�Ƃ�������"DB�I�ȍ\��"��e�ՂɎ����ł���B

    // �}�b�v��錾
    // �����N�n�b�V���}�b�v�^�E�E�Ekey��value�̃}�b�s���O�Ƃ��Ēl��ێ�����B�����͊i�[�����ێ������B
    LinkedHashMap<String, ArrayList<String>> testTable = new LinkedHashMap<String, ArrayList<String>>();

    // ���X�g��錾
    ArrayList<String> list = new ArrayList<String>();
    list.add( "�R�c" );
    list.add( "���Y" );
    list.add( "���{" );
    testTable.put( "1", list );

    // ���X�g��������
    list = new ArrayList<String>();
    list.add( "�r��" );
    list.add( "�Q�C�c" );
    list.add( "�}�C�N���\�t�g" );
    testTable.put( "2", list );

    list = new ArrayList<String>();
    list.add( "�X�e�B�[�u" );
    list.add( "�W���u" );
    list.add( "�A�b�v��" );
    testTable.put( "3", list );


    // �v�f�����o���ۂ́Akey���w�肵����ŁA�z��̗v�f�����w�肷��B
    System.out.println( testTable.get( "1" ).get( 0 ) );
    System.out.println( testTable.get( "1" ).get( 1 ) );
    System.out.println( testTable.get( "1" ).get( 2 ) );

    System.out.println( "" );


    // Iterator�̓K�p��B
    Iterator<String> it = testTable.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      //�z����ۂ���println�ɓ�����ƑS�ʂ��\�������B
      System.out.println( "LinkedHashMap:" + testTable.get( key ) );
    }

    System.out.println( "" );


    // �X�ɗv�f�X�Ɏ��o���ƈȉ��̒ʂ�B
    it = testTable.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      for ( String value : testTable.get( key ) ) {
        // Iterator�Ŕz������o���A�z�񂩂�ꎞ�ϐ��ɓW�J���Ė����܂Ń��[�v�B
        System.out.println( value );
      }
    }


    /** ��L�ȊO�ɂ��v���~�e�B�u�Ȍ^���p�ӂ���Ă���B�ڍׂ͂Ƃقٓ����Q�Ƃ̂��ƁB **/
  }
}
