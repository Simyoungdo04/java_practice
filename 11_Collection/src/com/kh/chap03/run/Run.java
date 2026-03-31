package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.Shop;

public class Run {
	public static void main(String[] args) {
		
		// HashSet
		// Value 값만 저장, Index개념 없음 == 순서보장 X, 중복 X
		
		// 문자열만 담을 수 있는 HashSet
		
		Set<String> set = new HashSet<String>();
		// add()
		set.add("안녕하세요");
		set.add("반갑습니다.");
		set.add("날이 더워요");
		set.add("안녕하세요");
		set.add(new String("반갑습니다."));
		set.add(new String("안녕하세요"));
		
		System.out.println(set); // 저장순서보장 X, 중복 허용 X
		
		// 요소 개수 구하기 size()
		System.out.println(set.size());
		
		// 주변 식당들 정보를 set에 담아보자
		Set<Shop> shops = new HashSet<Shop>();
		
		Shop gongShop = new Shop("공평동꼼장어", "꼼장어", 15000);
		Shop choiShop = new Shop("최고기", "고기", 18000);
		Shop emart = new Shop("맥주이마트", "라면", 5000);
		
		shops.add(gongShop);
		shops.add(choiShop);
		shops.add(emart);
		shops.add(new Shop("최고기", "고기", 18000));
		
		System.out.println(shops.toString());
		
		// HashSet => set에 새로운 요소를 추가할 때 마다
		// equals()와 hashCode()의 반환값을 기준으로 일치하는 요소가 있는지 없는지 판별함
		System.out.println("ABC".equals(new String("ABC")));
		System.out.println("ABC".hashCode());
		System.out.println(new String("ABC").hashCode());
		
		boolean flag = choiShop.equals(new Shop("최고기", "고기", 18000));
		System.out.println(flag);
		
		/*
		 * equals()의 호출결과가 true이고 hashcode()의 반환값을 동등비교 연산자를 통해
		 * 
		 */
		/*
		System.out.println("===============================");
		for(int i = 0; i < shop.size(); i++) {
			System.out.println(shop.get);
			*/
		
		for(Shop shop : shops){
			System.out.println(shop);
		
		List list = new ArrayList(shops);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");
		
		// Interator(반복자)
		// StringTokenozer랑 비슷한 느낌
		// hasnext, next()
		// ArrayList -> 배열로
		// LinkedList -> 노드를 연결
		// HashSet -> 해시테이블
		// TreeSet -> 트리
		// 개발자가 구체적인 자료구조를 모르더라도 반복을 시킬 수 있는 방법
		
		Iterator it = shops.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// List계열, Set계열 전부다 iterator()로 호출해서 반복시킬 수 있음
		// Map => 바로 사용이 불가능
		
		}
		
	}
}


