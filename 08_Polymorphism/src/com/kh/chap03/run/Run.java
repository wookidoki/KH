package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FootBall fb = new FootBall();
		BaseBall bb = new BaseBall();
		
		fb.rule();
		bb.rule();
		
		// �߻�Ŭ������ ����Ǿ� ��ü ������ �Ұ���
		//Sports s = new Sports();
		//�������� ���밡��
		
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			
		}

	}

}
