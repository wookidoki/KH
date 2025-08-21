package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlanController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 담당 , 화면 입/출력
public class PlanView {
	private Scanner sc = new Scanner(System.in);
	private PlanController pc = new PlanController();
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("식물관리 프로그램입니다.");
			//CRUD
			/*
			 * Create : 사용자에게 입력받은 값을 가지고 새로운 식물을 추가
			 * Read   : 만들어진 식물을 조회하는 작업
			 * Update : 기존의 식물을 수정하는 작업
			 * Delete : 기존의 식물을 삭제하는 작업
			 */
			System.out.println("1. 식물 추가");
			System.out.println("2. 식물 조회");
			System.out.println("3. 특정 식물 검색");
			System.out.println("4. 특정 식물 삭제");
			System.out.println("5. 특정 식물 수정");
			System.out.println("6. 식물 목록 파일로 저장");
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("기능선택 > ");
			
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
				case 0: System.out.println("프로그램을 종료합니다.");return; 
				default : System.out.println("없는 메뉴입니다");
			}
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine();
			}
		}
	}


	//1. 새롭게 식물을 추가할수있는 화면을 보여주는 메소드
	private void creatPlant() {
		System.out.println("● 식물 추가하기");
		System.out.println();
		System.out.println("식물명 입력하세요 > ");
		String name = sc.nextLine();
		System.out.println("식물 종류를 입력하세요 > ");
		String type = sc.nextLine();
		
		pc.createPlant(name, type);
	}
	
	//2. 식물을 조회할수있는 메소드
	private void readAll() {
		System.out.println("● 전체 식물목록");
		List<Plant> plants = pc.readAll();
		
		if(plants.isEmpty()) {
			System.out.println("식물이 존재하지 않습니다.");
		}else {
			 for (Plant p : plants) {
			System.out.println("식물이름 : " + p.getName() + ", 식물종류 : " + p.getType());
			System.out.println("====================================================");
		}
		
	 }
	}
	
	//3. 식물을 검색할수있는 메소드
	private void findByKeword() {
		System.out.println("● 식물 조회하기");
		System.out.print("키워드 입력 > ");
		String keyword = sc.nextLine();
		
		List<Plant> searched = pc.findByKeword(keyword);
		
		//searched.size() == 0
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			System.out.println("검색 결과가 총 " + searched.size() + "곤 존재합니다");
		}
		
		for( Plant s: searched ) {
			System.out.println(searched);
		}
		
	}

	
	//4. 식물을 삭제할수있는 메소드 
	private void deletPlant() {
		System.out.println("● 식물 삭제하기");
		System.out.print("삭제할 식물의 이름을 입력 > ");
		String name = sc.nextLine();
		System.out.print("삭제할 식물의 종류를 입력 > ");
		String type = sc.nextLine();
		
		int count = pc.deletPlant(name, type);
		
		if( count > 0) {
			System.out.println("삭제 성공!");
			System.out.println(name + "을(를)" + count + "개 삭제했습니다");
		} else {
			System.out.println("삭제할 식물을 찾지 못했습니다.");
		}
		
		System.out.println();
	}
	
	//5. 식물을 업데이트 할 수 있는 메소드
	private void updatePlant() {
		System.out.println("● 식물 수정하기");
		
		System.out.print("기존 식물의 이름을 입력 > ");
		String name = sc.nextLine();
		System.out.print("기존 식물의 종류를 입력 > ");
		String type = sc.nextLine();
		
		System.out.print(" 식물 이름 수정> ");
		String newName = sc.nextLine();
		System.out.print("식물 종류 수정 > ");
		String newType = sc.nextLine();
		
		boolean result = pc.updatePlant(name, type, newName, newType);
		
		if(result) {
			System.out.println("식물 정보 갱신 성공");
		}else {
			System.out.println("식물이 존재하지 않습니다.");
		}
		
		
	}
	
	//6
	private void outputFile() {
        System.out.println("● 파일로 저장합니다...");
        pc.outputFile();
		
	}

}

