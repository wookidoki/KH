package com.kh.chap01.condition;
import java.util.Scanner;

public class A_If {
	
	/*
	 * (����) if ��
	 *  
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�) {
	 * 
	 * 	���ǽ��� true �� ��� �����ϰ��� �ϴ� �ڵ�;
	 * 
	 * }
	 * 
	 * => ���ǽ��� ����� true �� ��� : if �� Scope ({}) ���� �ڵ尡 
	 * => ���ǽ��� ����� false �� ��� : �ǳʶ�
	 */
	
	public void method1 () {
		
		boolean loninCheck = false; // �α��� ���¸� �����ص� ���� 
		
		if(loninCheck == false) {
			System.out.println("���̹��� �� �����ϰ� ���ϰ� �̿��غ�����");
			System.out.println("���̹� �α��� �ϱ�");
			System.out.println("�α����ϱ� | ��й�ȣ | ȸ������" );			
		}
		

		if(loninCheck) {
			System.out.println("ȫ�浿�� ȯ���մϴ�");
			System.out.println("���� | ī�� | ��α�" );
		
		}
	}
		
	public void lunchMenu () {
		
		// ������ ������ �Է¹޾Ƽ� ���ɸ޴� ��õ
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ �Է����ּ��� (���� / ���� / ���) >>");
		String weather = sc.nextLine(); 
		
		
		if(weather == "����") { 
			System.out.print("��");
		}
				if(weather == "����") { 
					System.out.print("��");
				}
				if(weather.equals("���")) { 
					System.out.print("��");
				}
		
			
	}
		
		
	}

	
