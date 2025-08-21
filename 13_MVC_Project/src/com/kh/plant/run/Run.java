package com.kh.plant.run;
import com.kh.plant.view.PlanView;


public class Run {

	public static void main(String[] args) {
		
		//MVC 패턴 (Model - View - Controller)
		
		/* 애플리케이션을 만들때 구조를 3가지로 분리하자
		 * 소프트웨어 아키텍쳐 
		 * 
		 * 1. Model (데이터와 관련된 작업)
		 * 데이터 담당 => VO
		 * 외부매체와의 상호작용 => DAO
		 * 비즈니스 로직 
		 * 
		 * 2.View 
		 * 사용자 인터페이스를 담당 
		 * 사용자에게 정보를 표시, 사용자의 입력값을 받음 
		 * Model 에서 만들어진 데이터를 시각적으로 표현 
		 * 모델과 직접 상호작용하지 않음
		 * 
		 * 3.Controller
		 * Model과 View의 중간다리 역활
		 * 사용자 입력을 처리하고 모델에 전달
		 * 모델에서 일어난 일을 뷰로 
		 * 
		 */
		PlanView pv = new PlanView();
		pv.mainMenu();
		

	}

}
