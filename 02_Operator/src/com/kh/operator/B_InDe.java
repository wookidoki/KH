package com.kh.operator;
import java.util.Scanner;


public class B_InDe {

	/*
	 * �� ���������� (�� �� ������)
	 * 
	 * [ǥ����]
	 * 
	 * ++ : ���� 1���� ��Ű�� ������
	 * -- : ���� 1���� ��Ű�� ������
	 * 
	 * => ������ �����Ұ��� , ���߿� �Ұ����� ���� �������� ��ġ�� �޶���
	 * 
	 * �� �������� ��ġ
	 * ���������� : ++i --i / ���� ���� ���� �Ǵ� ���� ��Ű�� ���� �۾��� ó��
	 * ���������� : i++ i-- / ���� ���� ó���ϰ� ���� ����
	 * 
	 * 
	 */
	
	
	//�������� �޼ҵ�
	public void postfix () {
		
		int num = 10 ;

		System.out.println("num : " + num ) ;
		num ++ ;
		System.out.println("num : " + num ) ;
		num -- ;
		System.out.println("num : " + num ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println("num : " + num++ ) ;
		System.out.println(num ) ;
		
		int a = 10 ;
		int b = a++;
		
		System.out.println("a : " + a );
		System.out.println("b : " + b );
		
		int c = 10 ;
		int d = c--;
		
		System.out.println("c : " + c );
		System.out.println("d : " + d );
		
		
	}
	
	
	public void prefix  () {
		
		
		int num = 10 ;
		++num ;
		System.out.println("������"+ num ) ;
		
	}
	
	
	
	
	
	
	
	
	
	

}
