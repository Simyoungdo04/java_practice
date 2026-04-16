package com.kh.model.dto;

import java.sql.Date;

public class Cat {
	private String catId;
	private String catName;
	private String catGender;
	private double catWeight;
	private Date catBirth;
	private String catKeeperId;
	
	public Cat() {}
	public Cat(String catName, String catGender, double catWeight) {
		this.catName = catName;
		this.catGender = catGender;
		this.catWeight = catWeight;
	}
	public Cat(String catName, String catGender, double catWeight, Date catBirth, String catKeeperId) {
		this.catName = catName;
		this.catGender = catGender;
		this.catWeight = catWeight;
		this.catBirth = catBirth;
		this.catKeeperId = catKeeperId;
	}
	public Cat(String catId, String catName, String catGender, double catWeight, Date catBirth, String catKeeperId) {
		this.catId = catId;
		this.catName = catName;
		this.catGender = catGender;
		this.catWeight = catWeight;
		this.catBirth = catBirth;
		this.catKeeperId = catKeeperId;
	}
	
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
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
	public String getCatKeeperId() {
		return catKeeperId;
	}
	public void setCatKeeperId(String catKeeperId) {
		this.catKeeperId = catKeeperId;
	}
}
