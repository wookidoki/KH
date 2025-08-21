package com.kh.chap03.model.vo;

/*
 * import java.lang.*;
 * 이게 생략되어있는거임
 * 
 */

public class LastTime extends Object {
	
	// 모든 클래스의 최상위 부모클래스 => Object => 생략가능 
	
	private String name;
	
	public LastTime() {
		//super()  이것도 생략되어있는 거임
	}
	
	public LastTime(String name) {
		//super() 
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//return;
	}



/*
 *  Overriding
 *  
 *  - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의 (다시씀) 하는 것
 *  - 부모클래스가 제공하고 있는 메소드를 자식이 고쳐서 사용하겠다는 의미
 *  - 자식클래스에 존재하는 오버라이딩 된 메소드가 우선권을 가져서 호출되게 됨
 *  
 *  오버라이딩 성립조건
 *  1. 부모 메소드와 메소드 명이 정확하게 동일
 *  2. 매개변수의 자료형, 개수, 순서가 동일 (변수명과는 무관함)
 *  3. 반환형이 동일
 *  
 *   *** 오버라이딩 한 메소드에는 반드시 @Override 애노테이션을 붙여주자
 *   @Override 
 *   annotation
 */
	
	@Override
	public String toString() {
		return "응애";
	}
	
}
