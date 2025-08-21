package com.kh.idol.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.mode.vo.Idol;

public class IdolView {

	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();

	// 생성자부

	// 메소드부

	public void mainMenu() {
	    System.out.println("Aespa");

	    while (true) {
	        try {
	            System.out.println("""
	                    이용하실 서비스를 선택해주세요
	                    1. 에스파 정보보기
	                    2. 회원 가입
	                    3. 로그인 
	                    4. 게시판 서비스 
	                    5. 프로그램 종료
	                    메뉴 번호 입력 >  
	                    """);
	            int menuNo = sc.nextInt();
	            sc.nextLine(); // 버퍼 비우기

	            switch (menuNo) {
	                case 1 -> info();
	                case 2 -> signUp();
	                case 3 -> System.out.println("로그인 기능은 준비 중입니다.");
	                case 4 -> System.out.println("게시판 기능은 준비 중입니다.");
	                case 5 -> {
	                    System.out.println("프로그램을 종료합니다.");
	                    return; // while 루프 탈출
	                }
	                default -> System.out.println("잘못된 메뉴를 선택하셨습니다.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("숫자를 입력해주세요.");
	            sc.nextLine(); // 잘못된 입력 제거
	        } catch (Exception e) {
	            System.out.println("알 수 없는 오류 발생: " + e.getMessage());
	        }
	    }
	}

	// 1. 에스파 정보보기 서비스
	private void info() {
	    try {
	        System.out.println(""" 
	                정보 보기 
	                1. 카리나의 정보보기 
	                2. 지젤의 정보보기
	                3. 윈터의 정보보기
	                4. 닝닝의 정보보기
	                5. 에스파 전체 정보보기
	                6. 메인메뉴로 돌아가기
	                메뉴 번호 입력 >  
	                """);
	        int menuNo = sc.nextInt();
	        sc.nextLine();

	        switch (menuNo) {
	            case 1, 2, 3, 4 -> showMember(menuNo);
	            case 5 -> showAll();
	            case 6 -> {}
	            default -> System.out.println("잘못된 메뉴를 선택하셨습니다.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("숫자를 입력해주세요.");
	        sc.nextLine();
	    } catch (Exception e) {
	        System.out.println("에스파 정보 보기 중 오류 발생: " + e.getMessage());
	    }
	}

	private void showMember(int menuNo) {
	    try {
	        Idol member = ic.findMember(menuNo);
	        if (member == null) {
	            System.out.println("해당 번호의 멤버가 없습니다.");
	        } else {
	            System.out.println("이름 : " + member.getName());
	            System.out.println("포지션 : " + member.getPosition());
	            System.out.println("특기 : " + member.getSkill());
	            System.out.println();
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.out.println("존재하지 않는 인덱스 접근입니다.");
	    } catch (Exception e) {
	        System.out.println("멤버 조회 중 오류 발생: " + e.getMessage());
	    }
	}

	private void showAll() {
	    try {
	        List<Idol> aespa = ic.findAll();
	        if (aespa == null || aespa.isEmpty()) {
	            System.out.println("멤버가 없습니다.");
	        } else {
	            for (Idol i : aespa) {
	                System.out.println("이름 : " + i.getName());
	                System.out.println("포지션 : " + i.getPosition());
	                System.out.println("특기 : " + i.getSkill());
	                System.out.println();
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("전체 멤버 조회 중 오류 발생: " + e.getMessage());
	    }
	}
	
	private void signUp() {
	    String userId;
	    String userPwd;
	    String nickName;

	    System.out.println("에스파 커뮤니티에 오신것을 환영합니다");
	    System.out.println("\n회원가입 서비스");

	    while (true) {
	        try {
	            System.out.println("아이디는 4글자에서 10글자 사이로 입력해주세요");
	            System.out.print("아이디 만들기 > ");
	            userId = sc.nextLine();

	            if (userId.length() < 4 || userId.length() > 10) {
	                System.out.println("아이디는 4글자에서 10글자 사이로 입력해주세요!!");
	                continue;
	            }

	            if (!ic.checkId(userId)) {
	                System.out.println("이미 존재하고 있는 아이디입니다.");
	                continue; // 다시 입력받기
	            } else {
	                System.out.println("사용 가능한 아이디입니다.");
	            }

	            System.out.print("비밀번호 만들기 > ");
	            userPwd = sc.nextLine();

	            System.out.print("닉네임 입력  > ");
	            nickName = sc.nextLine();

	            boolean result = ic.signUp(userId, userPwd, nickName);

	            if(result) {
	                System.out.println("회원가입 축하드립니다.");
	            } else {
	                System.out.println("회원가입 실패 (아이디 중복)");
	            }
	            break; // 회원가입 종료 후 while 탈출

	        } catch (Exception e) {
	            System.out.println("입력 처리 중 오류 발생: " + e.getMessage());
	        }
	    }
	}
}
