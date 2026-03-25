package com.kh.vips.model.vo;

public class SaladPartChef extends Chef {
	public SaladPartChef(String name) {
		super(name);	
	}
	
	@Override
	public void cooking() {
		System.out.println("요리시작");
	}
}
