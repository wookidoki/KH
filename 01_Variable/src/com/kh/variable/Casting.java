package com.kh.variable;

public class Casting {
	
/*  
 * ★★★ 매우중요함
 * 
 *  Type Casting (자료형 변환) - 자료형을 바꾸는 개념
 *  
 *  1. = (대입 연산자) 를 기준으로 왼쪽 / 오른쪽 이 같은 자료형이여야 한다.
 *  >> 같은 자료형에 해당하는 리터럴 값만 대입할 수 있음.
 *  >> 자료형이 다를 경우? == 값을 바꿔서 대입해야 함.
 *  
 *  2. 같은 자료형들끼리만 연산이 가능함
 *  >> 자료형이 다른데 연산을 하고싶은 경우 -> 둘 중 하나를 "형 변환" 해서 나머지 하나와 동일하게 맞춰야함
 *  
 *  3. 연산의 결과물도 동일한 자료형
 *  
 *  
 *  [표현법] (바꾸고싶은 자료형) 값
 *  형변환 연산자 / cast 연산자
 *  
 *  종류
 *  1. 자동형변환 (Promotion) : 자동으로 형변환이 진행됨
 *  >> 작은 크기의 자료형 -> 큰 크기의 자료형
 *  직접 형변환을 할필요가 없음
 *  
 *  2. 강제형변환 (Type casting) : 자동형변환이 이루어지지 않은 경우 진행
 *  >> 큰 크기의 자료형 -> 작은 크기의 자료형
 *  
 *  
 */
	
	public void autoCasting() {
		
		//System.out.print("이 내용을 콘솔창에 출력해보세요 실습 시작!");
		
		//1. int(정수형 4Byte) => doulbe (실수, 8Byte)
		
		int intNum = 4 ;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		
		//2. int(정수형 4Byte) => long (정수, 8Byte)
		
		int bigIntger = 120000;
		long smallIntger = (long) bigIntger;
		System.out.println(smallIntger);
		
		//3 큰걸 작은걸로

		double double2 = 2.345;
		int  intNum3 = (int) double2;
		System.out.println(intNum3);
		
		//4 long (정수 8byte) -> float (실수, 4Byte) ** 특이 케이스
			//promotion XXX type casting 이 진행

		long longNum = 12312312L ;
		float floatNum = longNum;
		System.out.println(floatNum);
		// 정수가 실수로 변환될 때 큰 사이즈의 정수타입이 작은 사이즈 실수타입으로 형변환
		// 4Byte float 형이 Long 형보다 표현할수있는 값의 범위가 더 넓기 때문임
		// 12312312 = 1.2312312E7
		
		// 5 char(2byte) -> int (4byte)
		//				 <-
		char carC = '3' ;
		System.out.println(carC);
		
		int intNumC = carC ;
		System.out.println(intNumC);
		
		char carC2 = 98 ;
		System.out.println(carC2);
		
		int intNumC2 = carC2 ;
		System.out.println(intNumC2);
		
		int intCNum = 97 ;
		System.out.println(intCNum);
		
		char carCNum = (char) intCNum;
		System.out.println(carCNum);
		
		
		//퀴주퀴주
		System.out.println('a'); //a
		System.out.println((int)'a'); // 97
		System.out.println('a'+ 3); // 100
		System.out.println('a'+ '3');//148
		System.out.println('a'+ "3"); //a3
		
		
		/*
		 *  ● 비교연산자 ( == )
		 *  좌항과 우항의 값을 비교해서 결과값을 반환
		 *  true / false 값이 나옴
		 * 
		 */
		
		System.out.println("비교연산자 사용해보기");
		System.out.println(1 == 2);
		System.out.println('a' == 'b');
		System.out.println("a" == "b");
		System.out.println('2' == (int)50 );
		System.out.println((char)2 == '2');
	}
	
	// 강제 형 변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 
	public void forceCasting() {
		
		// 명시적 형변환이라고도 한다.
		// (바꿀자료형) 값
			double doubleNum = 10.123;
			int intNum = (int)doubleNum;
			System.out.println(intNum);
			System.out.println(doubleNum);
		
	}
	
	


}


