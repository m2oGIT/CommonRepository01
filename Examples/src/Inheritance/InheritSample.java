
package Inheritance;

/**
 * �p���̎g���� <br />
 * �p���𗘗p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class InheritSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // ���ۃN���X���̂́A�C���X�^���X�𐶐��ł��Ȃ��B
    // AbstractSample org = new AbstractSample();
    ExtendsSample ext = new ExtendsSample();

    // �����p�������\�b�h�����s�B
    ext.displayMsg();


    // �����p���������o�ϐ����X�V���邱�Ƃ��\�B
    ext.changeMsg( "�p����Ń��b�Z�[�W���X�V���܂����B" );

    // �����o�ϐ��̒l���m�F�B
    ext.displayMsg();


    // �p����Œǉ��������\�b�h�����s�B
    ext.clearMsg();

    // �����o�ϐ��̒l���m�F�B
    ext.displayMsg();


    // �p����ŕҏW�������\�b�h�����s�B
    ext.displayDate();

    // �p����ŕҏW�������\�b�h�̃I���W�i�������s�B
    ext.orgDisplayDate();

    /** �N���X�̋��ʂ�����e��؂�o�����ƂŁA�S�̂̃R�[�h�ʂ�����A���C�R�ꓙ���h���邽�ߕێ琫�����シ��B **/

    /** �Ɩ��v���O�����ł́A�ގ�����\���̃N���X�𕡐��쐬����ۂɁA���`�Ƃ���abstract�N���X���g�p����B **/
    /** Web�A�v���̉�ʃ��W�b�N��o�b�`������entity���ǂ���B **/
    /** ���C����abstract�N���X�̂ݒ����΁A�����I�Ɍp����̑S�N���X�ɓK�p�����B **/

    // ���ۃN���X���̂́A�C���X�^���X�𐶐��ł��Ȃ��B
    NomalExtendsSample next = new NomalExtendsSample();

  }
}
