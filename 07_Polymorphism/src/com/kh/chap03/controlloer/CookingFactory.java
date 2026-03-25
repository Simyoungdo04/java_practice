package com.kh.chap03.controlloer;

public class CookingFactory {
	public Cooking creatRice() {
		return new Rice();
	}
	public Cooking creatPasta() {
		return new Pasta();
	}
}
