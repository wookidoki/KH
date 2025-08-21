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
        aespa.add(new Idol("����","����","����۷ν�"));
        aespa.add(new Idol("�����","����","�Ƹ����"));
        aespa.add(new Idol("�״�","����","��Ŀ"));
    }

    // ��� ��ȸ
    public Idol findMember(int menuNo) {
        int index = menuNo - 1;
        if (index >= 0 && index < aespa.size()) {
            return aespa.get(index);
        }
        return null;
    }

    // ��ü ��� ��ȸ
    public List<Idol> findAll() {
        return aespa;
    }

    // ���̵� �ߺ� üũ
    public boolean checkId(String userId) {
        for(Fan f : fans) {
            if(f.getUserId().equals(userId)) {
                return false; // �ߺ�
            }
        }
        return true; // ��� ����
    }

    // ȸ������
    public boolean signUp(String userId, String userPwd, String nickName) {
        if(!checkId(userId)) {
            return false; // �ߺ� �� ����
        }
        fans.add(new Fan(userId, userPwd, nickName));
        return true; // ���� ����
    }

    // �α���
    public Fan login(String userId, String userPwd) {
        for(Fan f : fans) {
            if(f.getUserId().equals(userId) && f.getUserPwd().equals(userPwd)) {
                return f;
            }
        }
        return null;
    }

 // �Խ��� �ۼ�
    public void writeBoard(int boardNo, String title, String content, String writer, String createDate) {
        boards.add(new Board(boardNo, title, content, writer, createDate));
    }

    // �Խ��� ��ü ��ȸ
    public List<Board> getBoards() {
        return boards;
    }

    // �Խ��� �� ��ȸ
    public Board getBoardByNo(int boardNo) {
        for(Board b : boards) {
            if(b.getBoardNo() == boardNo) return b;
        }
        return null;
    }

}
