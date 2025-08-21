package com.kh.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.PaperBook;

public class Run {
	
	/*
	 *  매 클래스마다 중복된 코드들을 하나하나 기술하다 보면
	 *  코드의 추가 또는 수정과 같은 유지보수 시 전부 한땀한땀 찾아서 고쳐야하는 번거로움이 생김
	 *  
	 *  상속이라는 개념을 적용
	 *  매 클래스 마다 중복된 필드 메소드 들을
	 *  단 하나의 클래스로 만들어 놓고 , 정의를 해두고
	 *  해당 부모 클래스가 가지고있는 요소를 상속 받아서 사용하는 형태로 진행 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Book book = new Book("책이름1","출판사1","저자1",15000);
		
		ElectronicBook eBook = new ElectronicBook("책이름2","출판사2","저자2",13500, "밀리");
		
		PaperBook pBook = new PaperBook("책이름3","출판사3","저자3",17000,0);
		
		System.out.println(book.information());
		System.out.println(eBook.information());
		System.out.println(pBook.information());
		
		System.out.println(book);
		System.out.println(book.toString());
		
		System.out.println(eBook);
		
	}


}
