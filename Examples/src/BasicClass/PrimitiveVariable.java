
package BasicClass;

/**
 * �v���~�e�B�u�Ȍ^�̎g���� <br />
 * �v���~�e�B�u�Ȍ^���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class PrimitiveVariable {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public PrimitiveVariable() {
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

    // �v���~�e�B�u�iprimitive�j�F���q�́A�n�c�́A�Ƃ����Ӗ��B
    // �ł��V���v���^��{�I��Java�̕ϐ��̌^���p�ӂ���Ă���B
    // ���l�^�̉��Z�� +(�a�Z)�A-�i���Z�j�A*�i��Z�j�A/�i���Z�j �ōs���B

    // int�F�����^�i4�o�C�g�����t�����B-2147483648�`2147483647�j
    int num1 = 10;
    int num2 = 20;
    int sum1 = num1 + num2;
    System.out.println( "num1 + num2 �̌v�Z���ʂ� " + sum1 + "�ł��B" );

    // long�F�����^�i8�o�C�g�����t�����B��-922���`��922���j
    long num3 = 3000000000000000000L; // ������"L"�𖾋L����B�ȗ����͈Öق�int�l�ɕϊ������B
    long num4 = 4000000000000000000L;
    long sum2 = num3 + num4;
    System.out.println( "num3 + num4 �̌v�Z���ʂ� " + sum2 + "�ł��B" );

    // double�F�����^�i8�o�C�g���������_���j
    double num5 = 5.55555;
    double num6 = 6.66666;
    double sum3 = num5 + num6;
    System.out.println( "num5 + num6 �̌v�Z���ʂ� " + sum3 + "�ł��B" );

    // �A���Adouble�^�͓���̉��Z���Ɋۂߌ덷�ibyte���Z�ł��Ȃ����Z���ۂ߂�j�����������邽�߁A
    // Java�Ŏ����l�������ꍇ�̓I�u�W�F�N�g�^�i�N���X�^�Ƃ������j�ł���uBigDecimal�v���g�p����ꍇ�������B


    // char�F�����^�i2�o�C�gUNICODE�����B'\u0000'�`'\uffff'�j
    char ch1 = 'a'; // ���por�S�p�̂P�����������i�[�ł���B
    char ch2 = '��';
    System.out.println( "ch1�� " + ch1 + "�ł��B" + "ch2�� " + ch2 + "�ł��B" );

    // String�F������^�i�ʏ�A�����������ꍇ��String�^��p����B�j
    String str1 = "abcdefg�����������`�a�b�c�d�e�f";
    String str2 = "1234567890";
    String str3 = str1 + str2; // "+"���Z�q�ŕ�����������ł���B
    System.out.println( "str1 + str2 �̌������ʂ� " + str3 + "�ł��B" );

    // �����ɂ�String�̓I�u�W�F�N�g�^�����A����I�Ƀv���~�e�B�u�^�Ƃقړ����̈����ɂȂ��Ă���B


    // boolean�F�^�U�^�i�^�U�l�Btrue �܂��� false�B�����I�ɂ� 1 �܂��� 0 �Ɠ��`�B�j
    boolean flg1 = true;
    boolean flg2 = false;
    System.out.println( "flg1�� " + flg1 + "�ł��B" + "flg2�� " + flg2 + "�ł��B" );


    /** ��L�ȊO�ɂ��v���~�e�B�u�Ȍ^���p�ӂ���Ă���B�ڍׂ͂Ƃقٓ����Q�Ƃ̂��ƁB **/
  }
}
