package com.kh.delivery.model.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.common.Template;
import com.kh.delivery.model.dao.MemberDao;
import com.kh.delivery.model.dto.DeliMember;

public class MemberService {
	private MemberDao md = new MemberDao();
	
	public int signUp(DeliMember dm) {
		SqlSession session = Template.getSqlSession();
		int result = md.signUp(session, dm);
		if(result > 0) {
			session.commit();
		}
		session.close();
		return result;
	}

	public DeliMember login(DeliMember loginMember) {
		SqlSession session = Template.getSqlSession();
		DeliMember dm = md.login(session, loginMember);
		
		if(dm != null) {
			session.commit();
		}
		session.close();
		return dm;
	}

	public DeliMember idCheck(DeliMember id) {
		SqlSession session = Template.getSqlSession();
		DeliMember idCheck = md.idCheck(session, id);
		if(idCheck != null) {
			session.commit();
		}
		session.close();
		return idCheck;
	}
	
}
