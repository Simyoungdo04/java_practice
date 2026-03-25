package com.kh.chap02.model.vo;
/*
 * 상속(Inheritance) 
 * 
 * 기존에 존재하는 클래스를 이용해서 새로운 클래스를 만드는 기술
 * 
 * 상속은 유지보수가 어렵기 때문에 
 * 합성(Composition)을 통해 구현하는 것을 권장함
 * 
 * 상속 특징
 * 
 * - 자바는 클래스간의 다중상속을 지원하지 않음(단일상속만 가능)
 * - 명시되어있지 않지만 자바의 모든 클래스는 Object클래스의 후손 클래스
 * (내가 만든 클래스, 원래 제공하는 클래스)
 * 
 * => 모든 객체는 Object클래스에 존재하는 멤버를 사용할 수 있다
 * => Object클래스에 존재하는 메소드가 마음에 안든다면
 * => Object클래스의 메소드를 재정의 할 수 있음
 */
public class Game {
	// 공통필드
	public String gameName;
	public String publisher;
	public Game() {
		System.out.println("부모클래스");
	}
	
	public Game(String gameName, String publisher) {
		this.gameName = gameName;
		this.publisher = publisher;
	}
	
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
	
	public String info() {
		return "게임명 : " + gameName + ",운영사 : " + publisher;
	}
	
	
	
}
