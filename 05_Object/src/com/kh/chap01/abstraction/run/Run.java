package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class Run {

	public static void main(String[] args) {
		// 현실세계의 강아지 => 자바세상의 객체로 구현
		// 종 : 푸들, 이름 : 나폴레옹, 나이 : 5, 몸무게 : 8, 성별 : 암컷
		// 강아지 객체 생성해보기
		Puppy puppy = new Puppy(); // 객체생성, 인스턴스화
		// 객체를 생성할 때는 new라는 예약어를 사용한다.
		// Memory heap영역에 데이터를 생성
		
		// System.out.println(puppy);
		// 값이 없는 참조자료형은 heap영역에서 null이 들어있다.
		// System.out.println(puppy.name); // 참조
		
		puppy.name = "나폴레옹";
		System.out.println(puppy.name);
		
		// 종 : 방하르, 이름 : 징기스칸, 나이 : 5, 몸무게 : 40, 성별 : 수
		Puppy khan = new Puppy();
		khan.name = "징기스칸";
		System.out.println(khan.name);
		
		// 정수값 => 정수자료형 int, short, byte, long
		// 실수값 => 실수자료형
		// 논리값 => 논리자료형
		
		// 현실 세게의 강아지의 값 => 개발자가 직접 강아지 자료형 => 클래스
		// 클래스는 개발자가 만드는 자료형이다
		// 클래스란? 객체들의 정보(속성, 행위)들을 담아내는 그릇, 틀, 설계도, 명세
		// 소프트웨어 == 실체가 없음

		// 객체 지향 프로그래밍 => 현실세계에서의 개체를 속성과 행위를 가진 객체로 생성하여
        //					 객체간의 관계를 맺고 상호작용을 통해 프로그래밍을 하는 개발*방법론*
		
		puppy.bark();
		khan.bark();
		
		puppy.weight = 8;
		khan.weight = 40;
		
		System.out.println(puppy.name + "의 몸무게 : " + puppy.weight + "kg");
		System.out.println(khan.name + "의 몸무게 : " + khan.weight + "kg");
		
		puppy.sit();
		khan.sit();
		khan.sit();
		System.out.println(khan.name + "의 몸무게 : " + khan.weight + "kg");
	}

}
