/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * Test11 <br />
 * Java003 ��1�̉𓚗� <br />
 * �v�Z���� <br />
 * 0.1��10�񑫂�����A10�{�ɂ������ʂ�\������ <br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Test11 {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Test11() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * ���C�����\�b�h �������N������ <br />
   * 0.1��10�񑫂�����A10�{�ɂ������ʂ�\������ <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �v�Z����
    BigDecimal ans = new BigDecimal( "0.0" );
    // ���l�u0.1�v
    BigDecimal p1 = new BigDecimal( "0.1" );
    // ���l�u10�v
    BigDecimal ten = new BigDecimal( "10" );

    // 0.1��10�񑫂�
    for ( int i = 1; i <= 10; i++ ) {
      ans = ans.add( p1 );
    }

    // 0.1��10�񑫂������ʂ�10�{�ɂ���
    ans = ans.multiply( ten );
    // �v�Z���ʂ��o�͂���
    System.out.println( "�iBigDecimal�j0.1��10�񑫂�����A10�{�ɂ������ʁF" + ans );

    // �i�Q�l�p�jBigDecimal���g��Ȃ������ꍇ
    double dbl_ans = 0.0;

    // 0.1��10�񑫂�
    for ( int i = 1; i <= 10; i++ ) {
      dbl_ans += 0.1;
    }
    // 10�{�ɂ���
    dbl_ans = dbl_ans * 10;
    // �v�Z���ʂ��o�͂���
    System.out.println( "�idouble�j    0.1��10�񑫂�����A10�{�ɂ������ʁF" + dbl_ans );

  }
}
