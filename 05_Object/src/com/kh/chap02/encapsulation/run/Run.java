package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.AutoSellingMachine;

public class Run {
	// 캡슐화 (encapsulation)
	// 객체지향의 4대 특성: 추상, 캡슐화, 상속, 가용성
	// 속성(데이터)과 해당 데이터를 조작하는 행동(메소드)를 하나의 단위로 묶는 것
	// 정보은닉 (information hiding)
	public static void main(String[] args) {
		// 객체생성 => new 키워드를 쓴다. -> 생성할 클래스 이름을 적어준다.(생성자) 
		// 객체생성 == 메모리(heap)에 적재
		AutoSellingMachine asm = new AutoSellingMachine();
		// 변수 공간에 대입될 수 있는 값은 딱 9가지(null값 제외) 기본자료형
		// 주소값 == 객체(heap영역)
		/*asm.name = "삼양라면";
		System.out.println(asm.name);
		asm.price = 1100;
		System.out.println(asm.price);
		asm.amount = 10;
		System.out.println(asm.amount);
		*/
		
		/*
		 * asm.find(); 
		 * asm.add(); 
		 * asm.find(); 
		 * asm.sell(); 
		 * asm.find();
		 */
		
		// asm.open();
		
		// 필드가 외부에서는 보이지 않아서 오류가 생긴다
		// 접근제한자를 public에서 private로 변경했기 때문이다
		// 직접접근이 불가능 => 간접적으로 접근할 수 있는 방법을 만들어줘야함
		
		// getter / setter라는 메소드 구현하기
		// 라면 가격 1500원으로 세팅하고 싶다.
		asm.setPrice(1500); // argument, 인자값, 인수
		asm.setName("삼양라면");
		asm.setAmount(5);
		
		// 함수 == BuiltInFunction
		// 자바의 클래스 == 자료형
		// 메소드 == 특정 자료형만 수행할 수 있은 기능
		asm.getName();
		
		
		
		
		
	}
}
