package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	
	// ���θ޴� ���
	public void mainMenu() {
		
		System.out.println("�ִ� ��� ������ ȸ�� ����" + mc.SIZE + "���Դϴ�");
		System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "���Դϴ�");
		
		while(true) {
		if(mc.existMemberNum() < 10) {
			System.out.println("1. ��ȸ�� ���" +
							   "\n2. ȸ�� �˻�" + 
							   "\n3. ȸ�� ���� ����" +
							   "\n4. ȸ�� ����" +
							   "\n5. ��� ���" +
							   "\n9. ������" );
			}else if(mc.existMemberNum() == 10) { 
			System.out.println(
							   "\n2. ȸ�� �˻�" + 
							   "\n3. ȸ�� ���� ����" +
							   "\n4. ȸ�� ����" +
							   "\n5. ��� ���" +
							   "\n9. ������" );
			}
		int userInput = sc.nextInt();
		sc.nextLine();
		
		switch (userInput) {
		case 1 : insertMember();break;  //��ȸ�� ���
		case 2 : searchMember();break;  //ȸ�� �˻�
		case 3 : updateMember(); break; //ȸ�� ���� ����
		case 4 : deleteMember();break;  //ȸ�� ����
		case 5 : printAll();break;  	 //��� ���
		case 9 : System.out.println("���α׷��� �����մϴ�"); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}
	}
	
	//��ȸ�� ��� 
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		System.out.print("�̸� >>");
		String name = sc.nextLine();
		
		while(true) {
		System.out.print("���̵� >>");
		String id = sc.nextLine();
		if (mc.checkId(id) == true) {
			System.out.println("�̹� ȸ�����Ե� ���̵��Դϴ�.");
			
			System.out.print("��й�ȣ >>");
			String password = sc.nextLine();
			
			System.out.print("�̸��� >>");
			String email = sc.nextLine();
			
			System.out.print("���� >>");
			String gender = sc.nextLine();
			
			System.out.print("���� >>");
			int age = sc.nextInt();
			sc.nextLine();
			
			char g = gender.charAt(0);
			mc.insertMember(name, id, password, email, g, age);
			}
		}
		
	}
	
	public void searchMember() {
		
	}
	
	public void  searchId() {
		
	}
	
	public void searchName() {
		
	}
	
	public void searchEmail() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void updatePassword() {
		
	}
	
	public void updateName() {
		
	}
	
	public void updateEmail() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void deleteOne() {
		
	}
	
	public void deleteAll() {
		
	}
	
	public void printAll() {
		
	}
	
	
}
