package com.kh.homework.project02.vo;

import java.util.Scanner;

public class Plan {
	
	/*
	 * 1) ��� �ʵ��� ���������ڸ� private ���� ����
	 * 2) �ʵ忡 ���������� �����Ҽ��ֵ��� getter(), setter() ����
	 * 3) ��� �ʵ��� ������ ���ļ� ���ڿ��� ���·� ��ȯ���ִ� info()����
	 * 4) �⺻������ �� ��� �ʵ带 �Ű������� �������ִ� ������ ����
	 * 5) ������������ ����ϰ� �ִ� ���� Ŭ������ �ڵ���� ���� �� getter setter ��ü
	 */
	
	//[�ʵ��]
	
	private String name;
	private String job;
	private int age ;
	private String object;
	private int goal;
	
	//[�����ں�]
	
	public Plan() {
		
	}
	
	public Plan(String name, String job,int age,String object,int goal) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.object = object;
		this.goal = goal;
	}
	
	
	//[�޼ҵ��]
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
		return "����� ����" + "\n �̸� : " + name
				+ "\n ����: " + job
				+ "\n ����: " + age
				+ "\n ��ǥ: " + object
				+ "\n ��ǥ�ϼ�: " + goal;
				
	}
	
	//study ����
	public void start() {

		set();
			
		}
	
	private void set() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ȯ���մϴ� " + name + "��");
		
		while(true) {
		
			System.out.println("���õ� �غ�Ǽ̳���? \n> ��, �ƴϿ� > ");
			String set = sc.nextLine();
			
			if(set.equals("��")) {
				System.out.println("���õ� ���� ���� �ǽñ� �ٶ��ϴ�!");
				study();
				break;
		}else if(set.equals("�ƴϿ�")){
				System.out.println("���α׷��� �����ϰڽ��ϴ�.");
				break;
		}else {System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ��� > ");}
			}
			
		}
			
	private void study() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
