package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlanController;
import com.kh.plant.model.vo.Plant;

// View : �ð����� �κ� ��� , ȭ�� ��/���
public class PlanView {
	private Scanner sc = new Scanner(System.in);
	private PlanController pc = new PlanController();
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("�Ĺ����� ���α׷��Դϴ�.");
			//CRUD
			/*
			 * Create : ����ڿ��� �Է¹��� ���� ������ ���ο� �Ĺ��� �߰�
			 * Read   : ������� �Ĺ��� ��ȸ�ϴ� �۾�
			 * Update : ������ �Ĺ��� �����ϴ� �۾�
			 * Delete : ������ �Ĺ��� �����ϴ� �۾�
			 */
			System.out.println("1. �Ĺ� �߰�");
			System.out.println("2. �Ĺ� ��ȸ");
			System.out.println("3. Ư�� �Ĺ� �˻�");
			System.out.println("4. Ư�� �Ĺ� ����");
			System.out.println("5. Ư�� �Ĺ� ����");
			System.out.println("6. �Ĺ� ��� ���Ϸ� ����");
			System.out.println("0. ���α׷� ����");
			System.out.println();
			System.out.print("��ɼ��� > ");
			
			try {
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
				case 1:creatPlant();break;
				case 2:readAll();break;
				case 3:findByKeword();break;
				case 4:deletPlant();break;
				case 5:updatePlant();break;
				case 6:outputFile();break;
				case 0: System.out.println("���α׷��� �����մϴ�.");return; 
				default : System.out.println("���� �޴��Դϴ�");
			}
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���");
				sc.nextLine();
			}
		}
	}


	//1. ���Ӱ� �Ĺ��� �߰��Ҽ��ִ� ȭ���� �����ִ� �޼ҵ�
	private void creatPlant() {
		System.out.println("�� �Ĺ� �߰��ϱ�");
		System.out.println();
		System.out.println("�Ĺ��� �Է��ϼ��� > ");
		String name = sc.nextLine();
		System.out.println("�Ĺ� ������ �Է��ϼ��� > ");
		String type = sc.nextLine();
		
		pc.createPlant(name, type);
	}
	
	//2. �Ĺ��� ��ȸ�Ҽ��ִ� �޼ҵ�
	private void readAll() {
		System.out.println("�� ��ü �Ĺ����");
		List<Plant> plants = pc.readAll();
		
		if(plants.isEmpty()) {
			System.out.println("�Ĺ��� �������� �ʽ��ϴ�.");
		}else {
			 for (Plant p : plants) {
			System.out.println("�Ĺ��̸� : " + p.getName() + ", �Ĺ����� : " + p.getType());
			System.out.println("====================================================");
		}
		
	 }
	}
	
	//3. �Ĺ��� �˻��Ҽ��ִ� �޼ҵ�
	private void findByKeword() {
		System.out.println("�� �Ĺ� ��ȸ�ϱ�");
		System.out.print("Ű���� �Է� > ");
		String keyword = sc.nextLine();
		
		List<Plant> searched = pc.findByKeword(keyword);
		
		//searched.size() == 0
		if(searched.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�˻� ����� �� " + searched.size() + "�� �����մϴ�");
		}
		
		for( Plant s: searched ) {
			System.out.println(searched);
		}
		
	}

	
	//4. �Ĺ��� �����Ҽ��ִ� �޼ҵ� 
	private void deletPlant() {
		System.out.println("�� �Ĺ� �����ϱ�");
		System.out.print("������ �Ĺ��� �̸��� �Է� > ");
		String name = sc.nextLine();
		System.out.print("������ �Ĺ��� ������ �Է� > ");
		String type = sc.nextLine();
		
		int count = pc.deletPlant(name, type);
		
		if( count > 0) {
			System.out.println("���� ����!");
			System.out.println(name + "��(��)" + count + "�� �����߽��ϴ�");
		} else {
			System.out.println("������ �Ĺ��� ã�� ���߽��ϴ�.");
		}
		
		System.out.println();
	}
	
	//5. �Ĺ��� ������Ʈ �� �� �ִ� �޼ҵ�
	private void updatePlant() {
		System.out.println("�� �Ĺ� �����ϱ�");
		
		System.out.print("���� �Ĺ��� �̸��� �Է� > ");
		String name = sc.nextLine();
		System.out.print("���� �Ĺ��� ������ �Է� > ");
		String type = sc.nextLine();
		
		System.out.print(" �Ĺ� �̸� ����> ");
		String newName = sc.nextLine();
		System.out.print("�Ĺ� ���� ���� > ");
		String newType = sc.nextLine();
		
		boolean result = pc.updatePlant(name, type, newName, newType);
		
		if(result) {
			System.out.println("�Ĺ� ���� ���� ����");
		}else {
			System.out.println("�Ĺ��� �������� �ʽ��ϴ�.");
		}
		
		
	}
	
	//6
	private void outputFile() {
        System.out.println("�� ���Ϸ� �����մϴ�...");
        pc.outputFile();
		
	}

}

