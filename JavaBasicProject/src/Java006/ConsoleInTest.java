
package Java006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ConsoleInTest <br />
 * Java006 ��1�̉𓚗� <br />
 * ������̕\������ <br />
 * <br />
 * �R���\�[��������͂��ꂽ�����s�̕���������ߍ��݁A <br />
 * ���炩���ߒ�`���ꂽ�I�������iend�j�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class ConsoleInTest {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public ConsoleInTest() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ������̕\������ <br />
   * �R���\�[��������͂��ꂽ�����s�̕���������ߍ��݁A <br />
   * ���炩���ߒ�`���ꂽ�I�������iend�j�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B <br />
   *
   * @param args �N��������
   * @throws IOException ���o�͗�O
   */
  public static void main( String[] args ) throws IOException {

    // ���͎w������ʂɕ\������
    System.out.println( "���������͂��Ă��������B" );
    System.out.println( "end�̓��͂ŏI�����܂��B" );
    System.out.println();

    // �R���\�[�����͗p�N���X�̃C���X�^���X��錾
    BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    // ���͂����������String�^�ϐ��Ɋi�[����
    String str = br.readLine();
    // ���͂���������𗭂ߍ��ނ��߂�StringBuffer��錾
    StringBuffer sb = new StringBuffer();

    // ���͂���������"end"�ƈ�v����܂ŁAStringBuffer�ɗ��ߍ���
    while ( !str.equals( "end" ) ) {
      // �������sb�̍Ō���ɒǉ�����
      sb.append( str );
      // ���͂����������str�ɓǂݍ���
      str = br.readLine();
    }

    // ���߂�������̏o��
    System.out.println( "���߂���������o�͂��܂��B" + sb );

  }
}
