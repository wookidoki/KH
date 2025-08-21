package com.kh.chap06.controller;

public class OverloadingController {

	/*
	 * �޼ҵ� �����ε�(Method Overloading)
	 * 
	 *  - �ϳ��� Ŭ���� �ȿ� ������ �޼ҵ� �ĺ��ڷ� ���� ���� �޼ҵ���� �����Ҽ��ִ� ���
	 *  - �Ű����� �ڷ����� ����,����,���� �� �ٸ��� �ۼ�
	 *
	 */
    // 1. �ʵ� ����
    public String message;

    // 2. ������
    public OverloadingController() {}

    // 3. �ʵ带 �ʱ�ȭ�ϴ� �޼���
    public void initMessage() {
        message = "Hello from OverloadingController!";
    }

    // 4. �ʵ带 ����ϴ� �޼���
    public void printMessage() {
        System.out.println("message: " + message);
    }
    
    //�����ε�
    
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
    
    // ��ȯ ������ ������� �Ű������� ������ ������ �׻� �ٸ��� 
	// ���������ڿ� ������� �Ű������� ������ ������ �׻� �ٸ��� �ۼ�
    
}
