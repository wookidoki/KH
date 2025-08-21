package com.kh.chap03.escape;
import java.util.Scanner;


public class B_Continue {
	
	/*
	 * continue : 반복문 안에서 사용하는 문법
	 * 
	 * continue 문을 만나면 continue 이후에 어떤 코드가 존재하던 실행하지 않고 pass
	 * 반복문 scope 최상단 으로 올라가는 것을 의미함
	 * 
	 */
	
	public void method1 () {
		
		for(int i = 1; i < 11 ; i++) {
			if (i % 2 == 1) {
			System.out.print(i+" ");
			}
		}
	}
	
	public void method2 () {
		
		Scanner sc = new Scanner (System.in);
		

		
		while(true) {
			
			System.out.println (" 아이디 입력");
			String userId = sc.nextLine();
		
			
			if(userId.length() > 10 ) {
				System.out.println("아이디는 10자 이하"); continue;
			}  else { System.out.println("사용가능"); break;
				}
			
		}
		
	}

}//class

