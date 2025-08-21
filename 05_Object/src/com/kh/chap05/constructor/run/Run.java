package com.kh.chap05.constructor.run;

import com.kh.chap05.costructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member();
		// new가 객체를 생성하고 Member(); 가 객체의 초기 상태를 
	
		System.out.println(member.info());
		
		Member member2 = new Member("하하호호");
		
		Member member3 = new Member("하하", "호호");

		
		Member member4 = new Member("하하","호호","히히");
		System.out.print(member4.info());
	}

}
