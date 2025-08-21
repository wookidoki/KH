package com.kh.chap03.model.vo;

/*
 * 클래스 내부에 요소로 추상메소드를 하나라도 선언하는 순간
 * 클래스 또한 abstract 키워드를 붙여서 추상 클래스로 정의해야함
 * 
 * 추상클래스 == 필드 + 메소드 + 추상메소드(메소드생략가능)
 * ** 추상메소드가 존재하지않았도 추상클래스 정의가능 
 * 
 * 추상클래스를 정의하는 이유
 * 1. 기술적으로 기술자가 판단시 해당 클래스가 부모클래스 역활로만 사용할 것 같음
 * 		객체생성은 불가능해야한다. 라고 판단시
 * 2. 개념적으로 기술자가 판단시 해당 클래스가 구체적으로 구현된 상태가 아닌것 같다 하는
 * 		생각이 들면 추상클래스로 선언 
 * 
 * 객체 생성은 불가능하게 하고 타입만 다형성을 적용하게 하고싶다.
 * 
 */

	// 추상클래스로 선언되었기때문에 객체생성 불가

public abstract class Sports {
	
	private int peopleCount;
	
	public Sports() {}
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount; 
	}
	
	public int getPeopleCount() {
		return peopleCount;
	}
	
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	/*자식들이 오버라이딩 할 메소드
	public void rule() {
		System.out.println("Rules");
	}*/
	
	//추상화 abstract
	
	/*
	 * [ 추상화 메소드 표현법 ]
	 * 
	 * 접근제한자 abstract 반환형 식별자();
	 * 
	 */
	
	public abstract void rule();   

}
