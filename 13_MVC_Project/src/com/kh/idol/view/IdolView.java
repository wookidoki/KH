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
        System.out.println("Aespa Ŀ�´�Ƽ");

        while (true) {
            try {
                System.out.println("""
                        ===================
                        1. ������ ��������
                        2. ȸ�� ����
                        3. �α��� 
                        4. �Խ��� ���� 
                        5. ���α׷� ����
                        ===================
                        �޴� ��ȣ �Է� >  
                        """);
                int menuNo = sc.nextInt();
                sc.nextLine();

                switch (menuNo) {
                    case 1 -> info();
                    case 2 -> signUp();
                    case 3 -> login();
                    case 4 -> boardMenu();
                    case 5 -> { 
                        System.out.println("���α׷��� �����մϴ�.");
                        return; 
                    }
                    default -> System.out.println("�߸��� �޴��Դϴ�.");
                }
            } catch (InputMismatchException e) {
                System.out.println("���ڸ� �Է����ּ���.");
                sc.nextLine();
            }
        }
    }

    // 1. ������ ����
    private void info() {
        System.out.println("""
                ---- ������ ���� ----
                1. ī����
                2. ����
                3. ����
                4. �״�
                5. ��ü
                6. ���θ޴�
                �޴� ��ȣ �Է� >
                """);
        int menuNo = sc.nextInt();
        sc.nextLine();

        switch (menuNo) {
            case 1,2,3,4 -> showMember(menuNo);
            case 5 -> showAll();
            case 6 -> {}
            default -> System.out.println("�߸��� �Է��Դϴ�.");
        }
    }

    private void showMember(int menuNo) {
        Idol m = ic.findMember(menuNo);
        if(m == null) {
            System.out.println("�ش� ��� ����.");
        } else {
            System.out.println("�̸�: " + m.getName());
            System.out.println("������: " + m.getPosition());
            System.out.println("Ư��: " + m.getSkill());
        }
    }

    private void showAll() {
        List<Idol> list = ic.findAll();
        for(Idol i : list) {
            System.out.println("�̸�: " + i.getName());
            System.out.println("������: " + i.getPosition());
            System.out.println("Ư��: " + i.getSkill());
            System.out.println("----------------");
        }
    }

    // 2. ȸ������
    private void signUp() {
        System.out.println("ȸ������");
        System.out.print("���̵� �Է� > ");
        String userId = sc.nextLine();

        if(userId.length() < 4 || userId.length() > 10) {
            System.out.println("���̵�� 4~10���ڸ� ����");
            return;
        }

        if(!ic.checkId(userId)) {
            System.out.println("�̹� �����ϴ� ���̵�");
            return;
        }

        System.out.print("��й�ȣ �Է� > ");
        String userPwd = sc.nextLine();
        System.out.print("�г��� �Է� > ");
        String nickName = sc.nextLine();

        if(ic.signUp(userId, userPwd, nickName)) {
            System.out.println("ȸ������ ����!");
        } else {
            System.out.println("ȸ������ ����");
        }
    }

    // 3. �α���
    private void login() {
        System.out.print("���̵� > ");
        String id = sc.nextLine();
        System.out.print("��й�ȣ > ");
        String pw = sc.nextLine();

        Fan f = ic.login(id,pw);
        if(f != null) {
            loginFan = f;
            System.out.println(f.getNickName()+"�� �α��� ����!");
        } else {
            System.out.println("�α��� ����");
        }
    }

    // 4. �Խ���
    private void boardMenu() {
        if(loginFan == null) {
            System.out.println("�α��� �� �̿� ����");
            return;
        }

        while(true) {
            System.out.println("""
                    ---- �Խ��� ----
                    1. �� �ۼ�
                    2. ��ü �� ��ȸ
                    3. �� �� ��ȸ
                    4. ���θ޴�
                    """);
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1 -> writeBoard();
                case 2 -> viewBoards();
                case 3 -> viewBoardDetail();
                case 4 -> { return; }
                default -> System.out.println("�߸��� �޴�");
            }
        }
    }

    private void writeBoard() {
        System.out.print("���� > ");
        String title = sc.nextLine();
        System.out.print("���� > ");
        String content = sc.nextLine();

        int boardNo = ic.getBoards().size() + 1; // �� ��ȣ �ڵ� ����
        String writer = loginFan.getUserId(); // �α����� ȸ���� ���̵� ���
        String createDate = java.time.LocalDate.now().toString(); // ���� ��¥ �ڵ� �Է�

        ic.writeBoard(boardNo, title, content, writer, createDate);
        System.out.println("�� �ۼ� �Ϸ�!");
    }

    private void viewBoards() {
        List<Board> list = ic.getBoards();
        if(list.isEmpty()) {
            System.out.println("�ۼ��� �� ����");
            return;
        }
        for(Board b : list) {
            System.out.println(b.getBoardNo() + ". " + b.getBoardTitle() 
                               + " (" + b.getUserId() + ", " + b.getCreateDate() + ")");
        }
    }

    private void viewBoardDetail() {
        System.out.print("�� ��ȣ �Է� > ");
        int no = sc.nextInt();
        sc.nextLine();
        Board b = ic.getBoardByNo(no);
        if(b == null) {
            System.out.println("�������� �ʴ� ��");
        } else {
            System.out.println("����: " + b.getBoardTitle());
            System.out.println("�ۼ���: " + b.getUserId());
            System.out.println("�ۼ���: " + b.getCreateDate());
            System.out.println("����: " + b.getBoardContent());
        }
    }
}
