package com.kh.chap03.model.vo;

public class Coffee {
	
	private String name;
	private String bean;
	private String size;
	private int price;
	private boolean caffeine;
	public String setName;
	

	public String getName() {
		return name;
	}
	public String getBean() {
		return bean;
	}
	public String getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}
	public boolean getCaffeine() {
		return caffeine;
	}
	
	//필드값을 세팅해주는 매소드
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCaffenine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	
	
	//info
	public String info () {
		
		String info = name + "\n" + bean + "\n" + size + "\n" + price + "\n" + caffeine ;
		return info;
	}
	
}//class
