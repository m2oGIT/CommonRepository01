/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * Member <br />
 * Java007 ��2�̉𓚗� <br />
 * �Ј����N���X <br />
 * <br />
 * �Ј����i�Ј�No�A���A���j�����ƂɈȉ��̏���������B <br />
 * �Ј����̐ݒ� <br />
 * �Ј����̉�ʕ\�� <br />
 * ���������`�F�b�N<br />
 * �X�V���� 2017/05/28 �� �ԐD�F�V�K�쐬 <br />
 */
public class Member {

  /** �Ј������N���X�ϐ��Ƃ��ĕێ� */
  // �Ј�No
  private String id;
  // ���O
  private String firstName;
  // ��
  private String secondName;

  /**
   * �R���X�g���N�^ <br />
   * �Ј����i�Ј�No�A���A���j��ݒ肷��B <br />
   *
   * @param id �Ј�No <br />
   * @param firstName �� <br />
   * @param secondName �� <br />
   */
  public Member( String id, String firstName, String secondName ) {

    // �R���X�g���N�^��������Ј�����ݒ肷��
    this.id = id;
    this.firstName = firstName;
    this.secondName = secondName;
  }

  /**
   * �Ј����̕\�� <br />
   * �Ј����i�Ј�No�A���A���A�����j��\������B <br />
   */
  public void showinfo() {

    // �ێ����Ă���Ј������o�͂���
    System.out.println( "�Ј�No�F" + this.id );
    System.out.println( "���@�@�F" + this.secondName );
    System.out.println( "���@�@�F" + this.firstName );
    System.out.println( "�����@�F" + this.secondName + " " + this.firstName );
    System.out.println( "" );

  }

  /**
   * ���������`�F�b�N <br />
   * ���Ɛ������ꂼ�ꓙ���������肷��B <br />
   *
   * @param mem �Ј���� <br />
   */
  public void checkName( Member mem ) {

    // �N���X�̕ێ����Ă���Ј����ƁA���\�b�h�����Ƃ��ēn���ꂽ�N���X�̎Ј������r����
    if ( secondName.equals( mem.secondName ) && firstName.equals( mem.firstName ) ) {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA" + "�Ј�No=[" + mem.id + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + this.id + "]�ƁA" + "�Ј�No=[" + mem.id + "]�͓��������ł͂���܂���B" );
    }

  }

  // �ȉ���R�Œǉ�
 /**
   * ���̎擾 <br />
   * �����擾����B <br />
   *
   * @return firstName ��
   */
  public String getFirstName() {

    return this.firstName;

  }

  /**
   * ���̐ݒ� <br />
   * ����ݒ肷��B <br />
   *
   * @param firstName ��
   */
  public void setFirstName( String firstName ) {
    this.firstName = firstName;
  }

  /**
   * �Ј�No�̎擾 <br />
   * �Ј�No���擾����B <br />
   *
   * @return id �Ј�No
   */
  public String getId() {
    return this.id;
  }

  /**
   * �Ј�No�̐ݒ� <br />
   * �Ј�No��ݒ肷��B <br />
   *
   * @param id �Ј�No
   */
  public void setId( String id ) {
    this.id = id;
  }

  /**
   * ���̎擾 <br />
   * �����擾����B <br />
   *
   * @return secondName ��
   */
  public String getSecondName() {
    return this.secondName;
  }

  /**
   * ���̐ݒ� <br />
   * ����ݒ肷��B <br />
   *
   * @param secondName ��
   */
  public void setSecondName( String secondName ) {
    this.secondName = secondName;
  }
}
