package com.kh.chap04.model.vo;

public class Hong implements Jjimdak{
	
	//인터페이스를 사용하는걸 인터페이스 구현이라고 함 
	//Implementation
	@Override
	public void order() {
		System.out.println("홍찜닭 주문완료");
	}

}
