package com.kh.variable;

public class A_Variable {
	
	//변수 - 정해지지 않은 임의의 값 을 표현하기 위한 기호 
	//프로그래밍 언어에서의변수 - Memory(RAM) 에 값을 저장하기 위한 공간 ( 박스 )
	
	/**
	 *  ★ 변수란 메모리 상에 값을 저장하기 위한 공간
	 *  
	 */

	// 키오스크 (시즌메뉴)
	public void findSeasonMenu() {
		
		// 1. 시즌메뉴들을 출력 (메뉴명, 가격)
		// 2. 사용자가 메뉴판을 보고 주문을 했다고 가정
		// 3. 고객이 구매한 메뉴의 가격을 출력
		
		System.out.println("--- 변수 사용하기 전 ---");
		System.out.println("*시즌 메뉴*");
		//System.out.println("1. 딸기라떼 : 6700 won");
		System.out.println("1. 한교동 갈릭쉬림프 프레첼 : 1846 won");
		System.out.println("2. 요거 젤리 소다 플랫치노 : 3900 won");
		System.out.println("3. 케로케로케로피 멜론 라떼 : 4200 won");
		
		// 가정 - 딸기라떼 25잔 주문 , 멜론라떼 30잔 주문
		
		
		System.out.println("-------------------");
		
		//System.out.println("딸기 라떼를 25잔 시키셨습니다.");
		
		System.out.println("한교동 갈릭쉬림프 프레첼을 17개 시키셨습니다.");
		
		// 주문가격 딸기라떼 25잔* 딸기라떼 가격
		//System.out.println((6700 * 25) + "\s원 입니다.");
		
		System.out.println((1846 * 17) + "원 입니다.");
		System.out.println("케로케로케로피 멜론 라떼를 30잔 시키셨습니다.");
		System.out.println((4200 * 30) + "원 입니다.");
		
		
		//변수사용
		String seasonMenu = " 헬로헬로키티 딸기라떼";
		int price = 6700;
		int amount = 17;
		
		System.out.println("\n\n--- 변수를 사용해 봅시다 ---");
		System.out.println("\n*시즌 메뉴*");
		System.out.println("메뉴명 : 1. " + seasonMenu + " 가격 : " + price);
		System.out.println("\n" + seasonMenu + "\s" + amount + "\s" + "개 시키셨습니다." );
		System.out.println("총 " + (price * amount) + " 원 입니다" );

		
	}
	
	// 변수 선언 방법에 대해 알아봅시다.
	public void declareVariable() {
		
		/*
		 * ● 변수 선언 방법 -> 개발자가 메모리 상에 값을 올리는 방법 / 《변수는 값을 의미하는게 아니다!》
		 * 
		 * DataType 변수식별자;
		 * 변수 선언 뒤 처음 값을 대입하는 것을 초기화 (Initialization) 이라고 함
		 * 초기화를 통해 대입한 값을 초기값 이라고 함
		 * 
		 * 변수는 자신이 선언된 {Scope} 에서만 사용할수있습
		 * local variable(지역변수)
		 * 
		 */
		
		/*
		 * ● 식별자(Identifier)
		 * 
		 * 클래스 명, 메소드 명, 변수 명 등 개별자가 이용하는 고유의 이름
		 * 
		 * ※ 식별자 생성시 꼭 지켜야 하는 규칙
		 * 1.keyword(예약어)[보라글씨] 는 식별자로 사용할 수 없음
		 * 2.공백은 포함할 수 없음
		 * 3.대, 소문자를 구분하고 길이제한은 업dma
		 *
		 * ● 개발자들 사이 암묵적인 약속 > 영어 말고 쓰지말자
		 * 
		 * 1. 클래스 / 인터페이스 명명 규칙
		 * - 첫글자는 대문자로 표기
		 * - 연결된 단어들의 첫 단어도 대문자로 표기
		 * 
		 * 2. 변수 명명 규칙
		 * - 명사적 의미를 갖게 만들기
		 * - 첫글자는 소문자로 표기, 연결된 단어들의 첫글자는 대문자로 표기
		 * 
		 * 3. 메소드 명명 규칙
		 * - 동사적 의미를 갖게 만들기 (명령적 어조면 좋음)
		 * - 첫 글자는 소문자로 표기, 연결된 단어들의 첫글자는 대문자로 표기
		 * - 메소드 식별자의 경우 식별자 뒤에 반드시 () 를 붙임
		 * - 메소드 에서 _ 사용 XXXX
		 * 
		 * 4. 상수 명명 규칙
		 * - 모든 문자를 대문자로 표기
		 * - 단어와 단어 사이에는 _를 구분한다
		 * ex) LOGIN_OK
		 * 
		 */
		
		 // ● 변수의 자료형 Java 의 기본 자료형, 원시자료형
		
		 /*
		  * 1. 논리자료형 (논리 값 : true / false)
		  */
		
		boolean isLight; //변수 선언 
		// localVariable 은 초기화 (Initialized) 를 하지않으면 사용할 수 없음
		isLight = true;  //초기회 
		System.out.println(isLight);
		
		isLight = false; //대입
		System.out.println(isLight);
		
	 	/*
	 	 * 2. 숫자
	 	 * 
	 	 * ● 정수형
	 	 * 4가지 자료형이 존재
	 	 * byte short int long 보통 int를 많이 사용함
	 	 * long 형을 사용할때는 숫자뒤에 L 을 붙임
	 	 * 
	 	 * ● 실수형
	 	 * 2가지 자료형이 존재
	 	 * float double(기본) 
	 	 * float 를 사용하기 위해서 할당된 숫자 뒤에 F 를 붙임 
	 	 * 
	 	 * 
	 	 */
	
		// 2_1. 정수형
		byte byteNumber = 1;	//1Byte
		short shortNumber = 2;	//2Byte
		int intNumber = 3;		//4Byte
		long longNumber = 4L;	//8Byte
		
		// 2_2. 실수형
		float floatNumber = 2.22F ; //4Byte
		double doubleNumber = 3.33 ; //8Byte
		
		// 변수 선언과 동시에 초기화
		
		// 3. (단일) 문자형
		char rice = '밥' ; // 2Byte - 단일 문자에서는 반드시 홑 따옴표 사용
		
		// ㄴ 여기까지가 원시자료형 8개 boolen / byte / short / int / long / float / double / char
		
		
		// 4. 문자열 : 참조자료형
		String str ="abc"; 
		
		
		System.out.println("논리형 " + isLight);
		System.out.println("정수형 byte " + byteNumber);
		System.out.println("정수형 short " + shortNumber);
		System.out.println("정수형 int " + intNumber);
		System.out.println("정수형 long " + longNumber);
		System.out.println("실수형 float " + floatNumber);
		System.out.println("실수형 doulbe " + doubleNumber);
		System.out.println("단일 문자형 char " + rice);
		System.out.println("문자열 문자형 str " + str);
		
		// %b %d %f %c %s 
		// 논리 정수 실수 단일문자 문자열
		System.out.printf("isTrue 라는 변수에 대입한 값 : %b, char형은 %c", isLight , rice);
		
		//
		System.out.printf("\ndoubleNum 값 : %.3f" , doubleNumber);
		
		/*
		 * 출력문의 종류
		 * System.out.print();
		 * System.out.println(); => 개행한다. 줄바꿈
		 * System.out.printf(); 
		 */
		
		System.out.println("===============================");
		
		// 상수 (프로그래밍 언어)
		// 대문자로 띄어쓰기는 _ 로 진행
		
		int startYear = 1998; //변수
		final int START_YEAR = 1998; //상수
		
		System.out.println("KH 설립연도 : " + START_YEAR);
		
		

		
	}
	


}


















