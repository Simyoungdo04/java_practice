package com.kh.chap03.run;

import com.kh.chap03.controlloer.Cooking;
import com.kh.chap03.controlloer.CookingController;
import com.kh.chap03.controlloer.CookingFactory;
import com.kh.chap03.controlloer.Pasta;
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
		
		CookingController pc = new CookingController();
		pc.pastaCooking(); // CookingController 클래스에 의존
		
		
		Cooking cook = new Pasta();
		cook.cooking(); // Cooking 클래스에 의존
		
		CookingFactory cf = new CookingFactory();
		Cooking ck = cf.creatPasta();
		ck.cooking();
		
		// 다형성 : 부모타입자료형으로 여러 자식객체를 다룰 수 있음
		// 정보은닉하려고 사용함
		
	}
}
