package com.kh.chap04_assist.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//��ݽ�Ʈ�� input/output �迭�� ���
	//������Ʈ���� �����ϰ� ���
	
	//��ݽ�Ʈ���� Reader / Writer �ΰ��
	//���� ������Ʈ���� ����
	
	//BufferedReader / BufferedWriter
	//�ӵ������ ������ ������Ʈ��
	//�ӽð����� ���� 
	
	//[ ǥ���� ]
	//��ݽ�Ʈ��Ŭ�����̸� ��ݽ�Ʈ�� = new ��ݽ�Ʈ��������(�ܺθ�ü���ڰ�);
	//
	
	public void outputFile() {
		//BufferedWriter
		
		//0.���� ����!
		FileWriter fw = null;
		BufferedWriter bw = null;
		
	
		try {
			
			//1. ��ü ����
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw);
			
			//2. ���
			bw.write("good");
			bw.newLine();
			bw.write("thx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			//3. �ڿ��ݳ� => close()
			//�ڿ� �޳��� �ݵ�� ������ �������� �ݳ�
			
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void inputFile() {
		
		try (FileWriter fw = new FileWriter("c_buffer.txt");
			     BufferedWriter bw = new BufferedWriter(fw)) {
			    
			    bw.write("good");
			    bw.newLine();
			    bw.write("thx");
			    
			} catch (IOException e) {
			    e.printStackTrace();
			}
		
	}

}
