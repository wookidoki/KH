package com.kh.run; //��Ű�� �ش�

// import 
import com.kh.variable.*;


public class Run {
	
	
	public static void main (String[] args) {
		
	
		com.kh.variable.A_Variable variable = new com.kh.variable.A_Variable();
		// ��Ű�� ��� ���� Ŭ���� �̸����� �ۼ��ϸ� ǮŬ���� �� - ��Ȯ�� Ŭ������ ȣ�� �Ҽ�����
		
		//varibalbe.findSeasonMenu();
		
		//variable.declareVariable();
		
		B_KeyboardInput user = new com.kh.variable.B_KeyboardInput();
				
		//B_KeyboardInput.userImpormation();
		
		Casting ca = new Casting();
		ca.autoCasting();
		ca.forceCasting();

	}

}
