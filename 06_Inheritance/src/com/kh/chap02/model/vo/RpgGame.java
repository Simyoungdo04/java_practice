package com.kh.chap02.model.vo;

public class RpgGame extends Game{
	private int maxLevel;

	public RpgGame() {
		super();
	}

	public RpgGame(String gameName, String publisher, int maxLevel) {
		super(gameName, publisher);
		this.maxLevel = maxLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	
	// 메소드 재정의 / 자식클래스가 우선순위가 높음
	public String info() {
		return super.info() + "최대 레벨 : " + maxLevel;
	}
	
}
