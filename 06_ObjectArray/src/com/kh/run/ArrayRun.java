package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {
	
	public static void main(String[]args) {
		
		/*
		 * �迭�� Ư¡ => �迭�� ������?
		 * ������ ������ �������� ������ �����ϴ�
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Restaurant[] restaurants = new Restaurant[3];
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("�Ĵ��� ��ȣ �Է� > ");
			String storeName = sc.nextLine();
			
			System.out.println("�Ĵ��� �ּ� �Է� > ");
			String address = sc.nextLine();
			
			System.out.println("�Ĵ��� ���θ޴� �Է� > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName,address,mainMenu);
		}

		
		System.out.println(restaurants[0].getMainMenu());
		System.out.println(restaurants[0].information());
		
	}

}
