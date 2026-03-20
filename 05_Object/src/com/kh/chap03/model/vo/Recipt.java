package com.kh.chap03.model.vo;

public class Recipt {
	// 가격, 결제수단, 상점명
	// 필드부
	private int price;
	private String payment;
	private String storeName;
	private String date;
	// 자바에서 날짜를 저장할 수 있는 JDK에서 제공되는 클래스
	
	// 생성자부
	
	// 메소드부
	// getter() / setter() / info()
	
	// setter()
	public void setPyment(String payment) {
		this.payment = payment;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter()
	public String getPayment() {
		return payment;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String info() {
		String info = "가게이름 : " + storeName + "\n가격 : " + price + "\n결제수단 : " + payment + "\n날짜 : " + date;		
		return info;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
