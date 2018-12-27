package com.test.bookticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.bookticket.app.dao.TicketBookingDao;
import com.test.bookticket.app.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
		
		
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
	public void deleteBookedTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newemail) {
		
		Ticket ticketVo= ticketBookingDao.findOne(ticketId);
		ticketVo.setEmail(newemail);
		Ticket save=ticketBookingDao.save(ticketVo);
		return save;
	}

}
