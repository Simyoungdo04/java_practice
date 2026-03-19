package com.kh.chap01.abstraction.model.vo;
/*
 * public class 클래스식별자 {
 * 		
 * [필드부]
 * 
 * 
 * [생성자부]
 * 
 * 
 * [메소드부]
 * 
 * 
 * }
 */
public class Puppy {
	
	// [ 필드부 ]
	// 접근제한자 자료형 필드식별자;
	
	// 접근제한자 : 이 필드에 접근할 수 있는 접근권한을 제어하는 역할
	//		     public > protected > default > private
	// 클래스 내부에 필드를 선언할 때는 반드시 접근제한자를 붙일 것
	
	// 배열보다 좋은 점 => 여러가지 타입을 넣을 수 있다.
	// 이름, 종, 성별, 몸무게, 나이
	public String name;    // 강아지의 이름을 저장할 필드
	public String species; // 강아지의 종을 저장할 필드
	public String gender;  // 강아지의 성별을 저장할 필드
	public int weight; 	   // 강아지의 몸무계를 저장할 필드
	public int age;		   // 강아지의 나이를 저장할 필드
	
	// [ 생성자부 ]
	
	
	
	// [ 메소드부 ] ==> Puppy가 수행할 수 있는 행위(기능)
	// 짖기, 앉기
	public void bark() { // bark 메소드 입장에서 이름은 클래스 내부에 있다.
		System.out.println(name + " 짖다.");
	}
	
	public void sit() {
		System.out.println(name + " 앉다.");
		weight--;
	}
}















