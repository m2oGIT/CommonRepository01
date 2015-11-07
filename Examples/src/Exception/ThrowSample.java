
package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ��O�����̏�����(���p��) <br />
 * ��O�Ɋւ��鉞�p�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ThrowSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    /** throw/throws���g�����ƂŁA��荂�x�Ȑ��䂪�\�B **/
    /** �����A���R�x����������������ɂ���������AJava�̓����ł����_�̈�Ƃ�������B **/

    // ��O�̔������鏈�������s�B
    // subMethodA(); //���s���G���[����������B

    // ��O�̔������鏈�������s�B
    // subMethodB(); //throws�錾��FileNotFoundException���Ϗ�����Ă���Atry�`catch���L�q���Ȃ��ƃR���p�C���G���[

    // ��O�̔������鏈�������s�B
    // subMethodC();//throws�錾��Exception���Ϗ�����Ă���Atry�`catch���L�q���Ȃ��ƃR���p�C���G���[


    // ��O�������������Ă��Ȃ��G���[��main���\�b�h�ɓ��B��catch����Ȃ��ƁA
    // ���s���̏����������I������i��main���\�b�h���ŏ�ʂ̂��� "�G���[������������Ȃ��������" �ƂȂ�j�B
    // ���̍s�܂œ��B�ł��Ȃ��B
    System.out.println( "���C�����\�b�h�̖����ɓ��B���܂����B" );


    // throw/throws���g�p���邱�ƂŁA��O�����̋L�q�����N���X�̓��胁�\�b�h�ɏW��i�Ϗ��j���邱�Ƃ��ł���B

    // �Ɩ��v���O�����ł́A��O�N���X�����O�ŗp�Ӂ˗�O�������͎��O�̗�O�N���X�ɏW��˂�������O�o�̓��\�b�h�ɓn���˗�O�������O�ɏo�͂���

    // �Ƃ������������ǂ��̂���B

    // throw/throws�ŏW��i�Ϗ��j���邱�ƂŁA��O�����̋L�q�ӏ����X�̃v���O�����ɎU��΂邱�Ƃ�h���A

    // �ꌳ�Ǘ����\�ɂȂ�B���V�X�e���^�A�v�����œ��ꐫ�������ė�O�ɑΉ��ł���B
  }

  /**
   * �T�u���\�b�h���̂P<br />
   * ��O���������郁�\�b�h�ithrows�����j�B <br />
   **/
  private static void subMethodA() {

    // �Ӑ}�I��null���i�[�����ϐ���p�ӁB
    String str = null;
    // null�l�̎Q�ƁB
    str.length();
    // �����I�ɌĂяo�����֗�O����������B
  }

  /**
   * �T�u���\�b�h���̂Q<br />
   * ��O���������郁�\�b�h�ithrows�錾����j�B <br />
   *
   * @throws FileNotFoundException �t�@�C���p�X�G���[
   **/
  private static void subMethodB() throws FileNotFoundException { // throws�ŗ�O�������ɂ͏�ʂ֓�����錾
    FileReader obj = new FileReader( "filename.txt" );
    // throws�錾������O�͓��Y���\�b�h�ł�try�`catch���L�q�����A��ʁi�Ăяo�����j�ɈϏ�����B
  }

  /**
   * �T�u���\�b�h���̂R<br />
   * ��O���������郁�\�b�h�ithrow/throws�錾����j�B <br />
   *
   * @throws Exception ��O
   **/
  private static void subMethodC() throws Exception {

    try {
      FileReader obj = new FileReader( "filename.txt" );

    } catch ( FileNotFoundException e ) {

      // catch������O��ʂ̗�O�Ƃ���throw������
      System.out.println( "FileNotFoundException���������܂����BException�ɒu��������throw���܂��B" );
      Exception e2 = e;
      throw e2; // throw�ŗ�O����ʂɓ�����B
    }
  }

}
