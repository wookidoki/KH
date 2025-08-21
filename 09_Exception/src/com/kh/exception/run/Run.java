package com.kh.exception.run;

import com.kh.exception.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {

		/*
		 * 에러(Error)
		 * 
		 * - 시스템 에러 : 컴퓨터의 오작동 (소스코드로 해결 X)
		 * 
		 * - 컴파일 에러 : 프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
		 * 				=> 소스코드를 수정 해서 해결 (빨간줄로 알려줌)
		 * 
		 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러 문법적으로는 문제가 없는데 발생
		 * 	=>사용자의 잘못일 가능성이 높지만 개발자가 예측 가능한 경우 처리
		 * 
		 * - 논리적 에러 : 소스코드 상 문제도 없고 , 실행했을 때도 문제가 발생하지 않음
		 * 				=> 의도와는 다르게 동작 (기획 / 설게를 잘못했을 때)
		 */
		
		 // 에외 : 시스템 에러를 제외한 나머지 컴파일, 런타임, 논리적 에러와 같이 비교적 덜 심각한 애들 
			// 그중에서도 주로 런타임 에러를 의미함
		
		/*
		 * 예외 처리 방법
		 * 
		 */
		
		UncheckedException e = new UncheckedException();
		e.method1();
		

	}
	

}
