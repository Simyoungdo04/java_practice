package com.kh.sw.controller;

import com.kh.sw.model.vo.Switch;
import com.kh.sw.util.SwitchUtilImpl;

public class SwitchController {
	private Switch s = new Switch(false);
	
	
	public boolean toggleSwitch() {
		SwitchUtilImpl su = new SwitchUtilImpl();
		boolean on = su.toggle(s);
		return on;
	}
}
