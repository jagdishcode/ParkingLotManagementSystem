package com.pms.services;

import com.pms.exceptions.NoParkingSpotAvailableException;
import com.pms.models.Gate;
import com.pms.models.ParkingSpot;
import com.pms.models.Ticket;
import com.pms.models.Vehicle;

public class EntryGateService {

    SlotAllocationService slotAllocationService = new SlotAllocationService();
    TicketService ticketService = new TicketService();

    public Ticket createTicket(Gate gate, Vehicle vehicle) throws IllegalAccessException {
        ParkingSpot availableParkingSpot =
                slotAllocationService.findSpot(vehicle.getVehicleType());


        if(availableParkingSpot == null){
            throw new NoParkingSpotAvailableException();
        }

        Ticket ticket = ticketService.createTicket(vehicle, availableParkingSpot,gate);
        slotAllocationService.allocateSpot(availableParkingSpot);

        return ticket;

    }
}
