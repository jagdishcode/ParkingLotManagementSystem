package com.pms.services;

import com.pms.models.Gate;
import com.pms.models.ParkingSpot;
import com.pms.models.Ticket;
import com.pms.models.Vehicle;
import com.pms.repositories.TicketRepository;

import java.util.Date;

public class TicketService {
    private final TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot, Gate gate){

        Ticket ticket = Ticket.builder()
                .id(String.valueOf(Math.random()*100))
                .entryTime(new Date())
                .issuingGate(gate)
                .parkingAttendant(gate.getParkingAttendant())
                .vehicle(vehicle)
                .parkingSpot(spot)
                .build();

        ticketRepository.save(ticket);

        return ticket;
    }
}
