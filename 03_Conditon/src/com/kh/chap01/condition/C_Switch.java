package com.kh.chap01.condition;
import java.util.Scanner;

public class C_Switch {
	
	public void method0 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���ó���? B3~B1 >") ;
		
		String userFloor = sc.nextLine();
		
		switch (userFloor) {
			case "B1" : System.out.println("���� 1���Դϴ�"); break;
			case "B2" : System.out.println("���� 2���Դϴ�"); break;
			case "B3" : System.out.println("���� 3���Դϴ�"); break;	
		}
		
		System.out.println("�ȳ��� ������");
	}
	
	/*
	 * 
	 *  switch ��
	 *  
	 *  [ ǥ���� ]
	 *  
	 *  switch (case ���� ����� ����� ��� ){
	 *  	case ~ �� : ~ �ڵ� ; break ;
	 *  	case ~ : ~ ; break ;
	 *  }
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner (System.in);
		
		String menu;
		int price = 0;
		
		System.out.print("�޴��� �������ּ��� > �ѽ� �߽�  �Ͻ�");
		menu = sc.nextLine();
		
		
		
		
		switch (menu) {
		case "�ѽ�" : price = 8000; break;
		case "�߽�" : price = 9000; break;
		case "�Ͻ�" :price = 12000; break;	
		default : System.out.print("�׷� �޴��� �����");
		return; //���� ����ǰ��ִ� �޼ҵ� ������ �������� -> ȣ���� �������� ���ư� 
		} //break �� ���������� �κ�
		
		
		if (price > 0) {
			 System.out.print(price); }
		
	}
	
	public void login () {
		
		Scanner sc = new Scanner (System.in);
		
		// ȸ�������� �̹� �ߴٰ� ����
		String userId = "user01";
		String userPassword = "pass01!";
		String userName = "�̽¿�";
		
		System.out.println("�α��� �ϱ�");
		System.out.println("���̵�");
		System.out.println("��й�ȣ");
		
		String inputId = sc.nextLine();
		String inputPassword = sc.nextLine();
		
		int log = 0;
		
		if ( inputId.equals(userId) && inputPassword.equals(inputPassword)) {
			log = 1; }
		else { log = 0; }
		
		
		switch(log) {
		case 1 : System.out.println(userName + "�� ȯ���մϴ�"); break ;
		case 0 : System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�"); break ;
		}

	}
		
		
}// return�� 
	


