
package BasicClass;

import java.math.BigDecimal;

import Inheritance.ExtendsSample;
import Inheritance.NomalExtendsSample;

/**
 * �^�̉��p�I�Ȏg���� <br />
 * �v���~�e�B�u�Ȍ^�ƃI�u�W�F�N�g�^���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SampleExtraVariable {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    /** �^�̕ϊ��́A�ϊ��p���\�b�h������΂�����A�Ȃ���΃L���X�g�ōs���B */

    // �����^�˕�����^�ւ̕ϊ�
    int num1 = 100;
    String str1 = "";
    // str1 = num1; // ����̓R���p�C���G���[�B
    str1 = String.valueOf( num1 ); // ������^�ւ̕ϊ���String�N���X��valueOf()���\�b�h�����s����B

    // �ϊ����ʂ̊m�F
    System.out.println( "str1�F" + str1 );


    // ������^�ː����^�ւ̕ϊ�
    String str2 = "123456";
    int num2 = 10;
    // str2 = num2; // ����̓R���p�C���G���[�B
    num2 = Integer.parseInt( str2 ); // ���l�^�ւ̕ϊ���Integer�N���X��parseInt()���\�b�h�����s����B

    // �ϊ����ʂ̊m�F
    System.out.println( "num2�F" + num2 );


    // �����^�ˎ����^
    int num3 = 300;
    BigDecimal bd1 = BigDecimal.ZERO;
    // bd = num3; // ����̓R���p�C���G���[�B
    bd1 = BigDecimal.valueOf( num3 ); // �����^�ւ̕ϊ���BigDecimal�N���X��valueOf()���\�b�h�����s����B

    // �ϊ����ʂ̊m�F
    System.out.println( "bd1�F" + bd1 );


    // �����^�˕�����
    BigDecimal bd2 = new BigDecimal( "0.9876543210" );
    String str3 = "";
    String str4 = "";
    // str3 = bd2; // ����̓R���p�C���G���[�B
    str3 = String.valueOf( bd2 ); // String�N���X�̕ϊ����\�b�h�����s����B
    str4 = bd2.toPlainString(); // BigDecimal�N���X�̕ϊ����\�b�h�����s����B

    // �ϊ����ʂ̊m�F
    System.out.println( "str3�F" + str3 );
    System.out.println( "str4�F" + str4 );



    /** �^�̕ϊ��́A�ϊ��p���\�b�h������΂�����A�Ȃ���΃L���X�g�ōs���B */

    // ��Ƃ��āAObject�^����ϐ��Ɋi�[���ꂽ�^�ւ̖����I�ȕϊ��B
    Object obj1 = "�I�u�W�F�N�g������";
    String str5 = "";
    str5 = ( String ) obj1;
    System.out.println( "str5�F" + str5 );

    // Object�^���̂́A�L���X�g�s�v�łǂ�Ȍ^�̒l������\�B
    // �ꌩ�A�֗��Ɍ����邪����Ԃ��Ɓu�s���Ȓl�������Ă��R���p�C���G���[�ɂȂ�Ȃ��B�v�Ƃ������ƁB
    Object obj2 = null;
    String str6 = "������^�Ɋi�[���ꂽ������";
    obj2 = str6;
    System.out.println( "obj2�F" + obj2 );

    // ���W�b�N�ϓ_�ł́A�u���̕ϐ��ɉ��^�̒l���i�[����Ă���̂��v���ۏ؂���Ȃ��Ȃ��Ă��܂����߁A
    // ������Object�^�ɂ��ׂ����m���K�v�\���ȗ��R���Ȃ�����́A�g�p���ׂ��ł͂Ȃ��B

    // �ȉ��̓L���X�g��Object�^�̌�p�ɋN���������s���G���[�̗�B
    // Integer.parseInt( ( String )obj2 );



    /** �Q�l�܂łɁA�p���֌W�ɂ���N���X�̃C���X�^���X���m�͕ϊ��Ȃ��ő���\ */
    ExtendsSample ext = new ExtendsSample();
    NomalExtendsSample next = new NomalExtendsSample();
    // ���ʂ̃����o��ێ����Ă���A�Ƃ����p���̑O��ɂȂ肽����B
    // �Ⴆ�΁A�u����̒��ۃN���X���p��������ʃI�u�W�F�N�g�ԂŁA�C���X�^�����Ǝ󂯓n�������v�Ƃ�������ʂŕ֗��B
    ext = next;
    ext.displayDate();


    /** �Ȃ��A���ՂȌ^�̕ϊ��͎��s���G���[�̉����ƂȂ�₷���i���ɃL���X�g�͋����ɕϊ����Ă��܂����Ƃ�����j�B **/
    /** �l�����Ƃ��ẮA���߂���^�ϊ��̏��Ȃ����W�b�N��g�ނ��Ƃ��x�X�g�B **/
  }
}
