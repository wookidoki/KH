package com.kh.chap04.run;

import java.util.Arrays;

import com.kh.chap04.controller.FieldController;
import com.kh.chap04.controller.StaticContoller;



public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static class 에서 가져올때 따로 객체를 생성안해도 됨
		System.out.println(StaticContoller.str);
		
		
		FieldController fc = new FieldController();
		// 1. fc 라는 지역변수 이름 선언
	
		System.out.println(Arrays.toString(new int[2]));
		//Arrays 클래스는 접근할수있고 누워있으니 toString 메소드는 static 임 굵지않으니 값은 바뀔수있고
		
		/*
		 * AccessModifier (접근제어자 / 접근제한자)
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
