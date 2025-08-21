package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI, MultipleInterface {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing Jazz Music");
	}

}
