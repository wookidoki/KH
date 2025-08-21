package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.MakgeolliDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Run {
	
	public static void main(String[] args) {
		
		SojuDrinker s1 = new SojuDrinker(1);
		SojuDrinker s2 = new SojuDrinker(3);
		
		BeerDrinker b1 = new BeerDrinker(true);
		BeerDrinker b2 = new BeerDrinker(false);
		
		MakgeolliDrinker m1 = new MakgeolliDrinker(30);
		MakgeolliDrinker m2 = new MakgeolliDrinker(50);
				
		
		SojuDrinker[] sArr = new SojuDrinker[2];
		BeerDrinker[] bArr = new BeerDrinker[2];
		MakgeolliDrinker[] mArr = new MakgeolliDrinker[2];
		
		sArr[0] = s1;
		sArr[1] = s2;
		
		bArr[0] = b1;
		bArr[1] = b2;
		
		mArr[0] = m1;
		mArr[1] = m2;
		
	//===============================================================
		
		//������ 
		// �ڽ�Ŭ������ �θ�Ŭ������ �ڷ����� �޾� ����Ҽ����� 
		
		Drinker [] drinkArr = new Drinker[6];
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = m1;
		drinkArr[5] = m2;
		
		for (int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}
		
		
	}

}
