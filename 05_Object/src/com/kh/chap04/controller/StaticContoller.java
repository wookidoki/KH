package com.kh.chap04.controller;


// 클래스 변수(static) 와 상수 필드에 대해서
public class StaticContoller {
	
	//필드부
	//[표현법]
	//접근제한자 (예약어) 자료형 식별자;
	//private static String str ;
	
	public static String str = "static field"; // static 특 기울어진 글씨체 
	//private String str1 = "a"; 
	
	//생성 시점 : 프로그램 실행과 동시에 메모리의 static 영역에 할당
	//소멸 시점 : 프로그램 종료!
	//객체를 생성을 하지않고 static 영역에 할당!
	
	//static == "공유" 의 개념이 강함
	//프로그램 실행과 동시에 올려놓고 거기서 값을 공유해서 사용할 목적
	
	/*
	 * 상수 필드 
	 * 
	 * [ 표현법 ]
	 * public static final 자료형 상수필드식별자 = 값;
	 * => 한번 지정한 값을 고정해서 쓰겠다 . 무조건 초기화 동시에
	 * 
	 * static = 공유목적
	 * final = 절대 바꾸지않겠다
	 * 
	 * 값이 변경되면 큰일나는 고정적인 값들은 메모리 (static) 영역에 올려놓고 공유해서 사용할 목적
	 * 
	 * 상수 필드 네이밍도 반드시 대문자로 작성해야함!
	 * 
	 */
	
	public static final String JAVA_VERSION = "21"; // final 특 두꺼워짐
	
	
	/*
	 * /AccessModifier (접근제어자 / 접근제한자)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	

	


}
