package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

		public static void  main(String[]args){
				
			Puppy[] dogs = new Puppy[1];
			
			for(int i = 0; i<dogs.length; i++) {
				
			System.out.println(" ������ Ű���  ");
			dogs[i] = new Puppy();
			
			System.out.println(" �������� ������ �Է����ּ���  ");
			dogs[i].inputData();

			}
			
		
			dogs[0].playing();
			
		}
}
