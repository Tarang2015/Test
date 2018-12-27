package com.test.bookticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.bookticket.app.entity.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
