package com.kh.chap02.loop;

import java.util.*;


public class B_While {
	
	/*
	 *  while ��
	 *  
	 *  [ǥ����]
	 *  
	 *  �ʱ�� ; - �ʱ���� �ʼ��� �ƴ� 
	 *  while (���ǽ�) { }
	 *  
	 * for ��  => �����ڰ� �ݺ��� Ƚ���� ��Ȯ�ϰ� �˰��ִ�
	 * while => �����ڰ� �ݺ��� Ƚ���� �����Ҽ�����
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
		//1���� �����ؼ� 1~10 ���� �������� �������� ��� ���� �հ�
		
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
				System.out.println(i + " ��° ��ȣ > "+ lottoNum);
				i ++;
			}
		}
		
		
	}
	

}//class


