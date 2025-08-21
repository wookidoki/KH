package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
	/*
	 *  ��ӱ���
	 *  
	 *  �ʵ� / �޼ҵ� => ���� ���߿��ϴ�
	 *  
	 *  but ��ӱ����� �θ�Ŭ������ �ڽ�Ŭ�������� Ÿ�� (�ڷ���) �� �����ش�!!
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent();
		p1.printParent();
		//p1.parintChild1(); �ڽ��� �������̴� ����� �θ� ����Ҽ� ����
		//p1 ���� �δ� Parent ���� ���ٰ���
		
		//2. �ڽ� Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ�
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); //�ڽİ�ü�� �θ�ü�� ����Ű������ �θ� �޼ҵ� ȣ�Ⱑ��
		
		//3. �θ� Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ� => �ڷ����� Ʋ��
		Parent p2 = /*(Parent) - ����*/new Child1();
		p2.printParent();
		//p2.printChild1(); 
		
		/* Ŭ������ ��ȯ
		 * 1. Up Casting
		 * ��ĳ���� => �ڽ�Ÿ���� �θ�Ÿ������ (�����̰�����)
		 * 
		 * 2.Down Casting
		 * �θ�Ÿ���� �ڽ�Ÿ������(���� �Ұ�)
		 */
		
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[0] = new Child2();
		
		arr1[0].printChild1();
		
		System.out.println("\n\n\n\n�������� �����غ���");
		
		Parent[] arr = new Parent[4];
		arr[0] = (Parent) new Child1();
		arr[1] = (Parent) new Child2();
		arr[2] =  new Child1();
		arr[3] =  new Child2();
			
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
		System.out.println("\n\n\n\n");
		
		for(int i =0; i < arr.length; i++) {
			if(i == 0 || i == 2) { ((Child1)arr[i]).printChild1(); }
			if(i == 1 || i == 4) { ((Child2)arr[i]).printChild2(); }
		}
		
		System.out.println("\n\n\n\n");
		
		for(int i =0; i < arr.length; i++) {
		if(arr[i] instanceof Child1) {
			((Child1)arr[i]).printChild1();
			} else { ((Child2)arr[i]).printChild2();}
	
		}
		
		System.out.println("\n\n\n\n");
		
		/*
		 * ���� ���� ���ε�
		 * �������̵� �����ε�
		 * 
		 * �������ε� : ���α׷� "���� ��" ������ ������ �������ε� ����(�ڷ����� �޼ҵ带 ����Ŵ)
		 * 			���������� �����ϰ��ִ� ��ü�� �ش� �޼ҵ带 �������̵� �ߴٸ�
		 * 			���α׷� "���� ����" �������� �ڽ�Ŭ������ �������̵��� �޼ҵ带 ����
		 * 					Runtime
		 * 
		 * ������ : �θ�Ŭ���� �ڷ������� ���� �ڽ�Ŭ������ �ٷ�� ���
		 * 
		 */
		
		

	}
}
