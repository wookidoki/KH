package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.vo.Bong;
import com.kh.chap04.model.vo.Hong;
import com.kh.chap04.model.vo.Jjimdak;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �귣�� ����");
		System.out.println("1. ��");
		System.out.println("2. ȫ");
		System.out.print("�����ϼ� >>>> ");
		int menu = sc.nextInt();
		
		Jjimdak dak = null;
		
		switch(menu) {
		case 1 : dak = new Hong(); break;
		case 2 : dak = new Bong(); break;
		}
		
		dak.order();
	}

}
