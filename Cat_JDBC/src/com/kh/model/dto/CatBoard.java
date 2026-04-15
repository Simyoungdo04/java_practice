package com.kh.model.dto;

import java.sql.Date;

public class CatBoard {
	private int catBoardNo;
	private int catId;
	private Date catBoardDate;
	
	public CatBoard() {}
	public CatBoard(int catId) {
		this.catId = catId;
	}
	public CatBoard(int catBoardNo, int catId, Date catBoardDate) {
		this.catBoardNo = catBoardNo;
		this.catId = catId;
		this.catBoardDate = catBoardDate;
	}
	
	public int getCatBoardNo() {
		return catBoardNo;
	}
	public void setCatBoardNo(int catBoardNo) {
		this.catBoardNo = catBoardNo;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public Date getCatBoardDate() {
		return catBoardDate;
	}
	public void setCatBoardDate(Date catBoardDate) {
		this.catBoardDate = catBoardDate;
	}
}
