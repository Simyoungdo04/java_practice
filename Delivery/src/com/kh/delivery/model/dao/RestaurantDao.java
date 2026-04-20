package com.kh.delivery.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.model.dto.Menu;
import com.kh.delivery.model.dto.Restaurant;

public class RestaurantDao {
	
	public List<Restaurant> findAll(SqlSession session) {
		return session.selectList("restMapper.findAll");
	}

	public List<Restaurant> findByKeyword(SqlSession session, String keyword) {
		return session.selectList("restMapper.findByKeyword", keyword);
	}

	public List<Menu> findById(SqlSession session, String id) {
		return session.selectList("restMapper.findById", id);
	}
	
}
