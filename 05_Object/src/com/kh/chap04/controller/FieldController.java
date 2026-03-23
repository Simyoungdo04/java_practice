package com.kh.chap04.controller;
/*
 * 필드 == 멤버변수 == 인스턴스변수 == 속성
 * 
 * 클래스를 구성하는 요소 중 하나
 * 데이터를 저장하기 위한 역할(변수)
 * 클래스 블록 안에 존재
 * 
 * 필드(멤버변수, 인스턴스 변수)
 * 
 * static필드(클래스 변수)
 * 
 * 지역변수
 * 
 */
public class FieldController {
	
	public int global; // 필드
	
	public void cheackVariable(int parameter) {
		
		int local = 0; // 지역변수
		
		System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
