package com.kh.football.model.dto;

public class BoardDto {
	private int boardNo;
	private String BoardTitle;
	private String BoardContent;
	private String BoardWriter;
	private String password;
	private String creatDate;
	
	public BoardDto(String boardTitle, String boardContent, String boardWriter, String password) {
		super();
		BoardTitle = boardTitle;
		BoardContent = boardContent;
		BoardWriter = boardWriter;
		this.password = password;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return BoardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}

	public String getBoardContent() {
		return BoardContent;
	}

	public void setBoardContent(String boardContent) {
		BoardContent = boardContent;
	}

	public String getBoardWriter() {
		return BoardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		BoardWriter = boardWriter;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	
	
}