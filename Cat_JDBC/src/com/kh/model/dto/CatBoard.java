package com.kh.model.dto;

import java.sql.Date;

public class CatBoard {
	private String catBoardId;
	private String catBoardTitle;
	private String catBoardContent;
	private Date catBoardDate;
	private String catId;
	private String catKeeperId;
	
	public CatBoard() {}
	public CatBoard(String catBoardTitle, String catBoardContent, String catId, String catKeeperId) {
		this.catBoardTitle = catBoardTitle;
		this.catBoardContent = catBoardContent;
		this.catId = catId;
		this.catKeeperId = catKeeperId;
	}
	public CatBoard(String catBoardId, String catBoardTitle, String catBoardContent, Date catBoardDate, String catId,
			String catKeeperId) {
		this.catBoardId = catBoardId;
		this.catBoardTitle = catBoardTitle;
		this.catBoardContent = catBoardContent;
		this.catBoardDate = catBoardDate;
		this.catId = catId;
		this.catKeeperId = catKeeperId;
	}
	
	public String getCatBoardId() {
		return catBoardId;
	}
	public void setCatBoardId(String catBoardId) {
		this.catBoardId = catBoardId;
	}
	public String getCatBoardTitle() {
		return catBoardTitle;
	}
	public void setCatBoardTitle(String catBoardTitle) {
		this.catBoardTitle = catBoardTitle;
	}
	public String getCatBoardContent() {
		return catBoardContent;
	}
	public void setCatBoardContent(String catBoardContent) {
		this.catBoardContent = catBoardContent;
	}
	public Date getCatBoardDate() {
		return catBoardDate;
	}
	public void setCatBoardDate(Date catBoardDate) {
		this.catBoardDate = catBoardDate;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCatKeeperId() {
		return catKeeperId;
	}
	public void setCatKeeperId(String catKeeperId) {
		this.catKeeperId = catKeeperId;
	}
}
