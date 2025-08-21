package com.kh.second;


public class Run {

	public static void main(String[] args) {
		
		// Q 외부 class 에 존재하는 method 호출하는 방법
		
		/*
		 *  호출할 method 가 존재하는 class 를 생성(new) 해줘야함
		 *  
		 *  [표현법]
		 *  "class name" "class 를 대신할 별칭" =
		 */
		
		PrintController pc = new PrintController();
		
		pc.printCry();
		pc.printSmile();

	
	}
}

