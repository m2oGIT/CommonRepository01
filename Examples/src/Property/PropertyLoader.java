/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * �v���p�e�B�t�@�C���̎g���� <br />
 * Properties�N���X���g�p�����v���p�e�B�̎������@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class PropertyLoader {

  /** �v���p�e�B�I�u�W�F�N�g */
  private Properties conf = null;

  /**
   * �f�t�H���g�R���X�g���N�^ <br />
   * �v���p�e�B�t�@�C���̃p�X��ݒ肵�܂��B <br />
   *
   * @throws IOException ���o�͗�O
   */
  public PropertyLoader() throws IOException {

    // �C���X�^���X�𐶐��B
    conf = new Properties();

    // �@InputStream�𗘗p���ăt�@�C����ǂݍ��ޏꍇ�B�����΃p�X�܂��͐�΃p�X�ŋL�q����B
    InputStream inputStream = new FileInputStream(
        "C:\\eclipse44\\workspace44\\Examples\\run\\properties\\standardprop.properties" );
    conf.load( inputStream );
    inputStream.close();

    // �A�N���X���[�_�[���g�p���ăt�@�C����ǂݍ��ޏꍇ�B���N���X�p�X���ʂ��Ă���K�v������B
    conf.load( this.getClass().getResourceAsStream( "/standardprop.properties" ) );

  }

  /**
   * �i�[�l�̎擾<br />
   * �w�肳�ꂽkey�ɕR�Â��l��ԋp���܂��B <br />
   *
   * @param key �L�[�l
   * @return �擾�����l
   */
  public String getValue( String key ) {
    // key�ɕR�Â��l���擾�B
    return conf.getProperty( key );
  }

}
