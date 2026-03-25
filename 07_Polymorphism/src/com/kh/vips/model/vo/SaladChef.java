package com.kh.vips.model.vo;

public class SaladChef {
	private String name;
	public SaladChef(String name) {
		this.name = name;
	}
	public void saladCooking() {
		System.out.println(name + " 셀러드 요리시작합니다.");
	}
	public void breakTime() {
		System.out.println(name + " 쉬는시간");
	}
}
