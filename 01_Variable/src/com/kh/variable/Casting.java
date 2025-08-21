package com.kh.variable;

public class Casting {
	
/*  
 * �ڡڡ� �ſ��߿���
 * 
 *  Type Casting (�ڷ��� ��ȯ) - �ڷ����� �ٲٴ� ����
 *  
 *  1. = (���� ������) �� �������� ���� / ������ �� ���� �ڷ����̿��� �Ѵ�.
 *  >> ���� �ڷ����� �ش��ϴ� ���ͷ� ���� ������ �� ����.
 *  >> �ڷ����� �ٸ� ���? == ���� �ٲ㼭 �����ؾ� ��.
 *  
 *  2. ���� �ڷ����鳢���� ������ ������
 *  >> �ڷ����� �ٸ��� ������ �ϰ���� ��� -> �� �� �ϳ��� "�� ��ȯ" �ؼ� ������ �ϳ��� �����ϰ� �������
 *  
 *  3. ������ ������� ������ �ڷ���
 *  
 *  
 *  [ǥ����] (�ٲٰ���� �ڷ���) ��
 *  ����ȯ ������ / cast ������
 *  
 *  ����
 *  1. �ڵ�����ȯ (Promotion) : �ڵ����� ����ȯ�� �����
 *  >> ���� ũ���� �ڷ��� -> ū ũ���� �ڷ���
 *  ���� ����ȯ�� ���ʿ䰡 ����
 *  
 *  2. ��������ȯ (Type casting) : �ڵ�����ȯ�� �̷������ ���� ��� ����
 *  >> ū ũ���� �ڷ��� -> ���� ũ���� �ڷ���
 *  
 *  
 */
	
	public void autoCasting() {
		
		//System.out.print("�� ������ �ܼ�â�� ����غ����� �ǽ� ����!");
		
		//1. int(������ 4Byte) => doulbe (�Ǽ�, 8Byte)
		
		int intNum = 4 ;
		System.out.println(intNum);
		double doubleNum = (double)intNum;
		System.out.println(doubleNum);
		
		//2. int(������ 4Byte) => long (����, 8Byte)
		
		int bigIntger = 120000;
		long smallIntger = (long) bigIntger;
		System.out.println(smallIntger);
		
		//3 ū�� �����ɷ�

		double double2 = 2.345;
		int  intNum3 = (int) double2;
		System.out.println(intNum3);
		
		//4 long (���� 8byte) -> float (�Ǽ�, 4Byte) ** Ư�� ���̽�
			//promotion XXX type casting �� ����

		long longNum = 12312312L ;
		float floatNum = longNum;
		System.out.println(floatNum);
		// ������ �Ǽ��� ��ȯ�� �� ū �������� ����Ÿ���� ���� ������ �Ǽ�Ÿ������ ����ȯ
		// 4Byte float ���� Long ������ ǥ���Ҽ��ִ� ���� ������ �� �б� ������
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
		
		
		//��������
		System.out.println('a'); //a
		System.out.println((int)'a'); // 97
		System.out.println('a'+ 3); // 100
		System.out.println('a'+ '3');//148
		System.out.println('a'+ "3"); //a3
		
		
		/*
		 *  �� �񱳿����� ( == )
		 *  ���װ� ������ ���� ���ؼ� ������� ��ȯ
		 *  true / false ���� ����
		 * 
		 */
		
		System.out.println("�񱳿����� ����غ���");
		System.out.println(1 == 2);
		System.out.println('a' == 'b');
		System.out.println("a" == "b");
		System.out.println('2' == (int)50 );
		System.out.println((char)2 == '2');
	}
	
	// ���� �� ��ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� 
	public void forceCasting() {
		
		// ����� ����ȯ�̶�� �Ѵ�.
		// (�ٲ��ڷ���) ��
			double doubleNum = 10.123;
			int intNum = (int)doubleNum;
			System.out.println(intNum);
			System.out.println(doubleNum);
		
	}
	
	


}


