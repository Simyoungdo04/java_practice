package com.kh.chap02.loop;

public class LoopWhile {
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * 초기식; // 필수는 아님
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * 		증감식;  // 필수는 아님
	 * }
	 * 
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자 하는 코드를 실행
	 * 
	 * for	 => 개발자가 반복을 몇 번 해야할지 명확하게 알고 있다.
	 * while => 개발자가 반복을 몇 번 해야할지 가늠할 수 가 없다.
	 * 
	 * while은 무한반복하는 용도로 사용할 예정
	 */
	
	public void method1() {
		// 초기식 조건식 증감식
		int i = 0;
		while(i < 3) {
			i++;
			System.out.println(i);
		}
	}
	
	public void method2() {
		// 1 ~ 10까지의 합게를 구해서 출력
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
			// System.out.println(i);
		}
		System.out.println(sum);
	}
	
	public void method3() {
		
		// 1부터 시작해서
		// 1 ~ 10 사이의 임의의 정수까지를 모두 더한 합계를 출력
		// random : 무작위
		// Random r = new Random();
		// Math라는 클래스가 가지고 있는 random()를 호출해서 만들어 볼 예정
		
		// Math m = new Math(); => private
		double num = Math.random();
		// System.out.println(num);
		
		// random()의 결과 값은 16자리 까지 나온다. => 0.0 ~ 0.9999999999999999
		// 									=> 1 ~ 10??
		// num에 10을 곱하면 0.0 ~ 9.999~9
		// System.out.println(num * 10);
		// 10을 곱한결과를 int형으로 강제형변환
		// System.out.println((int)(num * 10));
		// 10을 곱한 결과를 int형으로 강제형변환을 해준 뒤 정수값 1을 더해줌
		//	1 ~ 10
		
		int randomNum = (int)(num * 10) + 1;
		System.out.println(randomNum);
		
		int i = 1;
		int sum = 0;
		
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum);;
	}
	
	// 로또 번호 생성기
	public void lotto() {
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
