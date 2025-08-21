package com.kh.variable;
import java.util.Scanner;

public class B_KeyboardInput {
	
	/*
	 * 키보드를 이용해서 사용자로 부터 입력 받기
	 * Scanner 라는 클래스 사용
	 * Scanner 클래스에 존재하고 있는 메소드를 호출해서 사용
	 * 
	 */
	
	
	public static void userImpormation() {
		
		String orderMenuName = (null);
		String userDeliveryAddress= (null);
		int orderMenuAmount = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		String menuA = "한교동 갈릭 쉬림프 프레첼" ;
		
		
		//사용자에게 음료를 입력받아서 출력해보기
		
		System.out.println("=== 메뉴판 ===");
		System.out.print("***WELCOME***");
		System.out.printf("\n● " + menuA);
		System.out.printf("\n● 키티 딸기 라떼");
		System.out.printf("\n● 케로피 멜론 빙수");
		System.out.printf("\n● 포차코 소다 에이드");
		System.out.println("\n=== 메뉴판 ===");
		
		System.out.print("주문하실 메뉴를 입력해주세요. > ");
		orderMenuName = sc.nextLine();
		System.out.println("주문하신 메뉴는 "+ orderMenuName + " 입니다");
		System.out.print("주문 갯수를 입력해주세요. (숫자만 입력해주세요) > ");
		orderMenuAmount = sc.nextInt();
		sc.nextLine();
		System.out.println("주문하신 수량은 "+ orderMenuAmount + "잔 입니다");
		System.out.print("주소지를 입력해주세요 > ");
		userDeliveryAddress = sc.nextLine();
		
		System.out.println("주소지는" + userDeliveryAddress + " 입니다" );
		
		/*
		 * next() - 사용자가 입력한 값에 공백이 있을 경우 공백 문자 이전까지만 입력받음.
		 * 
		 * nextInt() - 사용자로 부터 정수형으로 받고싶을 때
		 * nextDouble() - 사용자로 부터 실수형으로 받고싶을 때
		 * 		 
		 * nextLine() - 입력 버퍼에서 개행문자 이전까지 다 읽어옴
		 * ** nextInt() 사용후 정수만 가져와 개행문자 (엔터, \n) 남아있기 때문에 꼭 sc. nexLine() 을 사용해야함
		 */
		
		
	}
	
}
