package com.kh.chap02.run;
import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;

public class Run {
	
	/*
	 *  ���(Inheritance)
	 *  
	 *  - ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ ����°�
	 *  - �ߺ��� �ڵ带 �������� ����
	 *  
	 *  but ���� - ��ü���� ���յ��� ������
	 *  
	 *  ����� Ư¡
	 *  - Ŭ���� ���� ���߻���� �Ұ� (���ϻ�Ӹ� ����)
	 *  - ��õǾ������� ������ ��� Ŭ������ Object Ŭ������ �ļ� Ŭ���� (�ڹٿ��� ���� �����ϴ� Ŭ����)
	 *  => Object Ŭ������ �ִ� �ɹ��� ����Ҽ������� , �����ǵ� ������
	 *  
	 *  
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KoreaFood kf = new KoreaFood();
		kf.setFoodName("�����");
		System.out.println(kf.getFoodName());
		
		// ȣ���� �ϴ� �޼ҵ尡 �ش�Ŭ������ �������� �ʴ´ٸ�
		// �ڵ����� �ش� Ŭ������ �θ� Ŭ������ �ִ� �޼ҵ带 ȣ�� 
		
		ItalyFood italyfood = new ItalyFood("�⸧�Ľ�Ÿ","�ø�����",1,1);
		System.out.println(italyfood.information());
		
		JapanFood jp= new JapanFood("�ʹ�","����",1,1);
		System.out.println(jp.information());
		
		//�ڽ� Ŭ������ �����ϴ� �޼ҵ尡 �켱���� ���� �߿�!!
	}

	
}
