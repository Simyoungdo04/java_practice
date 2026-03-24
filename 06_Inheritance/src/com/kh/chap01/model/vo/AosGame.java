package com.kh.chap01.model.vo;

public class AosGame {
	private String gameName;
	private String publisher;
	private int charactorCount;
	
	// 기본생성자
	// Alt + Shift + s -> o -> Alt + d -> Alt + g
	public AosGame() {}
	
	// 모든 필드를 매개변수로 갖는 생성자
	// Alt + Shift + s -> o -> Alt + g
	public AosGame(String gameName, String publisher, int charactorCount) {
		this.gameName = gameName;
		this.publisher = publisher;
		this.charactorCount = charactorCount;
	}
	
	// 게터 세터
	// Alt + Shift + s -> r -> Alt + a -> Alt + r
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getCharactorCount() {
		return charactorCount;
	}
	public void setCharactorCount(int charactorCount) {
		this.charactorCount = charactorCount;
	}
	
	
}
