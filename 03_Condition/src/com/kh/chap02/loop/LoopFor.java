package com.kh.chap02.loop;

public class LoopFor {
	public void method0() {
		for(
			int i = 0;
			i < 3768;
			i++
		   ) {
			System.out.print(i + 1);
			System.out.println("번 반복함");
		}
		/*
		 * for 문
		 * 
		 * for() {
		 * 
		 * }
		 * 
		 * 괄호안은 반복의 횟수를 지정하는 역할
		 * 초기식; 조건식; 증감식		세 가지의 요소로 구성됨
		 * ;; 세미콜론으로 구분함 
		 * 
		 * [표현법]
		 * 
		 * for(초기식; 조건식; 증감식) {
		 * 		반복적으로 실행하고자 하는 코드;
		 * }
		 * 
		 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
		 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) 			=> int i= 0;
		 * 
		 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
		 * 			조건식의 결과가 true일 경우 반복을 수행
		 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 		=> i < 5;
		 * 
		 * - 증감식 : "반목문을 제어하는 변수에 대입된 값"을 증감하는 구문
		 * 			꼭 그래야하는 것은 아니지만 보통 초기식에서 선언된 변수를 가지고 증감식 작성
		 * 			이 때, 보편적으로 증감연산자를 사용 								=> i++		
		 */
	}
	public void method1() {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		//      /1/      /2/   /4/
		/* for(int i = 1; i <= 3; i++) {  
		          // /3/
			System.out.println(i);
		} // 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> ~(i번 만큼 반복)
		*/
		// 제어변수는 보통 i, j, k
		
		/*
		for(int i = 0; i < 10; i+=2) { 1+=2 => 2씩 커지게
			// if(i % 2 == 0) {
				System.out.println(i);
			// }
		}
		*/
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
	}
}































