package com.kh.chap05.constructor.run;

import com.kh.chap05.costructor.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member = new Member();
		// new�� ��ü�� �����ϰ� Member(); �� ��ü�� �ʱ� ���¸� 
	
		System.out.println(member.info());
		
		Member member2 = new Member("����ȣȣ");
		
		Member member3 = new Member("����", "ȣȣ");

		
		Member member4 = new Member("����","ȣȣ","����");
		System.out.print(member4.info());
	}

}
