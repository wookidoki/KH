package com.kh.chap01.run;

import com.kh.chap01.controller.Controller;

public class Run {
	
	public static void main(String[] args) {
		
		//�������� ������ �ٷ��ʹ�. ��Ȯ�ϰ� ��� ������ �ٷ����� �˼�����
		//1
		Controller c = new Controller();
		
		c.add(5);
		c.add(50);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
		c.add(123);
	
		
		
		System.out.println(c.toString());
		System.out.println(c.get(3));
		
		//�迭�� ���鶧 ���ο� �迭�� ����ԵǸ� ������ ����ִ� ������ ����� => ���� ���
		
		

		
	}

}
