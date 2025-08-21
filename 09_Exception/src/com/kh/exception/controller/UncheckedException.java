package com.kh.exception.controller;

import java.util.Scanner;

public class UncheckedException {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * ���� ó�� ���
	 * 
	 * ������ �߸��Ȱ� üũ�� ����
	 * 
	 * �� ���α׷� ���� �� �߻��ϴ� ���ܵ�
	 * RuntimeException
	 * 
	 * - NullPointerException �ּҰ� ��ü�� �����ߴ��� null ���� ������� ��� �߻� 
	 * 
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��ϴ� ����
	 * 
	 * - ClassCastException : ����� �� ���� �� ��ȯ�� ������ ��� �߻��ϴ� ����
	 * 
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 * ............
	 * 
	 * �����ڰ� �������� 
	 * 
	 */
	
	/* try ~ catch ��
	 * 
	 * [ ǥ���� ]
	 * 
	 * try {
	 * 	(num1 /num2) // ���ܰ� �߻��Ҽ����ִ� ���� "���⼱ 0���� ������ ���"
	 *
	 * } catch(�߻��ҿ���Ŭ������ ������) { => �Ű����� 
	 * 
	 *  �ش� ���ܰ� �߻������� ������ ����
	 * 
	 * }
	 * 
	 * 
	 */
	
	public void method1() {
		
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 
	 try {
		 System.out.println(a/b);
		 
		 System.out.println("���ƿ�");
		 
	 } catch(ArithmeticException e) {
		 System.out.println("��� �ȵſ�");
	 }
	}

}
