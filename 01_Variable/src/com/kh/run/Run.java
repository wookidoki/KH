package com.kh.run; //패키지 해더

// import 
import com.kh.variable.*;


public class Run {
	
	
	public static void main (String[] args) {
		
	
		com.kh.variable.A_Variable variable = new com.kh.variable.A_Variable();
		// 패키지 경로 부터 클래스 이름까지 작성하면 풀클래스 명 - 명확한 클래스를 호출 할수있음
		
		//varibalbe.findSeasonMenu();
		
		//variable.declareVariable();
		
		B_KeyboardInput user = new com.kh.variable.B_KeyboardInput();
				
		//B_KeyboardInput.userImpormation();
		
		Casting ca = new Casting();
		ca.autoCasting();
		ca.forceCasting();

	}

}
