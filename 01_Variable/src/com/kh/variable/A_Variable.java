package com.kh.variable;

public class A_Variable {
	
	//���� - �������� ���� ������ �� �� ǥ���ϱ� ���� ��ȣ 
	//���α׷��� �����Ǻ��� - Memory(RAM) �� ���� �����ϱ� ���� ���� ( �ڽ� )
	
	/**
	 *  �� ������ �޸� �� ���� �����ϱ� ���� ����
	 *  
	 */

	// Ű����ũ (����޴�)
	public void findSeasonMenu() {
		
		// 1. ����޴����� ��� (�޴���, ����)
		// 2. ����ڰ� �޴����� ���� �ֹ��� �ߴٰ� ����
		// 3. ���� ������ �޴��� ������ ���
		
		System.out.println("--- ���� ����ϱ� �� ---");
		System.out.println("*���� �޴�*");
		//System.out.println("1. ����� : 6700 won");
		System.out.println("1. �ѱ��� ���������� ����ÿ : 1846 won");
		System.out.println("2. ��� ���� �Ҵ� �÷�ġ�� : 3900 won");
		System.out.println("3. �ɷ��ɷ��ɷ��� ��� �� : 4200 won");
		
		// ���� - ����� 25�� �ֹ� , ��ж� 30�� �ֹ�
		
		
		System.out.println("-------------------");
		
		//System.out.println("���� �󶼸� 25�� ��Ű�̽��ϴ�.");
		
		System.out.println("�ѱ��� ���������� ����ÿ�� 17�� ��Ű�̽��ϴ�.");
		
		// �ֹ����� ����� 25��* ����� ����
		//System.out.println((6700 * 25) + "\s�� �Դϴ�.");
		
		System.out.println((1846 * 17) + "�� �Դϴ�.");
		System.out.println("�ɷ��ɷ��ɷ��� ��� �󶼸� 30�� ��Ű�̽��ϴ�.");
		System.out.println((4200 * 30) + "�� �Դϴ�.");
		
		
		//�������
		String seasonMenu = " ������ŰƼ �����";
		int price = 6700;
		int amount = 17;
		
		System.out.println("\n\n--- ������ ����� ���ô� ---");
		System.out.println("\n*���� �޴�*");
		System.out.println("�޴��� : 1. " + seasonMenu + " ���� : " + price);
		System.out.println("\n" + seasonMenu + "\s" + amount + "\s" + "�� ��Ű�̽��ϴ�." );
		System.out.println("�� " + (price * amount) + " �� �Դϴ�" );

		
	}
	
	// ���� ���� ����� ���� �˾ƺ��ô�.
	public void declareVariable() {
		
		/*
		 * �� ���� ���� ��� -> �����ڰ� �޸� �� ���� �ø��� ��� / �������� ���� �ǹ��ϴ°� �ƴϴ�!��
		 * 
		 * DataType �����ĺ���;
		 * ���� ���� �� ó�� ���� �����ϴ� ���� �ʱ�ȭ (Initialization) �̶�� ��
		 * �ʱ�ȭ�� ���� ������ ���� �ʱⰪ �̶�� ��
		 * 
		 * ������ �ڽ��� ����� {Scope} ������ ����Ҽ��ֽ�
		 * local variable(��������)
		 * 
		 */
		
		/*
		 * �� �ĺ���(Identifier)
		 * 
		 * Ŭ���� ��, �޼ҵ� ��, ���� �� �� �����ڰ� �̿��ϴ� ������ �̸�
		 * 
		 * �� �ĺ��� ������ �� ���Ѿ� �ϴ� ��Ģ
		 * 1.keyword(�����)[����۾�] �� �ĺ��ڷ� ����� �� ����
		 * 2.������ ������ �� ����
		 * 3.��, �ҹ��ڸ� �����ϰ� ���������� ��dma
		 *
		 * �� �����ڵ� ���� �Ϲ����� ��� > ���� ���� ��������
		 * 
		 * 1. Ŭ���� / �������̽� ��� ��Ģ
		 * - ù���ڴ� �빮�ڷ� ǥ��
		 * - ����� �ܾ���� ù �ܾ �빮�ڷ� ǥ��
		 * 
		 * 2. ���� ��� ��Ģ
		 * - ����� �ǹ̸� ���� �����
		 * - ù���ڴ� �ҹ��ڷ� ǥ��, ����� �ܾ���� ù���ڴ� �빮�ڷ� ǥ��
		 * 
		 * 3. �޼ҵ� ��� ��Ģ
		 * - ������ �ǹ̸� ���� ����� (����� ������ ����)
		 * - ù ���ڴ� �ҹ��ڷ� ǥ��, ����� �ܾ���� ù���ڴ� �빮�ڷ� ǥ��
		 * - �޼ҵ� �ĺ����� ��� �ĺ��� �ڿ� �ݵ�� () �� ����
		 * - �޼ҵ� ���� _ ��� XXXX
		 * 
		 * 4. ��� ��� ��Ģ
		 * - ��� ���ڸ� �빮�ڷ� ǥ��
		 * - �ܾ�� �ܾ� ���̿��� _�� �����Ѵ�
		 * ex) LOGIN_OK
		 * 
		 */
		
		 // �� ������ �ڷ��� Java �� �⺻ �ڷ���, �����ڷ���
		
		 /*
		  * 1. ���ڷ��� (�� �� : true / false)
		  */
		
		boolean isLight; //���� ���� 
		// localVariable �� �ʱ�ȭ (Initialized) �� ���������� ����� �� ����
		isLight = true;  //�ʱ�ȸ 
		System.out.println(isLight);
		
		isLight = false; //����
		System.out.println(isLight);
		
	 	/*
	 	 * 2. ����
	 	 * 
	 	 * �� ������
	 	 * 4���� �ڷ����� ����
	 	 * byte short int long ���� int�� ���� �����
	 	 * long ���� ����Ҷ��� ���ڵڿ� L �� ����
	 	 * 
	 	 * �� �Ǽ���
	 	 * 2���� �ڷ����� ����
	 	 * float double(�⺻) 
	 	 * float �� ����ϱ� ���ؼ� �Ҵ�� ���� �ڿ� F �� ���� 
	 	 * 
	 	 * 
	 	 */
	
		// 2_1. ������
		byte byteNumber = 1;	//1Byte
		short shortNumber = 2;	//2Byte
		int intNumber = 3;		//4Byte
		long longNumber = 4L;	//8Byte
		
		// 2_2. �Ǽ���
		float floatNumber = 2.22F ; //4Byte
		double doubleNumber = 3.33 ; //8Byte
		
		// ���� ����� ���ÿ� �ʱ�ȭ
		
		// 3. (����) ������
		char rice = '��' ; // 2Byte - ���� ���ڿ����� �ݵ�� Ȭ ����ǥ ���
		
		// �� ��������� �����ڷ��� 8�� boolen / byte / short / int / long / float / double / char
		
		
		// 4. ���ڿ� : �����ڷ���
		String str ="abc"; 
		
		
		System.out.println("���� " + isLight);
		System.out.println("������ byte " + byteNumber);
		System.out.println("������ short " + shortNumber);
		System.out.println("������ int " + intNumber);
		System.out.println("������ long " + longNumber);
		System.out.println("�Ǽ��� float " + floatNumber);
		System.out.println("�Ǽ��� doulbe " + doubleNumber);
		System.out.println("���� ������ char " + rice);
		System.out.println("���ڿ� ������ str " + str);
		
		// %b %d %f %c %s 
		// �� ���� �Ǽ� ���Ϲ��� ���ڿ�
		System.out.printf("isTrue ��� ������ ������ �� : %b, char���� %c", isLight , rice);
		
		//
		System.out.printf("\ndoubleNum �� : %.3f" , doubleNumber);
		
		/*
		 * ��¹��� ����
		 * System.out.print();
		 * System.out.println(); => �����Ѵ�. �ٹٲ�
		 * System.out.printf(); 
		 */
		
		System.out.println("===============================");
		
		// ��� (���α׷��� ���)
		// �빮�ڷ� ����� _ �� ����
		
		int startYear = 1998; //����
		final int START_YEAR = 1998; //���
		
		System.out.println("KH �������� : " + START_YEAR);
		
		

		
	}
	


}


















