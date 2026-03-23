package com.kh.chap04.view;

import com.kh.chap04.controller.FieldController;

public class FieldView {
	
	public void check() {
		FieldController fc = new FieldController();
		// 1. FieldController라는 자료형으로 fc라는 지역변수를 선언
		// 2. 객체 생성(new키워드를 만났을 때) -> global 멤버변수 할
		// 3. 생성된 객체의 주소값을 대입
		System.out.println(fc.global);
		
		fc.checkVariable(5); // 메소드가 stack에 올라갈 때 값이 할당이 된다. // checkVariable호출 ==> parameter(매개변수) 할당 및 초기화
		// checkVariable 호출 종료
		// parameter, local 지역변수 소멸
		
		System.out.println(fc.global);
		fc = null; // fc에 대입된 FieldController 주소를 null로 초기화시킴
		// System.out.println(fc.global);
		
		System.out.println(FieldController.JAVA_VERSION);
		
		
		/*
		 * AccessModifier(접근제한자 / 접근제어자)
		 * 
		 * public => 어디서든(같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능
		 * 
		 * protected => 같은 패키지라면 무조건 접근 가능
		 * 			 => 다른 패키지라면 상속구조인 클래스에서만 접근가능 / 상속은 07번에서 배움
		 * 
		 * default(package friendly) => 나랑 같은 패키지에서만 접근 가능
		 * 
		 * private => 오직 클래스 내부에서만 접근 가능(외부에서 X)
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
