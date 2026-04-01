package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.vo.FootballPlayer;

// 시각적인 부분, 화면 입/출력
// HTML CSS 안 배워서 어쩔 수 없이 여기다 씀
public class FootballView {
	private Scanner sc = new Scanner(System.in);
	private FootballController fc = new FootballController();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 축구선수 CRUD
		// CREATE : 사용자에게 축구선수의 이름, 포지션, 등번호를 입력받아 저장
		// READ : 만들어진 축구선수들을 조회
		// UPDATE : 기존에 존재하는 축구선수의 정보를 수정
		// DELETE : 기존에 존재하는 축구선수의 정보를 삭제
		while(true) {
			System.out.println();
			System.out.println("축구선수 관리 프로그램입니다");
			System.out.println("1. 축구선수 전체 조회하기");
			System.out.println("2. 축구선수 추가하기");
			System.out.println("3. 축구선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.println();
			System.out.print("메뉴를 골라주세요 > ");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.nextLine();
			}
			switch(menu) {
			case 1 : selectAll(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); sc.close(); return;
			case 2 : 
			case 3 : 
			case 4 : 
			default : System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
			}
		}
	}
	
	// 선수들의 정보를 출력해주는 기능
	private void selectAll() {
		// 사용자에게 값 입력받기 X, 모델에서 만든 값 출력하기
		List<FootballPlayer> list = fc.selectAll();
		
		// list의 필드로 있는 배열의 인덱스에 있는 VO의 주소값을 참조해서 필드 값을 출력
		/*
		String name = list.get(0).getName();
		String position = list.get(0).getPosition();
		Integer playerNum = list.get(0).getPlayerNum();
		
		System.out.println("선수의 정보 : ");
		System.out.println("이름 : " + name);
		System.out.println("포지션 : " + position);
		System.out.println("등번호 : " + playerNum);
		*/
		if(!list.isEmpty()) {
			for(FootballPlayer fp : list) {
				System.out.println("선수의 정보");
				System.out.println("==========================");
				System.out.println("이름 : " + fp.getName());
				System.out.println("포지션 : " + fp.getPosition());
				System.out.println("등번호 : " + fp.getPlayerNum());
				System.out.println("==========================");
				System.out.println();
			}
		} else {
			System.out.println("==========================");
			System.out.println("등록된 선수가 없습니다.");
			System.out.println("선수를 추가해주세요");
			System.out.println("==========================");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}