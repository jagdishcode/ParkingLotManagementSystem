package com.pms.repositories;

import com.pms.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {
    List<Ticket> tickets = new ArrayList<>();

    public void save(Ticket ticket){
        tickets.add(ticket);
    }
}
