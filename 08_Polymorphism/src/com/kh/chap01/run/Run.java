package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
	/*
	 *  상속구조
	 *  
	 *  필드 / 메소드 => 별로 안중요하다
	 *  
	 *  but 상속구조는 부모클래스가 자식클래스에게 타입 (자료형) 을 물려준다!!
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent();
		p1.printParent();
		//p1.parintChild1(); 자식이 가지고이는 멤버는 부모가 사용할수 없음
		//p1 변수 로는 Parent 에만 접근가능
		
		//2. 자식 타임 자료형으로 자식 타입 객체를 다룸
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); //자식객체는 부모객체도 가르키고있음 부모 메소드 호출가능
		
		//3. 부모 타입 자료형으로 자식 타입 객체를 다룸 => 자료형이 틀림
		Parent p2 = /*(Parent) - 생략*/new Child1();
		p2.printParent();
		//p2.printChild1(); 
		
		/* 클래스형 변환
		 * 1. Up Casting
		 * 업캐스팅 => 자식타입이 부모타입으로 (생략이가능함)
		 * 
		 * 2.Down Casting
		 * 부모타입이 자식타입으로(생략 불가)
		 */
		
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[0] = new Child2();
		
		arr1[0].printChild1();
		
		System.out.println("\n\n\n\n다형성을 적용해보자");
		
		Parent[] arr = new Parent[4];
		arr[0] = (Parent) new Child1();
		arr[1] = (Parent) new Child2();
		arr[2] =  new Child1();
		arr[3] =  new Child2();
			
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
		System.out.println("\n\n\n\n");
		
		for(int i =0; i < arr.length; i++) {
			if(i == 0 || i == 2) { ((Child1)arr[i]).printChild1(); }
			if(i == 1 || i == 4) { ((Child2)arr[i]).printChild2(); }
		}
		
		System.out.println("\n\n\n\n");
		
		for(int i =0; i < arr.length; i++) {
		if(arr[i] instanceof Child1) {
			((Child1)arr[i]).printChild1();
			} else { ((Child2)arr[i]).printChild2();}
	
		}
		
		System.out.println("\n\n\n\n");
		
		/*
		 * 동적 정적 바인딩
		 * 오버라이딩 오버로딩
		 * 
		 * 동적바인딩 : 프로그램 "실행 전" 컴파일 시점에 정적바인딩 수행(자료형의 메소드를 가리킴)
		 * 			실질적으로 참조하고있는 객체가 해당 메소드를 오버라이딩 했다면
		 * 			프로그램 "실행 시점" 동적으로 자식클래스의 오버라이딩된 메소드를 실행
		 * 					Runtime
		 * 
		 * 다형성 : 부모클래스 자료형으로 여러 자식클래스를 다루는 기술
		 * 
		 */
		
		

	}
}
