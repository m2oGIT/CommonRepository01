
package Static;


/**
 * static�̎g���� <br />
 * static�̃T���v���i�������j <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class StaticSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public StaticSample() {
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

    // ����N���X�istatic�j���Ăяo���B
    // MyCar1 mycar1 = new MyCar1();
    System.out.println( "MyCar1.getNum(): " + MyCar1.getNum() ); // static�ȃ��\�b�h�̓N���X��.���\�b�h���Œ��ڃA�N�Z�X�B

    MyCar1.setNum( 55555555 );
    System.out.println( "MyCar1.getNum(): " + MyCar1.getNum() ); // �l�͏�Ɉ�̕������p����B


    // ����N���X�i��static�j���Ăяo���B
    MyCar2 mycar2 = new MyCar2();
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // ��static�ȃ��\�b�h�̓C���X�^���X�o�R�ŃA�N�Z�X�B
    // System.out.println( "mycar1.getNum(): " + MyCar2.getNum() ); //���ڎQ�Ƃ̓R���p�C���G���[�ƂȂ�B


    // �V�K�C���X�^���X�𐶐�
    MyCar2 mycar3 = new MyCar2();
    // �C���X�^���Xmycar2��num���X�V
    mycar2.setNum( 0 );
    System.out.println( "mycar2.getNum(): " + mycar2.getNum() ); // ��static�Ȓl�̓C���X�^���X���Ƃɕێ������B
    System.out.println( "mycar3.getNum(): " + mycar3.getNum() ); // �ʂ̃C���X�^���X�ɂ������Ԃ͑��̃C���X�^���X�ɉe�����Ȃ��B



    /**
     * �g�������̖ڈ��Ƃ��āA �uUtility�̂悤�ȑS�̂ŋ��ʂ̃����o���P�g���񂹂Ύ������ꍇ�v�́ustatic�v�Ő錾���B
     * ����ȊO�̏ꍇ�i���邢�̓C���X�^���X���ɒl��ێ��������ꍇ�j�́u��static�v�Ő錾����A�ƍl����B
     **/
  }
}
