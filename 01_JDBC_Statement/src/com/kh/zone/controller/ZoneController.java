package com.kh.zone.controller;

import com.kh.zone.model.dto.ZoneDto;
import com.kh.zone.model.service.ZoneService;

public class ZoneController {
	private ZoneService zs = new ZoneService();
	
	public int save(String zoneName, String zoneType) {
		ZoneDto zd = new ZoneDto(zoneName, zoneType);
		
		return zs.save(zd);
	}
}
