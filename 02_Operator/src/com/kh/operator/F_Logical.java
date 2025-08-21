package com.kh.operator;
import java.util.Scanner;

public class F_Logical {
	
	/*
	 * ■ 논리연산자
	 * - 두개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값 => 논리값
	 * and or
	 * 
	 * 
	 * 
	 */
	
	public void logicMethod () {
		
		Scanner sc = new Scanner(System.in);
		
		int numFromUser = 0;
		
		System.out.print("숫자입력하세요 >> ");
		numFromUser = sc.nextInt();
		sc.nextLine();
		
		// 정수값이 0보다 크면서 짝수인지
		
		boolean result = ((numFromUser > 0) && (numFromUser % 2 == 0));
		
		System.out.println( numFromUser +" 는 정수값이 0보다 크면서 짝수입니까? >> " + result );
		
		
	}
	
	public void logicMethod2 () {
		
		Scanner sc = new Scanner(System.in);
		
		int numFromUser = 0;
		
		System.out.print("숫자입력하세요 >> ");
		numFromUser = sc.nextInt();
		sc.nextLine();
		System.out.println(numFromUser);
		
		boolean num = ( 1 <= numFromUser) && (numFromUser <= 100);
		System.out.println(num);

		
		
	}
	
	
	public void logicMethod3 () {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "kh정보교육원";
		char str3 = str.charAt(3);
		System.out.println(str3);
		
		char user;
		System.out.print("알파벳을 입력하시오 한 글자 >> ");
		user = sc.nextLine().charAt(0);
		boolean result = ((user == 'a' ) || (user == 'A'));
		//char 형이 int 형으로 자동형변환이 일어난 뒤 연산을 함
		
		System.out.print("a 또는 A 인가 >> " + result);
		

		
	}

}


