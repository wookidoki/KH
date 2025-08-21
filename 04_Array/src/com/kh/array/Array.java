package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	// ���� - �޸� �� �����͸� �����ϱ� ���� ���� 
	
	/*
	 * ������ �ĺ��ڸ� ����
	 * ������ ���ο� ���� �����ؼ� ���
	 * �������� ����������
	 * ���������� ��� �޸��� Stack ������ �ö󰣴�
	 * �ϳ��� ������������ �ϳ��� ���� ����
	 * �ʱ�ȭ�� �ؾ߸� ��밡�� �ʱ�ȭ�� ���� �ѹ��� ����
	 * ����� Scope �ȿ����� ���
	 * �ڷ����� ũ�Ⱑ ������������ ����ȯ�� ������
	 * �������� ���굵 ����..
	 * 
	 * 
	 */
	
	/*
	 * �迭 ( Array ) : �ϳ��� �迭�� ���� ���� ���� ���� ������
	 * 				��, " ���� �ڷ����� ���� " �� ����������
	 * 				���� ����(homogeneous collection) �̶�� �� 
	 * 
	 * 				�ڹٶ�� **(��� ��ü��) ����� ������ ����
	 * 
	 */
	
	/*
	 * �迭 ���� ���
	 * �ڷ��� [] �迭�ĺ���;
	 * 
	 * �迭�Ҵ�
	 * �迭�� ��� ���� ���� �迭�� ũ�⸦ �����ִ� ���� 
	 * 
	 * int[] numbers // �迭����
	 * numbers = new int[5]; //�Ҵ�
	 * 
	 * int arr = new int[5]; // ����� ���ÿ� �Ҵ�
	 * 
	 */
	
	public void method1() {
		
		int[] nums = new int[6];
		//������ ���� 5�� ���� , �ʱ�ȭ ����
		
		for (int i = 0 ; i < 6 ; i++) {
			int num = (int) (Math.random()*100) + 1;
			nums[i] = num;
			
			
			for(int j =0 ; j <= i ; j++) {
			System.out.print(nums[j]+" ");}
			
			System.out.println();
		}
	}
	
	public void methodA() {
		
		//�迭�� �����غ���
		int[] arrIntegers = new int[3]; // 0 1 2 3��
		double[] arrDoubles = new double[3];
		String [] arrStrings = new String[3];
		
		// �迭�ĺ���.lengh : �迭�� ũ�� (����) => ���� 
		
		arrStrings[0] = "������������";
		System.out.println(arrStrings[0]);
		
		
		
	}
	
	public void methodB() {
		
		String[] academyKhs = {"��������ũ","A������","B������","�繫��","������"};
		
		for( int index = 0 ; index <5 ; index++) {
			
			System.out.println(academyKhs[index]);
			
		}
	
	}
	
	public void lotto() {
		
		int[] lottoNumber = new int[6];
		
		
		for (int i = 0 ; i < 6 ; i++) {
			lottoNumber[i] = (int)(Math.random()*45) + 1; 
			System.out.println(lottoNumber[i]);
			}
		}
	
	public void methodC() {
		
		String[] zoo = {"tiger","rabbit","lion","monkey","dragon"};
		System.out.print(zoo.length);
		
		
	}
	
	public void methodD() {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[6];
		int min = nums[0];
		
		for (int i = 0 ; i < 6 ; i++ ) {
			System.out.println("�����Է�");
			nums[i] = (int) sc.nextInt();
			System.out.println("nums ��� �迭�� �Էµ�" + i + "��° �ε����� �� " + nums[i]);
	
			if (min < nums[i]) {
				min = nums[i];
				System.out.println(min);
			}
		}
	}	
	
	public void methodF() {
		
		// �ѹ� �Ҵ���� �迭�� ũ��� ������ �� ����
		
		String[] names = new String[3];
		names[0] = "��";
		names[1] = "��";
		names[2] = "��";
		System.out.println(Arrays.toString(names));
		
		names[2] = "��";
		System.out.println(Arrays.toString(names));
		System.out.println(names.hashCode());
		
		names = new String[4];
		names[3] = "¯";
		System.out.println(Arrays.toString(names));
		System.out.println(names.hashCode());
		
		/*
		 * �����ڷ��� = null
		 * 
		 * �����ڷ������� null �̶�� ���� ��
		 * �̴� �ּҰ��� �����ϴ°� �׷��� ������
		 * 
		 * 
		 */
		
		names = null;
		System.out.println(Arrays.toString(names));
		

		
	}
	
	//JVM �̶�� ģ���� main method �� ȣ���� �ؼ� �����ϴ°�
	// ������ ���� ������ �迭�� �����ð��� ������ G.C �� �˾Ƽ� ���� ���� : �ڵ� �޸� ���� 
	// �����򿭽ĺ��ڿ� �Ҵ縸 ���ӰԵȴٸ� ���� �����ϰ��ִ� ������ ����� ���ο� �迭�� ����
	
	public void methodE() {
		// �迭�� ���� ����ϴ� ���
		// ����� ���ÿ� ��Ҹ� �����ؼ� �����
		
		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		int[] arr2 = {1,2,3,4,5,6,7}; // �̷��� ���ٰ� �����
		System.out.println(Arrays.toString(arr2));
			
	}
	
	public void methodG() {
		
		// ���� ���� �ڡڡڡ�
		// �ּҰ��� �����ϴ°��̱� ������ ����Ű�� ����� ���� 
		// ���� ���� 
		
		//�߿��� ����
		
		int[] arry3  = {1 ,2 ,3, 4,5};
		System.out.println(Arrays.toString(arry3));
		
		// ���� ����� �迭�� ����
		
		int[] copy = arry3;
		System.out.println(Arrays.toString(copy));
		
		arry3[2] = 33;
		System.out.println(Arrays.toString(arry3));
		System.out.println(Arrays.toString(copy));
		
		
		/*
		 * �� arry3 �� �ٲ�µ� ����� copy �迭�� �ٲ�°�
		 * stack �� methodG �� �ö� {
		 * arry3 (������ �迭�� �����ϴ� ����) �� ���� {heap �޸𸮿� 20����Ʈ ���� ����� ���ڵ��� ���� �ε����� ����}
		 * 								{heap �޸𸮿� ���� �ּҰ��� stack �� �ִ� �迭�� ����}
		 * }
		 * 
		 * copy ( ������ �迭�� �����ϴ� ����) �� �� stack �� �ö󰡳�
		 * �̶��� arry3 �� �ּҰ��� �����ϴ°��� 
		 * 
		 */
		
	}
	
	public void methodH() {
		
		int[] orign = {1, 2, 3, 4, 5};
		//���� ����
		int[] copy = orign;
		
		System.out.println(Arrays.toString(orign));
		System.out.println(Arrays.toString(copy));
		
		//���� ����
		int[] copy2 = new int [7];
		
		for (int i =0;i < orign.length; i++) {
			copy2[i] = orign[i];
		}
		
		System.out.println(Arrays.toString(copy2));
		
		//���� ������ ��� �����迭���� ū �迭�� �����ϴ� ��찡 ����
		
		int[] copy3 = new int[10];
		System.arraycopy(orign, 0, copy3, 0, 5);
		/*
		 * ���̹������� == ù ���ڰ� �빮�� == Ŭ����/�������̽� 
		 * 
		 * 
		 */
		
		System.out.println(Arrays.toString(copy3));
	
		
	}
	
	
		
}// class
