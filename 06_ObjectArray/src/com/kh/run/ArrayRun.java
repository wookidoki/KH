package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Restaurant;

public class ArrayRun {
	
	public static void main(String[]args) {
		
		/*
		 * 배열의 특징 => 배열이 뭐에요?
		 * 논리적인 구조와 물리적인 구조가 동일하다
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Restaurant[] restaurants = new Restaurant[3];
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("식당의 상호 입력 > ");
			String storeName = sc.nextLine();
			
			System.out.println("식당의 주소 입력 > ");
			String address = sc.nextLine();
			
			System.out.println("식당의 메인메뉴 입력 > ");
			String mainMenu = sc.nextLine();
			
			restaurants[i] = new Restaurant(storeName,address,mainMenu);
		}

		
		System.out.println(restaurants[0].getMainMenu());
		System.out.println(restaurants[0].information());
		
	}

}
