package com.kh.chap02.model.vo;

//	����� ���ִ� ��  / �޴� ��
//	�θ�Ŭ���� 	  /�ڽ�Ŭ����
//	����Ŭ����		  /����Ŭ����
//	����Ŭ���� 	  /����Ŭ���� 
//	����Ŭ���� 	  /�ļ�Ŭ����
//	Ȯ��Ŭ���� 	  /�Ļ�Ŭ����

public class KoreaFood extends Food{
	
	private int spciy;
	
	public KoreaFood() {
		new Food(); // super : �θ�ü ���� Ű����
		
	}
	
	public int getSpicy() {
		return spciy;
	}
	
	public void setSpicy(int spciy) {
		this.spciy = spciy;
	}


}
