package com.kh.chap01.model.vo;

public class Child1 extends Parent {
	private int n;
	public Child1() {}

	public Child1(int n) {
		this.n = n;
	}
	public void printChild1() {
		System.out.println("자식클래스1 메소드입니다.");
	}
}
