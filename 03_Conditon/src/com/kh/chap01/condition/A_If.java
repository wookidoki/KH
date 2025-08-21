package com.kh.chap01.condition;
import java.util.Scanner;

public class A_If {
	
	/*
	 * (단일) if 문
	 *  
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 
	 * 	조건식이 true 일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 
	 * => 조건식의 결과가 true 일 경우 : if 문 Scope ({}) 안의 코드가 
	 * => 조건식의 결과가 false 일 경우 : 건너뜀
	 */
	
	public void method1 () {
		
		boolean loninCheck = false; // 로그인 상태를 저장해둔 변수 
		
		if(loninCheck == false) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요");
			System.out.println("네이버 로그인 하기");
			System.out.println("로그인하기 | 비밀번호 | 회원가입" );			
		}
		

		if(loninCheck) {
			System.out.println("홍길동님 환영합니다");
			System.out.println("메일 | 카페 | 블로그" );
		
		}
	}
		
	public void lunchMenu () {
		
		// 오늘의 날씨를 입력받아서 점심메뉴 추천
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("날씨를 입력해주세요 (맑음 / 더움 / 비움) >>");
		String weather = sc.nextLine(); 
		
		
		if(weather == "맑음") { 
			System.out.print("밥");
		}
				if(weather == "더움") { 
					System.out.print("면");
				}
				if(weather.equals("비움")) { 
					System.out.print("빵");
				}
		
			
	}
		
		
	}

	
