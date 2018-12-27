package com.test.bookticket.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bookticket.app.entity.Ticket;
import com.test.bookticket.app.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	@GetMapping(value="/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}
	@GetMapping(value="/ticket/allticket")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingService.getAllBookedTickets();
	}
	@DeleteMapping(value="/ticket/{ticketid}")
	public void deleteBookedTicket(@PathVariable ("ticketid") Integer ticketid) {
		ticketBookingService.deleteBookedTicket(ticketid);
	}
	@PutMapping(value="/ticket/{ticketid}/{newemail}")
	public Ticket updateTicket(@PathVariable("ticketid") Integer ticketid,@PathVariable ("newemail") String newemail) {
		return ticketBookingService.updateTicket(ticketid,newemail);
	}
}
