package com.kh.chap03.escape;
import java.util.Scanner;


public class B_Continue {
	
	/*
	 * continue : �ݺ��� �ȿ��� ����ϴ� ����
	 * 
	 * continue ���� ������ continue ���Ŀ� � �ڵ尡 �����ϴ� �������� �ʰ� pass
	 * �ݺ��� scope �ֻ�� ���� �ö󰡴� ���� �ǹ���
	 * 
	 */
	
	public void method1 () {
		
		for(int i = 1; i < 11 ; i++) {
			if (i % 2 == 1) {
			System.out.print(i+" ");
			}
		}
	}
	
	public void method2 () {
		
		Scanner sc = new Scanner (System.in);
		

		
		while(true) {
			
			System.out.println (" ���̵� �Է�");
			String userId = sc.nextLine();
		
			
			if(userId.length() > 10 ) {
				System.out.println("���̵�� 10�� ����"); continue;
			}  else { System.out.println("��밡��"); break;
				}
			
		}
		
	}

}//class

