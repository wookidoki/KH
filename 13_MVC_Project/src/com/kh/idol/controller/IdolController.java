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
        aespa.add(new Idol("유지민","리더","로켓런처"));
        aespa.add(new Idol("지젤","-","제노글로시"));
        aespa.add(new Idol("김민정","-","아모멘터"));
        aespa.add(new Idol("닝닝","-","해커"));
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
                return false; // 중복 → false
            }
        }
        return true; // 사용 가능 → true
    }

    public boolean signUp(String userId, String userPwd, String nickName) {
        if(!checkId(userId)) {
            return false; // 중복 → 가입 실패
        }
        Fan fan = new Fan(userId, userPwd, nickName);
        fans.add(fan);
        return true; // 가입 성공
    }
}
	
	
	
	
	
	
	
	
	
	
	


