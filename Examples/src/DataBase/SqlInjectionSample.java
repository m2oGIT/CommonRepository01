
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * SQL�C���W�F�N�V�����̎���iStatement�j <br />
 * Statement�N���X�̎��Ǝ㐫�̃T���v�� <br />
 * �X�V���� 2015/10/28 �R�{ ���u�F�V�K�쐬 <br />
 */
public class SqlInjectionSample {

  /**
   * ���C�����\�b�h<br />
   * �������N�����܂��B <br />
   *
   * @param args ���s������
   */
  public static void main( String[] args ) {

    // �C���W�F�N�V�����iInjection�j�́u�����A�����v�Ƃ������Ӗ��B
    // �v���O�����d�l�̌��ׂ�˂��A�J���҂̈Ӑ}���Ȃ�SQL�����s����B
    // Statement�N���X�ɂ́u����̃p�����[�^����WHERE��ȉ��̏����w�肪���������v�Ƃ������ׂ�����B

    // DB�֘A�C���X�^���X�𐶐��B
    Statement stmt = null;
    Connection conn = null;
    // ResultSet�͌������ʊi�[�p�̃��C�u�����N���X�B
    ResultSet rs = null;

    // �Ⴆ�Έȉ��̂悤�ɁASelect�����u�p�����[�^�v�Ɓu�p�����[�^�ȊO(�{��)�v�ŕ����ĕێ����A
    // �p�����[�^�̒l��Web��ʓ�������͂��ꂽ���e���i�[���郍�W�b�N�ł���Ƃ���B

    // ���͂��ꂽ�p�����[�^���J���҂̑z����̒l�ł���Ζ��Ȃ��B
    // String inputParam = "'����������'";

    // �ȉ��̂悤�ɁASQL���ɖ��ߍ��ނ��Ƃœ��ʂȈӖ�������������p�����[�^�Ƃ��ē��͂���B
    String inputParam = "' OR 'a' = 'a";

    // �{�̂ƃp�����[�^���������A1�{��SQL���ɂ���B
    String sqlSelect =
        "SELECT * FROM moeiwast_eiwatest_DB01.testTable WHERE name ='" + inputParam + "'";


    // �ڑ���DB�̎w�蕶����B
    String url = "jdbc:mysql://m2o-eiwa.1strentalserver.info:3306/moeiwast_eiwatest_DB01";

    try {
      // �h���C�o�����[�h����B
      Class.forName( "com.mysql.jdbc.Driver" ).newInstance();

      // Properties�N���X�ւ̃Z�b�g�B
      Properties props = new Properties();
      props.put( "user", "moeiwast_user01" );
      props.put( "password", "zaq12wsx_user01" );
      props.put( "useUnicode", "true" ); // �ȗ�����Ɠ��{�ꂪ������������B
      props.put( "characterEncoding", "SJIS" ); // �ȗ�����Ɠ��{�ꂪ������������B

      // �ڑ��������ɁA�R�l�N�V�����𐶐��B
      conn = DriverManager.getConnection( url, props );

      // �R�l�N�V��������X�e�[�g�����g�iSQL���s�p�I�u�W�F�N�g�j�𐶐��B
      stmt = conn.createStatement();

      // SQL�����s�B
      rs = stmt.executeQuery( sqlSelect );

      // �������ʂ�\������B�iSQL�C���W�F�N�V�����ɂ��A�S�������o����Ă��܂��B�j
      if ( rs != null ) {
        while ( rs.next() ) {

          // �l�����o���B
          System.out.println( rs.getInt( "id" ) );
          System.out.println( rs.getString( "name" ) );
          System.out.println( rs.getString( "createdate" ) );
          System.out.println( rs.getString( "client" ) );
          System.out.println( rs.getString( "address" ) );
          System.out.println( "" );
        }
      }

      // �������ʂ̃N���[�Y�B
      if ( rs != null ) {
        rs.close();
      }
      // �X�e�[�g�����g���N���[�Y����B
      stmt.close();

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

    /** ���̗�̏ꍇ�A�����񌋍���̏�����͎��̂悤�ɂȂ�BWHERE name ='' OR 'a' = 'a'�B **/
    /** �uname���󕶎� OR 'a' = 'a' �ł���ꍇ�v�܂�AOR�ȉ����u��ɐ^�v�ƂȂ�A **/
    /** WHERE��w�肪�����̂Ɠ��`�ɉ��߂���A�����Ƀe�[�u����̑S�������o�����B **/

    /** �����PreparedStatement�́u?�v�̒���ɂ��A�V���O���N�H�e�[�V������p���Ȃ��L�@�ƂȂ邱�Ƃ���A **/
    /** ���̖�������ł���isetObject()�ɓ��l�̕�������Z�b�g��Select�������s���Ă��A�������ʂ̓[�����ƂȂ�j�B **/


    /** ���ɐƎ㐫��˂����Z�L�����e�B�U���Ƃ��ẮA�ȉ����m���Ă���B **/
    /**  �EXSS�i�N���X�T�C�g�X�N���v�e�B���O�FWeb�y�[�W�Ɉ��ӂ̂���X�N���v�g�𖄂ߍ��ށj **/
    /**  �E�o�b�t�@�I�[�o�[�t���[�i�Ӑ}�I�Ƀ������̈�̃I�[�o�[�t���[�������N�����A���ӂ̂���R�[�h�����s����j **/
    /**  �EDOS�U���iDenial of Services attack�F��ʂ̃g���t�B�b�N�𑗐M���A�T�[�r�X���~������j **/

    /** �����Z�L�����e�B�z�[���ւ̑΍�Ƃ��āA **/
    /**  �u���̓`�F�b�N����肱�� �� �s���Ȓl�͏��߂�������ɓ��ꂳ���Ȃ��v **/
    /**  �u�T�j�^�C�W���O�i���Q���A�������j �� �s���Ȓl�𖳊Q�Ȓl�ɕϊ�����iPreparedStatement�j�v **/
    /**  �uJavaScript�ɂ���ʑ���̐���v �ȂǁA�A�v���̐݌v���_�ŃZ�L�����e�B�ɂ��Ĉӎ��E�������邱�Ƃ��d�v�ł���B**/

    /**  �� �Z�L�����e�B�̐Ƃ���\�������L���Ȍ��t "WeakestRink"�i�������S���͍ł��ϋv�x�̎ア�ӏ��Ő؂��j�ɗ��ӂ��邱�ƁB**/

  }
}
