package com.kh.zone.model.dao;

import com.kh.zone.model.dto.ZoneDto;

public class ZoneDao {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int save(ZoneDto zd) {
		int result = 0;
		
		
		return result;
	}
}
