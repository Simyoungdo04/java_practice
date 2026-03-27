package com.kh.sw.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.sw.controller.SwitchController;
import com.kh.sw.exception.SwitchBoomException;

public class SwitchView {
	private Scanner sc = new Scanner(System.in);
	private SwitchController swc = new SwitchController();
	
	public void menu() {
		System.out.println("불 스위치 프로그램에 오신것을 환영합니다.");
		while(true) {
			System.out.println("스위치 메뉴");
			System.out.println("1. 스위치 누르기");
			System.out.println("2. 프로그램 종료");
			System.out.print("메뉴를 선택해주세요 > ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("정확한 메뉴번호를 입력해주세요");
				continue;
			} finally {
				sc.nextLine();
			}
			switch(menuNo) {
			case 1 : toggleSwitch(); break;
			case 2 : System.out.println("프로그램을 종료합니다"); sc.close(); return;
			default : System.out.println("1, 2번 중에 골라주세요");
			}
		}
	}
	
	private void toggleSwitch() {
		
		// 스위치가 꺼져있는 상태면
		// 스위치를 켠 후에 불이 켜졌습니다. 출력
		
		// 스위치가 켜저있는 상태면
		// 스위치를 끈 후에 불이 꺼졌습니다. 출력
		boolean result = false;
		try {
			result = swc.toggleSwitch();
		} catch(SwitchBoomException e) {
			System.out.println("대폭발");
			return;
		}
		
		if(result) {
			System.out.println("\n불이 켜짐\n");
		} else {
			System.out.println("\n불이 꺼짐\n");
		}
	}
}
