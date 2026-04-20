package com.kh.delivery.controller;

import com.kh.delivery.model.dto.DeliMember;
import com.kh.delivery.model.service.MemberService;

public class MemberController {
	private MemberService ms = new MemberService();
	
	public int signUp(DeliMember dm) {
		return ms.signUp(dm);
	}
	
	public DeliMember login(DeliMember loginMember) {
		return ms.login(loginMember);
	}

	public DeliMember idCheck(DeliMember id) {
		return ms.idCheck(id);
	}
	
}
