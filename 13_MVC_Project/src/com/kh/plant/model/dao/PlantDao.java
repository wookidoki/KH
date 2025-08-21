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
            wr.write("\t\t�Ĺ����");
            wr.newLine();

            for (int i = 0; i < plants.size(); i++) {
                Plant plant = plants.get(i);
                wr.write((i + 1) + "�� : " + plant.getName() + " (" + plant.getType() + ")");
                wr.newLine();
            }

            System.out.println("plants.txt ���� ���� �Ϸ�!");

            // ������ ���� �ٷ� ����
            Desktop.getDesktop().open(new File("plants.txt"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}