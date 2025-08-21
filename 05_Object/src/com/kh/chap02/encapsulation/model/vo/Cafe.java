package com.kh.chap02.encapsulation.model.vo;


//VO(Value Object) Cafe �� �Ӽ��� �Է��ϴ� �뵵 (���� ��� �뵵)
//�ʵ�� , �����ں�, �޼ҵ��
public class Cafe {
	
	/*
	 * �ʵ�(Field)��
	 * 
	 * ��ü�� �������ִ� �Ӽ�
	 * ����(data) �� ��� �κ� 
	 * 
	 * �ʵ� == �ɹ�����
	 * 
	 * ���������� �ڷ��� �ʵ� �ĺ���;
	 * 
	 */
	
	private String name;
	private String address;
	private String signatureMenu;
	private int signatureMenuPrice;
	
	// ������(Constructor)��
	
	
	// �޼ҵ� (Method)�� // ���⼭�� �ϴ� �׳� ���� ������ VO �� ���� ���õ� ��ɵ��� ������
	// ���������� (�����) ��ȯ�� �޼ҵ�ĺ��� (){}
	
	//���������� : ȣ���� �� �ִ� ������ ������ �� ����
	//��ȯ�� : void => return �� �� �����ٰ��� ����.
	
	public void open() {
		dishWash();
		cleaning();
		cleanWindow();
	}
		
	private void dishWash() {
		System.out.println("�����ϰ� ����!!");
		
	}

	private void cleaning() {
		System.out.println("û�ҵ� ����!!");
		
	}
	
	private void cleanWindow() {
		System.out.println("������ ����!!");
		
	}
	
	
	//setter�� ����
	//�����޴��� ���������� ��� �� ������ �� �ִ� �޼ҵ�
	//signatureMenuPrice �� setter ������ set�ʵ�ĺ��� 


	public void setSignatureMenuPrice(int signatureMenuPrice) {
		this.signatureMenuPrice = signatureMenuPrice;
		
		//Scope �ȿ����� �ش� �����ȿ� �ִ� ���������� ���� �켱�������� �׷��� �ּҁ����� �����ؾ���.
	}
	
	
	// getter() �� ���������� public �� ����Ѵ�
	// get�ʵ������ ���� , ��Ÿ��ǥ���() �� ����Ѵ�
	// ��� �ʵ忡 ���ؼ� �ݵ�� ������ �� �������Ѵ�
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getAddress() {
		return address;
		
	}
	
	//getter() setter() ������� ==> ĸ��ȭ�� ����
	/*
	 * ���� ����� => �ʵ��� ���������ڸ� public ��� private ���� ����
	 * �޼ҵ带 ���� �ʵ忡 �����Ҽ��ֵ��� getter setter
	 * ������ �� ���� -> ��ü�� ���յ��� ���� -> å���� �и�
	 * 
	 */
	
	public String info() {
		
		String info = "name �ʵ尪 : " + name + "\naddress �ʵ尪 : " + 
		"\nsignatureMenuPrice �ʵ尪 : " + signatureMenuPrice;
		
		return info;
	}

	
	
}
