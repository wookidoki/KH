package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {
	// TODO Auto-generated method stub
	
	// ĸ��ȭ (encapsulaton)
	// �Ӽ�(������)�� �ش� �����͸� �����ϴ� �ൿ(�޼ҵ�)�� �ϳ��� ������ ���� ��
	// ��������(information hiding)
	// 3�� Ư�� ĸ��ȭ ��� ������

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		
		//cafe.cleaning();
		//cafe.cleanWidow();
		//cafe.dishWash();
		
		//�ʵ尡 �������ʴ� ���� 
		//private�� ��� ���� ������ �Ұ� , ���� �����ؾ���
		
		// cafe.name ="KHī��";
		//cafe.open();
		
		//�޼ҵ� ȣ��ο����� ������ ���� �ѱ������
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("KHī��");
		cafe.setAddress("����");
		
		String cafeName = cafe.getName();		
		
		System.out.println(cafe.getName());
		System.out.println(cafeName);
		
		//�޼ҵ� ȣ��ο����� ������ �����Ͱ��� ��������Ѵ�
		
		cafe.getAddress();
		System.out.println(cafe.getAddress());
		
		cafe.getSignatureMenuPrice();
		System.out.println(cafe.getSignatureMenuPrice());
		
		cafe.info();
		System.out.println(cafe.info());
	}



}
