package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * ���׸� <Generic>
		 * (�Ϲ�ȭ?)
		 * 
		 * �÷����� ����ϸ鼭 �ٷ� Ÿ�Ե��� �̸� �����Ҽ��ִ� ���
		 * 
		 * ��������� <Integer> , <Plant>
		 * Ư�� Ÿ���� ��ҵ鸸 �������ֵ��� �Ҽ�����
		 * 
		 * 1. �ٸ� ����� Ÿ���� ������ �� ���� => �Ǽ��� ���ϼ��ִ�
		 * 2. �� �� ����ȯ�ϴ� ������ ���� �� ����
		 */
		
		ArrayList<Plant> plants = new ArrayList();// Plant ���ƴ� �ٸ� Ÿ���� ��Ұ� �߰��� �ȵ�
		plants.add(new Plant("����","�꼼������"));
		plants.add(new Plant("����","�꼼������"));
		plants.add(new Plant("����","�꼼������"));
		
		
		//plants.add("asd"); �ȵ�
	
		System.out.println(plants);
		
		
		
		for(Plant plant: plants) {
			System.out.println(plant);
		}
	}



}
