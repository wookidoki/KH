package com.kh.idol.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.idol.mode.vo.Board;
import com.kh.idol.mode.vo.Fan;
import com.kh.idol.mode.vo.Idol;

public class IdolController {

    private List<Fan> fans = new ArrayList<>();
    private List<Board> boards = new ArrayList<>();
    private List<Idol> aespa = new ArrayList<>();

    {
        aespa.add(new Idol("������","����","���Ϸ�ó"));
        aespa.add(new Idol("����","-","����۷ν�"));
        aespa.add(new Idol("�����","-","�Ƹ����"));
        aespa.add(new Idol("�״�","-","��Ŀ"));
    }

    public Idol findMember(int menuNo) {
        int index = menuNo - 1;
        if (index >= 0 && index < aespa.size()) {
            return aespa.get(index);
        }
        return null;
    }

    public List<Idol> findAll() {
        return aespa;
    }

    public boolean checkId(String userId) {
        for(Fan f : fans) {
            if(f.getUserId().equals(userId)) {
                return false; // �ߺ� �� false
            }
        }
        return true; // ��� ���� �� true
    }

    public boolean signUp(String userId, String userPwd, String nickName) {
        if(!checkId(userId)) {
            return false; // �ߺ� �� ���� ����
        }
        Fan fan = new Fan(userId, userPwd, nickName);
        fans.add(fan);
        return true; // ���� ����
    }
}
	
	
	
	
	
	
	
	
	
	
	


