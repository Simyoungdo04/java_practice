package com.kh.model.dto;

import java.sql.Date;

public class Cat {
	private int catId;
	private String catName;
	private String catGender;
	private double catWeight;
	private Date catBirth;
	
	public Cat() {}
	public Cat(String catName, String catGender, double catWeight) {
		this.catName = catName;
		this.catGender = catGender;
		this.catWeight = catWeight;
	}
	public Cat(int catId, String catName, String catGender, double catWeight, Date catBirth) {
		this.catId = catId;
		this.catName = catName;
		this.catGender = catGender;
		this.catWeight = catWeight;
		this.catBirth = catBirth;
	}
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatGender() {
		return catGender;
	}
	public void setCatGender(String catGender) {
		this.catGender = catGender;
	}
	public double getCatWeight() {
		return catWeight;
	}
	public void setCatWeight(double catWeight) {
		this.catWeight = catWeight;
	}
	public Date getCatBirth() {
		return catBirth;
	}
	public void setCatBirth(Date catBirth) {
		this.catBirth = catBirth;
	}
	
	@Override
	public String toString() {
		return "Cat [catId=" + catId + ", catName=" + catName + ", catGender=" + catGender + ", catWeight=" + catWeight
				+ ", catBirth=" + catBirth + "]";
	}
}
