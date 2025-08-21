package com.kh.chap04_assist.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//기반스트림 input/output 계열인 경우
	//보조스트림도 동일하게 사용
	
	//기반스트림이 Reader / Writer 인경우
	//역시 보조스트림도 동일
	
	//BufferedReader / BufferedWriter
	//속도향상이 목적인 보조스트림
	//임시공간을 제공 
	
	//[ 표현법 ]
	//기반스트림클래스이름 기반스트림 = new 기반스트림생성자(외부매체인자값);
	//
	
	public void outputFile() {
		//BufferedWriter
		
		//0.변수 선언!
		FileWriter fw = null;
		BufferedWriter bw = null;
		
	
		try {
			
			//1. 객체 생성
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw);
			
			//2. 출력
			bw.write("good");
			bw.newLine();
			bw.write("thx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			//3. 자원반납 => close()
			//자원 받납은 반드시 생성의 역순으로 반납
			
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
