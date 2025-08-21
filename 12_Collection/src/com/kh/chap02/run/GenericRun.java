package com.kh.chap02.run;

import java.util.ArrayList;

import com.kh.chap02.model.vo.Plant;

public class GenericRun {

	public static void main(String[] args) {
		/*
		 * 제네릭 <Generic>
		 * (일반화?)
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할수있는 기능
		 * 
		 * 명시적으로 <Integer> , <Plant>
		 * 특정 타입의 요소들만 담을수있도록 할수았음
		 * 
		 * 1. 다른 요소의 타입을 제한할 수 있음 => 실수를 줄일수있다
		 * 2. 매 번 형변환하는 절차를 없엘 수 있음
		 */
		
		ArrayList<Plant> plants = new ArrayList();// Plant 가아닌 다른 타입의 요소가 추가가 안됨
		plants.add(new Plant("관엽","산세베리아"));
		plants.add(new Plant("관엽","산세베리아"));
		plants.add(new Plant("관엽","산세베리아"));
		
		
		//plants.add("asd"); 안됨
	
		System.out.println(plants);
		
		
		
		for(Plant plant: plants) {
			System.out.println(plant);
		}
	}



}
