package com.kh.chap02.encapsulation.model.vo;

// 하나의 클래스는 하나의 책임만 가져야한다.
// 필드부, 생성자부, 메소드부
public class AutoSellingMachine {
	// 필드(Field)부
	/*
	 * 값을 담는 부분
	 * 
	 * 필드 == 멤버변수
	 * 
	 * 객체들이 가져야할 공통적인 속성을 기술해 놓는 것
	 * 
	 * 접근제한자 자료형 필드식별자;
	 */
	// 자판기 == 제품이름, 제품가격, 수량
	private String name;
	private int price;
	private int amount;
	
	// Dependency(의존) 관계 중요*
	
	private void find() {
		System.out.println(amount);
	}
	private void sell() {
		amount -= 1;
	}
	private void add() {
		amount += 3;
	}
	
	public void open() {
		find();
		add();
		find();
		sell();
		find();
	}
	
	// 객체의 속성 값을 기록 및 수정하는 기능의 메소드 : setter()
	/*
	 * VO -> setter메소드를 구현하지 않음
	 * DTO -> setter를 구현해서
	 * 
	 * setter 만들기 규칙
	 * 
	 * 1. setter메소드는 외부에서 접근이 가능해야 하기 때문에 접근제한자 public을 이용
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(camelCase)를 꼭 지키도록한다.
	 */
	
	// 하나의 메소드는 하나의 기능만을 수행해야한다. **
	
	// price필드 값을 set할 수 있는 메소드 구현
	public void setPrice(int price) { // void 리턴타입 반환형
						// parameter, 매개변수
						// 매개변수는 메소드 호출 시 초기화가 강제됨**
		System.out.println(price);
		// Scope안에서는 해당 영역안에 있는 지역변수가 식별자 우선권을 가진다.
		// this : 해당 객체의 주소값을 가리키는 역할
		this.price = price;
	}
	
	
	
	
	
	
	
	
	
	
}