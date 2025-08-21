package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  �ڹ��� �÷���(Collection Framework)
		 *  
		 *  Abstract Data Type(�߻��� �ڷ���) ==> Interface
		 *  **������ ���� ����Ϸ��� Ŭ������ �־����
		 *  (�������̽��� �����ϴ�)
		 *  +
		 *  ����ü => Class
		 *  +
		 *  �˰��� => method
		 *  
		 */
		
		
		/*
		 * �迭�� �÷����� ������
		 * 
		 * - �迭�� ��������
		 * 1. �迭�� ����Ϸ��� �� �� �� ũ�⸦ �Ҵ��ؾ��� => �ѹ� ������ ũ��� ������ �Ұ���
		 * 2. �迭 �߰��� ���ο� ��Ҹ� �߰��ϰų� ������ �� �������� �о��ְų� ��ܾ��ϴ� �ڵ带 �ۼ��ؾ���
		 * 
		 * - �÷��� �� ������
		 * 1. ũ���� ������ ����
		 * => ũ�⸦ ���������ʴ��� ��밡��
		 * => ��Ұ� �߰� �Ǹ鼭 ũ�⸦ �Ѿ�� ��Ȳ�� �߻��� �ڵ� Ȯ��
		 * 2. �߰��� ���� �߰��ϰų� �����ϴ� ��� �̹� ������ �����Ǿ�����
		 * => �ʿ��� �޼ҵ� ȣ�� ���
		 * 
		 * -- �߸�
		 * - �迭�� ��� �ϳ��� Ÿ�� �ڷ����� ��밡��
		 * - �÷����� ��� ���� Ÿ���� �����͵��� ������ �� ���� : ���� Ÿ���� �����͸� ����� ��밡�� 
		 * 
		 * ** 
		 * ����� �������� ������ ��Ȯ�ϴ� -> ��ȸ�� ���� : �迭
		 * �������� �߰��� ������ ���� �Ͼ�� => �÷��� 
		 */
		
		/**
		 * �������� �÷����� ����
		 * 
		 * - List �迭 : �ٷ���� �ϴ� �� (Value)  �� ���� / Index ���� , �ߺ��� ���
		 * => LinkedList , ArrayList , Vector
		 * 
		 * - set �迭
		 * 
		 * - map �迭
		 * 
		 */
		
		//1. ��Ҹ� �߰��ϴ� �޼ҵ�
		ArrayList plants = new ArrayList(3);
		System.out.println(plants);
		
		// �÷�Ʈ�� ArrayList �ٷ������ ****** // Object
		
		
		plants.add(new Plant("�����", "ȣ����"));
		plants.add(new Plant("�����", "Ȳ���"));
		plants.add(new Plant("����", "������"));
		System.out.println(plants);
		
		plants.add(2, new Plant("����","����"));
		System.out.println(plants);
		//�����ڷ��� ������ ��¹��� ���Դ� -> toString �� �ڵ����� �ٴ´� 
		
		//2. ��Ҹ� �����ϴ� �޼ҵ�
		//set(int index, E e) : list �� index ��ġ�� ���� ���޵� ���(e) �� set ���ִ� �żҵ�
		
		plants.set(0, new Plant("~��", "~��"));
		System.out.println(plants);
		
		//3. ��Ҹ� �����ϴ� �żҵ�
		//remove(int index) : List �� index ��ġ�� ��� ��Ҹ� �����ϴ� �޼ҵ�
		
		plants.remove(0);
		System.out.println(plants);
		
		//4. ����Ʈ�� ũ�⸦ ��ȯ�ޱ�
		System.out.println(plants.size());
		
		//5. List �� �ش� index ��ġ�� ��� ��Ҹ� �������� �żҵ�
		System.out.println(plants.get(1));
		
		String yaja =  ((Plant) plants.get(1)).getName(); 
		//Object Ŭ������ getName �޼ҵ尡 ���� �׷��� Plant �� �ڷ����� �ٲ������
		//plants �� ArrayList �ڷ�����
		//�׷��� plants.get() ���� Plant ��
		System.out.println(yaja);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("�Ĺ�����: " + ((Plant) plants.get(i)).getType());
		}
		
		for( Object p : plants) {
			System.out.println(p); // �������ε�
		}
		
		//6. ����Ʈ �ڸ���
		//subList(int index1, int index2) : List
		List sub = plants.subList(0,1);
		System.out.println(sub);
		
		//7. ����Ʈ�� ���� ��Ҹ� �߰��ϱ�
		// addAll(Collection c) : �ش� ����Ʈ�� �ٸ� �÷��ǿ� �ִ� ��ҵ��� ���� �߰����ִ� �޼ҵ�
		plants.addAll(sub);
		System.out.println(plants); // ����Ʈ�� ������ ��(Value) �� �ߺ��ɼ�����
		
		//8. ����Ʈ�� ���� ��Ұ� �ִ��� ������ �Ǻ��ϴ� �޼ҵ� 
		//isEmpty() : ��Ұ� ���������ʴٸ� true �ϳ��� ������ false
		System.out.println(plants.isEmpty());
		plants.clear();
		System.out.println(plants.isEmpty());
	}

}
