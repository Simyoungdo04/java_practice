package com.kh.sw.util;

import com.kh.sw.exception.SwitchBoomException;
import com.kh.sw.model.vo.Switch;

public class SwitchUtilImpl implements SwitchUtil {

	@Override
	public boolean toggle(Switch s) {
		boom();
		s.setOn(!s.isOn());
		s.isOn();
		return s.isOn();                                                                                                                                                                                                                                             
	}
	
	
	/**
	 * 이 메소드는 스위치를 눌렀을 때 폭발 확률을 계산하는 메소드로
	 * 10%확률로 SwitchBoomException이 발생함
	 * 
	 * @author 심영도
	 * @since 26-03-27
	 */
	private void boom() {
		// 90% 확률로 문제없음
		// 10% 확률로 대폭발
		int rand = (int)(Math.random() * 100 + 1);
		
		if(rand <= 10) {
			throw new SwitchBoomException("대폭발");	
		}
	}
}
