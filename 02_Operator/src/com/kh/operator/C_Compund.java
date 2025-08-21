package com.kh.operator;
import java.util.Scanner;

public class C_Compund {
	
	/*
	 * ■ 복합대입연산자
	 * 
	 * ( 대입연산자 = , 변수에 값을 대입할때 )
	 * 
	 * 복합대입 연산자는 산술연산자와 대입연산자가 결합된 것
	 * => 자기 자신의 값과 해당 산술연산을 한 후 그 결과를 자기 자신에게 다시 대입하는 용도
	 * 
	 * 
	 * + - / * %  
	 
	 * 
	 */
	
	
	
	
	public void compund () {
		
		int endDays =  200 ;
		endDays -= 1;
		System.out.println(endDays);
		
		int mutilple = 5;
		mutilple *= 3;
		System.out.println(mutilple);
		

		
		
		
	}
	

	public void method1 () {
		
		System.out.println("a");
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("정수값 입력 하시오 >> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println(num);
		
		// number = number - 10  =>>>> number -= 10;  같음
		
		num -= 10;
		System.out.println(num);
		
		
	}
	
	
	

}
