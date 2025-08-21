package com.kh.chap01.run;

import com.kh.chap01.controller.Controller;

public class Run {
	
	public static void main(String[] args) {
		
		//정수값을 여러개 다루고싶다. 정확하게 몇개의 정수를 다룰지는 알수없음
		//1
		Controller c = new Controller();
		
		c.add(5);
		c.add(50);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
	
		
		
		System.out.println(c.toString());
		System.out.println(c.get(3));
		
		//배열을 만들때 새로운 배열을 만들게되면 기존에 들어있던 값들이 사라짐 => 복사 사용
		
		

		
	}

}
