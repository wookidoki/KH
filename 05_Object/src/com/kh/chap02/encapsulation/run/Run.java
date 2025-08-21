package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Cafe;

public class Run {
	// TODO Auto-generated method stub
	
	// 캡슐화 (encapsulaton)
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉(information hiding)
	// 3대 특성 캡슐화 상속 다형성

	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		
		//cafe.cleaning();
		//cafe.cleanWidow();
		//cafe.dishWash();
		
		//필드가 보이지않는 오류 
		//private일 경우 직접 접근이 불가 , 간접 접근해야함
		
		// cafe.name ="KH카페";
		//cafe.open();
		
		//메소드 호출부에서는 오로지 값만 넘길수있음
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("KH카페");
		cafe.setAddress("서울");
		
		String cafeName = cafe.getName();		
		
		System.out.println(cafe.getName());
		System.out.println(cafeName);
		
		//메소드 호출부에서는 오로직 데이터값만 보내줘야한다
		
		cafe.getAddress();
		System.out.println(cafe.getAddress());
		
		cafe.getSignatureMenuPrice();
		System.out.println(cafe.getSignatureMenuPrice());
		
		cafe.info();
		System.out.println(cafe.info());
	}



}
