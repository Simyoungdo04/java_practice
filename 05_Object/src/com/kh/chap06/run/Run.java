package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController;

public class Run {
	// 메소드 => 특정 객체가 수행할 수 있는 기능
	// 소프트웨어로 현실세계의 문제를 해결하기 위함 ==> 웹개발자
	// 우리나라 == 자바공화국						|
	// 너무 오랜 기당동안 자바를 사용함 <------------┘
	public static void main(String[] args) {
		MethodController result = new MethodController();
		int a = result.add(1, 2);
		int b = result.add(2, 3);
		// int result = new MethodController().add(5, 4);
		System.out.printf("%d %d %d %d", a, b, a + b, a - b);
		System.out.println();
		result.method1();
		String str = result.method2();
		System.out.println(str);
		System.out.println(result.method2());
		System.out.println(result.method3());
	}
}
