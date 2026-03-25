package com.kh.chap03.run;

import com.kh.chap03.model.vo.Chef;
import com.kh.chap03.model.vo.MainChef;
import com.kh.chap03.model.vo.SaladChef;

public class Run {
	public static void main(String[] args) {
		MainChef mc = new MainChef("이승철");
		mc.cooking();
		SaladChef sc = new SaladChef("고길동");
		sc.cooking();
		
		// Chef c = new Chef();
		// 추상클래스로 선언되었기 때문에 객체 생성이 불가능하다.
		
		Chef[] c = {mc, sc};
		for(int i = 0; i < c.length; i++) {
			c[i].cooking();
		}
	}
}
