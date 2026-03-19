package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class Run {

	public static void main(String[] args) {
		// 현실세계의 강아지 => 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무계 : 8, 성별 : 암컷
		// 강아지 객체 생성해보기
		Puppy puppy = new Puppy(); // 객체생성, 인스턴스화
		// 객체를 생성할 때는 new라는 예약어를 사용한다.
		// Memory heap영역에 데이터를 생성
		
		// System.out.println(puppy);
		// 값이 없는 참조자료형은 heap영역에서 null이 들어있다.
		// System.out.println(puppy.name); // 참조
		
		puppy.name = "나폴레옹";
		System.out.println(puppy.name);
		
		
		
		
	}

}
