package com.kh.football.model.vo;

import java.util.Objects;

// UPDATE를 구현해야하는데 record로 구현하면
// 필드에 final키워드가 붙어 수정이 불가능해지기 때문에
public class FootballPlayer {
	private int id;// 식별값을 저장할 필드
	private String name;
	private String position;
	private Integer playerNum;
	
	public FootballPlayer(int id, String name, String position, Integer playerNum) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.playerNum = playerNum;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(Integer playerNum) {
		this.playerNum = playerNum;
	}

	@Override
	public String toString() {
		return "FootballPlayer [id =" + id + ", name=" + name + ", position=" + position + ", playerNum=" + playerNum + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, playerNum, position);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(playerNum, other.playerNum)
				&& Objects.equals(position, other.position);
	}
}
