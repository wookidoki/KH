package com.kh.homework.project02.run;

import com.kh.homework.project02.vo.Plan;

public class Run {

	public static void main(String[] args) {
		
		Plan p = new Plan("�̽¿�", "���л�",27,"�ڹٰ���",130);
		System.out.println(p.info());
		p.start();
		
		// TODO Auto-generated method stub

	}

}
