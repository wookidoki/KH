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
        aespa.add(new Idol("지젤","래퍼","제노글로시"));
        aespa.add(new Idol("김민정","보컬","아모멘터"));
        aespa.add(new Idol("닝닝","보컬","해커"));
    }

    // 멤버 조회
    public Idol findMember(int menuNo) {
        int index = menuNo - 1;
        if (index >= 0 && index < aespa.size()) {
            return aespa.get(index);
        }
        return null;
    }

    // 전체 멤버 조회
    public List<Idol> findAll() {
        return aespa;
    }

    // 아이디 중복 체크
    public boolean checkId(String userId) {
        for(Fan f : fans) {
            if(f.getUserId().equals(userId)) {
                return false; // 중복
            }
        }
        return true; // 사용 가능
    }

    // 회원가입
    public boolean signUp(String userId, String userPwd, String nickName) {
        if(!checkId(userId)) {
            return false; // 중복 → 실패
        }
        fans.add(new Fan(userId, userPwd, nickName));
        return true; // 가입 성공
    }

    // 로그인
    public Fan login(String userId, String userPwd) {
        for(Fan f : fans) {
            if(f.getUserId().equals(userId) && f.getUserPwd().equals(userPwd)) {
                return f;
            }
        }
        return null;
    }

 // 게시판 작성
    public void writeBoard(int boardNo, String title, String content, String writer, String createDate) {
        boards.add(new Board(boardNo, title, content, writer, createDate));
    }

    // 게시판 전체 조회
    public List<Board> getBoards() {
        return boards;
    }

    // 게시판 상세 조회
    public Board getBoardByNo(int boardNo) {
        for(Board b : boards) {
            if(b.getBoardNo() == boardNo) return b;
        }
        return null;
    }

}
