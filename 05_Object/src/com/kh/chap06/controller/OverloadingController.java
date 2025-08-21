package com.kh.chap06.controller;

public class OverloadingController {

	/*
	 * 메소드 오버로딩(Method Overloading)
	 * 
	 *  - 하나의 클래스 안에 동일한 메소드 식별자로 여러 개의 메소드들을 정의할수있는 기술
	 *  - 매개변수 자료형의 개수,순서,종류 를 다르게 작성
	 *
	 */
    // 1. 필드 선언
    public String message;

    // 2. 생성자
    public OverloadingController() {}

    // 3. 필드를 초기화하는 메서드
    public void initMessage() {
        message = "Hello from OverloadingController!";
    }

    // 4. 필드를 출력하는 메서드
    public void printMessage() {
        System.out.println("message: " + message);
    }
    
    //오버로딩
    
    public void test(int num) {
    	
    }
    public void test(int a, int b) {
    	
    }
    public void test(int a, char b) {
    	
    }
    
    public void test(char b, int a) {
    	
    }
    
    public void test(char a) {
    	
    }
    public void test(String b) {
    	
    }
    public void test(boolean t) {
    	
    }
    
    // 반환 형과는 상관없이 매개변수의 개수와 순서를 항상 다르게 
	// 접근제한자와 상관없이 매개변수의 개수와 순서를 항상 다르게 작성
    
}
