package com.kh.delivery.controller;

import java.util.List;

import com.kh.delivery.model.dto.Menu;
import com.kh.delivery.model.dto.Restaurant;
import com.kh.delivery.model.service.RestaurantService;

public class RestaurantController {
	private RestaurantService rs = new RestaurantService();
	
	public List<Restaurant> findAll() {
		return rs.findAll();
	}

	public List<Restaurant> findBykeyword(String keyword) {
		return rs.findByKeyword(keyword);
	}

	public List<Menu> findById(String id) {
		return rs.findById(id);
	}

}
