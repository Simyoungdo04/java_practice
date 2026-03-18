package com.kh.array;

import java.util.Arrays;

public class Array {
	
	// 변수(Variable)
	// 메모리(RAM) 공간에 DATA(VALUE)값을 저장하는 공간
	
	// 변수의 특징
	// 자료형이 정해져있다, 고유한 식별자를 가짐, 자료형은 크기가 정해져있다, 새로운 값을 대입해서 쓸 수 있다
	// 선언된 Scope에서만 사용할 수 있다, 하나의 변수 공간에는 하나의 값만 대입될 수 있음 ***
	
	/*
	 * 배열(Array) : 하나의 배열에 여러 개의 값을 담을 수 있음
	 * 			    단, "같은 자료형의 값들"만 담을 수 있음
	 * 				동종모음(homogeneous collection)이라고도 부름
	 * 
	 * => 배열의 각 공간에 접근할 때 사용하는 개념 index
	 * => index는 0부터 시작한다.
	 */
	
	public void method1() {
		// 다섯 개의 정수를 변수에 대입한 뒤 정수값을 모두 더한 값을 출력
		// int num1 = 15;
		// int num2 = 19;
		// int num3 = 28;
		// int num4 = 33;
		// int num5 = 18;
		// int sum = num1 + num2 + num3 + num4 + num5;
		// System.out.println(sum);
		// 배열
		
		// 1. 배열 선언
		/*
		 * 변수 선언 방법
		 * 
		 * 자료형 변수명;
		 * 
		 * 배열 선언 방법
		 * 
		 * 1) 자료형 배열명[];
		 * 2) 자료형[] 배열명; -> 두 번째 방법을 많이 사용함
		 */
		// 변수 선언
		// int num = 0;
		
		// 배열 선언
		// int[] nums = 0;
		
		// 2. 배열 할당
		/*
		 * 배열에 몇 개의 값이 들어갈것인지 배열의 크기를 정해주는 과정
		 * 지정한 개수만큼의 값이 들어갈 공간이 할당됨
		 * 
		 * [표현법]
		 * 
		 * int[] nums; <= 배열 선언
		 * nums = new int[5]; <= 할당
		 * 
		 * int[] arr = new int[5]; <= 선언과 동시에 할당
		 * 
		 * 1. int[] arr : 배열 선언
		 * 2. new int[5] : heap 영역에 int형 4Byte 짜리 공간 5개를 이어 붙여 20Byte 공간을 만든다
		 * 3. int[] arr = new int[5] : heap 영역에 있는 공간의 주소를 대입한다.
		 * 
		 * arr[0] => 0번 인덱스
		 * 
		 * 배열은 참조 자료형이다.
		 */
		//nums라는 정수형 배열을 선언하고 2칸을 할당받음
		int[] nums = new int[2];
		
		// 배열에 값을 대입 => index개념
		nums[0] = 10;
		nums[1] = 11;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}
	
	public void method2() {
		// 배열은 중요하다
		
		// 1. 배열 선언 및 할당
		int i;
		int[] integers = new int[3]; // 0, 1, 2
		
		// 배열식별자.length : 배열의 크기(길이) => 정수
		// System.out.println(integers.length);
		
		// System.out.println(i);
		// localvariable == 초기화를 진행하지 않으면 사용할 수 없음
		// System.out.println(integers[0]);
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 		   => 변수 공간에 실제 값을 바로 담을 수 있음
		 * 
		 * 참조자료형 : int[], boolean[], char[] , ~, String
		 * 		   => 변수 공간에 주소 값을 담을 수 있음
		 */
		// 설명을 위한 코드 실제로는 이렇게 작성하면 안됨
		// 301, 302, 501, 502, 사무실
		
//		String[] KH정보교육원종로점 = new String[5];
//		// System.out.println(KH정보교육원종로점);
//		KH정보교육원종로점[0] = "301강의실";
//		KH정보교육원종로점[1] = "302강의실";
//		KH정보교육원종로점[2] = "501강의실";
//		KH정보교육원종로점[3] = "502강의실";
//		KH정보교육원종로점[4] = "사무실";
//		
//		// 도달하고자 하는 목적지
//		// 501강의실
//		System.out.println(KH정보교육원종로점[2]);
		int num1 = 3;
		int num2 = 3;
		System.out.println(num1 == num2);
		
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		System.out.println(nums1 == nums2);
		
		// 참조자료형의 경우 == 사용 시
		// 주소값을 비교하기 때문에 원하는 결과를 얻을 수 없음
		// 문자열
		// 문자열.equals("비교할 문자열");
		
		// 해시코드 : 주소값을 10진수(int형) 형태로 나타낸 것
		System.out.println(nums1.hashCode());
		System.out.println(nums2.hashCode());
	}
	
	// 로또번호 생성기 0.2
	public void crateLottoNumber() {
		int[] lottoNums = new int[6]; // 0 ~ 5		
		
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = (int)(Math.random() * 45) + 1;
		}
		// Arrays.toString(배열식별자) => 배열의 요소들을 이쁘게 출력해줌
		System.out.println(Arrays.toString(lottoNums));
		
	}
	
	public void method3() {
		// 구구단을 담는 9칸짜리 배열을 선언 및 할당
		
		// 1. 배열 선언 및 할당
		String[] gugudan = new String[9];
		
		// 2. 배열 인덱스에 구구단 대입
		gugudan[0] = " 2 X 1 = 2\n";
		gugudan[1] = "2 X 2 = 4\n";
		gugudan[2] = "2 X 3 = 6\n";
		gugudan[3] = "2 X 4 = 8\n";
		gugudan[4] = "2 X 5 = 10\n";
		gugudan[5] = "2 X 6 = 12\n";
		gugudan[6] = "2 X 7 = 14\n";
		gugudan[7] = "2 X 8 = 16\n";
		gugudan[8] = "2 X 9 = 18";
		
		// 3. 출력
		System.out.println(Arrays.toString(gugudan));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
