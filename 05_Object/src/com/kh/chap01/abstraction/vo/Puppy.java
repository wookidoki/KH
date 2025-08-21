package com.kh.chap01.abstraction.vo;

import java.util.Scanner;

/*
 * public class 클래스식별자 {
 * 
 * 	// 필드부
 * 
 *	// 생성자부
 *
 *	// 메소드부
 *	
 *
 * }
 * 
 * 
 * 
 */

public class Puppy {
	
	Scanner sc = new Scanner(System.in);
	
	//[필드부] 
	//개체의 속성 (값을 저장하는 공간이 필요하구나)
	
	// 접근제한자 자료형 필드식별자; 
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역활
	// public > protected ? default > private
	// 클래스 내부에 필드를 선언할때는 반드시 접근 제한자를 붙일 것 
	// 종 이름 나이 성별 색상 몸무게
	
	public String species;
	public String name;
	public int 	  age;
	public String gender;
	public String color;
	public int 	  weight;
	
	//[생성자부]
	
	//[메소드부] 이 class (여기선 puppy) 가 가질수있는 기능이 들어가는 곳
	
	public void inputData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" \n강아지 이름 > " );
		name = sc.nextLine();
		System.out.print(" \n강아지 종 > " );
		species = sc.nextLine();
		System.out.print(" \n강아지 성별 > " );
		gender = sc.nextLine();
		System.out.print(" \n강아지 나이 > " );
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" \n강아지 색 > " );
		color = sc.nextLine();
		System.out.print(" \n강아지 무게 > " );
		weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" 강아지 정보 "
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
			System.out.println("다이어트 짖기를 추천드려요");	
		}System.out.println("1. 냄새맟기/ 2.짖기/ 3. 프로그램 종료 >");
		
		int menuNo = sc.nextInt();
		
		switch (menuNo) {
		case 1 : sniff ();break;
		case 2 : bark();break;
		case 3 : System.out.println("프로그램 종료합니다.");break;	
		default : exit = true;
	}
		
		
	}
	
	public void sniff () {
		
		System.out.println(name + "킁킁");
		
	}
	
	public void bark() {
		
		if(weight > 15) {
		System.out.println(name + " 짖습니다.");
		weight -= 5;
		System.out.println(weight + "몸무게입니다.");
		}else {
			System.out.println("너나 짓어라~");
		}
	}
	
	
	
	
}//class
