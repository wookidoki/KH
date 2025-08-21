package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker {
	
	private boolean gout;
	
	public BeerDrinker() {
		
	}

	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	
	public boolean getGout() {
		return gout;
	}
	
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	
	@Override
	public void drink() {
		System.out.println("���ָ� ���� ���ʴϴ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("��ĭ�� ���� �Խ��ϴ�.");
	}
	
}
