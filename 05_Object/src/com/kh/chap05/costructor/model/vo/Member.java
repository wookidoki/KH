package com.kh.chap05.costructor.model.vo;

public class Member {
	
	// [ 필드부 ]
	private String userId;
	private String userPwd;
	private String nickName;
	
	
	// [ 생성자부 ]
	/* 
	 * *생성자 (Constructor) : 객체를 생성하는데 사용하는 특수한 유형의 메소드
	 * 
	 * [ 표현법 ]
	 * 접근제한자 클래스식별자(매개변수(생략가능)) {
	 * 			해당생성자를 통해서 객체 생성시 실행하고자하는 코드;
	 * }
	 * 
	 * 생성자의 역활
	 * -- 기술적 관점 : 객체가 생성될 때 어떤 상태로 시작을 해야하는가
	 * -- 개념적 관점 : 객체가 처음부터 유효한 상태를 가지도록 강제하기위해 
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 >> 기본생성자
	 * 2. 매개변수가 존재하는 생성자 
	 */
	
	
	
	public Member() {
		// 기본생성자 - 매개변수가 없는 생성자 
		// 기본생성자는 객체를 생성할 목적으로 호출해서 사용 
		// 기본생성자는 생략해도 에러가 발생하지않는다 
		// 클래스 내부에 생성자를 하나도 작성하지 않으면 기본생성자를 자동으로 만들어줌 
		// 앞으로는 기본생성자를 항상 작성하자 ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	}

	public Member(String userId) {
		System.out.println("매개변수가 1개인 생성자");
		
	}
	public Member(String userId , String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
		
	}
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	/*
	 * 1. 반드시 생성자의 이름을 클래스랑 동일하게 작성(대소문자 주의)
	 * 2. 반환형이 존재해서는 안된다 (메소드로 판단)
	 * 3. 매개변수 생성자를 명시적으로 작성하면 기본생성자를 만들어주지 않는다
	 * ==>> 꼭 기본생성자를 만들어주는 습관
	 * 4. 생성자는 동일한 이름으로 여러 개 생성이 가능하지만 매개변수가 중복되어선 안됨.
	 * 
	 */
	
	

	
	
	
	
	// [메소드부]
	public void setuserId(String userId) {
		this.userId = userId;
	}
	
	public void setPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setnickName(String nickName) {
		
	}
	
	public String getuserId() {
		return userId;
	}
	
	public String getuserPwd() {
		return userPwd;
	}
	
	public String getncikName() {
		return userPwd;
	}

	public String info() {
		return "ID : " + userId
				+"\nPassword : " +userPwd 
				+"\n환영합니다 " + nickName + "님";
		
	}
	
	
}
