
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * �T�[�o�[DB�ڑ��� <br />
 * DB�A�N�Z�b�T�̎g�����iPreparedStatement�j <br />
 * PreparedStatement�N���X���g�p������{�I�ȕ��@ <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class PreparedStatementSample {

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public PreparedStatementSample() {
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

    // PreparedStatement�N���X�͍ł��g�p�p�x�̍���DB�A�N�Z�X�N���X�B
    // �Ɩ��v���O�����ł͒ʏ킱������g�p����B

    // DB�֘A�C���X�^���X�𐶐��B
    PreparedStatement pstmt = null;
    Connection conn = null;
    // ResultSet�͌������ʊi�[�p�̃��C�u�����N���X�B
    ResultSet rs = null;
    int count = 0;

    // SQL���𕶎���ŋL�q����B
    // PreparedStatement��value����U�u?�v�ŉ��u�����Ē������_�������iStatement�N���X�̎��Ǝ㐫�ւ̑΍�j�B
    String sqlSelect = "SELECT * FROM moeiwast_eiwatest_DB01.test01_yamamoto";
    // String sqlInsert = "insert into moeiwast_eiwatest_DB01.test01_yamamoto"
    // + " ( STAFF_NO, OFFICE_CD, STAFF_NAME, WORK_TIME, CREATE_DATE ) values ( ?, ?, ?, ?, ? )";

    // �ڑ���DB�̎w�蕶����iDB���i���ƂɌ�����^�j�B
    // �T�[�o�[DB��ڑ���Ƃ���ꍇ�B
    String url = "jdbc:mysql://m2o-eiwa.1strentalserver.info:3306/moeiwast_eiwatest_DB01";

    try {
      // �h���C�o�iopt/mysql-connector-java-5.1.36-bin.jar�j�����[�h����B
      // eclipse�̃v���W�F�N�g���v���p�e�B�[���r���h�p�X�����C�u��������h���C�ojar�̊i�[���ݒ肵�Ă������ƁB
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // MySQL�̏ꍇ�A�ȉ��̂悤�ɕ����R�[�h�w����܂ސڑ�����
      // Properties�N���X�ɃZ�b�g����Connection�N���X�ɓn���B
      Properties props = new Properties();

      props.put( "useUnicode", "true" ); // �ȗ�����Ɠ��{�ꂪ������������B
      props.put( "characterEncoding", "SJIS" ); // �ȗ�����Ɠ��{�ꂪ������������B

      // �@�T�[�o�[DB��ڑ���Ƃ���ꍇ�B��������ID/PWD���w�肷��B
      props.put( "user", "moeiwast_user01" );
      props.put( "password", "zaq12wsx_user01" );

      // �ڑ��������ɁA�R�l�N�V�����𐶐��B
      conn = DriverManager.getConnection( url, props );

      // �R�l�N�V��������X�e�[�g�����g�iSQL���s�p�I�u�W�F�N�g�j�𐶐��B
      pstmt = conn.prepareStatement( sqlSelect );
      // pstmt = conn.prepareStatement( sqlInsert );


      // �p�����[�^�I�u�W�F�N�g���Z�b�g�B���u�����Ă����u?�v�����̓I�Ȓl�ɒu�������Ă���B
      // �T�[�o�[DB��test_table��ڑ���Ƃ���ꍇ�B
      // pstmt.setObject( 1, "12345678901" );
      // pstmt.setObject( 2, "123" );
      // pstmt.setObject( 3, "�T���v���v���O��������o�^" );
      // pstmt.setObject( 4, "99999" );
      // pstmt.setObject( 5, "2016/07/23" );

      // SQL�����s�B
      // �Q�ƌn�iSelect�j�ƍX�V�n�Ń��\�b�h���قȂ�B
      rs = pstmt.executeQuery();
      // count = pstmt.executeUpdate();


      // �������ʂ�\������B�iexecuteQuery���s���j
      // ResultSet�͕\�`���̃I�u�W�F�N�g�B
      // �f�t�H���g��"0�s��(�f�[�^�Ȃ�)"���w���Ă���Ars.next()�����s����x��1�s�i�ށB
      if ( rs != null ) {
        while ( rs.next() ) {

          // �J�����̌^�ɍ��킹��getInt()/getString�Œl�����o���B
          System.out.println( rs.getString( "STAFF_NO" ) );
          System.out.println( rs.getString( "OFFICE_CD" ) );
          System.out.println( rs.getString( "STAFF_NAME" ) );
          System.out.println( rs.getString( "WORK_TIME" ) );
          System.out.println( rs.getString( "CREATE_DATE" ) );
          System.out.println( "" );
        }
      }

      // �X�V������\������B�iexecuteUpdate���s���j
      if ( count != 0 ) {
        System.out.println( "�X�V���������܂����B" + count + " �����X�V���܂����B" );
      }


      // Stream�Ɠ��l�A�����Ŗ����I�ɃN���[�Y�������L�q����̂�����@�B
      // �������ʂ̃N���[�Y�B
      if ( rs != null ) {
        rs.close();
      }
      // �X�e�[�g�����g���N���[�Y����B
      pstmt.close();

      // �G���[�������̓G���[�̓��e��\���B
    } catch ( ClassNotFoundException e ) {
      System.out.println( "ClassNotFoundException:" + e.getMessage() );
    } catch ( SQLException e ) {
      System.out.println( "SQLException:" + e.getMessage() );
    } catch ( Exception e ) {
      System.out.println( "Exception:" + e.getMessage() );

    } finally {
      try {
        // �R�l�N�V�������N���[�Y�B
        if ( conn != null ) {
          conn.close();
        }
      } catch ( SQLException e ) {
        System.out.println( "SQLException:" + e.getMessage() );
      }
    }

    /** �g�p���郉�C�u�����N���X�̎�ނ������ۈËL��������߁A�T���v�������ɃR�s�[�쐬�ł����Ȃ��B **/
  }
}
