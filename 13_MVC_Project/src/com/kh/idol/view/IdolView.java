package com.kh.idol.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.mode.vo.Idol;

public class IdolView {

	// �ʵ��
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();

	// �����ں�

	// �޼ҵ��

	public void mainMenu() {
	    System.out.println("Aespa");

	    while (true) {
	        try {
	            System.out.println("""
	                    �̿��Ͻ� ���񽺸� �������ּ���
	                    1. ������ ��������
	                    2. ȸ�� ����
	                    3. �α��� 
	                    4. �Խ��� ���� 
	                    5. ���α׷� ����
	                    �޴� ��ȣ �Է� >  
	                    """);
	            int menuNo = sc.nextInt();
	            sc.nextLine(); // ���� ����

	            switch (menuNo) {
	                case 1 -> info();
	                case 2 -> signUp();
	                case 3 -> System.out.println("�α��� ����� �غ� ���Դϴ�.");
	                case 4 -> System.out.println("�Խ��� ����� �غ� ���Դϴ�.");
	                case 5 -> {
	                    System.out.println("���α׷��� �����մϴ�.");
	                    return; // while ���� Ż��
	                }
	                default -> System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("���ڸ� �Է����ּ���.");
	            sc.nextLine(); // �߸��� �Է� ����
	        } catch (Exception e) {
	            System.out.println("�� �� ���� ���� �߻�: " + e.getMessage());
	        }
	    }
	}

	// 1. ������ �������� ����
	private void info() {
	    try {
	        System.out.println(""" 
	                ���� ���� 
	                1. ī������ �������� 
	                2. ������ ��������
	                3. ������ ��������
	                4. �״��� ��������
	                5. ������ ��ü ��������
	                6. ���θ޴��� ���ư���
	                �޴� ��ȣ �Է� >  
	                """);
	        int menuNo = sc.nextInt();
	        sc.nextLine();

	        switch (menuNo) {
	            case 1, 2, 3, 4 -> showMember(menuNo);
	            case 5 -> showAll();
	            case 6 -> {}
	            default -> System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("���ڸ� �Է����ּ���.");
	        sc.nextLine();
	    } catch (Exception e) {
	        System.out.println("������ ���� ���� �� ���� �߻�: " + e.getMessage());
	    }
	}

	private void showMember(int menuNo) {
	    try {
	        Idol member = ic.findMember(menuNo);
	        if (member == null) {
	            System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
	        } else {
	            System.out.println("�̸� : " + member.getName());
	            System.out.println("������ : " + member.getPosition());
	            System.out.println("Ư�� : " + member.getSkill());
	            System.out.println();
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.out.println("�������� �ʴ� �ε��� �����Դϴ�.");
	    } catch (Exception e) {
	        System.out.println("��� ��ȸ �� ���� �߻�: " + e.getMessage());
	    }
	}

	private void showAll() {
	    try {
	        List<Idol> aespa = ic.findAll();
	        if (aespa == null || aespa.isEmpty()) {
	            System.out.println("����� �����ϴ�.");
	        } else {
	            for (Idol i : aespa) {
	                System.out.println("�̸� : " + i.getName());
	                System.out.println("������ : " + i.getPosition());
	                System.out.println("Ư�� : " + i.getSkill());
	                System.out.println();
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("��ü ��� ��ȸ �� ���� �߻�: " + e.getMessage());
	    }
	}
	
	private void signUp() {
	    String userId;
	    String userPwd;
	    String nickName;

	    System.out.println("������ Ŀ�´�Ƽ�� ���Ű��� ȯ���մϴ�");
	    System.out.println("\nȸ������ ����");

	    while (true) {
	        try {
	            System.out.println("���̵�� 4���ڿ��� 10���� ���̷� �Է����ּ���");
	            System.out.print("���̵� ����� > ");
	            userId = sc.nextLine();

	            if (userId.length() < 4 || userId.length() > 10) {
	                System.out.println("���̵�� 4���ڿ��� 10���� ���̷� �Է����ּ���!!");
	                continue;
	            }

	            if (!ic.checkId(userId)) {
	                System.out.println("�̹� �����ϰ� �ִ� ���̵��Դϴ�.");
	                continue; // �ٽ� �Է¹ޱ�
	            } else {
	                System.out.println("��� ������ ���̵��Դϴ�.");
	            }

	            System.out.print("��й�ȣ ����� > ");
	            userPwd = sc.nextLine();

	            System.out.print("�г��� �Է�  > ");
	            nickName = sc.nextLine();

	            boolean result = ic.signUp(userId, userPwd, nickName);

	            if(result) {
	                System.out.println("ȸ������ ���ϵ帳�ϴ�.");
	            } else {
	                System.out.println("ȸ������ ���� (���̵� �ߺ�)");
	            }
	            break; // ȸ������ ���� �� while Ż��

	        } catch (Exception e) {
	            System.out.println("�Է� ó�� �� ���� �߻�: " + e.getMessage());
	        }
	    }
	}
}
