package com.kh.chap02.model.vo;

public class SojuDrinker extends Drinker {
	
	private int limit;
	
	public SojuDrinker() {
		
	}

	public SojuDrinker(int limit) {
		this.limit = limit;
	}
	
	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Override
	public void drink() {
		System.out.println("���ָ� ���� ���ʴϴ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("��â�� ���� �Խ��ϴ�.");
	}
	
	
}
