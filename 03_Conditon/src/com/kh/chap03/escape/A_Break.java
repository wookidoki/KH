package com.kh.chap03.escape;

import java.util.Scanner ;

public class A_Break {
	
	public void method1 () {
	
		int i = 0 ;
		
		while (true) {
			int myFavoriteNumMath = (int) ( Math.random() * 100 )+ 1 ;
			
			System.out.print("\s" + myFavoriteNumMath);
			
			if (myFavoriteNumMath == 50) { break;
				
			}
		}
		
	}
	
	public void method2 () {
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("사과는 영어로?");
			String exit = sc.nextLine();
			
			if (exit.equals("exit")) {
				System.out.println("종료"); break;
			}
			
			if (exit.equals("apple")) {
				System.out.println("종답 ~ 종료함"); break;
			}
			
			System.out.println("틀렸지");
		}
		
	}
	
	public void method3 () {
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
			System.out.println(" 숫자입력해봥 ");
			int userNum = sc.nextInt();
			System.out.println(" 입력한 숫자는 >" + userNum);
			
			if ( userNum < 0) {
				
				System.out.println(" 음수넹 정지할께 ");  break;
			}
					
		}
	}
	
	public void method4 () {
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			
			System.out.print ( "1이상의 숫자를 입력하세용 > ");
			int userNum = sc.nextInt();
					
			if (userNum >= 1) {
				for (int i = 0 ; i < userNum  ; i ++  ) {
					System.out.print( userNum - i + " " );
				} break ;
				
			} else { System.out.println ( "1이상의 숫자를 입력하시라구요!! ");}
			
		}
		
	}
	
	

}//class
