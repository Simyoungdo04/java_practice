package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.service.CookingSkill;
import com.kh.chap04.model.service.HitTheBob;
import com.kh.chap04.model.service.HongKongHouse;

public class Run { // Interface : 면과 면의 경계
	public static void main(String[] args) {
		
		// 기능에 대한 설계
		
		Scanner sc = new Scanner(System.in);
		// 손님이 덮밥 시켜야지 가정
		System.out.println("덮밥 주문 서비스에 오신것을 환영합니다.");
		System.out.println("주문하실 덮밥 브랜드를 선택하시기 바랍니다.");
		System.out.println("1. 청킹미미");
		System.out.println("2. 힛또밥");
		System.out.print("메뉴를 선택해주세요 > ");
		int menuNo = sc.nextInt();
		
		CookingSkill cs = null;
		switch(menuNo) {
		case 1 : cs = new HongKongHouse(); break;
		case 2 : cs = new HitTheBob(); break;
		}
		cs.makeDopbob();
	}
}
