package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap02.model.vo.Plant;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 *  자바의 컬렉션(Collection Framework)
		 *  
		 *  Abstract Data Type(추상적 자료형) ==> Interface
		 *  **실제로 만들어서 사용하려면 클래스가 있어야함
		 *  (인터페이스를 구현하는)
		 *  +
		 *  구현체 => Class
		 *  +
		 *  알고리즘 => method
		 *  
		 */
		
		
		/*
		 * 배열과 컬렉션의 차이점
		 * 
		 * - 배열의 불편한점
		 * 1. 배열을 사용하려고 할 때 꼭 크기를 할당해야함 => 한번 지정된 크기는 변경이 불가능
		 * 2. 배열 중간에 새로운 요소를 추가하거나 삭제할 때 기존값을 밀어주거나 당겨야하는 코드를 작성해야함
		 * 
		 * - 컬렉션 의 좋은점
		 * 1. 크기의 제약이 없음
		 * => 크기를 지정하지않더라도 사용가능
		 * => 요소가 추가 되면서 크기를 넘어서는 상황이 발생시 자동 확장
		 * 2. 중간에 값을 추가하거나 삭제하는 경우 이미 로직이 구현되어있음
		 * => 필요한 메소드 호출 사용
		 * 
		 * -- 중립
		 * - 배열의 경우 하나의 타입 자료형만 사용가능
		 * - 컬렉션의 경우 여러 타입의 데이터들을 관리할 수 있음 : 같은 타입의 데이터만 묶어서도 사용가능 
		 * 
		 * ** 
		 * 사용할 데이터의 갯수가 명확하다 -> 조회의 목적 : 배열
		 * 데이터의 추가나 삭제가 많이 일어난다 => 컬렉션 
		 */
		
		/**
		 * 개념적인 컬렉션의 종류
		 * 
		 * - List 계열 : 다루고자 하는 값 (Value)  만 저장 / Index 개념 , 중복값 허용
		 * => LinkedList , ArrayList , Vector
		 * 
		 * - set 계열
		 * 
		 * - map 계열
		 * 
		 */
		
		//1. 요소를 추가하는 메소드
		ArrayList plants = new ArrayList(3);
		System.out.println(plants);
		
		// 플랜트를 ArrayList 다루고있음 ****** // Object
		
		
		plants.add(new Plant("서양란", "호접란"));
		plants.add(new Plant("동양란", "황룡관"));
		plants.add(new Plant("관엽", "금전수"));
		System.out.println(plants);
		
		plants.add(2, new Plant("관엽","야자"));
		System.out.println(plants);
		//참조자료형 변수가 출력문에 들어왔다 -> toString 이 자동으로 붙는다 
		
		//2. 요소를 수정하는 메소드
		//set(int index, E e) : list 의 index 위치에 값을 전달된 요소(e) 로 set 해주는 매소드
		
		plants.set(0, new Plant("~란", "~란"));
		System.out.println(plants);
		
		//3. 요소를 삭제하는 매소드
		//remove(int index) : List 의 index 위치에 담긴 요소를 삭제하는 메소드
		
		plants.remove(0);
		System.out.println(plants);
		
		//4. 리스트의 크기를 반환받기
		System.out.println(plants.size());
		
		//5. List 의 해당 index 위치에 담긴 요소를 가져오는 매소드
		System.out.println(plants.get(1));
		
		String yaja =  ((Plant) plants.get(1)).getName(); 
		//Object 클래스는 getName 메소드가 없다 그래서 Plant 로 자료형을 바꿔줘야함
		//plants 는 ArrayList 자료형임
		//그래서 plants.get() 값을 Plant 로
		System.out.println(yaja);
		
		for(int i = 0; i < plants.size(); i++) {
			System.out.println("식물종류: " + ((Plant) plants.get(i)).getType());
		}
		
		for( Object p : plants) {
			System.out.println(p); // 동적바인딩
		}
		
		//6. 리스트 자르기
		//subList(int index1, int index2) : List
		List sub = plants.subList(0,1);
		System.out.println(sub);
		
		//7. 리스트에 많은 요소를 추가하기
		// addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 요소들을 몽땅 추가해주는 메소드
		plants.addAll(sub);
		System.out.println(plants); // 리스트는 데이터 값(Value) 가 중복될수있음
		
		//8. 리스트에 현재 요소가 있는지 없는지 판별하는 메소드 
		//isEmpty() : 요소가 존재하지않다면 true 하나라도 있으면 false
		System.out.println(plants.isEmpty());
		plants.clear();
		System.out.println(plants.isEmpty());
	}

}
