package com.kh.chap06.controller;

public class MethodConroller {
	
	/*
	 * 메소드(method) == 맴버함수 : 입력값을 가지고 특정동작을 수행한뒤 결과물을 내놓는다
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록 
	 * 1.재사용성
	 * 2.모듈화
	 * 
	 * 객체지향 프로그래밍에서의 메소드 : 객체가 수행할 수 이쓴ㄴ 행동을 정의한 코드블록 
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의자료형 매개변수식별자){
	 * 	
	 * 	
	 * 				수행할 코드;
	 * 				return 반환값;
	 * }
	 * 
	 * 
	 */
	
	//1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
	}
	
	//2. 매개변수가 존재하지 않지만 반환값은 전환하는 메소드
	public String method2() {
		return "asdasd";
	}

	public String method3() {
		return "asdasd";
	}
	
	public static void staticMethod() {
		
		
	}

}
