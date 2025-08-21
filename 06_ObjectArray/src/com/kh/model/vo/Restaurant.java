package com.kh.model.vo;

public class Restaurant {
	
	//��ȣ �ּ� ���θ޴�
	private String storeName;
	private String address;
	private String mainMenu;
	
	//�⺻������
	public Restaurant() {
		
	}
	
	//��� �ʵ带 �Ű������� ���� ������
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
		return  "[ ��ȣ�� :" + storeName + " �ּ� " + address + " ���θ޴� " + mainMenu + "]" ;
	}

}
