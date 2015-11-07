
package BasicClass;

/**
 * ��r���̃T���v�� <br />
 * ������r��equals()�̈Ⴂ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SampleEquals {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public SampleEquals() {
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

    /** �v���~�e�B�u�iprimitive�j�Ȍ^�̒l�̔�r **/
    // �v���~�e�B�u�Ȍ^�̒l�̔�r�́A"==" �ōs���B

    // int�^
    int num1 = 10;
    int num2 = 10;

    if ( num1 == num2 ) {
      System.out.println( "num1 �� num2 �� �����l�ł��B" );
    } else {
      System.out.println( "num1 �� num2 �� �قȂ�l�ł��B" );
    }

    // long�^
    long num3 = 3000000000000000000L;
    long num4 = 4000000000000000000L;

    if ( num3 == num4 ) {
      System.out.println( "num3 �� num4 �� �����l�ł��B" );
    } else {
      System.out.println( "num3 �� num4 �� �قȂ�l�ł��B" );
    }

    // double�^
    double num5 = 5.55555;
    double num6 = 6.66666;

    if ( num5 == num6 ) {
      System.out.println( "num5 �� num6 �� �����l�ł��B" );
    } else {
      System.out.println( "num5 �� num6 �� �قȂ�l�ł��B" );
    }

    // char�F�����^
    char ch1 = 'a';
    char ch2 = '��';

    if ( ch1 == ch2 ) {
      System.out.println( "ch1 �� ch2 �� �����l�ł��B" );
    } else {
      System.out.println( "ch1 �� ch2 �� �قȂ�l�ł��B" );
    }

    // boolean�F�^�U�^�i�^�U�l�Btrue �܂��� false�B�����I�ɂ� 1 �܂��� 0 �Ɠ��`�B�j
    boolean flg1 = true;
    boolean flg2 = false;

    if ( flg1 == flg2 ) {
      System.out.println( "flg1 �� flg2 �� �����l�ł��B" );
    } else {
      System.out.println( "flg1 �� flg2 �� �قȂ�l�ł��B" );
    }

    // �Ȃ��Aif���̏�������boolean��"==true"��r�͏ȗ��\�B�p�o����\�L�B

    if ( flg1 ) { // if ( flg1 == true ) { �Ɠ��`�B
      System.out.println( "flg1 �� true�ł��B" );
    } else {
      System.out.println( "flg1 �� false�ł��B" );
    }

    // �قȂ�^�ł̔�r�̓R���p�C���G���[�ƂȂ�B
    // if ( ch1 == flg1 ) {
    // System.out.println( "num1 �� num2 �� �����l�ł��B" );
    // } else {
    // System.out.println( "num1 �� num2 �� �قȂ�l�ł��B" );
    // }
    // int��long�̂悤�ɈÖقŕϊ������r�\�Ȍ^�����邪�A
    // �Öق̕ϊ��́u�������������̌^�Ɋ񂹂�i������overflow�΍�j�v���[���ł���ꍇ�������A
    // �������̉\�����l������ƌ^�͑����������ǂ��B


    /** �I�u�W�F�N�g�^�̒l�̔�r **/
    // �I�u�W�F�N�g�^�̒l�̔�r�́A"equals()���\�b�h �ōs���B
    // �I�u�W�F�N�g�^��""==" ��p�����ꍇ�A�u�A�h���X�����ꂩ�H�v�̔�r�ɂȂ�A�l�̔�r�Ƃ͕ʂ̈Ӗ��ɂȂ�B
    // ����String�^���܂ރI�u�W�F�N�g�^�ɑ΂���l�̔�r��equals()���\�b�h�ōs�����ƁB

    // String�F������^
    String str1 = "abcdefg�����������`�a�b�c�d�e�f";
    String str2 = "abcdefg�����������`�a�b�c�d�e�f";

    if ( str1.equals( str2 ) ) {
      System.out.println( "str1 �� str2 �� �����l�ł��B" );
    } else {
      System.out.println( "str1 �� str2 �� �قȂ�l�ł��B" );
    }

    // String�F������^
    // new�i�C���X�^���X�������j���s���A�����I�ɕʃA�h���X�ɓ����l���i�[����B
    String str3 = new String( "abcdefg�����������`�a�b�c�d�e�f" );
    String str4 = new String( "abcdefg�����������`�a�b�c�d�e�f" );

    // "=="��r�ł��R���p�C���͒ʂ邪�A�l�̔�r�͂���Ȃ��B
    // new�����l���i�[�����ꍇ�́A�œK���ɂ�蓯��A�h���X���Q�Ƃ����i"=="�œ���Ɣ��肳���j�B
    // ���A�ǐ��������邽�߁A�I�u�W�F�N�g�^�̒l�̔�r��"equals()���\�b�h �ōs���B
    if ( str3 == str4 ) {
      System.out.println( "str3 �� str4 �� �����l�ł��B" );
    } else {
      System.out.println( "str3 �� str4 �� �قȂ�l�ł��B" );
    }

  }
}
