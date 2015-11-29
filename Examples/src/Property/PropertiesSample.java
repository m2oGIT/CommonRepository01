
package Property;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * �v���p�e�B�t�@�C���̎g���� <br />
 * Properties�N���X���g�p�����v���p�e�B�̎������@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class PropertiesSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public PropertiesSample() {
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

    // Java�����̃v���p�e�B�@�\�ł���Properties�N���X�ł̉��p��B

    // ���샍�[�_�[�̃C���X�^���X�𐶐��B
    PropertyLoader loader = null;

    try {
      // �����������̒��Ńv���p�e�B�t�@�C����ǂݍ��ށB
      loader = new PropertyLoader();
      //�Ăяo��������p�X���w�肷��ꍇ�͈�������R���X�g���N�^�𗘗p����
      //loader = new PropertyLoader( "run/properties/standardprop.properties" );
    } catch ( IOException e ) {
      e.printStackTrace();
    }

    // key�ɕR�Â�value���擾����B
    System.out.println( loader.getValue( "key-1" ) );
    System.out.println( loader.getValue( "key-2" ) );
    System.out.println( loader.getValue( "key-3" ) );


    /** Java��������g�p����Ă���v���p�e�B�̎������@�B **/
    /** ���ɗ��R���Ȃ���΁AProperties�N���X�Ŏ������Ė��Ȃ��B **/
  }


}
