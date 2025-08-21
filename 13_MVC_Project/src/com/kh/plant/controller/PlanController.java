package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

//Controller : �ÿ��ڰ� View �� ���� ��û���� ��
//��û�� �޾� ó������ �� �ٽ� ó������� View �� ��ȯ����

public class PlanController {
	//�Ĺ������
	private List<Plant> plants = new ArrayList();
	private PlantDao dao = new PlantDao();
	
	//�ʱ�ȭ���
	{
		plants.add(new Plant("�Ĺ�1","����1"));
	}
	
	//1
	public void createPlant(String name, String type) {
		
		plants.add(new Plant(name,type));
		System.out.println("�Ĺ��� �߰��Ǿ����ϴ�.");
		
		// TODO Auto-generated method stub
		
	}
	
	//2
	public List<Plant> readAll() {
		return plants;
		
	}
	
	//3
	public List<Plant> findByKeword(String keyword) {
		//1. �迭�� �Ἥ ����µ� ��ĭ? �� �𸣸� ����Ʈ 
		//Plant[] ������������
		//List<Plant>
		
		List<Plant> searched = new ArrayList();
		
		for(int i = 0; i < plants.size(); i++) {
			//��Ҹ� ������ ����
			Plant plant = plants.get(i);
			//����ڰ� �Է��� Ű���尡 ���ԵǾ��ִٸ� 
			if(plant.getName().contains(keyword)||(plant.getType().contains(keyword))) {
				searched.add(plant);
			}
		}
		
		return searched;
	}
	
	
	//4
	public int deletPlant(String name, String type) {
		int count = 0;
		
		//��ûó��
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
				//set(int index, E e) : list �� index ��ġ�� ���� ���޵� ���(e) �� set ���ִ� �żҵ�
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
