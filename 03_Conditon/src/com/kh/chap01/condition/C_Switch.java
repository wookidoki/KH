package com.kh.chap01.condition;
import java.util.Scanner;

public class C_Switch {
	
	public void method0 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇층 가시나요? B3~B1 >") ;
		
		String userFloor = sc.nextLine();
		
		switch (userFloor) {
			case "B1" : System.out.println("지하 1층입니다"); break;
			case "B2" : System.out.println("지하 2층입니다"); break;
			case "B3" : System.out.println("지하 3층입니다"); break;	
		}
		
		System.out.println("안녕히 가세요");
	}
	
	/*
	 * 
	 *  switch 문
	 *  
	 *  [ 표현식 ]
	 *  
	 *  switch (case 문에 기술할 동긍비교 대상 ){
	 *  	case ~ 값 : ~ 코드 ; break ;
	 *  	case ~ : ~ ; break ;
	 *  }
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner (System.in);
		
		String menu;
		int price = 0;
		
		System.out.print("메뉴를 선택해주세요 > 한식 중식  일식");
		menu = sc.nextLine();
		
		
		
		
		switch (menu) {
		case "한식" : price = 8000; break;
		case "중식" : price = 9000; break;
		case "일식" :price = 12000; break;	
		default : System.out.print("그런 메뉴는 없어용");
		return; //현재 실행되고있는 메소드 영역을 빠져나감 -> 호출한 영역으로 돌아감 
		} //break 가 빠져나가는 부분
		
		
		if (price > 0) {
			 System.out.print(price); }
		
	}
	
	public void login () {
		
		Scanner sc = new Scanner (System.in);
		
		// 회원가입은 이미 했다고 가정
		String userId = "user01";
		String userPassword = "pass01!";
		String userName = "이승욱";
		
		System.out.println("로그인 하기");
		System.out.println("아이디");
		System.out.println("비밀번호");
		
		String inputId = sc.nextLine();
		String inputPassword = sc.nextLine();
		
		int log = 0;
		
		if ( inputId.equals(userId) && inputPassword.equals(inputPassword)) {
			log = 1; }
		else { log = 0; }
		
		
		switch(log) {
		case 1 : System.out.println(userName + "님 환영합니다"); break ;
		case 0 : System.out.println("아이디 또는 비밀번호가 잘못되었습니다"); break ;
		}

	}
		
		
}// return문 
	


