package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 
	 * ■ 비교 연산자(관계 연산자) // 동등비교연산자 (==) 이건 먼저 배웠었음
	 * 
	 * 두개의 값을 비교 , 이항연산자
	 * 비교연산을 한 결과 참인경우 true 거짓인 경우 false
	 * 조건문에서 사용할 예정
	 * 
	 * 
	 * 1. 동등비교 
	 * a == b : a 와 b 가 일치합니까?
	 * a != b : a 와 b 가 일치하지 않습니까?
	 * 
	 * 2. 대소비교
	 * a < b 
	 * a > b
	 * a <= b
	 * a => b
	 * 결과값은 true or false
	 * 
	 * 
	 */
	
	public void method1 () {
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println ("firstNumber < secondNumber :" + (firstNumber < secondNumber));
		System.out.println ("firstNumber > secondNumber :" + (firstNumber > secondNumber));
		System.out.println ("firstNumber == secondNumber :" + (firstNumber == secondNumber));
		
		System.out.println ("firstNumber 가 짝수입니까? :" + ((firstNumber %  2) == 0));
		System.out.println ("secondNumber 가 홀 수가 아닙니까? :" + ((secondNumber %  2) != 1));
		
	}

}
