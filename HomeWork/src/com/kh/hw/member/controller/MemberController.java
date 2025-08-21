package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	Member mem = new Member();
	
	
	final public int SIZE = 10;
	Member[] m = new Member[SIZE];
	
	public MemberController() {}
	
	public int existMemberNum() {
		
		int count = 0;
		
		for(Member member : m) {
			if (member!= null) { count++; } 
			}
		return count;
		
	}
	
	public Boolean checkId(String id) {
            if (mem != null && mem.getId().equals(id)) {return false;}
            else {return true; }
	}
	
	//회원 등록
	public void insertMember(String id, String name, String password, 
			String email, char gender, int age) {
		
		for (int i = 0; i < m.length ; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name ,password ,email ,gender ,age);
				return;
			}
			
			System.out.println("더 이상 사용자를 등록할수가 없습니다");
		}

	}
	
	public String searchId(String id) {
		return
	}
	
	public Member[] searchName(String name) {
		return
	}
	
	public Member[] searchEmail(String email) {
		return
	}
	
	public Boolean updatePassword(String id, String password) {
		return
	}
	
	public Boolean updateName(String id, String name) {
		return
	}
	
	public Boolean updateEmail(String id, String email) {
		return
	}
	
	public Boolean delete(String id) {
		return
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		return
	}
	
	
	
	
	
	
	
	
	
	

}
