package com.kh.member.model.service;

import java.sql.Connection;

import static com.kh.keeper.common.JdbcTemplate.*;
import com.kh.member.exception.DuplicateMemberIdException;
import com.kh.member.exception.MemberIdToLargeException;
import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.dto.MemberDto;

public class MemberService {
	
	public boolean idCheck(String memberId) {
		Connection conn = getConnection();
		boolean result = new MemberDao().idCheck(conn,memberId);
		close(conn);
		return result;
	}
	
	public int singUp(MemberDto member) {
		if(member.getMemberId().length() > 30) {
			throw new MemberIdToLargeException();
		}
		
		// 모든 검사를 다 넘어갔다고 가정
		Connection conn = getConnection();
		
		MemberDao md = new MemberDao();
		if(md.idCheck(conn, member.getMemberId())) {
			throw new DuplicateMemberIdException();
		}
		
		int result = md.singUp(conn, member);
		
		if(result > 0) {
			commit(conn);
		}
		close(conn);
		
		return result;
	}
}
