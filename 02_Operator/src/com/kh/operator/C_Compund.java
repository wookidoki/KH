package com.kh.operator;
import java.util.Scanner;

public class C_Compund {
	
	/*
	 * �� ���մ��Կ�����
	 * 
	 * ( ���Կ����� = , ������ ���� �����Ҷ� )
	 * 
	 * ���մ��� �����ڴ� ��������ڿ� ���Կ����ڰ� ���յ� ��
	 * => �ڱ� �ڽ��� ���� �ش� ��������� �� �� �� ����� �ڱ� �ڽſ��� �ٽ� �����ϴ� �뵵
	 * 
	 * 
	 * + - / * %  
	 
	 * 
	 */
	
	
	
	
	public void compund () {
		
		int endDays =  200 ;
		endDays -= 1;
		System.out.println(endDays);
		
		int mutilple = 5;
		mutilple *= 3;
		System.out.println(mutilple);
		

		
		
		
	}
	

	public void method1 () {
		
		System.out.println("a");
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("������ �Է� �Ͻÿ� >> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num);
		
		// number = number - 10  =>>>> number -= 10;  ����
		
		num -= 10;
		System.out.println(num);
		
		
	}
	
	
	

}
