package com.kh.variable;
import java.util.Scanner;

public class B_KeyboardInput {
	
	/*
	 * Ű���带 �̿��ؼ� ����ڷ� ���� �Է� �ޱ�
	 * Scanner ��� Ŭ���� ���
	 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ带 ȣ���ؼ� ���
	 * 
	 */
	
	
	public static void userImpormation() {
		
		String orderMenuName = (null);
		String userDeliveryAddress= (null);
		int orderMenuAmount = 0 ;
		
		Scanner sc = new Scanner(System.in);
		
		String menuA = "�ѱ��� ���� ������ ����ÿ" ;
		
		
		//����ڿ��� ���Ḧ �Է¹޾Ƽ� ����غ���
		
		System.out.println("=== �޴��� ===");
		System.out.print("***WELCOME***");
		System.out.printf("\n�� " + menuA);
		System.out.printf("\n�� ŰƼ ���� ��");
		System.out.printf("\n�� �ɷ��� ��� ����");
		System.out.printf("\n�� ������ �Ҵ� ���̵�");
		System.out.println("\n=== �޴��� ===");
		
		System.out.print("�ֹ��Ͻ� �޴��� �Է����ּ���. > ");
		orderMenuName = sc.nextLine();
		System.out.println("�ֹ��Ͻ� �޴��� "+ orderMenuName + " �Դϴ�");
		System.out.print("�ֹ� ������ �Է����ּ���. (���ڸ� �Է����ּ���) > ");
		orderMenuAmount = sc.nextInt();
		sc.nextLine();
		System.out.println("�ֹ��Ͻ� ������ "+ orderMenuAmount + "�� �Դϴ�");
		System.out.print("�ּ����� �Է����ּ��� > ");
		userDeliveryAddress = sc.nextLine();
		
		System.out.println("�ּ�����" + userDeliveryAddress + " �Դϴ�" );
		
		/*
		 * next() - ����ڰ� �Է��� ���� ������ ���� ��� ���� ���� ���������� �Է¹���.
		 * 
		 * nextInt() - ����ڷ� ���� ���������� �ް���� ��
		 * nextDouble() - ����ڷ� ���� �Ǽ������� �ް���� ��
		 * 		 
		 * nextLine() - �Է� ���ۿ��� ���๮�� �������� �� �о��
		 * ** nextInt() ����� ������ ������ ���๮�� (����, \n) �����ֱ� ������ �� sc. nexLine() �� ����ؾ���
		 */
		
		
	}
	
}
