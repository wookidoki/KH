package com.kh.operator;

public class E_Comparison {
	
	/*
	 * 
	 * �� �� ������(���� ������) // ����񱳿����� (==) �̰� ���� �������
	 * 
	 * �ΰ��� ���� �� , ���׿�����
	 * �񱳿����� �� ��� ���ΰ�� true ������ ��� false
	 * ���ǹ����� ����� ����
	 * 
	 * 
	 * 1. ����� 
	 * a == b : a �� b �� ��ġ�մϱ�?
	 * a != b : a �� b �� ��ġ���� �ʽ��ϱ�?
	 * 
	 * 2. ��Һ�
	 * a < b 
	 * a > b
	 * a <= b
	 * a => b
	 * ������� true or false
	 * 
	 * 
	 */
	
	public void method1 () {
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println ("firstNumber < secondNumber :" + (firstNumber < secondNumber));
		System.out.println ("firstNumber > secondNumber :" + (firstNumber > secondNumber));
		System.out.println ("firstNumber == secondNumber :" + (firstNumber == secondNumber));
		
		System.out.println ("firstNumber �� ¦���Դϱ�? :" + ((firstNumber %  2) == 0));
		System.out.println ("secondNumber �� Ȧ ���� �ƴմϱ�? :" + ((secondNumber %  2) != 1));
		
	}

}
