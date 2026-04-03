package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardService {
	private List<Board> boards = new ArrayList<Board>();
	private int id;
	
	{
		boards.add(new Board(++id, "첫 글입니다.", "재밌다", "관리자", "1234",
				   new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss").format(new Date())));
		boards.add(new Board(++id, "두번째 글입니다.", "재1밌2다3", "관리자", "1234",
				   new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss").format(new Date())));
	}
	
	public List<Board> findAll() {
		return boards;
	}
	
	public Board findById(int boardNo) {
		/*
		for(Board board : boards) {
			if(board.getBoardNo() == boardNo) {
				return board;
			}
		}
		return null;
		*/
		return boards.stream().filter(b -> b.getBoardNo() == boardNo).findFirst().orElse(null);
	}
	
	public void saveBoard(BoardDto board) {
		boards.add(new Board(++id, board.getBoardTitle(), board.getBoardContent(), 
								   board.getBoardWriter(), board.getPassword(),
								   new SimpleDateFormat("yyyy-MM-dd / hh:mm:ss").format(new Date())));
	}
	
	public Board updateBoard(int boardNo, BoardDto board) {
		int index = 0;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				index = i;
			}
		}
		Board b = boards.get(index);
		if(b.getBoardWriter().equals(board.getBoardWriter()) && b.getPassword().equals(board.getPassword())) {
			boards.set(index, new Board(boardNo, board.getBoardTitle(), board.getBoardContent(), 
							   b.getBoardWriter(), b.getPassword(), b.getCreateDate()));
			return boards.get(index);
		}
		return null;
	}
	
	public int deleteBoard(int boardNo) {
		if(boardNo < 0) {
			return 0;
		}
		int index = -1;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				index = i;
				break;
			}
		}
		if(index > -1) {
			boards.remove(index);
			return 1;
		}
		return 0;
	}
}
