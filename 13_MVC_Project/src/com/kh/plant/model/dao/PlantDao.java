package com.kh.plant.model.dao;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.kh.plant.model.vo.Plant;

public class PlantDao {
	
	public void outputFile(List<Plant> plants) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("plants.txt"))) {
            wr.write("\t\t식물목록");
            wr.newLine();

            for (int i = 0; i < plants.size(); i++) {
                Plant plant = plants.get(i);
                wr.write((i + 1) + "번 : " + plant.getName() + " (" + plant.getType() + ")");
                wr.newLine();
            }

            System.out.println("plants.txt 파일 저장 완료!");

            // 저장한 파일 바로 열기
            Desktop.getDesktop().open(new File("plants.txt"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}