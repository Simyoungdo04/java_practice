package com.kh.football.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.football.controller.FootballController;
import com.kh.football.model.dto.FootballPlayerDto;
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
			// 리스트에 풋볼플레이어를 추가 <- 방법이 없기 때문
			// 사용자가 입력한 값을 저장소에 저장
			System.out.println("3. 축구선수 수정하기");
			System.out.println("4. 축구선수 삭제하기");
			// 축구선수 id 받아서 한명만 지우기
			System.out.println("5. 축구선수 정보 파일로 출력하기");
			System.out.println("6. 축구선수 검색하기");
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
			case 2 : addFootballPlayer(); break;
			case 3 : updateFootballPlayer(); break;
			case 4 : deleteFootballPlayer(); break;
			case 5 : fc.outputFootballPlayer(); break;
			case 6 : findFootballPlayer(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); sc.close(); return;
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
				System.out.println("ID : " + fp.getId());
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
	
	private void addFootballPlayer() {
		// View가 해야할 일
		// 1. 사용자의 입력값 받기
		// 2. Model에서 만든 값 출력하기
		
		// 축구선수를 만들 수 있는 값들
		// 선수이름 : String, 포지션 : String, 등번호 : Integer
		System.out.println();
		System.out.print("선수의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		System.out.print("선수의 포지션을 입력해주세요 > ");
		String position = sc.nextLine();
		System.out.print("선수의 등 번호를 입력해주세요 > ");
		int playerNum = 0;
		try {
			playerNum = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("등 번호는 숫자만 입력이 가능합니다.");
			return;
		}
		
		// 사용자의 입력값 받기 끝 -> View가 할 일 1절 끝
		// case 1) 100% 성공이니까 추가하고 끝내기
		// case 2) 성공 실패 여부를 판별해서 성공했다 실패했다 출력해주기
		// case 3) 추가 성공 시 추가된 데이터 추력해주기 실패 시에 실패했다 말해주기 *
		
		// 3개의 값을 넘기는데 너무 번거롭다
				// 1. FootballPlayer VO X ==> 생성자 인자값 부족
				// 2. ArrayList O 		  ==> 인덱스를 알아야함
				// 3. HashMap O 		  ==> <String, Object>
				// 4. Object[]			  ==> 이거쓸바에 리스트씀
		FootballPlayer fp = fc.addFootballPlayer(new FootballPlayerDto(name, position, playerNum));
		
		// 성공 / 실패 여부를 판별 한 뒤
		// 각각 맞는 출력문을 작성
		if(fp != null) {
			selectAll();
		} else {
			System.out.println();
			System.out.println("선수 등록에 실패했습니다.");
			System.out.println("관리자에게 문의하세요.");
		}
		
	}
	
	private void updateFootballPlayer() {
		// 뭘 업데이트 할지 정해야함
		// 이름하고 포지션하고 등번호 바꾸기
		
		// 선수를 어떻게 식별할 것인가
		// ID값이 일치하면
		
		selectAll();
		System.out.println("어떤 선수의 정보를 수정하시겠습니까?");
		System.out.print("선수의 ID를 입력해주세요 > ");
		
		try {
			int id = Integer.parseInt(sc.nextLine());
			// 1. 입력받은 id값을 가지고 서비스까지 가서 id가 있는지 확인
			// 	  있으면 아래코드 수행 없으면 return 하기

			// 1_1) 이미 우리는 축구선수주소 가지고있는 List의 주소를 반환받는
			// 		메소드를 구현 => Service
			// 		Service메소드를 호출해서 반환받아서 여기서 검사
			
			// 1_2) id값을 들고 서비스까지 가서 서비스에 검증 로직 작성
			//		id가 있나 없나 검증하는 코드
			boolean result = fc.idCheck(id);
			
			if(!result) {
				System.out.println("존재하지 않는 아이디 입니다.");
				return;
			}
			
			// 2. 입력받은 id값이 있던지 없던지 그냥 다 받아버리기
			// 	  그리고 서비스가서 있는지 없는지 판별 후 작업 수행
			
			System.out.print("변경하실 이름을 입력해주세요 > ");
			String name = sc.nextLine();
			System.out.print("변경하실 포지션을 입력해주세요 > ");
			String position = sc.nextLine();
			System.out.print("변경하실 번호를 입력해주세요 > ");
			int playerNum = Integer.parseInt(sc.nextLine());
			
			// Update 시 새로운 FootballPlayer를 만들어서 넣어주어야 하는데
			// id값을 기존의 id값으로 유지할 것인가
			// 새로운 id를 만들 것인가
			fc.updateFootballPlayer(id, new FootballPlayerDto(name, position, playerNum));

		} catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력해주세요");
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}
		// 1. 아이디
		// 2. 이름, 포지션, 등번호
	}
	
	private void deleteFootballPlayer() {
		System.out.println();
		System.out.println("등록된 축구선수를 해지하겠습니다.");
		selectAll();
		System.out.print("어떤 선수를 해지하시겠습니까 > ");
		int id = 0;
		
		try {
			id = sc.nextInt();
			sc.nextLine();
		} catch(InputMismatchException e) {
			System.out.println("아이디는 숫자만 입력 가능합니다.");
			sc.nextLine();
			return;
		}
		// 우리가 선수 삭제해서 해야할 작업
		
		// 사용자가 -1 <-- 유효성검증 => 패스
		
		// 구현방식
		// 1. id를 들고가서 index를 가져와서 index를 전달해서 한번에 리무브
		// 2. id를 들고가서 서비스에서 반복을 돌려서 찾아서 리무브
		String result = fc.deleteFootballPlayer(id);
		
		if(result != null) {
			System.out.println(result + "선수의 정보가 삭제되었습니다.");
		} else {
			System.out.println("id를 찾을 수 없습니다.");
		}
	}
	
	private void findFootballPlayer() {
		System.out.println("선수 검색 서비스입니다.");
		System.out.println("찾고 싶은 이름의 키워드를 입력해주세요 > ");
		String keyword = sc.nextLine();
		List<FootballPlayer> players = fc.findFootballPlayer(keyword);
		if(players.isEmpty()) {
			System.out.println("==============================");
			System.out.println("검색결과가 존재하지 않습니다.");
			System.out.println("==============================");
			
		} else {
			System.out.println();
			System.out.println(keyword + "검색 결과입니다.");
			for(FootballPlayer player : players) {
				System.out.println("이름 : " + player.getName() + ", 포지션 : " + player.getPosition() 
															   + ", 등번호 : " + player.getPlayerNum());
				System.out.println();
			}
		}
	}
	
	
	
	
}