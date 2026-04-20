package com.kh.delivery.view;

import java.util.List;
import java.util.Scanner;

import com.kh.delivery.controller.MemberController;
import com.kh.delivery.controller.RestaurantController;
import com.kh.delivery.model.dto.DeliMember;
import com.kh.delivery.model.dto.LoginCheck;
import com.kh.delivery.model.dto.Menu;
import com.kh.delivery.model.dto.Restaurant;

public class DeliveryMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private LoginCheck lc = new LoginCheck();
	private RestaurantController rc = new RestaurantController();
	
	public void loginMenu() {
		while(true) {
			String menu = null;
			
			if(lc.getLoginCheck() != 0) {
				System.out.println();
				System.out.println("회원 메뉴");
				System.out.println("1. 가게 목록");
				System.out.println("2. 카테고리 검색");
				System.out.println("3. 가게 메뉴 보기");
				System.out.println("4. 주문하기");
				System.out.println("5. 주문내역 확인하기");
				System.out.println("6. 주문 취소");
				System.out.println("0. 로그아웃");
				System.out.print("메뉴 선택 > ");
				menu = sc.nextLine();
				switch(menu) {
				case "1" : findAll(); break;
				case "2" : findBykeyword(); break;
				case "3" : findById(); break;
				case "4" : order(); break;
				case "0" : lc.setLoginCheck(0); break;
				}
			} else {
				System.out.println("로그인 메뉴");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 선택 > ");
				menu = sc.nextLine();
				
				switch(menu) {
				case "1" : login(); break;
				case "2" : signUp(); break;
				case "0" : System.out.println("프로그램 종료"); sc.close(); return;
				}
			}
		}
	}
	
	private void login() {
		System.out.println();
		System.out.println("로그인");
		System.out.print("ID를 입력해주세요 > ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호를 입력해주세요 > ");
		String pwd = sc.nextLine();
		
		DeliMember loginMember = new DeliMember();
		loginMember.setMemberId(id);
		loginMember.setMemberPw(pwd);
		loginMember = mc.login(loginMember);

		if(loginMember != null) {
			System.out.println(loginMember.getMemberName() + "님 로그인 성공");
			lc.setLoginCheck(1);
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	private void signUp() {
		System.out.println();
		System.out.println("회원가입");
		String id = null;
		while(true) {
			System.out.print("ID를 입력해주세요 > ");
			id = sc.nextLine();
			
			DeliMember idCheck = new DeliMember();
			idCheck.setMemberId(id);
			idCheck = mc.idCheck(idCheck);
			if(idCheck != null) {
				System.out.println("이미 존재하는 ID입니다.");
			} else {
				break;
			}
		}
		
		System.out.print("비밀번호를 입력해주세요 > ");
		String pwd = sc.nextLine();
		
		System.out.print("성함을 입력해주세요 > ");
		String name = sc.nextLine();
		
		System.out.print("주소를 입력해주세요 > ");
		String address = sc.nextLine();
		
		int result = mc.signUp(new DeliMember(id, pwd, name, address));
		
		if(result > 0) {
			System.out.println(name + "님 회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	
	private void findAll() {
		System.out.println();
		System.out.println("가게 전체 보기");
		
		List<Restaurant> rests = rc.findAll();
		if(rests.isEmpty()) {
			System.out.println("가게가 없습니다.");
		} else {
			for(Restaurant rest : rests) {
				System.out.println("==================================");
				System.out.println("가게 번호 : " + rest.getRestNo()
				+ "\n가게 이름 : " + rest.getRestName() + " | 카테고리 : " + rest.getCategory()
				+ "\n최소 주문 금액 : " + rest.getMinPrice() + " | 배달 팁 : " + rest.getDeliveryFee());
			}
			System.out.println("==================================\n");
		}
	}
	
	private void findBykeyword() {
		System.out.println();
		System.out.println("카테고리 검색");
		System.out.print("음식 카테고리 입력 > ");
		String keyword = sc.nextLine();
		
		List<Restaurant> rests = rc.findBykeyword(keyword);
		if(rests.isEmpty()) {
			System.out.println("카테고리를 조회할 수 없습니다.");
		} else {
			for(Restaurant rest : rests) {
				System.out.println("==================================");
				System.out.println("가게 번호 : " + rest.getRestNo()
				+ "\n가게 이름 : " + rest.getRestName() + " | 카테고리 : " + rest.getCategory()
				+ "\n최소 주문 금액 : " + rest.getMinPrice() + " | 배달팁 : " + rest.getDeliveryFee());
			}
			System.out.println("==================================\n");
		}
	}
	
	private String findById() {
		System.out.println();
		System.out.println("가게 메뉴 보기");
		findAll();
		System.out.print("가게 ID 입력 > ");
		String id = sc.nextLine();
		
		List<Menu> menus = rc.findById(id);
		
		if(menus.isEmpty()) {
			System.out.println("가게를 찾지 못했습니다.");
			id = null;
		} else {
			for(Menu menu : menus) {
				System.out.println("가게 이름 : " + menu.getRestName());
				System.out.println("최소 주문 금액 : " + menu.getMinPrice() 
								 + " | 배달팁 : " + menu.getDeliveryFee());
				System.out.println("==================================");
				if(menus.isEmpty()) {
					System.out.println("메뉴 없음");
				} else {
					for(Menu getMenu : menus) {
						System.out.println("음식 번호 : " + getMenu.getMenuNo());
						System.out.println("음식 이름 : " + getMenu.getMenuName() 
							             + " | 가격 : " + getMenu.getPrice()
							             + "\n품절 유무 : " + getMenu.getSoldOut());
						System.out.println();
					}
					System.out.println("==================================");
					break;
				}
			}
		}
		return id;
	}
	
	private void order() {
		System.out.println();
		System.out.print("주문하기");
		String restId = findById();
		String menuNo = null;
		if(restId != null) {
			System.out.print("메뉴 번호 입력 > ");
			menuNo = sc.nextLine();
		} else {
			return;
		}
		
//		int result = rc.order(restId, menuNo);
//		
//		if(result > 0) {
//			System.out.println("주문 성공");
//		} else {
//			System.out.println("주문 실패");
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
