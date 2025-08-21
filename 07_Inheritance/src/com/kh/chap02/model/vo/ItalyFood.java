package com.kh.chap02.model.vo;

public class ItalyFood extends Food{
	
	private int oil;
	
	public ItalyFood() {
		super();
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		//접근제한자가 private 이라 보이지않음
		//1. 부모클래스의 접근제한자를 바꿔버림 - 캡슐하 원칙 위반
		//2. 부모클래스의 접근제한자 public 인 setter 메소드 호출
		//3. 부모클래스가 가지고있는 매개변수 생성자를 호출 (이방법이 제일 편함)
		
		super(foodName, material,cookingTime);
		this.oil = oil;
	}

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	

}
