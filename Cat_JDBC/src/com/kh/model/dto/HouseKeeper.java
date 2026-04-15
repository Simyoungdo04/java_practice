package com.kh.model.dto;

public class HouseKeeper {
	private int houseKeeperNo;
	private String houseKeeperName;
	private String catName;
	
	public HouseKeeper() {}
	public HouseKeeper(String houseKeeperName, String catName) {
		this.houseKeeperName = houseKeeperName;
		this.catName = catName;
	}
	public HouseKeeper(int houseKeeperNo, String houseKeeperName, String catName) {
		this.houseKeeperNo = houseKeeperNo;
		this.houseKeeperName = houseKeeperName;
		this.catName = catName;
	}
	
	public int getHouseKeeperNo() {
		return houseKeeperNo;
	}
	public void setHouseKeeperNo(int houseKeeperNo) {
		this.houseKeeperNo = houseKeeperNo;
	}
	public String getHouseKeeperName() {
		return houseKeeperName;
	}
	public void setHouseKeeperName(String houseKeeperName) {
		this.houseKeeperName = houseKeeperName;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
}
