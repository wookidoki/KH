package com.kh.chap02.model.vo;

/*
 *  상속(Inheritance)
 *  
 *  기존의 클래스를 이용해서 새로운 클래스를 만드는 기술 == 상송
 *  
 *  매 클래스마다 중복된 필드, 메소드 들을 하나의 클래스로 정의 해둔 후
 *  해당 클래스의 맴버를 가져다 사용하는 개념
 * 
 */

public class Food {

	// 공통적으로 가지고 있던 필드
	// 필드부 : foodName, material, cookingTime
	
	protected String foodName;
	protected String material;
	protected int cookingTime;
	
	//생성자부
	public Food() {
		
	}
	
	public Food(String foodName, String material, int cookingTime) {
		this.setFoodName(foodName);
		this.setMaterial(material);
		this.setCookingTime(cookingTime);
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public String information() {
		return "음식 이름 : " + foodName + ",주 재료 : " + material + ",조리시간 : " + cookingTime;
	}
	

}
