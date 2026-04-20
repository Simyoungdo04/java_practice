package com.kh.delivery.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.common.Template;
import com.kh.delivery.model.dao.RestaurantDao;
import com.kh.delivery.model.dto.Menu;
import com.kh.delivery.model.dto.Restaurant;

public class RestaurantService {
	private RestaurantDao rd = new RestaurantDao();
	
	public List<Restaurant> findAll() {
		SqlSession session = Template.getSqlSession();
		List<Restaurant> rests = rd.findAll(session);
		session.close();
		return rests;
	}

	public List<Restaurant> findByKeyword(String keyword) {
		SqlSession session = Template.getSqlSession();
		List<Restaurant> rests = rd.findByKeyword(session, keyword);
		session.close();
		return rests;
	}

	public List<Menu> findById(String id) {
		SqlSession session = Template.getSqlSession();
		List<Menu> menus = rd.findById(session, id);
		session.close();
		return menus;
	}

}
