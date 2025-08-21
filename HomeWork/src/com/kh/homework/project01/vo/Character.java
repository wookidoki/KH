package com.kh.homework.project01.vo;

import java.util.Scanner;

//VO
public class Character {

	
	private String name;
	private String job;
	private String race; 
	private int level;
	private int[] staut;
	private int exp;
	
	private int expToLevelUp;
	
	public String setName() {
		return name;
	}
	public String setJob() {
		return job;
	}
	public String setRace() {
		return race;
	}
	public int setLevel() {
		return level;
	}
	public int[] staut() {
		return staut;
	}
	

	//게임 시작
	public void start() {
		
		level = 1;
		expToLevelUp = level * 20;
		
		makeCharacter( );
		
		startAdventure();
				
	}
	
	
	
	private void makeCharacter( ) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Game Start!");
		System.out.println("케릭터를 생성하세요");
		System.out.print(" 케릭터 이름 > ");
		name = sc.nextLine();
		System.out.print(" 종족을 입력하세요 > 인간 , 엘프 , 오크 > "  );
		race = sc.nextLine();
		System.out.print(" 직업을 입력하세요 > 전사 , 마법사 , 도적 , 궁수 > ");
		job = sc.nextLine();
		level = 1 ;
		staut = new int[]{10, 2, 2, 2, 2}; //체력 , 힘, 민첩, 지능 , 운
		
		printCharacterInfo();
			
	}
	
	// 케릭터 정보창
	private void printCharacterInfo() {
		
	    System.out.println("===== 캐릭터 정보 =====");
	    System.out.println("이름: " + name);
	    System.out.println("종족: " + race);
	    System.out.println("직업: " + job);
	    System.out.println("레벨: " + level + " exp = " + exp+ "/"+ expToLevelUp);
	    System.out.print("스탯: ");
	    for (int s : staut) {
	        System.out.print(s + " ");
	    }
	
	}
	
	//모험시작
	private void startAdventure() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==== 행동을 선택하세요 ====");
			System.out.println("1. 움직이기");
			System.out.println("2. 휴식하기");
			System.out.println("3. 케릭터 정보확인");
			System.out.println("4. 게임종료");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				move();
				break;
			case 2 :
				rest();
				break;
			case 3 :
				printCharacterInfo();
				break;
			case 4 : System.out.println(">> 게임을 종료합니다");
			 	break;
			default : System.out.println(">> 잘못된 입력입니다.");
			}
			
		}
		
		
	}
	
	//이동시작
	private void move() {
		
		int index = (int)(Math.random()*100) + 1;
		System.out.println("\n 이동 중...");
		
		if(index < 40) {
			System.out.println("\n>> 아무일도 없었다");
		}else if (index < 90) {
			System.out.println(">> 몬스터를 조우했다!");
			encounterMonster();
		}else {
			System.out.println(">> 마을을 발견했습니다.");
		}
		 
		
	}
	
	//휴식
	private void rest() {
		
		System.out.println("\n>> 휴식을 취합니다...");
		if( staut[0] < 10 * level) {
			staut[0] += 5;}
		if ( staut[0] > 10 * level) {
			staut[0] = 10* level ;
		}
		
		 System.out.println(">> 체력이 회복되었습니다. \n 현재 체력: " + staut[0]);
	}
	
	//이동중 몬스터 만남
	private void encounterMonster() {
		
		int index = (int)(Math.random()*100) + 1;
		
		String[] enemyNames = {"슬라임" , "고블린", "산적" };
		int[] enemyHps = { 15 , 30 , 50 };
		int[] enemyDameages = { 2 , 5 , 10 };
		
	    int monsterIndex;
	    if (index < 50) {
	        monsterIndex = 0;
	    } else if (index < 80) {
	        monsterIndex = 1; 
	    } else {
	        monsterIndex = 2;
	    }

	    String enemyName = enemyNames[monsterIndex];
	    int enemyHp = enemyHps[monsterIndex];
	    int enemyDamage = enemyDameages[monsterIndex];

	    System.out.println("\n>> " + enemyName + "을 조우했습니다!");
		
		fight(enemyName,enemyHp, enemyDamage);
	}
	
	private void fight(String enemyName,int enemyHp, int enemyDamage) {
		
		Scanner sc = new Scanner (System.in);
		
		   while (true) {
		        System.out.println("\n==== 전투 선택 ====");
		        System.out.println("1. 공격하기");
		        System.out.println("2. 도망치기");
		        System.out.print("선택 > ");
		        int choice = sc.nextInt();
		        
		        //데미지 세팅
		        int myDamage = 0;

		        if (job.equals("전사")) {
		            myDamage = 5 + staut[1]; // 힘
		        } else if (job.equals("마법사")) {
		            myDamage = 5 + staut[3]; // 지능
		        } else if ( job.equals("도적")) {
		            myDamage = 5 + staut[4]; // 운
		        } else if ( job.equals("궁수")) {
		            myDamage = 5 + staut[2]; // 민첩
		        }
		        
		        // 공격시
		        if (choice == 1) {

		            enemyHp -= myDamage;
		            System.out.println(">>" + enemyName + "에게 " + myDamage + "의 피해를 입혔습니다.");

		            if (enemyHp <= 0) {
		                System.out.println(">> " + enemyName + "을(를) 처치했습니다!");
		                gainExp(10); // 경험치 추가
		                break;
		            }

		            // 몬스터 반격
		            staut[0] -= enemyDamage;
		            System.out.println(">> " + enemyName + "이 반격하여 당신에게 " + enemyDamage + "의 피해를 입혔습니다.");
		            System.out.println("현재 체력: " + staut[0]);

		            if (staut[0] <= 0) {
		                System.out.println(">> 당신은 쓰러졌습니다... 게임 오버!");
		                System.exit(0);
		            }
		            //도망가기
		        } else if (choice == 2) {
		            System.out.println(">> 도망쳤습니다!");
		            break;
		        } else {
		            System.out.println("잘못된 입력입니다.");
		        }
		    }
		}
	
	private void gainExp(int gained) {
	    exp += gained;
	    System.out.println(">> 경험치 +" + gained + " (현재 경험치: " + exp + "/" + expToLevelUp + ")");

	    if (exp >= expToLevelUp) {
	        levelUp();
	        exp = 0;
	        expToLevelUp += 10;
	    }
	}
	
	private void levelUp() {
	    level++;
	    System.out.println("\n>> 레벨업! 현재 레벨: " + level);

	    switch (job) {
	    
	        case "1": case "전사":
	            staut[1] += 3; 
	            break;
	        case "2": case "마법사":
	            staut[3] += 3; 
	            break;
	        case "3": case "도적":
	            staut[4] += 3; 
	            break;
	        case "4": case "궁수":
	            staut[2] += 3; 
	            break;
	    }

	    // 체력은 모든 직업 공통으로 증가
	    staut[0] += 10* level;

	    System.out.println(">> 스탯이 증가했습니다!");
	    printCharacterInfo();
	}
			
		

		
		
	
}//class