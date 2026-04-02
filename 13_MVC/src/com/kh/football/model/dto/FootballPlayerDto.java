package com.kh.football.model.dto;

// DTO : Data Transfer Object
// DTO : 순수하게 데이터를 옮겨담을 용도로 만드는 클래스
// DTO / VO 차이첨

// DTO : 값의 전송, setter O, 코드 안넣고, 극단적으로 가면 필드를 public
// VO  : 값을 담음, setter X, equals() / hashCode() / 비즈니스 로직, 필드를 final로 선언 
public class FootballPlayerDto { // DTO 클래스 만들 때 record로 만드는 경우가 많음
	private String name;
	private String position;
	private int playerNum;
	
	public FootballPlayerDto() {}

	public FootballPlayerDto(String name, String position, int playerNum) {
		this.name = name;
		this.position = position;
		this.playerNum = playerNum;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getPlayerNum() {
		return playerNum;
	}
}
