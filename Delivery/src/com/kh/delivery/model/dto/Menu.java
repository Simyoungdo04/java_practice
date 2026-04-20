package com.kh.delivery.model.dto;

public class Menu {
	private int menuNo;
	private int restNo;
	private String menuName;
	private int price;
	private char soldOut;
	private int minPrice;
	private int deliveryFee;
	private String restName;
	
	public Menu() {}
	public Menu(int restNo) {
		this.restNo = restNo;
	}
	public Menu(int menuNo, int restNo, String menuName, int price, char soldOut) {
		super();
		this.menuNo = menuNo;
		this.restNo = restNo;
		this.menuName = menuName;
		this.price = price;
		this.soldOut = soldOut;
	}
	
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public int getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}
	public int getDeliveryFee() {
		return deliveryFee;
	}
	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public int getRestNo() {
		return restNo;
	}
	public void setRestNo(int restNo) {
		this.restNo = restNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getSoldOut() {
		return soldOut;
	}
	public void setSoldOut(char soldOut) {
		this.soldOut = soldOut;
	}
	
	@Override
	public String toString() {
		return "Menu [menuNo=" + menuNo + ", restNo=" + restNo + ", menuName=" + menuName + ", price=" + price
				+ ", soldOut=" + soldOut + ", minPrice=" + minPrice + ", deliveryFee=" + deliveryFee + "]";
	}
}
