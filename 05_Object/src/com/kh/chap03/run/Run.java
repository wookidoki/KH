package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.Coffee;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Coffee coffee = new Coffee();
	Scanner sc = new Scanner(System.in);
	// ���⼭ coffee ������ (�׸��� sc) �����ڷ��� , ���۷��� Ÿ�� �̶����
	
	String name= sc.nextLine();
	String bean= sc.nextLine();
	String size= sc.nextLine();
	int price= sc.nextInt();
	boolean Caffenine= sc.nextBoolean();
	
	coffee.setName(name);
	coffee.setBean(bean);
	coffee.setSize(size);
	coffee.setPrice(price);
	coffee.setCaffenine(Caffenine);
	
	coffee.info();
	System.out.print(coffee.info());
	
	//String coffeeName = coffee.getName();
	

	}

}
