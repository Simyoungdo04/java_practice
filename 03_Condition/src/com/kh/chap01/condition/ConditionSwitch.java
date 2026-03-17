package com.kh.chap01.condition;

import java.util.Scanner;

public class ConditionSwitch {
	
	public void method0() {
		// 스위치문 연습하기
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 층 가세요?(B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		
		String message = "층입니다. 문이 열립니다.";
		
		switch(floor) {
		case "B1" : System.out.println("지하 1" + message);
		break;
		case "B2" : System.out.println("지하 2" + message);
		break;
		case "B3" : System.out.println("지하 3" + message);
		}
		
	}
	
}



























