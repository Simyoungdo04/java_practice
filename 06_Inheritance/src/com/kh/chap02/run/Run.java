package com.kh.chap02.run;

import com.kh.chap02.model.vo.AosGame;

public class Run {
	public static void main(String[] args) {
		AosGame ag = new AosGame();
		ag.setGameName("롤");
		System.out.println(ag.getGameName());
	}
}
