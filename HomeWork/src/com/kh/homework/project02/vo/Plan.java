package com.kh.homework.project02.vo;

import java.util.Scanner;

public class Plan {
	
	/*
	 * 1) 모든 필드의 접근제한자를 private 으로 변경
	 * 2) 필드에 간접적으로 접근할수있도록 getter(), setter() 생성
	 * 3) 모든 필드의 정보를 합쳐서 문자열의 형태로 반환해주는 info()생성
	 * 4) 기본생성자 및 모든 필드를 매개변수로 가지고있는 생성자 생성
	 * 5) 직접접근으로 사용하고 있던 실행 클래스의 코드들을 전부 다 getter setter 대체
	 */
	
	//[필드부]
	
	private String name;
	private String job;
	private int age ;
	private String object;
	private int goal;
	
	//[생성자부]
	
	public Plan() {
		
	}
	
	public Plan(String name, String job,int age,String object,int goal) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.object = object;
		this.goal = goal;
	}
	
	
	//[메소드부]
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setObject(String object) {
		this.object= object;
	}
	public void setGoal(int Goal) {
		this.goal = goal;
	}
	
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public int getAge() {
		return age;
	}
	public String getObject() {
		return object;
	}
	public int getGoal() {
		return goal;
	}
	
	//info
	public String info() {
		return "사용자 정보" + "\n 이름 : " + name
				+ "\n 직업: " + job
				+ "\n 나이: " + age
				+ "\n 목표: " + object
				+ "\n 목표일수: " + goal;
				
	}
	
	//study 시작
	public void start() {

		set();
			
		}
	
	private void set() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("환영합니다 " + name + "님");
		
		while(true) {
		
			System.out.println("오늘도 준비되셨나요? \n> 예, 아니오 > ");
			String set = sc.nextLine();
			
			if(set.equals("예")) {
				System.out.println("오늘도 힘찬 공부 되시길 바랍니다!");
				study();
				break;
		}else if(set.equals("아니오")){
				System.out.println("프로그램을 종료하겠습니다.");
				break;
		}else {System.out.println("잘못된 입력입니다. 다시 입력해주세요 > ");}
			}
			
		}
			
	private void study() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
