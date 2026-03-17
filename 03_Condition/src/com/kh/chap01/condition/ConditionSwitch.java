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
	/*
	 * switch 문
	 * 
	 * [표현식]
	 * 
	 * switch(case문에 기술할 동등비교 대상) {
	 * case 정수, 실수, 문자, 문자열 : 실행할 코드;
	 * break;
	 * case ~
	 * }
	 * 
	 * switch(정수 || 실수 || 문자 || 문자열) {
	 * case 값1 : 실행할코드a; // 동등비교 대상 == 값1 true일 경우 실행할 코드 a를 수행
	 * break;			   // switch영역(Scope)을 빠져나감
	 * case 값2 : 실행할코드b; // 동등비교 대상 == 값2 true일 경우 실행할 코드 b를 수행
	 * break;			   // switch영역(Scope)을 빠져나감
	 * case 값3 : 실행할코드c; // 동등비교 대상 == 값3 true일 경우 실행할 코드 c를 수행
	 * break;			   // switch영역(Scope)을 빠져나감
	 * default : 실행할코드; // == else
	 * }
	 */
	
	// 조회하는 프로그램 => 사람이름을 입력하면 정보를 조회해주는 프로그램
	public void findByName() {
		
		// 사용자에게 사람이름을 입력받아서
		// 사람의 정보를 출력해줄 것
		
		// 고길동, 짱구, 둘리, 도라에몽

		// 고길동 : 남성,  서울특별시 도봉구 쌍문동, 좋아하는 것: 술, 싫어하는 것: 둘리 일당
		// 짱구	: 남성, 서울특별시 초록구 떡잎마을, 좋아하는 것: 가족, 싫어하는 것: 피망 
		// 둘리	: 수컷, 서울특별시 도봉구 쌍문동,  좋아하는 것: 장난치기, 싫어하는 것: 고길동
		// 도라에몽: 없음, 도쿄도 네리마구 츠키미다이, 좋아하는 것: 노진구, 싫어하는 것: 쥐
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		// System.out.println(name);
		
		// Ver 1
		/*
		switch(name) {
		case "고길동" : System.out.println("남성, 서울특별시 도봉구 쌍문동, 좋아하는 것: 술, 싫어하는 것: 둘리 일당");
		break;
		case "짱구" : System.out.println("남성, 서울특별시 초록구 떡잎마을, 좋아하는 것: 가족, 싫어하는 것: 피망 ");
		break;
		case "둘리" : System.out.println("수컷, 서울특별시 도봉구 쌍문동,  좋아하는 것: 장난치기, 싫어하는 것: 고길동");
		break;
		case "도라에몽" : System.out.println("도라에몽: 없음, 도쿄도 네리마구 츠키미다이, 좋아하는 것: 노진구, 싫어하는 것: 쥐");
		break;
		default : System.out.println("검색 할 수 없는 이름입니다.");;
		}
		*/
		
		// 첫 번째 -> 모던스위치 문법
		String address = switch(name) {
		case "고길동", "둘리" -> "서울특별시 도봉구 쌍문동";
		case "짱구" -> "서울특별시 초록구 떡잎마을";
		case "도라에몽" -> "도쿄도 네리마구 츠키미다이";
		default -> "주소지 없음";
		};
		// System.out.println(address);
		
		// 두 번째 -> 중복제거하기
		String favorite = "";
		switch(name) {
		case "고길동" :  favorite = "술"; break;
		case "짱구" :  favorite = "가족"; break;
		case "둘리" :  favorite = "장난치기"; break;
		case "도라에몽" :  favorite = "노진구"; break;
		default : System.out.println("그런 사람은 존재한지 않습니다.");
		return; // 현재 메소드 영역을 아에 빠져나가는 구문 -> 이 메소드를 호출한 곳으로 이동
		} // break 구문을 만나면 빠져나오는 부분
		
		System.out.println(name + "\n" + "거주지 : " + address + ", 좋아하는 것 : " + favorite);
		
	} // return 구문을 만나는 순간 메소드의 닫는 Scope로 이동
	
	// 전통적인 로그인 기능 구현
	
	
	
	
	
	
	
	
}



























