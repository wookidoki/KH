package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

//Controller : 시용자가 View 를 통해 요청했을 때
//요청을 받아 처리해준 뒤 다시 처리결과를 View 로 반환해줌

public class PlanController {
	//식물저장소
	private List<Plant> plants = new ArrayList();
	private PlantDao dao = new PlantDao();
	
	//초기화블록
	{
		plants.add(new Plant("식물1","종류1"));
	}
	
	//1
	public void createPlant(String name, String type) {
		
		plants.add(new Plant(name,type));
		System.out.println("식물이 추가되었습니다.");
		
		// TODO Auto-generated method stub
		
	}
	
	//2
	public List<Plant> readAll() {
		return plants;
		
	}
	
	//3
	public List<Plant> findByKeword(String keyword) {
		//1. 배열을 써서 들고가는데 몇칸? 잘 모르면 리스트 
		//Plant[] 정해져있을때
		//List<Plant>
		
		List<Plant> searched = new ArrayList();
		
		for(int i = 0; i < plants.size(); i++) {
			//요소를 변수에 대입
			Plant plant = plants.get(i);
			//사용자가 입력한 키워드가 포함되어있다면 
			if(plant.getName().contains(keyword)||(plant.getType().contains(keyword))) {
				searched.add(plant);
			}
		}
		
		return searched;
	}
	
	
	//4
	public int deletPlant(String name, String type) {
		int count = 0;
		
		//요청처리
		for(int i = 0; i < plants.size(); i++) {
			if(name.equals(plants.get(i).getName()) &&
			   type.equals(plants.get(i).getType())){
				
				plants.remove(plants.get(i));
				i--;
				count++; 
			}
		}
		return count;
	

	}
	
	//5
	public boolean updatePlant(String name, String type, String newName, String newType) {

		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) && type.equals(p.getType())) {
				//set(int index, E e) : list 의 index 위치에 값을 전달된 요소(e) 로 set 해주는 매소드
				p.setName(newName);
				p.setType(newType);
				return true;
			}
		}
		return false;
	}
	
	public void outputFile() {
		dao.outputFile(plants);
	}


}
