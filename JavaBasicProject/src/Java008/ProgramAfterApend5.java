/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.io.FileNotFoundException;
import java.io.IOException;

import Java008.accessor.TextReader;
import Java008.accessor.TextWriter;

/**
 * ProgramAfterApend5 <br />
 * Java008 ��5�̉𓚗�i�N���X�����Łj <br />
 * <br />
 * �o�̓t�@�C���ҏW���� <br />
 * �X�V���� 2015/11/01 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ProgramAfterApend5 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ProgramAfterApend5() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �o�̓t�@�C���ҏW���� <br />
   * �Ј�����ǂݏ�������B <br />
   *
   * @param args �N��������
   */
  public static void main( String[] args ) {

    try {
      // �C���X�^���X�����A�x���͔�\���Ƃ���B
      TextReader txtred = new TextReader();
      @SuppressWarnings("unused")
      TextWriter txtwrt = new TextWriter( txtred.getList() );

    } catch ( FileNotFoundException e ) {
      System.out.println( "�t�@�C����������܂���B" );
    } catch ( IOException e ) {
      System.out.println( "���o�͗�O���������܂����B" );
    }
  }
}
