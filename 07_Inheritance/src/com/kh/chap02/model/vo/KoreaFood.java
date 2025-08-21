package com.kh.chap02.model.vo;

//	상속을 해주는 쪽  / 받는 쪽
//	부모클래스 	  /자식클래스
//	슈퍼클래스		  /서브클래스
//	상위클래스 	  /하위클래스 
//	조상클래스 	  /후손클래스
//	확장클래스 	  /파생클래스

public class KoreaFood extends Food{
	
	private int spciy;
	
	public KoreaFood() {
		new Food(); // super : 부모객체 생성 키워드
		
	}
	
	public int getSpicy() {
		return spciy;
	}
	
	public void setSpicy(int spciy) {
		this.spciy = spciy;
	}


}
