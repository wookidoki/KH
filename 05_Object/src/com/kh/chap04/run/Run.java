package com.kh.chap04.run;

import java.util.Arrays;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticContoller;



public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static class ���� �����ö� ���� ��ü�� �������ص� ��
		System.out.println(StaticContoller.str);
		
		
		FieldController fc = new FieldController();
		// 1. fc ��� �������� �̸� ����
	
		System.out.println(Arrays.toString(new int[2]));
		//Arrays Ŭ������ �����Ҽ��ְ� ���������� toString �޼ҵ�� static �� ���������� ���� �ٲ���ְ�
		
		/*
		 * AccessModifier (���������� / ����������)
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
