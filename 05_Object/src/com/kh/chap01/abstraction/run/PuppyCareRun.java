package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

		public static void  main(String[]args){
				
			Puppy[] dogs = new Puppy[1];
			
			for(int i = 0; i<dogs.length; i++) {
				
			System.out.println(" 강아지 키우기  ");
			dogs[i] = new Puppy();
			
			System.out.println(" 강아지의 정보를 입력해주세요  ");
			dogs[i].inputData();

			}
			
		
			dogs[0].playing();
			
		}
}
