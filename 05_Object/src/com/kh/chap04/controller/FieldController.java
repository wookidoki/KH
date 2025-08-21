package com.kh.chap04.controller;

/*
 * 필드(field) == 맴버변수 == 인스턴스변수
 * 클래스를 구성하는 요소중 하나 (필드 생성자 메소드)
 * 데이터 저장을 위한 역활 (변수)
 * 클래스 내부에 정의 하지만 메소드 영역 밖에 존재
 * 
 * ** 변수구분
 * 필드 : class scope 
 * (local) variable : class 안에 있어도  특정 영역안에 선언된 = method if for 등등..
 * 
 * 1. 전역변수의 역할을 하는 친구들
 * 	- 필드 ( 맴버변수 , 인스턴스변수 ) : 생성지점 new 키워드 사용해서 해당 객체를 생성하는 순간 heap 에 할당
 * 								  소멸시점 객체가 소멸될때
 * 									G.C 가 일을 안하면 OOM 아웃오브메모리 발생
 * 
 * 
 * - 클래스 변수(static) : static 이라는 예약어가 붙어있는 동시
 * 							프로그램 시작과 동시에 static 영역에 올라가서 종료시 소멸
 * 
 * 2. 지역 변수
 * 		생성 시점 : 특정 스코프 내부에서 선언되는 시점 스택 메모리에 할당  특정 스코프가 끝나면 소멸 
 * 
 * 
 * 
 */

public class FieldController {
	
	public int global;
	
	public void checkVariable(int parameter) {
		
	}

}
