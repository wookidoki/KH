package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant r1 = new Restaurant();
		//r1.information();
		
		//3���� �Ĵ� ������ �Է¹޾ҳ��ٰ� ����
		
		Scanner sc = new Scanner(System.in);
		Restaurant r2 = null;
		Restaurant r3=null;
		Restaurant r4=null;
		
		for(int i =0; i<3 ; i++) {
		
			System.out.println("�Ĵ��� ��ȣ �Է� > ");
			String storeName = sc.nextLine();
			
			System.out.println("�Ĵ��� �ּ� �Է� > ");
			String address = sc.nextLine();
			
			System.out.println("�Ĵ��� ���θ޴� �Է� > ");
			String mainMenu = sc.nextLine();
		
			if(i==0) {
				r2 = new Restaurant(storeName,address,mainMenu);
			}else if(i==1) {
				r3 = new Restaurant(storeName,address,mainMenu);
			}else {
				r4 = new Restaurant(storeName,address,mainMenu);
			}	
		
		}
		
	   r2.information();
	   r3.information();
	   r4.information();
	   
	   System.out.print("���Ը� �Է����ּ��� > ");
	   String searched = sc.nextLine();
	   if(searched.equals(r2.getStoreName())) {
		   System.out.println("��ǥ�޴� : " + r2.getMainMenu());
	   } 
	   if(searched.equals(r3.getStoreName())) {
		   System.out.println("��ǥ�޴� : " + r3.getMainMenu());
	   }
	   if(searched.equals(r4.getStoreName())) {
		   System.out.println("��ǥ�޴� : " + r4.getMainMenu());
	   }
	}

}
