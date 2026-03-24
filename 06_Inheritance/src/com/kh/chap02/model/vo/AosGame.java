package com.kh.chap02.model.vo;
// 상속 해주는 클래스 == 부모클래스(슈퍼클래스, 상위클래스, 조상클래스, 확장클래스)
// 상속 받는 클래스  == 자식클래스(서브클래스, 하위클래스, 후손클래스, 파생클래스)

public class AosGame extends Game {
	private int charactorCount;

	public AosGame() {
		super(); // Game(); 게임클래스 기본생성자
		System.out.println("자식클래스");
	}

	public AosGame(int charactorCount) {
		this.charactorCount = charactorCount;
	}

	public int getCharactorCount() {
		return charactorCount;
	}

	public void setCharactorCount(int charactorCount) {
		this.charactorCount = charactorCount;
	}
}
