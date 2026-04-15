package com.kh.model.dto;

public class HouseKeeper {
    private int houseKeeperNo;
    private String houseKeeperName;
    private int catId;

    public HouseKeeper() {}
    public HouseKeeper(String houseKeeperName, int catId) {
        this.houseKeeperName = houseKeeperName;
        this.catId = catId;
    }
    public HouseKeeper(int houseKeeperNo, String houseKeeperName, int catId) {
        this.houseKeeperNo = houseKeeperNo;
        this.houseKeeperName = houseKeeperName;
        this.catId = catId;
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
    public int getCatId() { 
    	return catId; 
    }
    public void setCatId(int catId) { 
    	this.catId = catId; 
    }
}