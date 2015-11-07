
package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * �R���N�V�����N���X�̎g���� <br />
 * �g�����ꂽ�z����g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class CollectionClass {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���I�ɗv�f����ύX�\�Ȕz�񂪁A���C�u�����N���X�ɗp�ӂ���Ă���B

    // �錾����"<>"�i�W�F�l���b�N�A�W�F�l���N�X�ƌĂ΂��v�f�^�̎w��j�ŃZ�b�g����^���w�肷��B
    // <?>�Ń��C���h�J�[�h�w��\�����A�^�̕s��v���N���₷���A�o�O�̉����ƂȂ邽�ߐ�������Ȃ��B

    // �܂��A�N���X�Ȃ̂Ŏg�p����import���K�v�B

    /** ���X�g�^ */
    // ArrayList�F�A���C���X�g�^�E�E�E�R���N�V�����̒��ōł���{�ƂȂ�z��
    ArrayList<String> list = new ArrayList<String>();
    list.add( "�ЂƂ߂̗v�f" );
    list.add( "�ӂ��߂̗v�f" );
    list.add( "�݂��߂̗v�f" );

    // �ʏ�for��
    for ( int i = 0; i < list.size(); i++ ) {
      System.out.println( "list[" + i + "]�F" + list.get( i ) ); // �v�f�̎擾��.get(�C���f�b�N�X)�ōs���B
    }

    // �g��for���i�z��̗v�f���A�J��Ԃ��j
    for ( String value : list ) { // �ꎞ�ϐ��ɔz��̒l��W�J���A�����܂ŌJ��Ԃ��C���[�W�B
      System.out.println( "ArrayList:" + value );
    }
    System.out.println( "" );


    /** �Z�b�g�^ */
    // �n�b�V���Z�b�g�^�E�E�E�v�f�̏d���������ꂸ�A�����̕ۏႪ�����B
    HashSet<String> hset = new HashSet<String>();

    hset.add( "AAA" );
    hset.add( "BBB" );
    hset.add( "CCC" );
    hset.add( "AAA" );

    // �v�f�����o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    // iterator����������Œl���w�����A�ڐ���̃C���[�W�B
    // iterator�̃C���X�^���X�ɓK�p�������R���N�V�����̃C���X�^���X��������B
    Iterator<String> it = hset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "HashSet:" + it.next() );
    }

    System.out.println( "" );


    // �c���[�Z�b�g�^�E�E�E�v�f�̏d���������ꂸ�A�����͎������Ƀ\�[�g�����B
    TreeSet<String> tset = new TreeSet<String>();

    tset.add( "AAA" );
    tset.add( "BBB" );
    tset.add( "CCC" );
    tset.add( "AAA" );

    // �v�f�����o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    it = tset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "TreeSet:" + it.next() );
    }

    System.out.println( "" );


    // �����N�Z�b�g�^�E�E�E�v�f�̏d���������ꂸ�A�����͊i�[�����ێ������B
    LinkedHashSet<String> lset = new LinkedHashSet<String>();

    lset.add( "AAA" );
    lset.add( "BBB" );
    lset.add( "CCC" );
    lset.add( "AAA" );

    // �v�f�����o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    it = lset.iterator();
    while ( it.hasNext() ) {
      System.out.println( "LinkedHashSet:" + it.next() );
    }

    System.out.println( "" );


    /** �}�b�v�^ */
    // �n�b�V���}�b�v�^�E�E�Ekey��value�̃}�b�s���O�Ƃ��Ēl��ێ�����B�����̕ۏႪ�������Akey���w�肷��̂ŉe���͏������B
    HashMap<String, String> hmap = new HashMap<String, String>();

    hmap.put( "1", "�ЂƂ߂�value" );
    hmap.put( "2", "�ӂ��߂�value" );
    hmap.put( "3", "�݂��߂�value" );
    hmap.put( "4", "�ЂƂ߂�value" );

    // �v�f�����o���ۂ́Akey���w�肷��B
    System.out.println( hmap.get( "1" ) );

    // �v�f�����ׂĎ��o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    it = hmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "HashMap:" + hmap.get( key ) );
    }

    System.out.println( "" );


    // �c���[�}�b�v�^�E�E�Ekey��value�̃}�b�s���O�Ƃ��Ēl��ێ�����B������key�̎������Ƀ\�[�g�����B
    TreeMap<String, String> tmap = new TreeMap<String, String>();

    tmap.put( "1", "value�@" );
    tmap.put( "2", "value�A" );
    tmap.put( "3", "value�B" );
    tmap.put( "4", "value�C" );

    // �v�f�����o���ۂ́Akey���w�肷��B
    System.out.println( tmap.get( "1" ) );

    // �v�f�����ׂĎ��o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    it = tmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "TreeMap:" + tmap.get( key ) );
    }

    System.out.println( "" );


    // �����N�n�b�V���}�b�v�^�E�E�Ekey��value�̃}�b�s���O�Ƃ��Ēl��ێ�����B�����͊i�[�����ێ������B
    LinkedHashMap<String, String> lmap = new LinkedHashMap<String, String>();

    lmap.put( "1", "�ЂƂ߂�value" );
    lmap.put( "2", "�ӂ��߂�value" );
    lmap.put( "3", "�݂��߂�value" );
    lmap.put( "4", "�ЂƂ߂�value" );

    // �v�f�����o���ۂ́Akey���w�肷��B
    System.out.println( lmap.get( "1" ) );

    // �v�f�����ׂĎ��o���ۂ́Aiterator�i�C�e���[�^�j���g�p����B
    it = lmap.keySet().iterator();
    while ( it.hasNext() ) {
      String key = it.next();
      System.out.println( "LinkedHashMap:" + lmap.get( key ) );
    }

    System.out.println( "" );


    /**
     * ����ArrayList��Map�͎g�p�p�x�������B�v�f�̓I�u�W�F�N�g�^�̂ݎw��\�ł���_�ɂ����ӁB
     **/

    // <>��int���w�肷��ƃR���p�C���G���[�ƂȂ�B
    // ArrayList<int> intList = new ArrayList<int>();

    // ���������������ꍇ�́Aint���g�������N���X�i���b�p�[�N���X�j��Integer���w�肷��B
    ArrayList<Integer> integerList = new ArrayList<Integer>();

    // ���b�p�[�N���X��new�Ő錾����B
    integerList.add( new Integer( 1234567890 ) );
    // �I�[�g�{�N�V���O(Autoboxing)�@�\�Ƃ����āA���b�p�[�N���X�Ƀv���~�e�B�u�Ȍ^�̒l���i�[�ł���B
    // Java5.0�ȍ~�́A����Autoboxing�ňȉ��̂悤�ȃV���v���ȏ��������\�ƂȂ����B
    integerList.add( 1234567890 );

    // ���l�Ɉȉ��̃��b�p�[�N���X���p�ӂ���Ă���B
    byte b = 12;
    Byte ob = new Byte(b); // �o�C�g�^

    short s = 32;
    Short os = new Short(s); // �V���[�g�^

    long l = 153L;
    Long ol = new Long(l); // �����O�^

    float f = 3.24F;
    Float of = new Float(f); // �Œ菬���_�^

    double d = 7.6;
    Double od = new Double(d); // �Œ菬���_�^

  }
}
