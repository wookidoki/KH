package com.kh.chap05.costructor.model.vo;

public class Member {
	
	// [ �ʵ�� ]
	private String userId;
	private String userPwd;
	private String nickName;
	
	
	// [ �����ں� ]
	/* 
	 * *������ (Constructor) : ��ü�� �����ϴµ� ����ϴ� Ư���� ������ �޼ҵ�
	 * 
	 * [ ǥ���� ]
	 * ���������� Ŭ�����ĺ���(�Ű�����(��������)) {
	 * 			�ش�����ڸ� ���ؼ� ��ü ������ �����ϰ����ϴ� �ڵ�;
	 * }
	 * 
	 * �������� ��Ȱ
	 * -- ����� ���� : ��ü�� ������ �� � ���·� ������ �ؾ��ϴ°�
	 * -- ������ ���� : ��ü�� ó������ ��ȿ�� ���¸� �������� �����ϱ����� 
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ >> �⺻������
	 * 2. �Ű������� �����ϴ� ������ 
	 */
	
	
	
	public Member() {
		// �⺻������ - �Ű������� ���� ������ 
		// �⺻�����ڴ� ��ü�� ������ �������� ȣ���ؼ� ��� 
		// �⺻�����ڴ� �����ص� ������ �߻������ʴ´� 
		// Ŭ���� ���ο� �����ڸ� �ϳ��� �ۼ����� ������ �⺻�����ڸ� �ڵ����� ������� 
		// �����δ� �⺻�����ڸ� �׻� �ۼ����� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	}

	public Member(String userId) {
		System.out.println("�Ű������� 1���� ������");
		
	}
	public Member(String userId , String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
		
	}
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	/*
	 * 1. �ݵ�� �������� �̸��� Ŭ������ �����ϰ� �ۼ�(��ҹ��� ����)
	 * 2. ��ȯ���� �����ؼ��� �ȵȴ� (�޼ҵ�� �Ǵ�)
	 * 3. �Ű����� �����ڸ� ��������� �ۼ��ϸ� �⺻�����ڸ� ��������� �ʴ´�
	 * ==>> �� �⺻�����ڸ� ������ִ� ����
	 * 4. �����ڴ� ������ �̸����� ���� �� ������ ���������� �Ű������� �ߺ��Ǿ �ȵ�.
	 * 
	 */
	
	

	
	
	
	
	// [�޼ҵ��]
	public void setuserId(String userId) {
		this.userId = userId;
	}
	
	public void setPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setnickName(String nickName) {
		
	}
	
	public String getuserId() {
		return userId;
	}
	
	public String getuserPwd() {
		return userPwd;
	}
	
	public String getncikName() {
		return userPwd;
	}

	public String info() {
		return "ID : " + userId
				+"\nPassword : " +userPwd 
				+"\nȯ���մϴ� " + nickName + "��";
		
	}
	
	
}
