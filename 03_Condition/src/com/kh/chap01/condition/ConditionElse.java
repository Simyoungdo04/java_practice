package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionElse {
	/*
	 * if ~ else
	 * 
	 * [표현법]
	 * 
	 * if(조건식) { // 만약에
	 * 		조건식의 결과가 true일 경우 실행할 코드 - a
	 * } else { // 그게 아니고
	 * 		조건식의 결과가 false일 경우 실행할 코드 - b
	 * }
	 * => 조건식의 결과가 true일 경우 a를 실행
	 * => 조건식의 결과가 false일 경우 b를 실행
	 */
	public void method1() {
		// 당첨 핸드폰 번호 뒷자리 => 7777
		
		// 사용자에게 핸드폰 번호 뒷자리를 입력받아서
		System.out.print("핸드폰 번호 뒷자리 4개를 입력해주세요. >");
		Scanner sc = new Scanner(System.in);
		// int phoneNum = sc.nextInt(); <= 이거 안됨 0000 == 0 **
		String phoneNum = sc.nextLine();
		// System.out.println(phoneNum);
		
		// 당첨 핸드폰번호와 일치한다면 당첨을 출력하고
		// 당첨자 번호랑 같으면 당첨 아니면 다음기회에
		
		// 어떤 값을 가지고 사용자가 입력한 폰번호 == phoneNum / "7777"
		// 어떤 연산 == 동등비교 연산
		// 문자열 값을 비교하고 싶을때 : == 동등비교 연산자의 경우 기본타입 자료형 8개 끼리만 사용가능하기 때문에
		// 					     equals()라는 메소드를 호출해서 비교해주어야함
		//						 문자열 값이 일치할 경우 true를 반환 일치하지 않을 경우 false를 반환
		if(phoneNum.equals("7777")) {
			System.out.println("축하합니다! 백만원 상품권 당첨입니다~");
		} else {
			System.out.println("아쉽지만 다음기회에...");
		}
		
		/*
		if(!(phoneNum.equals("7777"))) {
			System.out.println("아쉽지만 다음기회에");
		}
		*/ 
		// if문의 조건식 결과가 true일 경우 => if Scope가 끝나면 else Scope를 건너뜀
		// if문의 조건식 결과가 false일 경우 => if Scope를 건너뛰고 else Scope를 진입
		// 불필요한 연산이 줄어든다! => 처리속도 향상
		
	}
	
	/*
	 * if ~ else if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행
	 * } else if(조건식2) {
	 * 		조건식2가 true일 경우 실행
	 * } else if(조건식3) {
	 * 		조건식3이 true일 경우 실행
	 * } else {
	 * 		모든 조건들이 false일 경우 실행
	 * }
	 */
	
	public void method2() {
		// 핸드폰 뒷자리를 입력받아서 1, 2, 3등, 다음기회에 출력하기
		// 7777, 1111, 9999
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 뒷자리를 입력해주세요. >");
		String phoneNum = sc.nextLine();
		// System.out.println(phoneNum);
		// 만약에 사용자가 7777을 입력하면 1등을 출력하기
		if(phoneNum.equals("7777")) {
			System.out.println("축하합니다! 1등 입니다~");
		} else if(phoneNum.equals("1111")) {
			System.out.println("축하합니다! 2등 입니다~");
		} else if(phoneNum.equals("9999")) {
			System.out.println("축하합니다! 3등 입니다~");
		} else {
			System.out.println("아쉽지만 다음기회에...");
		}
		
	}
	
}
