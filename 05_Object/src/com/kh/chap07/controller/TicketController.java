package com.kh.chap07.controller;

import com.kh.chap07.model.service.TicketService;
import com.kh.chap07.model.vo.Ticket;

public class TicketController {
	private TicketService ts = new TicketService();
	
	public int saveTicket(Ticket ticket) {
		return ts.saveTicket(ticket);
	}
	
	public Ticket printTicket() {
		// 서비스한테 티켓 받아오기
		return ts.printTicket();
	}
	
	public Ticket[] findAll() {
		Ticket[] tickets = ts.findAll();
		return tickets;
	}
}
