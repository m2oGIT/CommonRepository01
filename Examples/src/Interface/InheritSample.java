
package Interface;

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

    // Interface�N���X���̂́A�C���X�^���X�𐶐��ł��Ȃ��B
    // InterfaceSample org = new InterfaceSample();
    ImplementsSample ipm = new ImplementsSample();

    // �����������\�b�h�����s�B
    ipm.displayMsg();

    // �����������\�b�h�����s�B
    ipm.changeMsg( "�p����Ń��b�Z�[�W���X�V���܂����B" );

    // �����o�ϐ��̒l���m�F�B
    ipm.displayMsg();

    // �����������\�b�h�����s�B
    ipm.displayDate();

    // ������N���X�Œǉ��������\�b�h�����s�B
    ipm.displayTime();


    /** ��͂�N���X�̋��ʂ�����e��؂�o�����ƂŁA�S�̂̃R�[�h�ʂ�����A���C�R�ꓙ���h���邽�ߕێ琫�����シ��B **/

    /** �A���Aabstract�N���X�Ƃ͈قȂ�A�e���\�b�h�̓��e�͎�����N���X�Ɉ�C�����B **/
    /** �����interface�̖��̒ʂ�A�C���^�[�t�F�[�X�𕡐��N���X�Ԃŋ��L�������ꍇ��interface�N���X���g�p����B **/
  }
}
