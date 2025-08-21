package com.kh.chap02.loop;
import java.util.Scanner;

public class A_For {
	
	public void method0 () {
		
		for(
			int i = 0;
				i<5;
				i++
				) {
			System.out.println("돌려돌려");
		}
	}
		
	public void method1 () {
		
		for( int i = 1; i <= 4; i++	)
			if (i % 2 == 0){
				System.out.println("짝"); }
		
			else {
				System.out.println("홀");}
	}
	
	public void gugudan () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단 출력하시겠습니까 > ");
		
		int userNum1 = sc.nextInt();
		sc.nextLine();
		
		if (0 > userNum1 || 10 < userNum1) {
			System.out.print("1~9 사이 숫자를 입력하세요"); }
			else {		
				for (int i=0; i<10; i++) if (i > 0) {
				System.out.println(userNum1 + " * " + i + " = " + (userNum1*i));}
				}
	
	}
	
	public void square() {
		
		for (int i = 0 ; i < 3; i++) {
			for (int j = 0 ; j < 3; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	public void gugudanProgram() {
		
		Scanner sc = new Scanner(System.in);
		
		int buttonNum = 0;
		System.out.println("구구단 프로그램");
		System.out.println("1. 구구단 프로그램 실행하기");
		System.out.println("2. 구구단 프로그램 설명보기");
		System.out.println("3. 구구단 프로그램 프로그램 종료하기");
		
		buttonNum = sc.nextInt();
		sc.nextLine();
		
		switch (buttonNum) {
		case 1 :  
			System.out.print("프로그램을 시작합니다. 숫자를 입력하세요 > " );
			buttonNum = sc.nextInt();
			sc.nextLine();
			if (buttonNum <= 0 || buttonNum >= 10) {
				System.out.print("잘못된 숫자를 입력하셨습니다." ); return;
			}
			else {
				for (int i = 0; i < 10 ; i++) {
					if( i > 0) {
				System.out.println(buttonNum + "*" + i + "=" + (buttonNum * i) ); }
					}
				} break;
		case 2 : System.out.println("프로그램 설명"); break;
		case 3 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 숫자를 입력하셨습니다.");
			
		}
	}
	
	
}//class
