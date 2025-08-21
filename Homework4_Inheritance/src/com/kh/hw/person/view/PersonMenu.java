package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	private Scanner sc  = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
			int[] counts = pc.personCount();
			System.out.println(" \n �л��� �ִ� 3����� �����Ҽ��ֽ��ϴ�");
			System.out.println("���� ����� �л���" + counts[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� �����Ҽ��ֽ��ϴ�");
			System.out.println(" ����� �����" + counts[1] + "���Դϴ�.");
			System.out.println("\n1. �л� �޴� \n2. ��� �޴� \n9. ������");
			System.out.print("�޴� ��ȣ :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: studentMenu();
			case 2: empolyeeMenu();
			case 9: System.out.println("�����մϴ�.");return;
			default: System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			
		}
		
	}
	
	public void studentMenu() {
		
		while(true) {
			int count = pc.personCount()[0];
			if(count >= 3) 
			 System.out.println("�ٻ��� ���� �� �ִ� ������ �� ã�� ������ �л� �߰��޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�,");
			 System.out.println("\n1. �л� �߰� \n2. �л� ���� \n9. ��������");
			 System.out.print("�޴� ��ȣ :");
			 int menu = sc.nextInt();
			 sc.nextLine();
			if(count >= 3 && menu ==1) {
		     System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		     continue;
			}
			
			switch(menu) {
			case 1: insertStudent();
			case 2: printStudent();
			case 9: System.out.println("�������� ���ư��ϴ�.");return;
			default: System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		 }
		}	
	}
	
	public void empolyeeMenu() {
		
		while(true) {
			int count = pc.personCount()[0];
			if(count >= 10) 
			 System.out.println("����� ���� �� �ִ� ������ �� ã�� ������ ��� �߰��޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�,");
			 System.out.println("\n1. ��� �߰� \n2. ��� ���� \n9. ��������");
			 System.out.print("�޴� ��ȣ :");
			 int menu = sc.nextInt();
			 sc.nextLine();
			if(count >= 10 && menu == 1) {
		     System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		     continue;
			}
			
			switch(menu) {
			case 1: insertEmployee();
			case 2: printEmployee();
			case 9: System.out.println("�������� ���ư��ϴ�.");return;
			default: System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		 }
		}
	}
	
	
    public void insertStudent() {
    	
        while (pc.personCount()[0] < 3) {
            System.out.print("�л� �̸� : "); 
            String name = sc.nextLine();
            System.out.print("�л� ���� : "); 
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("�л� Ű : "); 
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("�л� ������ : "); 
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("�л� �г� : "); 
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("�л� ���� : "); 
            String major = sc.nextLine();

            pc.insertStudent(name, age, height, weight, grade, major);

            if (pc.personCount()[0] == 3) {
                System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
                return;
            }
            System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
            String choice = sc.nextLine();
            if (choice.equals("n") || choice.equals("N")) break;
        }
    }

    public void printStudent() {
        for (Student s : pc.printStudent()) {
            if (s != null) System.out.println(s);
        }
    }

    public void insertEmployee() {
        while (pc.personCount()[1] < 10) {
            System.out.print("��� �̸� : "); 
            String name = sc.nextLine();
            System.out.print("��� ���� : "); 
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("��� Ű : "); 
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("��� ������ : "); 
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("��� �޿� : "); 
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("��� �μ� : "); 
            String dept = sc.nextLine();

            pc.insertEmployee(name, age, height, weight, salary, dept);

            if (pc.personCount()[1] == 10) {
                System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�.");
                return;
            }
            System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
            String choice = sc.nextLine();
            if (choice.equals("n") || choice.equals("N")) break;
        }
    }

    public void printEmployee() {
        for (Employee e : pc.printEmployee()) {
            if (e != null) System.out.println(e);
        }
    }

}
