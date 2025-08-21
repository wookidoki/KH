package com.kh.chap02.model.vo;

public class ItalyFood extends Food{
	
	private int oil;
	
	public ItalyFood() {
		super();
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		//���������ڰ� private �̶� ����������
		//1. �θ�Ŭ������ ���������ڸ� �ٲ���� - ĸ���� ��Ģ ����
		//2. �θ�Ŭ������ ���������� public �� setter �޼ҵ� ȣ��
		//3. �θ�Ŭ������ �������ִ� �Ű����� �����ڸ� ȣ�� (�̹���� ���� ����)
		
		super(foodName, material,cookingTime);
		this.oil = oil;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	

}
