package com.kh.chap02.encapsulation.model.vo;


//VO(Value Object) Cafe 의 속성을 입력하는 용도 (값을 담는 용도)
//필드부 , 생성자부, 메소드부
public class Cafe {
	
	/*
	 * 필드(Field)부
	 * 
	 * 객체가 가질수있는 속성
	 * 정보(data) 를 담는 부분 
	 * 
	 * 필드 == 맴버변수
	 * 
	 * 접근제한자 자료형 필드 식별자;
	 * 
	 */
	
	private String name;
	private String address;
	private String signatureMenu;
	private int signatureMenuPrice;
	
	// 생성자(Constructor)부
	
	
	// 메소드 (Method)부 // 여기서는 일단 그냥 진행 원래는 VO 에 값과 관련된 기능들이 들어가야함
	// 접근제한자 (예약어) 반환형 메소드식별자 (){}
	
	//접근제한자 : 호출할 수 있는 범위를 제한할 수 있음
	//반환형 : void => return 할 때 돌려줄값이 없다.
	
	public void open() {
		dishWash();
		cleaning();
		cleanWindow();
	}
		
	private void dishWash() {
		System.out.println("깨끗하게 빡빡!!");
		
	}

	private void cleaning() {
		System.out.println("청소도 빡빡!!");
		
	}
	
	private void cleanWindow() {
		System.out.println("유리도 빡빡!!");
		
	}
	
	
	//setter를 구현
	//고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	//signatureMenuPrice 의 setter 무조건 set필드식별자 


	public void setSignatureMenuPrice(int signatureMenuPrice) {
		this.signatureMenuPrice = signatureMenuPrice;
		
		//Scope 안에서는 해당 영역안에 있는 지역변수에 대한 우선권이있음 그래서 주소겂으로 구분해야함.
	}
	
	
	// getter() 는 접근제한자 public 을 사용한다
	// get필드명으로 짓되 , 낙타봉표기법() 을 사용한다
	// 모든 필드에 대해서 반드시 무조건 다 만들어야한다
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
		
	}
	
	public String getAddress() {
		return address;
		
	}
	
	//getter() setter() 만들었음 ==> 캡슐화가 끝남
	/*
	 * 값을 숨긴다 => 필드의 접근제한자를 public 대신 private 으로 선언
	 * 메소드를 통해 필드에 접근할수있도록 getter setter
	 * 데이터 를 숨김 -> 객체간 결합도를 낮춤 -> 책임을 분리
	 * 
	 */
	
	public String info() {
		
		String info = "name 필드값 : " + name + "\naddress 필드값 : " + 
		"\nsignatureMenuPrice 필드값 : " + signatureMenuPrice;
		
		return info;
	}

	
	
}
