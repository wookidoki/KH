package com.kh.chap03.model.vo;

/*
 * Ŭ���� ���ο� ��ҷ� �߻�޼ҵ带 �ϳ��� �����ϴ� ����
 * Ŭ���� ���� abstract Ű���带 �ٿ��� �߻� Ŭ������ �����ؾ���
 * 
 * �߻�Ŭ���� == �ʵ� + �޼ҵ� + �߻�޼ҵ�(�޼ҵ��������)
 * ** �߻�޼ҵ尡 ���������ʾҵ� �߻�Ŭ���� ���ǰ��� 
 * 
 * �߻�Ŭ������ �����ϴ� ����
 * 1. ��������� ����ڰ� �Ǵܽ� �ش� Ŭ������ �θ�Ŭ���� ��Ȱ�θ� ����� �� ����
 * 		��ü������ �Ұ����ؾ��Ѵ�. ��� �Ǵܽ�
 * 2. ���������� ����ڰ� �Ǵܽ� �ش� Ŭ������ ��ü������ ������ ���°� �ƴѰ� ���� �ϴ�
 * 		������ ��� �߻�Ŭ������ ���� 
 * 
 * ��ü ������ �Ұ����ϰ� �ϰ� Ÿ�Ը� �������� �����ϰ� �ϰ�ʹ�.
 * 
 */

	// �߻�Ŭ������ ����Ǿ��⶧���� ��ü���� �Ұ�

public abstract class Sports {
	
	private int peopleCount;
	
	public Sports() {}
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount; 
	}
	
	public int getPeopleCount() {
		return peopleCount;
	}
	
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	/*�ڽĵ��� �������̵� �� �޼ҵ�
	public void rule() {
		System.out.println("Rules");
	}*/
	
	//�߻�ȭ abstract
	
	/*
	 * [ �߻�ȭ �޼ҵ� ǥ���� ]
	 * 
	 * ���������� abstract ��ȯ�� �ĺ���();
	 * 
	 */
	
	public abstract void rule();   

}
