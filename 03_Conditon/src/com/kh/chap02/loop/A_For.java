package com.kh.chap02.loop;
import java.util.Scanner;

public class A_For {
	
	public void method0 () {
		
		for(
			int i = 0;
				i<5;
				i++
				) {
			System.out.println("��������");
		}
	}
		
	public void method1 () {
		
		for( int i = 1; i <= 4; i++	)
			if (i % 2 == 0){
				System.out.println("¦"); }
		
			else {
				System.out.println("Ȧ");}
	}
	
	public void gugudan () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� ����Ͻðڽ��ϱ� > ");
		
		int userNum1 = sc.nextInt();
		sc.nextLine();
		
		if (0 > userNum1 || 10 < userNum1) {
			System.out.print("1~9 ���� ���ڸ� �Է��ϼ���"); }
			else {		
				for (int i=0; i<10; i++) if (i > 0) {
				System.out.println(userNum1 + " * " + i + " = " + (userNum1*i));}
				}
	
	}
	
	public void square() {
		
		for (int i = 0 ; i < 3; i++) {
			for (int j = 0 ; j < 3; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}
	
	public void gugudanProgram() {
		
		Scanner sc = new Scanner(System.in);
		
		int buttonNum = 0;
		System.out.println("������ ���α׷�");
		System.out.println("1. ������ ���α׷� �����ϱ�");
		System.out.println("2. ������ ���α׷� ������");
		System.out.println("3. ������ ���α׷� ���α׷� �����ϱ�");
		
		buttonNum = sc.nextInt();
		sc.nextLine();
		
		switch (buttonNum) {
		case 1 :  
			System.out.print("���α׷��� �����մϴ�. ���ڸ� �Է��ϼ��� > " );
			buttonNum = sc.nextInt();
			sc.nextLine();
			if (buttonNum <= 0 || buttonNum >= 10) {
				System.out.print("�߸��� ���ڸ� �Է��ϼ̽��ϴ�." ); return;
			}
			else {
				for (int i = 0; i < 10 ; i++) {
					if( i > 0) {
				System.out.println(buttonNum + "*" + i + "=" + (buttonNum * i) ); }
					}
				} break;
		case 2 : System.out.println("���α׷� ����"); break;
		case 3 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
			
		}
	}
	
	
}//class
