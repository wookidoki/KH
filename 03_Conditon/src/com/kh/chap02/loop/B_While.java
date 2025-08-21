package com.kh.chap02.loop;

import java.util.*;


public class B_While {
	
	/*
	 *  while 문
	 *  
	 *  [표현법]
	 *  
	 *  초기식 ; - 초기식이 필수는 아님 
	 *  while (조건식) { }
	 *  
	 * for 문  => 개발자가 반복의 횟수를 명확하게 알고있다
	 * while => 개발자가 반복의 횟수를 가늠할수없음
	 * 
	 * 
	 * 
	 */
	
	public void method1 () {
		
		int i = 0 ;
		int sum = 0;
		

		
		while (i < 11) {
			
			if (i % 2 == 0) { 
			sum += i ;
			
			} 
			i ++;
		}
		
		System.out.print(sum);
		
	}
	
	
	public void method2 () {
		//1부터 시작해서 1~10 사이 랜덤ㅎㄴ 정수까지 모두 더한 합계
		
		int i = 0 ;
		int sum = 0 ;
		double randomNum = (Math.random() * 10) + 1;
		
	
		
		while (i < 11) {
			if (i <= (int)randomNum) {
				sum += i;
			}
			i++;
		}
		System.out.println((int)randomNum);
		System.out.println(sum);
		
	}
	
	public void lotto() {
		
		double randomnum = Math.random()*100 ;
		int lottoNum = 0 ;
		int i = 1;
		
		while (i < 7) {
			randomnum = Math.random()*100 + 1 ;
			if(randomnum < 46) {
				lottoNum = (int) randomnum;
				System.out.println(i + " 번째 번호 > "+ lottoNum);
				i ++;
			}
		}
		
		
	}
	

}//class


