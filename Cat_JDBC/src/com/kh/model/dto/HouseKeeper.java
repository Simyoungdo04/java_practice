package com.kh.model.dto;

public class HouseKeeper {
    private String houseKeeperId;
    private String houseKeeperName;

    public HouseKeeper() {}
	public HouseKeeper(String houseKeeperName) {
		this.houseKeeperName = houseKeeperName;
	}
	public HouseKeeper(String houseKeeperId, String houseKeeperName) {
		this.houseKeeperId = houseKeeperId;
		this.houseKeeperName = houseKeeperName;
	}
	public String getHouseKeeperId() {
		return houseKeeperId;
	}
	public void setHouseKeeperId(String houseKeeperId) {
		this.houseKeeperId = houseKeeperId;
	}
	public String getHouseKeeperName() {
		return houseKeeperName;
	}
	public void setHouseKeeperName(String houseKeeperName) {
		this.houseKeeperName = houseKeeperName;
	}
}