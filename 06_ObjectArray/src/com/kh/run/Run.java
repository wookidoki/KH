package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant r1 = new Restaurant();
		//r1.information();
		
		//3개의 식당 정보를 입력받았나다고 가정
		
		Scanner sc = new Scanner(System.in);
		Restaurant r2 = null;
		Restaurant r3=null;
		Restaurant r4=null;
		
		for(int i =0; i<3 ; i++) {
		
			System.out.println("식당의 상호 입력 > ");
			String storeName = sc.nextLine();
			
			System.out.println("식당의 주소 입력 > ");
			String address = sc.nextLine();
			
			System.out.println("식당의 메인메뉴 입력 > ");
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
	   
	   System.out.print("가게명 입력해주세요 > ");
	   String searched = sc.nextLine();
	   if(searched.equals(r2.getStoreName())) {
		   System.out.println("대표메뉴 : " + r2.getMainMenu());
	   } 
	   if(searched.equals(r3.getStoreName())) {
		   System.out.println("대표메뉴 : " + r3.getMainMenu());
	   }
	   if(searched.equals(r4.getStoreName())) {
		   System.out.println("대표메뉴 : " + r4.getMainMenu());
	   }
	}

}
