package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 *  ■ 삼항 연산자 - 피 연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐 ( 조건문 의 형식 )
	 * 
	 *  조건문 : 값에 따라 연산을 처리하는 방식
	 *  	- 결과값이 true 일 경우 첫번째 문장을 처리
	 *  	- 결과값이 false 일 경우 두번째 문장을 처리
	 *  	- 
	 *  
	 *  [ 표현식 ]
	 *  
	 *  조건식이 true 일 경우 결과 값 : 조건식이 false 일 경우 결과값
	 * 
	 */
	
	public void method1() {
		
		String menu1 = "멜론 프라푸치노";
		String menu2 = "자몽 망고 프라푸치노";
		String menu3 = "브륄레 프라푸치노";
		
		System.out.println("메뉴판");
		System.out.println("1. " + menu1);
		System.out.println("2. " + menu2);
		System.out.println("3. " + menu3);		
		
		//메뉴 번호가지고 주문 받기
		
		Scanner sc = new Scanner (System.in);
		//Ctrl + Shif + o => 빨간줄 나오면 해라
		
		System.out.println(" 메뉴 번호 입력 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		String selectedMenu = (menuNo == 1) ? menu1
				: (menuNo == 2) ? menu2
				: (menuNo == 3) ? menu3
				: "없는 메뉴를 주문하셨습니다." ;
		
		//조건식 
		// ? true 일 경우 결과값
		// : false 일 경우 결과 값
		
		System.out.println(selectedMenu);
		
		
	}
	
	//홀짝 구하기 
	public void method2 () {
		//사용자에게 정수 값을 하나 입력 받아서 입력받은 정수가 홀짝 / 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		int userNum = 0;
		System.out.println("숫자를 입력해보세요");
		userNum = sc.nextInt();
		sc.nextLine();
		
		String odd = "홀수";
		String  even = "짝수";
		
		String result  = ((userNum > 0) && (userNum % 2 == 0)) ? even  
						:((userNum > 0) && (userNum % 2 == 1)) ? odd
						:(userNum == 0) ? "0 입니다"
						: "0보다 큰 정수만 입력해주세요" ;
		
		System.out.println(result);
						
								
		
	}

}
