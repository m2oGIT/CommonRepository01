
package BasicClass;

import java.math.BigDecimal;

/**
 * BigDecimal�̎g���� <br />
 * �I�u�W�F�N�g�^�̎����l���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SampleBigDecimal {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public SampleBigDecimal() {
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


    /** BigDecimal�F�I�u�W�F�N�g�^�̎����l �ۂ߂̌��O�����Ŏg�p�ł��邽�߁A�g�p�p�x�������B **/

    // BigDeCimal�^�̒l��2�p�ӁB
    BigDecimal bd1 = new BigDecimal( "0.01" );
    BigDecimal bd2 = new BigDecimal( "1.00" );

    // ���Z
    BigDecimal ad = bd1.add( bd2 );
    System.out.println( "bd1 + bd2 �̌v�Z���ʂ� " + ad + "�ł��B" );

    // ���Z
    BigDecimal sr = bd1.subtract( bd2 );
    System.out.println( "bd1 - bd2 �̌v�Z���ʂ� " + sr + "�ł��B" );

    // ��Z
    BigDecimal mp = bd1.multiply( bd2 );
    System.out.println( "bd1 * bd2 �̌v�Z���ʂ� " + mp + "�ł��B" );

    // ���Z
    BigDecimal dv = bd1.divide( bd2 );
    System.out.println( "bd1 / bd2 �̌v�Z���ʂ� " + dv + "�ł��B" );


    /** BigDecimal�ɂ�scale�i���x�j�Ƃ����T�O������B **/

    // �Ⴆ�΁A�ȉ��̒l��scale��"2"�ƂȂ�B
    BigDecimal bd3 = new BigDecimal( "2.50" );
    BigDecimal bd4 = new BigDecimal( "0.00" );

    System.out.println( bd3 );
    System.out.println( bd4 );

    // scale�𑝂₷
    bd4 = bd3.setScale( 100 );
    System.out.println( bd4 );

    // scale�����炷�@���������̃��[���i�ۂ߃��[�h�j���w�肷��B

    bd4 = bd3.setScale( 0, BigDecimal.ROUND_HALF_UP ); // �l�̌ܓ�
    System.out.println( bd4 );
    bd4 = bd3.setScale( 0, BigDecimal.ROUND_UP ); // �؂�グ
    System.out.println( bd4 );
    bd4 = bd3.setScale( 0, BigDecimal.ROUND_DOWN ); // �؂�̂�
    System.out.println( bd4 );

    /** �ۂ߃��[�h�̒萔�͑��ɂ��p�ӂ���Ă���B API�}�j���A�����Q�Ƃ̂��ƁB **/
  }
}
