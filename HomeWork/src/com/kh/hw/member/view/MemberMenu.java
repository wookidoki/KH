package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	
	// 메인메뉴 출력
	public void mainMenu() {
		
		System.out.println("최대 등록 가능한 회원 수는" + mc.SIZE + "명입니다");
		System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다");
		
		while(true) {
		if(mc.existMemberNum() < 10) {
			System.out.println("1. 새회원 등록" +
							   "\n2. 회원 검색" + 
							   "\n3. 회원 정보 수정" +
							   "\n4. 회원 삭제" +
							   "\n5. 모두 출력" +
							   "\n9. 끝내기" );
			}else if(mc.existMemberNum() == 10) { 
			System.out.println(
							   "\n2. 회원 검색" + 
							   "\n3. 회원 정보 수정" +
							   "\n4. 회원 삭제" +
							   "\n5. 모두 출력" +
							   "\n9. 끝내기" );
			}
		int userInput = sc.nextInt();
		sc.nextLine();
		
		switch (userInput) {
		case 1 : insertMember();break;  //새회원 등록
		case 2 : searchMember();break;  //회원 검색
		case 3 : updateMember(); break; //회원 정보 수정
		case 4 : deleteMember();break;  //회원 삭제
		case 5 : printAll();break;  	 //모두 출력
		case 9 : System.out.println("프로그램을 종료합니다"); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
	}
	
	//새회원 등록 
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("이름 >>");
		String name = sc.nextLine();
		
		while(true) {
		System.out.print("아이디 >>");
		String id = sc.nextLine();
		if (mc.checkId(id) == true) {
			System.out.println("이미 회원가입된 아이디입니다.");
			
			System.out.print("비밀번호 >>");
			String password = sc.nextLine();
			
			System.out.print("이메일 >>");
			String email = sc.nextLine();
			
			System.out.print("성별 >>");
			String gender = sc.nextLine();
			
			System.out.print("나이 >>");
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
