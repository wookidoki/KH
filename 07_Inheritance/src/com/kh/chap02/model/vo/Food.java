package com.kh.chap02.model.vo;

/*
 *  ���(Inheritance)
 *  
 *  ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ ����� ��� == ���
 *  
 *  �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ� ���� �ϳ��� Ŭ������ ���� �ص� ��
 *  �ش� Ŭ������ �ɹ��� ������ ����ϴ� ����
 * 
 */

public class Food {

	// ���������� ������ �ִ� �ʵ�
	// �ʵ�� : foodName, material, cookingTime
	
	protected String foodName;
	protected String material;
	protected int cookingTime;
	
	//�����ں�
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
		return "���� �̸� : " + foodName + ",�� ��� : " + material + ",�����ð� : " + cookingTime;
	}
	

}
