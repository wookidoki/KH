package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 *  �� ���� ������ - �� �����ڰ� 3�� => �� 3���� 1���� �����ڷ� �̷���� ( ���ǹ� �� ���� )
	 * 
	 *  ���ǹ� : ���� ���� ������ ó���ϴ� ���
	 *  	- ������� true �� ��� ù��° ������ ó��
	 *  	- ������� false �� ��� �ι�° ������ ó��
	 *  	- 
	 *  
	 *  [ ǥ���� ]
	 *  
	 *  ���ǽ��� true �� ��� ��� �� : ���ǽ��� false �� ��� �����
	 * 
	 */
	
	public void method1() {
		
		String menu1 = "��� ����Ǫġ��";
		String menu2 = "�ڸ� ���� ����Ǫġ��";
		String menu3 = "����� ����Ǫġ��";
		
		System.out.println("�޴���");
		System.out.println("1. " + menu1);
		System.out.println("2. " + menu2);
		System.out.println("3. " + menu3);		
		
		//�޴� ��ȣ������ �ֹ� �ޱ�
		
		Scanner sc = new Scanner (System.in);
		//Ctrl + Shif + o => ������ ������ �ض�
		
		System.out.println(" �޴� ��ȣ �Է� > ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		String selectedMenu = (menuNo == 1) ? menu1
				: (menuNo == 2) ? menu2
				: (menuNo == 3) ? menu3
				: "���� �޴��� �ֹ��ϼ̽��ϴ�." ;
		
		//���ǽ� 
		// ? true �� ��� �����
		// : false �� ��� ��� ��
		
		System.out.println(selectedMenu);
		
		
	}
	
	//Ȧ¦ ���ϱ� 
	public void method2 () {
		//����ڿ��� ���� ���� �ϳ� �Է� �޾Ƽ� �Է¹��� ������ Ȧ¦ / �Ǻ��ؼ� ���
		
		Scanner sc = new Scanner(System.in);
		
		int userNum = 0;
		System.out.println("���ڸ� �Է��غ�����");
		userNum = sc.nextInt();
		sc.nextLine();
		
		String odd = "Ȧ��";
		String  even = "¦��";
		
		String result  = ((userNum > 0) && (userNum % 2 == 0)) ? even  
						:((userNum > 0) && (userNum % 2 == 1)) ? odd
						:(userNum == 0) ? "0 �Դϴ�"
						: "0���� ū ������ �Է����ּ���" ;
		
		System.out.println(result);
						
								
		
	}

}
