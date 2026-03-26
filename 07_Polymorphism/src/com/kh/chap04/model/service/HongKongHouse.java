package com.kh.chap04.model.service;

public class HongKongHouse implements CookingSkill, CookingSkillI {
	@Override
	public void makeDopbob() {
		System.out.println("홍콩식 치킨 덮밥 만들기");
	}
}
