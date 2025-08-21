package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	// 변수 - 메모리 상에 데이터를 저장하기 위한 공간 
	
	/*
	 * 고유한 식별자를 가짐
	 * 공간에 새로운 값을 대입해서 사용
	 * 지료형이 정해져있음
	 * 지역변수의 경우 메모리의 Stack 영역에 올라간다
	 * 하나의 변수공간에는 하나의 값만 대입
	 * 초기화를 해야만 사용가능 초기화는 최초 한번만 가능
	 * 선언된 Scope 안에서만 사용
	 * 자료형은 크기가 정해져있으며 형변환이 가능함
	 * 변수끼리 연산도 가능..
	 * 
	 * 
	 */
	
	/*
	 * 배열 ( Array ) : 하나의 배열에 여러 개의 값을 담을 수있음
	 * 				단, " 같은 자료형의 값들 " 만 담을수있음
	 * 				동종 모음(homogeneous collection) 이라고도 함 
	 * 
	 * 				자바라는 **(언어 자체에) 내장된 유일한 구조
	 * 
	 */
	
	/*
	 * 배열 선언 방법
	 * 자료형 [] 배열식별자;
	 * 
	 * 배열할당
	 * 배열에 몇개의 값이 들어갈지 배열의 크기를 정해주는 과정 
	 * 
	 * int[] numbers // 배열선언
	 * numbers = new int[5]; //할당
	 * 
	 * int arr = new int[5]; // 선언과 동시에 할당
	 * 
	 */
	
	public void method1() {
		
		int[] nums = new int[6];
		//임의의 정수 5개 선언 , 초기화 진행
		
		for (int i = 0 ; i < 6 ; i++) {
			int num = (int) (Math.random()*100) + 1;
			nums[i] = num;
			
			
			for(int j =0 ; j <= i ; j++) {
			System.out.print(nums[j]+" ");}
			
			System.out.println();
		}
	}
	
	public void methodA() {
		
		//배열을 공부해보자
		int[] arrIntegers = new int[3]; // 0 1 2 3개
		double[] arrDoubles = new double[3];
		String [] arrStrings = new String[3];
		
		// 배열식별자.lengh : 배열의 크기 (길이) => 정수 
		
		arrStrings[0] = "ㅁㄴㅇㅁㄴㅇ";
		System.out.println(arrStrings[0]);
		
		
		
	}
	
	public void methodB() {
		
		String[] academyKhs = {"인포데스크","A강의장","B강의장","사무실","주차장"};
		
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
			System.out.println("정수입력");
			nums[i] = (int) sc.nextInt();
			System.out.println("nums 라는 배열에 입력된" + i + "번째 인데스의 값 " + nums[i]);
	
			if (min < nums[i]) {
				min = nums[i];
				System.out.println(min);
			}
		}
	}	
	
	public void methodF() {
		
		// 한번 할당받은 배열의 크기는 변경할 수 없음
		
		String[] names = new String[3];
		names[0] = "이";
		names[1] = "승";
		names[2] = "욱";
		System.out.println(Arrays.toString(names));
		
		names[2] = "민";
		System.out.println(Arrays.toString(names));
		System.out.println(names.hashCode());
		
		names = new String[4];
		names[3] = "짱";
		System.out.println(Arrays.toString(names));
		System.out.println(names.hashCode());
		
		/*
		 * 참조자료형 = null
		 * 
		 * 참조자료형에는 null 이라는 값이 들어감
		 * 이는 주소값이 존재하는가 그렇지 않은가
		 * 
		 * 
		 */
		
		names = null;
		System.out.println(Arrays.toString(names));
		

		
	}
	
	//JVM 이라는 친구가 main method 를 호출을 해서 동작하는겨
	// 연결이 끊긴 기존의 배열은 일정시간이 지나면 G.C 가 알아서 삭제 해줌 : 자동 메모리 관리 
	// 기존뱌열식별자에 할당만 새롭게된다면 기존 참조하고있던 연결이 끊기고 새로운 배열을 참조
	
	public void methodE() {
		// 배열을 보통 사용하는 방법
		// 선언과 동시에 요소를 대입해서 사용함
		
		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		int[] arr2 = {1,2,3,4,5,6,7}; // 이렇게 쓴다고 보면됨
		System.out.println(Arrays.toString(arr2));
			
	}
	
	public void methodG() {
		
		// 얕은 복사 ★★★★
		// 주소값을 대입하는것이기 때문에 가리키는 대상이 같음 
		// 깊은 복사 
		
		//중요한 내용
		
		int[] arry3  = {1 ,2 ,3, 4,5};
		System.out.println(Arrays.toString(arry3));
		
		// 얕은 복사로 배열을 복사
		
		int[] copy = arry3;
		System.out.println(Arrays.toString(copy));
		
		arry3[2] = 33;
		System.out.println(Arrays.toString(arry3));
		System.out.println(Arrays.toString(copy));
		
		
		/*
		 * 왜 arry3 만 바꿨는데 복사된 copy 배열도 바뀌는가
		 * stack 에 methodG 가 올라감 {
		 * arry3 (정수열 배열을 저장하는 공간) 이 생김 {heap 메모리에 20바이트 열이 생기고 숫자들이 각각 인덱스에 대입}
		 * 								{heap 메모리에 생긴 주소값을 stack 에 있는 배열에 대입}
		 * }
		 * 
		 * copy ( 정수열 배열을 저장하는 공간) 이 또 stack 에 올라가나
		 * 이때는 arry3 의 주소값을 대입하는거임 
		 * 
		 */
		
	}
	
	public void methodH() {
		
		int[] orign = {1, 2, 3, 4, 5};
		//얕은 복사
		int[] copy = orign;
		
		System.out.println(Arrays.toString(orign));
		System.out.println(Arrays.toString(copy));
		
		//깊은 복사
		int[] copy2 = new int [7];
		
		for (int i =0;i < orign.length; i++) {
			copy2[i] = orign[i];
		}
		
		System.out.println(Arrays.toString(copy2));
		
		//깊은 복사의 경우 기존배열보다 큰 배열로 복사하는 경우가 많음
		
		int[] copy3 = new int[10];
		System.arraycopy(orign, 0, copy3, 0, 5);
		/*
		 * 네이밍컨벤션 == 첫 글자가 대문자 == 클래스/인터페이스 
		 * 
		 * 
		 */
		
		System.out.println(Arrays.toString(copy3));
	
		
	}
	
	
		
}// class
