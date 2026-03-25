package com.kh.chap03.controlloer;

public class Rice extends Cooking {

	private void Rice1() {
		System.out.println("밥짓기");
	}

	@Override
	public void cooking() {
		Rice1();
	}

}
