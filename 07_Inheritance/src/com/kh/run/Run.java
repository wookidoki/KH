package com.kh.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.PaperBook;

public class Run {
	
	/*
	 *  �� Ŭ�������� �ߺ��� �ڵ���� �ϳ��ϳ� ����ϴ� ����
	 *  �ڵ��� �߰� �Ǵ� ������ ���� �������� �� ���� �Ѷ��Ѷ� ã�Ƽ� ���ľ��ϴ� ���ŷο��� ����
	 *  
	 *  ����̶�� ������ ����
	 *  �� Ŭ���� ���� �ߺ��� �ʵ� �޼ҵ� ����
	 *  �� �ϳ��� Ŭ������ ����� ���� , ���Ǹ� �صΰ�
	 *  �ش� �θ� Ŭ������ �������ִ� ��Ҹ� ��� �޾Ƽ� ����ϴ� ���·� ���� 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Book book = new Book("å�̸�1","���ǻ�1","����1",15000);
		
		ElectronicBook eBook = new ElectronicBook("å�̸�2","���ǻ�2","����2",13500, "�и�");
		
		PaperBook pBook = new PaperBook("å�̸�3","���ǻ�3","����3",17000,0);
		
		System.out.println(book.information());
		System.out.println(eBook.information());
		System.out.println(pBook.information());
		
		System.out.println(book);
		System.out.println(book.toString());
		
		System.out.println(eBook);
		
	}


}
