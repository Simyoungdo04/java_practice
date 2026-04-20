package com.kh.delivery.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.model.dto.DeliMember;

public class MemberDao {

	public int signUp(SqlSession session, DeliMember dm) {
		return session.insert("memberMapper.signUp", dm);
	}

	public DeliMember login(SqlSession session, DeliMember loginMember) {
		return session.selectOne("memberMapper.login", loginMember);
	}

	public DeliMember idCheck(SqlSession session, DeliMember id) {
		return session.selectOne("memberMapper.idCheck", id);
	}
}
