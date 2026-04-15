package com.kh.view;

import java.util.Scanner;

import com.kh.controller.CatController;

public class CatView {
	private Scanner sc = new Scanner(System.in);
	private CatController catController = new CatController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 고양이 생성");
			System.out.println("2. 고양이 조회");
			System.out.println("3. 고양이 수정");
			System.out.println("4. 고양이 삭제");
			// System.out.println("5. 고양이 자랑");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호를 입력 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : insertCat(); break;
			case "2" : break;
			case "3" : break;
			case "4" : break;
			case "0" : System.out.println("프로그램 종료"); return;
			}
		}
	}
	
	private void insertCat() {
		System.out.println("고양이 생성");
		System.out.print("고양이 이름 입력 > ");
		String name = sc.nextLine();
		System.out.print("고양이 성별 입력 > ");
	}
}
