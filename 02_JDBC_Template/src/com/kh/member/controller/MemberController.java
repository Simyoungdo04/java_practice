package com.kh.member.controller;

import com.kh.member.model.dto.MemberDto;
import com.kh.member.model.service.MemberService;

public class MemberController {

	public boolean idCheck(String memberId) {
		boolean result = new MemberService().idCheck(memberId);
		return result;
	}
	
	public int singUp(MemberDto member) {
		return new MemberService().singUp(member);
	}
}
