package com.kh.variable;

public class Casting {
	/*
	 * Type Casting: **자료형변환 / 형변환** 중요함
	 * 
	 * 자료형을 바꾸는 개념
	 * 
	 * 자바에서 값을 처리하는 규칙
	 * 
	 * 1. =(대입연산자)를 기준으로 왼쪽 = 오른쪽이 같은 자료형이어야 한다.
	 * - 같은 자료형에 해당하는 리털러값만 대입할 수 있음
	 * - 자료형이 다를 경우 => 값을 바꿔서 대입해야 함.
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * - 자료형이 다른데 연산을 하려면 둘 중 하나를 "형변환"을 해서 맞춰야 함
	 * 
	 * 3. 연산의 결과물도 동일한 자료형이어야 한다.
	 * - 3 + 7 = 10(정수), 1.1 + 3.3 = 4.4(실수)
	 * 
	 * [표현법] (바꾸고싶은 자료형)값;
	 * 형변환 연산자 / cast 연산자
	 * 
	 * 형변환의 종류
	 * 
	 * 1. 자동형변환(Promotion): 자동으로 형변환이 진행됨
	 * - 작은 크기의 자료형이 큰 크기의 자료형으로 변환될 때
	 * 직접 형변환을 할 필요가 없음
	 * 
	 * 2. 강제형변환(Type Casting): 자동형변환이 이루어지지 않는 경우 진행
	 * - 직접 형변환을 해야할 때 (자료형)을 통해 진행 
	 */
	// boolean	: 1Byte
	// char		: 2Byte
	// byte		: 1Byte, short: 2Byte, int: 4Byte, long: 8Byte
	// float	: 4Byte, double: 8Byte
	
	// 자동형변환(Promotion): 작은 자료형 -> 큰 자료형
	public void autoCasting() {
		// System.out.println("이 내용을 콘솔창에 출력해 보세요");
		// 1. int(정수, 4Byte) => double(실수, 8Byte)
		
		// 변수 선언과 동시에 초기화
		// int num = 7;
		// System.out.println(num);
		// double doubleNum = /*(double)*/num;
		// System.out.println(doubleNum);
		// System.out.println(num);
		
		
		// 2. int(정수/ 4Byte) => long(정수, 8Byte)
		/* int bigNum = 120;
		long smallLong = bigNum;
		System.out.println(smallLong);
		
		// 3. long(정수, 8Byte) -> float(실수, 4Byte) ** 특이케이스
		long longNum = 1000L;
		// int i = longNum;
		// int i = (int)longNum;
		// System.out.println(i);
		float floatNum = longNum;
		System.out.println(floatNum);
		// 정수가 실수로 변환 될때 큰 사이즈의 정수탑입을 작은 사이즈의 실수 타입으로 자동형변환해줌
		// 4Byte float형이 long형 보다 표현할 수 있는 값의 범위가 넓기 때문
		
		// 1 2 3
		// 1.00000001, 1.00000002, 1.000~
		
		System.out.println("===================");
		
		// 4. char(2Byte, 문자) <-> int(4Byte, 정수)
		
		char c = 'a';
		// System.out.println(c);
		int a2Num = c;
		// System.out.println(a2Num);
		char c2 = 97;
		// System.out.println(c2);
		
		System.out.println('a'); 		// => a
		System.out.println((int)'a');   // => 97
		System.out.println('a' + 3); 	// => 100
		System.out.println('a' + '3');  // => 148
		System.out.println((int)'3');	// => 51
		System.out.println('a' + "3"); 	// => a3
		
		// System.out.println("===================");
		
		// System.out.println('3');	// => 3
		// System.out.println((char)3);// =>  - 깨짐
		// System.out.println((char)'3' + (char)3); // => 54
		
		// System.out.println("===================");
		
		// 번외. byte 또는 short형 간의 연산
		
		byte byteNum = (byte)128;
		// System.out.println(byteNum); // -128
		
		byte b2 = 126;
		byte b3 = 3;
		// System.out.println(b2 + b3);*/
		// 결과값은 int형 => 연산자가 값을 처리하는 크기가 int형 크기(4Byte)
		
		// = 
		// 비교연산자 ( == )
		// 좌항과 우항의 값을 비교해서 결과값을 반환
		// true / false
		System.out.println("비교 연산자 사용");
		System.out.println(1 == 2);
		System.out.println('a' == 'b');
		System.out.println(2 == (int)'2');
		System.out.println((char)2 == '2');
		// System.out.println((int)'2' == '2');
		
		// 강제 형 변환: 큰 크기의 자료형 => 작은 크기의 자료형
		// 명시적 형변환이라고도 한다
		// (바꿀 자료형)값
		
		double dNum = 10.123456789;
		int iNum = (int)dNum;
		System.out.println(iNum);
		// System.out.printf("%.10f", dNum);
		// 0.1234 절삭 => 데이터의 손실
		double ddNum = iNum;
		System.out.println(ddNum);
		
		
	}
	
	
}
















