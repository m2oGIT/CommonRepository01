
package Constructor;


/**
 * �R���X�g���N�^�̎g���� <br />
 * �R���X�g���N�^�̃T���v���i�������j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class ConstructorSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ConstructorSample() {
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

    //����N���X�̃R���X�g���N�^���Ăяo���B
    MyCar1 mycar1 = new MyCar1();
    System.out.println( "mycar1.getNum(): " + mycar1.getNum() ); // ���������Ȃ��B


    //����N���X�̃R���X�g���N�^���Ăяo���B
    MyCar2 mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // ������������B


    //����N���X�̃R���X�g���N�^���Ăяo���B
    MyCar3 mycar3 = new MyCar3();
    System.out.println( "mycar3.getNum(): " + mycar3.getNum() ); // ���������Ƃ��ď��������Ȃ��N���X�̒l��ݒ�B


    // �Ⴆ��mycar2��num��K���Ȓl�ŏ���������B
    mycar2.setNum( -999999999 );
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() );

    // new���邱�ƂŃR���X�g���N�^���ēx���s�����B
    mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() );


    /**�����I�ȏ������̑��A
     * �C���X�^���X�������ɕK�����s�������������R���X�g���N�^�ɋL�q���Ă����Ɨǂ��B**/
  }
}
