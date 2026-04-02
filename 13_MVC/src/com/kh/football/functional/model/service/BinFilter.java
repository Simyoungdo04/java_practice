package com.kh.football.functional.model.service;

import com.kh.football.functional.model.dto.Material;

@FunctionalInterface // 이 인터페이스는 함수형이다, 람다 사용한다.
public interface BinFilter {
	// 추상메소드가 2개 이상일 경우 람다 불가
	boolean test(Material m);
}
