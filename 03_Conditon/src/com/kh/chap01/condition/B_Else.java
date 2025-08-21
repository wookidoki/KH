package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * 
	 *  if ~ else
	 *  
	 *  [ 표현법 ]
	 *  
	 *  if 조건식 { 조건식의 결과가 true  실행할 코드 }
	 *  	else { 조건식의 결가가 false 실행할 코드 }
	 *  
	 * 
	 */
	
	public void method1 () {
		
		//사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력 
		
		Scanner sc = new Scanner (System.in);
		
		int userNum = 0 ;
		
		System.out.print("정수를 입력하시오 > ");
		userNum = sc.nextInt();
		sc.hasNextLine();
		
		if (userNum > 0) {
			System.out.print("양수"); }
			else
			{ System.out.print("음수"); }
	
		
		
		
	}
	
	/*
	 *  if ~ else if 문
	 *  
	 *  [ 표현법 ]
	 *  
	 *  if ( 조건식 1) {} 
	 *  	else if ( 조건식 2) { 조건식 2가 true 일 경우 }
	 *  	else if ( 조건식 3) { 조건식 3가 true 일 경우 }
	 *  	...
	 *  	...
	 *  	else
	 *  	
	 */
	
	public void method2() {
		
		Scanner sc = new Scanner (System.in);
		
		int userNum= 0;
		
		System.out.println("정수입력");
		
		userNum = sc.nextInt();
		sc.nextLine();
		
		if ( userNum < 0) {System.out.println("음수");}
		else if  ( userNum > 0) {System.out.println("양수");}
		else {System.out.println("0");}
		
	}
	
	public void checkAge() {
		
		Scanner sc = new Scanner (System.in);
		
		int userAge = 0;
		
		System.out.println("나이입력");
		
		userAge = sc.nextInt();
		sc.nextLine();
		
		if ( 0 <= userAge && userAge <=5 )  {
			System.out.println("유아 입니다 .");}
			else if ( 6 <= userAge && userAge <= 12 ) {
			System.out.println("아동 입니다.");}
			else if ( 13 <= userAge && userAge <= 18 ) {
			System.out.println("청소년 입니다.");}
			else if ( 19 <= userAge && userAge <= 29 ) {
			System.out.println("청년 입니다.");}
			else if ( 30 <= userAge && userAge <= 49 ) {
			System.out.println("중년 입니다.");}
			else if ( 49 <= userAge && userAge <= 120 ) {
			System.out.println("노년 입니다.");}
			else {System.out.println("나이를 잘못 입력하셨습니다  ");}
		
		
	}
	
	// 일반적으로 다룰려는 값의 형태와 범위를 고려해서 작성 위에서부터 많은 경우의수가 포함될수있도록
	// 가장 적은 경우가 밑으로 가도록 
		
		
	}
	

