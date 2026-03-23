package com.kh.chap05.view;

import com.kh.chap05.model.vo.Member;

public class MemberView {
	
	public void memberMenu() {
		Member m = new Member();
		System.out.println(m.info());
		Member m1 = new Member("user");
		
		Member m2 = new Member("user", "pass");
		System.out.println(m2.info());
		
		Member m3 = new Member("user3","pass3","nickName3");
		System.out.println(m3.info());
	}
	
	
}
