package com.kh.chap01.abstraction.view;

import java.util.Scanner;

import com.kh.chap01.abstraction.model.vo.Puppy;

public class PuppyCare {
	// 사용자에게 강아지의 정보를 입력받아서
	// 입력받은 강아지의 정보를 출력해주고
	// 강아지와 함게 놀아줄 수 있는 프로그램
	
	public void run() {
		System.out.println("🦴🐕강아지 다마고치🐕🦴");
		Scanner sc = new Scanner(System.in); // 스캐너 타입의 변수 선언 = 스캐너 객체 생성;
		Puppy puppy = new Puppy();
		
		System.out.print("강아지 이름이 뭐예요? > ");
		puppy.name = sc.nextLine();
		System.out.print("무슨 종이예요? > ");
		puppy.species = sc.nextLine();
		System.out.print("암컷이예요? 수컷이예요? > ");
		puppy.gender = sc.nextLine();
		System.out.print("몇 살이예요? > ");
		puppy.age = sc.nextInt();
		System.out.print("얘는 몇 키로예요? > ");
		puppy.weight = sc.nextInt();
		
		while(true) {
			System.out.println("🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴");
			System.out.println(puppy.name + "의 정보");
			System.out.println("나이 : " + puppy.age);
			System.out.println("성별 : " + puppy.gender);
			System.out.println("종 : " + puppy.species);
			System.out.println("몸무게 : " + puppy.weight);
			System.out.println("🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴🦴");
			System.out.println();
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
