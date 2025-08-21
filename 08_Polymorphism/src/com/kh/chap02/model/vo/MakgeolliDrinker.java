package com.kh.chap02.model.vo;

public class MakgeolliDrinker extends Drinker {
	
	private int age;
	
	public MakgeolliDrinker() {
		
	}

	public MakgeolliDrinker(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("���ɸ��� ���� ���ʴϴ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("���� ���� �Խ��ϴ�.");
	}
	

}
