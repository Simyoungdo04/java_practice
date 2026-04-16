package com.kh.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.controller.CatController;
import com.kh.model.dto.Cat;

public class CatView {
	private Scanner sc = new Scanner(System.in);
	private CatController catController = new CatController();
	
	public void mainMenu() {
		while(true) {
			System.out.println(" === 메인 메뉴 === ");
			System.out.println("1. 고양이 관리 메뉴");
			System.out.println("2. 집사 관리 메뉴");
			System.out.println("3. 고양이 자랑 게시판");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴번호 입력 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : catMenu(); break;
			case "2" : houseKeeperMenu(); break;
			case "3" : break;
			case "0" : System.out.println("프로그램 종료"); return;
			default : System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	public void catMenu() {
		while(true) {
			System.out.println(" === 고양이 관리 메뉴 === ");
			System.out.println("1. 고양이 생성");
			System.out.println("2. 고양이 전체 조회");
			System.out.println("3. 내 고양이 조회");
			System.out.println("4. 아이디로 고양이 조회");
			System.out.println("5. 고양이 수정");
			System.out.println("6. 고양이 삭제");
			System.out.println("0. 메인 메뉴 돌아가기");
			System.out.print("메뉴번호 입력 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" : insertCat(); break;
			case "2" : selectCatList(); break;
			case "3" : break;
			case "4" : break;
			case "5" : break;
			case "0" : return;
			default : System.out.println("없는 메뉴입니다.");
			}
		}
	}
	
	private void houseKeeperMenu() {
		while(true) {
			System.out.println(" === 집사 관리 메뉴 === ");
			System.out.println();
		}
	}
	
	private void insertCat() {
		System.out.println("고양이 생성");
		System.out.print("고양이 이름 입력 > ");
		String name = sc.nextLine();
		System.out.print("고양이 성별 입력 > ");
		String gender = sc.nextLine();
		System.out.print("고양이 몸무계 입력 > ");
		double weight = 0;
		try {
			weight = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("몸무계는 정수 또는 실수 값으로 입력해주세요.");
			return;
		} finally {
			sc.nextLine();
		}
		
		int result = catController.insertCat(new Cat(name, gender, weight));
	}
	
	private void selectCatList() {
		List<Cat> cats = catController.selectCatList();
		if(cats.isEmpty()) {
			System.out.println("고양이가 존재하지 않습니다.");
		} else {
			System.out.println();
			System.out.println("전체 고양이");
			for(Cat cat : cats) {
				System.out.println("고양이 번호 : " + cat.getCatId() + "\n" + 
							       "고양이 이름 : " + cat.getCatName() + "\t" + 
								   "고양이 성별 : " + cat.getCatGender() + "\n" + 
							       "고양이 몸무게 : " + cat.getCatWeight() + "\t" +
								   "고양이 생일 : " + cat.getCatBirth() + "\t" +
							       "고양이 집사 : " + cat.getCatKeeperId());
			}
			System.out.println();
		}
	}
}
