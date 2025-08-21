package com.kh.chap02.model.vo;

public class JapanFood extends Food{
	
	private int fresh;
	
	public JapanFood() {
		
	}
	
	public JapanFood(String foodName, String material, int cookingTime, int fresh) {
		super(foodName,material,cookingTime);
		this.setFresh(fresh);
	}

	public int getFresh() {
		return fresh;
	}

	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	
	public String information() {
		return super.information()+ ",½Å¼±µµ : " + fresh;
	}

}
