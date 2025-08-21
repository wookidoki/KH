package com.kh.chap05.model.vo;

public class HipHop extends Music implements MusicI, MultipleInterface{
	
	private int a;
	
	public HipHop() {}
	
	
	@Override
	 public void playMusic() {
		System.out.println("Playing HipHop Music");
	}
	

}
