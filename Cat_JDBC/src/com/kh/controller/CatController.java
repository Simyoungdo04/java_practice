package com.kh.controller;

import java.util.List;

import com.kh.model.dto.Cat;
import com.kh.model.service.CatService;

public class CatController {
	
	public int insertCat(Cat cat) {
		return new CatService().insertCat(cat);
	}
	
	public List<Cat> selectCatList() {
		return new CatService().selectCatList();
	}
	
}
