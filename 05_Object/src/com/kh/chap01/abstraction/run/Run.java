package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	private static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 객체 지향 프로그래밍 : 현실세계에서의 독립적인 존재(개체)를 속성과 행위를 가진 객체로 만들어서
		 * 					객체간의 상호작용을 통해 프로그래밍 하는 기법 
		 * 
		 * 구현하고자 하는 프로그램에 객체를 만들기 위해(생성하기 위해) =>> 클래스를 먼저 생성
		 * 
		 * 클래스란? = 각 객체들의 정보 (속성, 행위) 들을 담아내는 그릇 또는 틀 설계도 또는 명세
		 * 클래스 : VO (Value Object) 
		 * 
		 * 숙제 : 각 VO 클래수 의 최소 필드 수 5개
		 * 최소 한개 이상의 필드 값을 변경할수있는 메소드 생성 puppy 의 bark() 처럼
		 * 
		 * 제출할 곳 : 우리반 게시판 게시글 작성
		 * 과제 탭을 선택 할 수 있음 
		 * 
		 * 
		 */
		
		
		//개발자가 만드는 사용자 정의 과정을 클래스 라고함
		
		
		// 객체 생성해보기
		// 강아지 객체 생성 
		Puppy dog =  // 변수 선언 
		new Puppy(); // 강아지 객체 생성 
		// new 라는 예약어를 사용 
		//Memory 의 heap 영역에 데이터를 생성
		
		dog.species = "포메라니안";
		dog.name = "똘똘이";
		dog.age = 4;
		dog.gender = "W";
		dog.color ="brown";
		dog.weight = 2;
				
		
		System.out.println(dog);
		System.out.println(dog.name + "는 " 
						  + dog.species + "입니다. "
						  + dog.color + "색상입니다.");
		
		
		Puppy soldier = new Puppy();
		soldier.species = "그레이트 피레니즈";
		soldier.name = "상근이";
		soldier.age = 10;
		soldier.gender = "M";
		soldier.color ="White";
		soldier.weight = 60;
		
		System.out.println(soldier.name + "는 " 
				  + soldier.species + "입니다. "
				  + soldier.color + "색상입니다.");
		
		//객체의 관점 
		
		dog.sniff();
		soldier.sniff();
		
		dog.bark();
		

	}



}
