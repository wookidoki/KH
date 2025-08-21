package com.kh.operator;
import java.util.Scanner;


public class B_InDe {

	/*
	 * ■ 증감연산자 (단 항 연산자)
	 * 
	 * [표현법]
	 * 
	 * ++ : 값을 1증가 시키는 연산자
	 * -- : 값을 1감소 시키는 연산자
	 * 
	 * => 증감을 먼저할건지 , 나중에 할건지에 따라 연산자의 위치가 달라짐
	 * 
	 * ● 연산자의 위치
	 * 전위연산자 : ++i --i / 먼저 값을 증가 또는 감소 시키고 나서 작업을 처리
	 * 후위연산자 : i++ i-- / 먼저 값을 처리하고 나서 증감
	 * 
	 * 
	 */
	
	
	//후위연산 메소드
	public void postfix () {
		
		int num = 10 ;

		System.out.println("num : " + num ) ;
		num ++ ;
		System.out.println("num : " + num ) ;
		num -- ;
		System.out.println("num : " + num ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println(num ) ;
		
		int a = 10 ;
		int b = a++;
		
		System.out.println("a : " + a );
		System.out.println("b : " + b );
		
		int c = 10 ;
		int d = c--;
		
		System.out.println("c : " + c );
		System.out.println("d : " + d );
		
		
	}
	
	
	public void prefix  () {
		
		
		int num = 10 ;
		++num ;
		System.out.println("전위함"+ num ) ;
		
	}
	
	
	
	
	
	
	
	
	
	

}
