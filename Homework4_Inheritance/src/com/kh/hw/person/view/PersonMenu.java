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
			System.out.println(" \n 학생은 최대 3명까지 저장할수있습니다");
			System.out.println("현재 저장된 학생은" + counts[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할수있습니다");
			System.out.println(" 저장된 사원은" + counts[1] + "명입니다.");
			System.out.println("\n1. 학생 메뉴 \n2. 사원 메뉴 \n9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: studentMenu();
			case 2: empolyeeMenu();
			case 9: System.out.println("종료합니다.");return;
			default: System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
			}
			
		}
		
	}
	
	public void studentMenu() {
		
		while(true) {
			int count = pc.personCount()[0];
			if(count >= 3) 
			 System.out.println("핵생을 담을 수 있는 공간이 꽉 찾기 때문에 학생 추가메뉴는 더 이상 활성화 되지 않습니다,");
			 System.out.println("\n1. 학생 추가 \n2. 학생 보기 \n9. 메인으로");
			 System.out.print("메뉴 번호 :");
			 int menu = sc.nextInt();
			 sc.nextLine();
			if(count >= 3 && menu ==1) {
		     System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
		     continue;
			}
			
			switch(menu) {
			case 1: insertStudent();
			case 2: printStudent();
			case 9: System.out.println("메인으로 돌아갑니다.");return;
			default: System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
		 }
		}	
	}
	
	public void empolyeeMenu() {
		
		while(true) {
			int count = pc.personCount()[0];
			if(count >= 10) 
			 System.out.println("사원을 담을 수 있는 공간이 꽉 찾기 때문에 사원 추가메뉴는 더 이상 활성화 되지 않습니다,");
			 System.out.println("\n1. 사원 추가 \n2. 사원 보기 \n9. 메인으로");
			 System.out.print("메뉴 번호 :");
			 int menu = sc.nextInt();
			 sc.nextLine();
			if(count >= 10 && menu == 1) {
		     System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
		     continue;
			}
			
			switch(menu) {
			case 1: insertEmployee();
			case 2: printEmployee();
			case 9: System.out.println("메인으로 돌아갑니다.");return;
			default: System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
		 }
		}
	}
	
	
    public void insertStudent() {
    	
        while (pc.personCount()[0] < 3) {
            System.out.print("학생 이름 : "); 
            String name = sc.nextLine();
            System.out.print("학생 나이 : "); 
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("학생 키 : "); 
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("학생 몸무게 : "); 
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("학생 학년 : "); 
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("학생 전공 : "); 
            String major = sc.nextLine();

            pc.insertStudent(name, age, height, weight, grade, major);

            if (pc.personCount()[0] == 3) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;
            }
            System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
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
            System.out.print("사원 이름 : "); 
            String name = sc.nextLine();
            System.out.print("사원 나이 : "); 
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("사원 키 : "); 
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("사원 몸무게 : "); 
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("사원 급여 : "); 
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("사원 부서 : "); 
            String dept = sc.nextLine();

            pc.insertEmployee(name, age, height, weight, salary, dept);

            if (pc.personCount()[1] == 10) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
                return;
            }
            System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
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
