package com.kh.chap05.model.service;

import com.kh.chap05.model.vo.Soup;

public class TunaFilter implements SoupFilter {
	// 재료에 참치 들어간 김치찌개를 골라줘
	@Override
	public boolean test(Soup s) {
		return s.getMainMenu().contains("참치"); // contains == 포함이 돼있는가 / equals == 같은가
	}

}
