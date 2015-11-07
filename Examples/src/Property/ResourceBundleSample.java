
package Property;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * �v���p�e�B�t�@�C���̎g���� <br />
 * ResourceBundle�N���X���g�p�����v���p�e�B�̎������@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ResourceBundleSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // Java6.0�Ŋg�����ꂽResourceBundle�N���X�ł̎�����B

    // �v���p�e�B�t�@�C���̃p�X���N���X�p�X�ϐ��ɒǉ�����K�v������B
    // ���݂̊��ł̃N���X�p�X�͈ȉ��̂P�s�����s����Ɗm�F�ł���B
    System.out.println( "CLASSPATH�F" + System.getProperty( "java.class.path" ) );

    // ResourceBundle�N���X�̃C���X�^���X�𐶐��B
    ResourceBundle bundle = null;

    try {
      // �ǂݍ��ރt�@�C�������w��B�g���q��properties�ɌŒ肳��A�R�[�h��͋L�q�s�v�B
      bundle = ResourceBundle.getBundle( "resourceprop" );
    } catch ( MissingResourceException e ) {
      e.printStackTrace();
      return;
    }

    try {
      // key�ɕR�Â�value���擾����B
      System.out.println( bundle.getString( "key-1" ) );
      System.out.println( bundle.getString( "key-2" ) );
      System.out.println( bundle.getString( "key-3" ) );
    } catch ( MissingResourceException e ) {
      e.printStackTrace();
      return;
    }


    /** Stream���g�����o���h�����g�����̈Ⴂ�ŁA������̓N���X�p�X��g���q�̐��񂪂��镪�A���Ȃ�����B **/
    /** ���������O�iMissingResourceException�j��RuntimeException���p�����Ă���A���s����O�ƂȂ�_�����ӁB **/
    /** �]����Properties�N���X�Ƃǂ�����g�����́A�󋵎���B **/

  }
}