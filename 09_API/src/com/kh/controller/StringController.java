package com.kh.controller;

import java.io.StringBufferInputStream;

public class StringController {
	
	// String 클래스 => 불변
	
	public void method1() {
		// String abc = "abc"; // String은 주소값만 들어가면 되기 때문에 4Byte이다
		String str = new String("hello");
		String str1 = new String("hello");
		
		System.out.println(str);
		// 1. String 클래스의 toString()의 경우
		// 실제 담겨있는 문자열 value값을 반환할게끔 오버라이딩
		// equals()
		System.out.println(str.equals(str1));
		// 2. 문자열 value를 비교하도록 오버라이딩
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		// 3. 주소값을 해싱하는 것이 아니라 실제 담긴 문자열값을 기반으로 해싱을 돌리도록 오버라이딩
		
		// System.identityHashCode(참조형변수)
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
	}
	
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method3() {
		String str1 = new String("hello");
		String str2 = "hello";
		
		// 문자열 리터럴은 대입연산자를 사용해 대입할 때
		// String Pool(heap) 영역에 등록됨
		// StringPool : 동일한 내용의 문자열 value 가 존재할 수 없음
		
		System.out.println(System.identityHashCode(str2));
		str2 += "bye";
		System.out.println(System.identityHashCode(str2));
		System.out.println(str2);
		
		String a = "a";
		String b = "a";
		
		System.out.println(a == b);
	}
	
	public void method4() {
		StringBuffer sb = new StringBuffer();
		String str = "hello" + "world";
		sb.append("hello");
		sb.append("world");
		System.out.println(sb);
		// 문자열 임시저장공간
		// 문자열이 불변객체라서 내용물 변경이 일어나면 게속 새로운 공간을 할당해서 올릴것
		// 이를 해결하기 위해 임시공강(Buffer)를 중비해서 임시공간에 차곡차곡 담았다가 한번에 처리하는 클래스
		StringBuilder sr = new StringBuilder();
		sr.append("Hello");
		sr.append("World");
		System.out.println(sr);
		// 동시제어기능(Thread-Safe)
		// Thread t;
		// Tomcat, Jetty -> 서버들에서 제공이 많이 되고 있음
		// 충돌나겠다 가 아니라면 굳이 구현할 필요가 없음
	}
	
	public void method() {
		String str1 = "은총알은 없다";
		
		// 1. 문자열.length()
		// 문자열의 길이를 반환
		System.out.println(str1.length());
		
		String userId = "asasdfasdfasdf";
		if(8 <= userId.length() && userId.length() <= 20) {
		} else {
			throw new RuntimeException("asdfasdfasdf");
		}
		
		// 2. 문자열.charAt() : char
		char ch = userId.charAt(1);
		System.out.println(ch);
		
		String phoneNumber = "010-1234-5678";
		// 3. 문자열.substring(int beginindex) :  String
		System.out.println(phoneNumber.substring(4)); // 4번 인덱스 부터
		
		// 4. 문자열.indexOf(String) : int
									  // 은총알은 없다
		System.out.println(str1.indexOf("없다"));
		
		String[] emails = {"hong@kh.com", "kim@kh.com", "lee@kh.com", "hahahoho@kh.com"};
		// System.out.println(emails[0].substring(0, 4));
		// System.out.println(emails[3]);
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0, emails[i].indexOf("@")));
		}
		
		String fileName = "asdfasdfasdf.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".") + 1));
		
		String fileName2 = "a.sd.fas.df.a.sd.f.as.df.a.sdf.jpg";
		System.out.println(fileName2.substring(fileName2.lastIndexOf(".")));
		
		// 문자열.toCharArray() : char[]
		String ch1 = "배열로만들 문자열";
		char[] chArr = ch1.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		for(char c : chArr) {
			System.out.println(c);
		}
		
		System.out.println(String.valueOf(chArr));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
