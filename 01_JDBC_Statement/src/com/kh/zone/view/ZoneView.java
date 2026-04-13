package com.kh.zone.view;

import java.util.Scanner;

import com.kh.zone.controller.ZoneController;

public class ZoneView {
	private Scanner sc = new Scanner(System.in);
	private ZoneController zc = new ZoneController();
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("1. 구역 추가하기");
			System.out.println("2. 구역 전체조회하기");
			System.out.println("3. 구역 수정하기");
			System.out.println("4. 구역 삭제하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴를 선택해주세요 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : save(); break;
			case "2" : break;
			case "3" : break;
			case "4" : break;
			case "0" : break;
			default : System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	private void save() {
		System.out.println("============================");
		System.out.print("구역 이름을 입력해주세요 > ");
		String zoneName = sc.nextLine();
		System.out.print("구역 실내외구분을 입력해주세요 > ");
		String zoneType = sc.nextLine();
		
		int result = zc.save(zoneName, zoneType);
		
		if(result > 0) {
			
		} else {
			
		}
	}
}
