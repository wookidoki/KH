package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * 
	 *  if ~ else
	 *  
	 *  [ ǥ���� ]
	 *  
	 *  if ���ǽ� { ���ǽ��� ����� true  ������ �ڵ� }
	 *  	else { ���ǽ��� �ᰡ�� false ������ �ڵ� }
	 *  
	 * 
	 */
	
	public void method1 () {
		
		//����ڿ��� ������ �Է¹޾Ƽ� 0���� ū�� �ƴ��� �Ǻ� �� ��� 
		
		Scanner sc = new Scanner (System.in);
		
		int userNum = 0 ;
		
		System.out.print("������ �Է��Ͻÿ� > ");
		userNum = sc.nextInt();
		sc.hasNextLine();
		
		if (userNum > 0) {
			System.out.print("���"); }
			else
			{ System.out.print("����"); }
	
		
		
		
	}
	
	/*
	 *  if ~ else if ��
	 *  
	 *  [ ǥ���� ]
	 *  
	 *  if ( ���ǽ� 1) {} 
	 *  	else if ( ���ǽ� 2) { ���ǽ� 2�� true �� ��� }
	 *  	else if ( ���ǽ� 3) { ���ǽ� 3�� true �� ��� }
	 *  	...
	 *  	...
	 *  	else
	 *  	
	 */
	
	public void method2() {
		
		Scanner sc = new Scanner (System.in);
		
		int userNum= 0;
		
		System.out.println("�����Է�");
		
		userNum = sc.nextInt();
		sc.nextLine();
		
		if ( userNum < 0) {System.out.println("����");}
		else if  ( userNum > 0) {System.out.println("���");}
		else {System.out.println("0");}
		
	}
	
	public void checkAge() {
		
		Scanner sc = new Scanner (System.in);
		
		int userAge = 0;
		
		System.out.println("�����Է�");
		
		userAge = sc.nextInt();
		sc.nextLine();
		
		if ( 0 <= userAge && userAge <=5 )  {
			System.out.println("���� �Դϴ� .");}
			else if ( 6 <= userAge && userAge <= 12 ) {
			System.out.println("�Ƶ� �Դϴ�.");}
			else if ( 13 <= userAge && userAge <= 18 ) {
			System.out.println("û�ҳ� �Դϴ�.");}
			else if ( 19 <= userAge && userAge <= 29 ) {
			System.out.println("û�� �Դϴ�.");}
			else if ( 30 <= userAge && userAge <= 49 ) {
			System.out.println("�߳� �Դϴ�.");}
			else if ( 49 <= userAge && userAge <= 120 ) {
			System.out.println("��� �Դϴ�.");}
			else {System.out.println("���̸� �߸� �Է��ϼ̽��ϴ�  ");}
		
		
	}
	
	// �Ϲ������� �ٷ���� ���� ���¿� ������ ����ؼ� �ۼ� ���������� ���� ����Ǽ��� ���Եɼ��ֵ���
	// ���� ���� ��찡 ������ ������ 
		
		
	}
	

