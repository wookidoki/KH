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
			
			System.out.println("����� �����?");
			String exit = sc.nextLine();
			
			if (exit.equals("exit")) {
				System.out.println("����"); break;
			}
			
			if (exit.equals("apple")) {
				System.out.println("���� ~ ������"); break;
			}
			
			System.out.println("Ʋ����");
		}
		
	}
	
	public void method3 () {
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			
			System.out.println(" �����Է��ؔg ");
			int userNum = sc.nextInt();
			System.out.println(" �Է��� ���ڴ� >" + userNum);
			
			if ( userNum < 0) {
				
				System.out.println(" ������ �����Ҳ� ");  break;
			}
					
		}
	}
	
	public void method4 () {
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
			
			System.out.print ( "1�̻��� ���ڸ� �Է��ϼ��� > ");
			int userNum = sc.nextInt();
					
			if (userNum >= 1) {
				for (int i = 0 ; i < userNum  ; i ++  ) {
					System.out.print( userNum - i + " " );
				} break ;
				
			} else { System.out.println ( "1�̻��� ���ڸ� �Է��Ͻö󱸿�!! ");}
			
		}
		
	}
	
	

}//class
