package com.kh.chap01.model.vo;

public class ItalyFood {
	
	private String foodName;
	private String material;
	private int cookingTime;
	private int oil;
	
	public ItalyFood() {
		
	}
	
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
		this.oil = oil;
	}

	
	//getter()
	public String getFoodNmae() {
		return foodName;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	public int getOil() {
		return oil;
	}
	
	
	
	
	//setter()
	public void setfoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public void setOil(int oil) {
		this.oil = oil;
	}
	
	public String inforamtion() {
		return "[ 음식이름 : " + foodName + "재료 : " +material + "요리시간 : " + cookingTime +
				"오일 양 : " + oil + "]";
		}

}
