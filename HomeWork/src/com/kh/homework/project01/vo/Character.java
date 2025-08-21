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
	

	//���� ����
	public void start() {
		
		level = 1;
		expToLevelUp = level * 20;
		
		makeCharacter( );
		
		startAdventure();
				
	}
	
	
	
	private void makeCharacter( ) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Game Start!");
		System.out.println("�ɸ��͸� �����ϼ���");
		System.out.print(" �ɸ��� �̸� > ");
		name = sc.nextLine();
		System.out.print(" ������ �Է��ϼ��� > �ΰ� , ���� , ��ũ > "  );
		race = sc.nextLine();
		System.out.print(" ������ �Է��ϼ��� > ���� , ������ , ���� , �ü� > ");
		job = sc.nextLine();
		level = 1 ;
		staut = new int[]{10, 2, 2, 2, 2}; //ü�� , ��, ��ø, ���� , ��
		
		printCharacterInfo();
			
	}
	
	// �ɸ��� ����â
	private void printCharacterInfo() {
		
	    System.out.println("===== ĳ���� ���� =====");
	    System.out.println("�̸�: " + name);
	    System.out.println("����: " + race);
	    System.out.println("����: " + job);
	    System.out.println("����: " + level + " exp = " + exp+ "/"+ expToLevelUp);
	    System.out.print("����: ");
	    for (int s : staut) {
	        System.out.print(s + " ");
	    }
	
	}
	
	//�������
	private void startAdventure() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==== �ൿ�� �����ϼ��� ====");
			System.out.println("1. �����̱�");
			System.out.println("2. �޽��ϱ�");
			System.out.println("3. �ɸ��� ����Ȯ��");
			System.out.println("4. ��������");
			System.out.print("���� > ");
			
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
			case 4 : System.out.println(">> ������ �����մϴ�");
			 	break;
			default : System.out.println(">> �߸��� �Է��Դϴ�.");
			}
			
		}
		
		
	}
	
	//�̵�����
	private void move() {
		
		int index = (int)(Math.random()*100) + 1;
		System.out.println("\n �̵� ��...");
		
		if(index < 40) {
			System.out.println("\n>> �ƹ��ϵ� ������");
		}else if (index < 90) {
			System.out.println(">> ���͸� �����ߴ�!");
			encounterMonster();
		}else {
			System.out.println(">> ������ �߰��߽��ϴ�.");
		}
		 
		
	}
	
	//�޽�
	private void rest() {
		
		System.out.println("\n>> �޽��� ���մϴ�...");
		if( staut[0] < 10 * level) {
			staut[0] += 5;}
		if ( staut[0] > 10 * level) {
			staut[0] = 10* level ;
		}
		
		 System.out.println(">> ü���� ȸ���Ǿ����ϴ�. \n ���� ü��: " + staut[0]);
	}
	
	//�̵��� ���� ����
	private void encounterMonster() {
		
		int index = (int)(Math.random()*100) + 1;
		
		String[] enemyNames = {"������" , "���", "����" };
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

	    System.out.println("\n>> " + enemyName + "�� �����߽��ϴ�!");
		
		fight(enemyName,enemyHp, enemyDamage);
	}
	
	private void fight(String enemyName,int enemyHp, int enemyDamage) {
		
		Scanner sc = new Scanner (System.in);
		
		   while (true) {
		        System.out.println("\n==== ���� ���� ====");
		        System.out.println("1. �����ϱ�");
		        System.out.println("2. ����ġ��");
		        System.out.print("���� > ");
		        int choice = sc.nextInt();
		        
		        //������ ����
		        int myDamage = 0;

		        if (job.equals("����")) {
		            myDamage = 5 + staut[1]; // ��
		        } else if (job.equals("������")) {
		            myDamage = 5 + staut[3]; // ����
		        } else if ( job.equals("����")) {
		            myDamage = 5 + staut[4]; // ��
		        } else if ( job.equals("�ü�")) {
		            myDamage = 5 + staut[2]; // ��ø
		        }
		        
		        // ���ݽ�
		        if (choice == 1) {

		            enemyHp -= myDamage;
		            System.out.println(">>" + enemyName + "���� " + myDamage + "�� ���ظ� �������ϴ�.");

		            if (enemyHp <= 0) {
		                System.out.println(">> " + enemyName + "��(��) óġ�߽��ϴ�!");
		                gainExp(10); // ����ġ �߰�
		                break;
		            }

		            // ���� �ݰ�
		            staut[0] -= enemyDamage;
		            System.out.println(">> " + enemyName + "�� �ݰ��Ͽ� ��ſ��� " + enemyDamage + "�� ���ظ� �������ϴ�.");
		            System.out.println("���� ü��: " + staut[0]);

		            if (staut[0] <= 0) {
		                System.out.println(">> ����� ���������ϴ�... ���� ����!");
		                System.exit(0);
		            }
		            //��������
		        } else if (choice == 2) {
		            System.out.println(">> �����ƽ��ϴ�!");
		            break;
		        } else {
		            System.out.println("�߸��� �Է��Դϴ�.");
		        }
		    }
		}
	
	private void gainExp(int gained) {
	    exp += gained;
	    System.out.println(">> ����ġ +" + gained + " (���� ����ġ: " + exp + "/" + expToLevelUp + ")");

	    if (exp >= expToLevelUp) {
	        levelUp();
	        exp = 0;
	        expToLevelUp += 10;
	    }
	}
	
	private void levelUp() {
	    level++;
	    System.out.println("\n>> ������! ���� ����: " + level);

	    switch (job) {
	    
	        case "1": case "����":
	            staut[1] += 3; 
	            break;
	        case "2": case "������":
	            staut[3] += 3; 
	            break;
	        case "3": case "����":
	            staut[4] += 3; 
	            break;
	        case "4": case "�ü�":
	            staut[2] += 3; 
	            break;
	    }

	    // ü���� ��� ���� �������� ����
	    staut[0] += 10* level;

	    System.out.println(">> ������ �����߽��ϴ�!");
	    printCharacterInfo();
	}
			
		

		
		
	
}//class