package com.kh.operator;
import java.util.Scanner;

public class A_Arithmetic {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	/*
	 * ■ 산술연산자
	 * 
	 * 이항연산자
	 * 
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱셈
	 * / : 나눗셈
	 * % : 모듈러(Modular) 나눗셈의 몫을 제외한 나머지 
	 * 	  
	 */


	public void method () {
		
		int num1 = 10;
		int num2 = 5;
		
		//덧셈
		System.out.println(num1 + num2);
		System.out.println("num1 + num2 : " + num1 + num2);
		System.out.println("num1 + num2 : "  + (num1 + num2));

		
		int sum = (num1 + num2) ;
		System.out.println("num1 + num2 : " + sum);
		System.out.printf("num1 + num2 : %d \n", num1 + num2);
		System.out.printf("num1 + num2 : %d \n", sum);
		
		//뺄셈
		System.out.println(num1 - num2);
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		System.out.println("num1 * num2 : "  + (num1 * num2));
		System.out.println("num1 / num2 : "  + (num1 / num2));
		System.out.println("num1 % num2 : "  + (num1 % num2));
		
		
		presentToStudent();
		

		
	}
	
	public void presentToStudent() {
		
		
		
		int candyAmount = 0;
		int student = 0 ;
		
		int candyforOnePerson = 0;
		int remainCandy = 0 ;
	
		
		System.out.println("사탕갯수를 입력하세요 (숫자만 입력하세요)");
		candyAmount = sc.nextInt();
		sc.nextLine();
		
		System.out.println("학생 수를 입력하세요 (숫자만 입력하세요) ");
		student = sc.nextInt();
		sc.nextLine();
		
		candyforOnePerson = (candyAmount /student );
		remainCandy = (candyAmount % student );
		
		System.out.printf("총 사탕갯수는 %d , 총 학생 수는 %d 입니다. \n", candyAmount ,student);
		System.out.printf("학생 한 명당 받을 수 있는 사탕의 개수 : %d 개 \n남은 사탕 개수 : %d개 " 
				, candyforOnePerson, remainCandy);
		
		

		
	}
	
	public void test () {
		
		//System.out.println("꼭 main method 에서 호출해야하 하는것은 아님");
		
		
		
	}
}
