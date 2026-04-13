package com.kh.zone.model.service;

import com.kh.zone.model.dao.ZoneDao;
import com.kh.zone.model.dto.ZoneDto;

public class ZoneService {
	private ZoneDao zoneDao = new ZoneDao();
	
	public int save(ZoneDto zd) {
		return zoneDao.save(zd);
	}
}
