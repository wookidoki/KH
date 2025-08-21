package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ��ü ���� ���α׷��� : ���Ǽ��迡���� �������� ����(��ü)�� �Ӽ��� ������ ���� ��ü�� ����
		 * 					��ü���� ��ȣ�ۿ��� ���� ���α׷��� �ϴ� ��� 
		 * 
		 * �����ϰ��� �ϴ� ���α׷��� ��ü�� ����� ����(�����ϱ� ����) =>> Ŭ������ ���� ����
		 * 
		 * Ŭ������? = �� ��ü���� ���� (�Ӽ�, ����) ���� ��Ƴ��� �׸� �Ǵ� Ʋ ���赵 �Ǵ� ��
		 * Ŭ���� : VO (Value Object) 
		 * 
		 * ���� : �� VO Ŭ���� �� �ּ� �ʵ� �� 5��
		 * �ּ� �Ѱ� �̻��� �ʵ� ���� �����Ҽ��ִ� �޼ҵ� ���� puppy �� bark() ó��
		 * 
		 * ������ �� : �츮�� �Խ��� �Խñ� �ۼ�
		 * ���� ���� ���� �� �� ���� 
		 * 
		 * 
		 */
		
		
		//�����ڰ� ����� ����� ���� ������ Ŭ���� �����
		
		
		// ��ü �����غ���
		// ������ ��ü ���� 
		Puppy dog =  // ���� ���� 
		new Puppy(); // ������ ��ü ���� 
		// new ��� ���� ��� 
		//Memory �� heap ������ �����͸� ����
		
		dog.species = "���޶�Ͼ�";
		dog.name = "�ʶ���";
		dog.age = 4;
		dog.gender = "W";
		dog.color ="brown";
		dog.weight = 2;
				
		
		System.out.println(dog);
		System.out.println(dog.name + "�� " 
						  + dog.species + "�Դϴ�. "
						  + dog.color + "�����Դϴ�.");
		
		
		Puppy soldier = new Puppy();
		soldier.species = "�׷���Ʈ �Ƿ�����";
		soldier.name = "�����";
		soldier.age = 10;
		soldier.gender = "M";
		soldier.color ="White";
		soldier.weight = 60;
		
		System.out.println(soldier.name + "�� " 
				  + soldier.species + "�Դϴ�. "
				  + soldier.color + "�����Դϴ�.");
		
		//��ü�� ���� 
		
		dog.sniff();
		soldier.sniff();
		
		dog.bark();
		

	}



}
