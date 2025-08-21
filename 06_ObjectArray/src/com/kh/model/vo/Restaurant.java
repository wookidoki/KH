package com.kh.model.vo;

public class Restaurant {
	
	//상호 주소 메인메뉴
	private String storeName;
	private String address;
	private String mainMenu;
	
	//기본생성자
	public Restaurant() {
		
	}
	
	//모든 필드를 매개변수로 갖는 생성자
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
		
	}
	
	//getter setter
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMainMenu() {
		return mainMenu;
	}

	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	public String information() {
		return  "[ 상호명 :" + storeName + " 주소 " + address + " 메인메뉴 " + mainMenu + "]" ;
	}

}
