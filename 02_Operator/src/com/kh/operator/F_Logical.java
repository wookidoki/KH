package com.kh.operator;
import java.util.Scanner;

public class F_Logical {
	
	/*
	 * �� ��������
	 * - �ΰ��� ������ �����ϴ� ������
	 * 
	 * [ ǥ���� ]
	 * 
	 * ���� �������� ���� => ����
	 * and or
	 * 
	 * 
	 * 
	 */
	
	public void logicMethod () {
		
		Scanner sc = new Scanner(System.in);
		
		int numFromUser = 0;
		
		System.out.print("�����Է��ϼ��� >> ");
		numFromUser = sc.nextInt();
		sc.nextLine();
		
		// �������� 0���� ũ�鼭 ¦������
		
		boolean result = ((numFromUser > 0) && (numFromUser % 2 == 0));
		
		System.out.println( numFromUser +" �� �������� 0���� ũ�鼭 ¦���Դϱ�? >> " + result );
		
		
	}
	
	public void logicMethod2 () {
		
		Scanner sc = new Scanner(System.in);
		
		int numFromUser = 0;
		
		System.out.print("�����Է��ϼ��� >> ");
		numFromUser = sc.nextInt();
		sc.nextLine();
		System.out.println(numFromUser);
		
		boolean num = ( 1 <= numFromUser) && (numFromUser <= 100);
		System.out.println(num);

		
		
	}
	
	
	public void logicMethod3 () {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "kh����������";
		char str3 = str.charAt(3);
		System.out.println(str3);
		
		char user;
		System.out.print("���ĺ��� �Է��Ͻÿ� �� ���� >> ");
		user = sc.nextLine().charAt(0);
		boolean result = ((user == 'a' ) || (user == 'A'));
		//char ���� int ������ �ڵ�����ȯ�� �Ͼ �� ������ ��
		
		System.out.print("a �Ǵ� A �ΰ� >> " + result);
		

		
	}

}


