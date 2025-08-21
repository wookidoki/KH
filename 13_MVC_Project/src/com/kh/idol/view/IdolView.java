package com.kh.idol.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.mode.vo.Board;
import com.kh.idol.mode.vo.Fan;
import com.kh.idol.mode.vo.Idol;

public class IdolView {

    private Scanner sc = new Scanner(System.in);
    private IdolController ic = new IdolController();
    private Fan loginFan;

    public void mainMenu() {
        System.out.println("Aespa 커뮤니티");

        while (true) {
            try {
                System.out.println("""
                        ===================
                        1. 에스파 정보보기
                        2. 회원 가입
                        3. 로그인 
                        4. 게시판 서비스 
                        5. 프로그램 종료
                        ===================
                        메뉴 번호 입력 >  
                        """);
                int menuNo = sc.nextInt();
                sc.nextLine();

                switch (menuNo) {
                    case 1 -> info();
                    case 2 -> signUp();
                    case 3 -> login();
                    case 4 -> boardMenu();
                    case 5 -> { 
                        System.out.println("프로그램을 종료합니다.");
                        return; 
                    }
                    default -> System.out.println("잘못된 메뉴입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                sc.nextLine();
            }
        }
    }

    // 1. 에스파 정보
    private void info() {
        System.out.println("""
                ---- 에스파 정보 ----
                1. 카리나
                2. 지젤
                3. 윈터
                4. 닝닝
                5. 전체
                6. 메인메뉴
                메뉴 번호 입력 >
                """);
        int menuNo = sc.nextInt();
        sc.nextLine();

        switch (menuNo) {
            case 1,2,3,4 -> showMember(menuNo);
            case 5 -> showAll();
            case 6 -> {}
            default -> System.out.println("잘못된 입력입니다.");
        }
    }

    private void showMember(int menuNo) {
        Idol m = ic.findMember(menuNo);
        if(m == null) {
            System.out.println("해당 멤버 없음.");
        } else {
            System.out.println("이름: " + m.getName());
            System.out.println("포지션: " + m.getPosition());
            System.out.println("특기: " + m.getSkill());
        }
    }

    private void showAll() {
        List<Idol> list = ic.findAll();
        for(Idol i : list) {
            System.out.println("이름: " + i.getName());
            System.out.println("포지션: " + i.getPosition());
            System.out.println("특기: " + i.getSkill());
            System.out.println("----------------");
        }
    }

    // 2. 회원가입
    private void signUp() {
        System.out.println("회원가입");
        System.out.print("아이디 입력 > ");
        String userId = sc.nextLine();

        if(userId.length() < 4 || userId.length() > 10) {
            System.out.println("아이디는 4~10글자만 가능");
            return;
        }

        if(!ic.checkId(userId)) {
            System.out.println("이미 존재하는 아이디");
            return;
        }

        System.out.print("비밀번호 입력 > ");
        String userPwd = sc.nextLine();
        System.out.print("닉네임 입력 > ");
        String nickName = sc.nextLine();

        if(ic.signUp(userId, userPwd, nickName)) {
            System.out.println("회원가입 성공!");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    // 3. 로그인
    private void login() {
        System.out.print("아이디 > ");
        String id = sc.nextLine();
        System.out.print("비밀번호 > ");
        String pw = sc.nextLine();

        Fan f = ic.login(id,pw);
        if(f != null) {
            loginFan = f;
            System.out.println(f.getNickName()+"님 로그인 성공!");
        } else {
            System.out.println("로그인 실패");
        }
    }

    // 4. 게시판
    private void boardMenu() {
        if(loginFan == null) {
            System.out.println("로그인 후 이용 가능");
            return;
        }

        while(true) {
            System.out.println("""
                    ---- 게시판 ----
                    1. 글 작성
                    2. 전체 글 조회
                    3. 글 상세 조회
                    4. 메인메뉴
                    """);
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1 -> writeBoard();
                case 2 -> viewBoards();
                case 3 -> viewBoardDetail();
                case 4 -> { return; }
                default -> System.out.println("잘못된 메뉴");
            }
        }
    }

    private void writeBoard() {
        System.out.print("제목 > ");
        String title = sc.nextLine();
        System.out.print("내용 > ");
        String content = sc.nextLine();

        int boardNo = ic.getBoards().size() + 1; // 글 번호 자동 증가
        String writer = loginFan.getUserId(); // 로그인한 회원의 아이디 사용
        String createDate = java.time.LocalDate.now().toString(); // 오늘 날짜 자동 입력

        ic.writeBoard(boardNo, title, content, writer, createDate);
        System.out.println("글 작성 완료!");
    }

    private void viewBoards() {
        List<Board> list = ic.getBoards();
        if(list.isEmpty()) {
            System.out.println("작성된 글 없음");
            return;
        }
        for(Board b : list) {
            System.out.println(b.getBoardNo() + ". " + b.getBoardTitle() 
                               + " (" + b.getUserId() + ", " + b.getCreateDate() + ")");
        }
    }

    private void viewBoardDetail() {
        System.out.print("글 번호 입력 > ");
        int no = sc.nextInt();
        sc.nextLine();
        Board b = ic.getBoardByNo(no);
        if(b == null) {
            System.out.println("존재하지 않는 글");
        } else {
            System.out.println("제목: " + b.getBoardTitle());
            System.out.println("작성자: " + b.getUserId());
            System.out.println("작성일: " + b.getCreateDate());
            System.out.println("내용: " + b.getBoardContent());
        }
    }
}
