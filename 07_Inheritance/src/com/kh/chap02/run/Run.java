package com.kh.chap02.run;
import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;

public class Run {
	
	/*
	 *  상속(Inheritance)
	 *  
	 *  - 기존의 클래스를 이용해서 새로운 클래스를 만드는것
	 *  - 중복된 코드를 공통으로 관리
	 *  
	 *  but 단점 - 객체간의 결합도가 높아짐
	 *  
	 *  상속의 특징
	 *  - 클래스 간의 다중상속이 불가 (단일상속만 가능)
	 *  - 명시되어있지는 않지만 모든 클래스는 Object 클래스의 후손 클래스 (자바에서 원래 제공하는 클래스)
	 *  => Object 클래스에 있는 맴버를 사용할수있지만 , 재정의도 가능함
	 *  
	 *  
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KoreaFood kf = new KoreaFood();
		kf.setFoodName("비빔밥");
		System.out.println(kf.getFoodName());
		
		// 호출을 하는 메소드가 해당클래스에 존재하지 않는다면
		// 자동으로 해당 클래스의 부모 클래스에 있는 메소드를 호출 
		
		ItalyFood italyfood = new ItalyFood("기름파스타","올리브유",1,1);
		System.out.println(italyfood.information());
		
		JapanFood jp= new JapanFood("초밥","생선",1,1);
		System.out.println(jp.information());
		
		//자식 클래스에 존재하는 메소드가 우선권을 가짐 중요!!
	}

	
}
