package com.kh.first; //패키지 선언부 package header : 현재 클래스의 위치

/*	
 *	주석(Comments)
 *	작성한 코드를 이해하기 쉽도록 함
 *	유지보수 시간 단축 	
 *	1. 한줄 주석 (//)
 * 	2. 다행 주석 (/*~) 
 */

/*
 * 	패키지(package)
 * 
 *	하나의 패키지 안에 여러 개의 클래스들이 존재할 수 있음
 *	단, 하나의 패키지 안에 동일한 이름의 클래스는 존재X
 *	클래스를 용도에 맞게 구분해서 패키지에 보관을 권장
 *
 *	적어도 세 단계 이상의 패키지를 만드는 걸 권장함
 *	ex) com.kh.first
 *	com.(회사이름).(하위카테고리)
 */

/**
 * 
 */	

//보라글씨는 키워드 또는 예약어 라고 함
	
public class MyFirstClass {

	//scope {  } 은 중괄호로 묶은 부분, 복합문을 구성하는 요소
	
	// main method : 프로그램의 시작점.프로그램당 1개는 가지고있어야함
	// method - 하나의 기능단위 () 로 끝남
	// 공백문자 - 빈칸 / 탭문자 / 빈 줄  소스코드를 보기 좋게함 
	
	public static void main(String[] args) {
		
	printMyName();	
		
	System.out.println("Hello Java World!");
		
	/*
	 * static 고정적으로 쓰이는것
	 * dynamic 동적으로 바뀔수있는 것 
	 * auto 자동으로
	 */
		
	System.out.println("수업이 재미가 있어요 \n하지만 조금 졸려요");
	
	/* System 부분 - 연산자 부분 , 
	 * out 부분 - 코드 창을 벗어나 여기서는 콘솔창을 의미함
	 */
	
	return;
			
	}
	
	public static void printMyName() {
		System.out.println("안녕하세요. 제 이름은 이승욱 입니다. 반갑습니다~~ ");
		
	}
	


	
	
}
