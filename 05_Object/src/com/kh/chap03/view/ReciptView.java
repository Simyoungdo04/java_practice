package com.kh.chap03.view;

import java.util.Scanner;

import com.kh.chap03.model.vo.Recipt;

public class ReciptView {
	public void mainMenu() {
		// 사용자에게 영수증 정보를 입력받고
		// 입력받은 영수증 정보를 출력해주는 프로그램
		Scanner sc = new Scanner(System.in);
		// Recipt라는 클래스로 객체를 생성
		Recipt r = new Recipt();
					// 객체(object) <= 이론적인 얘기 / 추상적인 개념
					// Instance ==> 실제 메모리에 올라간 데이터
		// 1. 참조자료형
		// 클래스를 만든다는 행위 == 개발자가 자신에게 필요한 사용자 정의 자료형을 만들겠다.
		// 2. 여러 자료형에 각각 여러 개의 값을 보관가능 + 기능
				
		// 가격, 결제수단, 상점명, 날짜
		System.out.print("가격이 얼마인가요? > ");
		int price = sc.nextInt();
		sc.nextLine();
		r.setPrice(price);
		
		System.out.print("결제수단은 무엇인가요? > ");
		String payment = sc.nextLine();
		r.setPayment(payment);
		
		System.out.print("상점명은 무엇인가요? > ");
		String storeName = sc.nextLine();
		r.setStoreName(storeName);
		
		System.out.print("날짜는 언제 인가요? > ");
		String date = sc.nextLine();
		r.setDate(date);
		
		System.out.println("==============================");
		String info = r.info();
		System.out.println(info);
		
		sc.close();
	}
}
