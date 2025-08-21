package com.kh.exception.controller;

import java.util.Scanner;

public class UncheckedException {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 예외 처리 방법
	 * 
	 * 문법이 잘못된건 체크를 해줌
	 * 
	 * ● 프로그램 실행 시 발생하는 예외들
	 * RuntimeException
	 * 
	 * - NullPointerException 주소값 객체를 참조했더니 null 값이 들어있을 경우 발생 
	 * 
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근했을 때 발생하는 예외
	 * 
	 * - ClassCastException : 허용할 수 없는 형 변환을 진행할 경우 발생하는 예외
	 * 
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * ............
	 * 
	 * 개발자가 예측가능 
	 * 
	 */
	
	/* try ~ catch 문
	 * 
	 * [ 표현법 ]
	 * 
	 * try {
	 * 	(num1 /num2) // 예외가 발생할수도있는 구문 "여기선 0으로 나누는 경우"
	 *
	 * } catch(발생할예외클래스명 변수명) { => 매개변수 
	 * 
	 *  해당 예외가 발생했을때 실행할 구문
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
		 
		 System.out.println("조아용");
		 
	 } catch(ArithmeticException e) {
		 System.out.println("노노 안돼용");
	 }
	}

}
