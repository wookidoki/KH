package com.kh.chap01.abstraction.vo;

import java.util.Scanner;

/*
 * public class Ŭ�����ĺ��� {
 * 
 * 	// �ʵ��
 * 
 *	// �����ں�
 *
 *	// �޼ҵ��
 *	
 *
 * }
 * 
 * 
 * 
 */

public class Puppy {
	
	Scanner sc = new Scanner(System.in);
	
	//[�ʵ��] 
	//��ü�� �Ӽ� (���� �����ϴ� ������ �ʿ��ϱ���)
	
	// ���������� �ڷ��� �ʵ�ĺ���; 
	// ���������� : �� �ʵ忡 ������ �� �ִ� ���ٱ����� �����ϴ� ��Ȱ
	// public > protected ? default > private
	// Ŭ���� ���ο� �ʵ带 �����Ҷ��� �ݵ�� ���� �����ڸ� ���� �� 
	// �� �̸� ���� ���� ���� ������
	
	public String species;
	public String name;
	public int 	  age;
	public String gender;
	public String color;
	public int 	  weight;
	
	//[�����ں�]
	
	//[�޼ҵ��] �� class (���⼱ puppy) �� �������ִ� ����� ���� ��
	
	public void inputData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" \n������ �̸� > " );
		name = sc.nextLine();
		System.out.print(" \n������ �� > " );
		species = sc.nextLine();
		System.out.print(" \n������ ���� > " );
		gender = sc.nextLine();
		System.out.print(" \n������ ���� > " );
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" \n������ �� > " );
		color = sc.nextLine();
		System.out.print(" \n������ ���� > " );
		weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" ������ ���� "
							+"\n" + name
							+"\n" + species
							+"\n" + age
							+"\n" + gender
							+"\n" + color
							+"\n" + weight
							);
		
	}
	
	public void playing() {
		
		boolean exit = false;
		
		if(weight > 20) {
			System.out.println("���̾�Ʈ ¢�⸦ ��õ�����");	
		}System.out.println("1. ��������/ 2.¢��/ 3. ���α׷� ���� >");
		
		int menuNo = sc.nextInt();
		
		switch (menuNo) {
		case 1 : sniff ();break;
		case 2 : bark();break;
		case 3 : System.out.println("���α׷� �����մϴ�.");break;	
		default : exit = true;
	}
		
		
	}
	
	public void sniff () {
		
		System.out.println(name + "ůů");
		
	}
	
	public void bark() {
		
		if(weight > 15) {
		System.out.println(name + " ¢���ϴ�.");
		weight -= 5;
		System.out.println(weight + "�������Դϴ�.");
		}else {
			System.out.println("�ʳ� �����~");
		}
	}
	
	
	
	
}//class
