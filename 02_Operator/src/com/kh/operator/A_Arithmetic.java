package com.kh.operator;
import java.util.Scanner;

public class A_Arithmetic {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	/*
	 * �� ���������
	 * 
	 * ���׿�����
	 * 
	 * + : ����
	 * - : ����
	 * * : ����
	 * / : ������
	 * % : ��ⷯ(Modular) �������� ���� ������ ������ 
	 * 	  
	 */


	public void method () {
		
		int num1 = 10;
		int num2 = 5;
		
		//����
		System.out.println(num1 + num2);
		System.out.println("num1 + num2 : " + num1 + num2);
		System.out.println("num1 + num2 : "  + (num1 + num2));

		
		int sum = (num1 + num2) ;
		System.out.println("num1 + num2 : " + sum);
		System.out.printf("num1 + num2 : %d \n", num1 + num2);
		System.out.printf("num1 + num2 : %d \n", sum);
		
		//����
		System.out.println(num1 - num2);
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		System.out.println("num1 * num2 : "  + (num1 * num2));
		System.out.println("num1 / num2 : "  + (num1 / num2));
		System.out.println("num1 % num2 : "  + (num1 % num2));
		
		
		presentToStudent();
		

		
	}
	
	public void presentToStudent() {
		
		
		
		int candyAmount = 0;
		int student = 0 ;
		
		int candyforOnePerson = 0;
		int remainCandy = 0 ;
	
		
		System.out.println("���������� �Է��ϼ��� (���ڸ� �Է��ϼ���)");
		candyAmount = sc.nextInt();
		sc.nextLine();
		
		System.out.println("�л� ���� �Է��ϼ��� (���ڸ� �Է��ϼ���) ");
		student = sc.nextInt();
		sc.nextLine();
		
		candyforOnePerson = (candyAmount /student );
		remainCandy = (candyAmount % student );
		
		System.out.printf("�� ���������� %d , �� �л� ���� %d �Դϴ�. \n", candyAmount ,student);
		System.out.printf("�л� �� ��� ���� �� �ִ� ������ ���� : %d �� \n���� ���� ���� : %d�� " 
				, candyforOnePerson, remainCandy);
		
		

		
	}
	
	public void test () {
		
		//System.out.println("�� main method ���� ȣ���ؾ��� �ϴ°��� �ƴ�");
		
		
		
	}
}
