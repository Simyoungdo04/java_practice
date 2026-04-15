package com.kh.model.service;

import static com.kh.common.CatTemplate.close;
import static com.kh.common.CatTemplate.commit;
import static com.kh.common.CatTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.model.dao.CatDao;
import com.kh.model.dto.Cat;

public class CatService {
	
	public int insertCat(Cat cat) {
		Connection conn = getConnection();
		int result = new CatDao().insertCat(conn, cat);
		if(result > 0) {
			commit(conn);
		}
		close(conn);
		return result;
	}
	
	public List<Cat> selectCatList() {
		Connection conn = getConnection();
		List<Cat> cats = new CatDao().selectCatList(conn);
		close(conn);
		return cats;
	}
	
}
