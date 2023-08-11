package com.pms.controllers;

import com.pms.dto.GenerateTicketRequest;
import com.pms.dto.GenerateTicketResponse;
import com.pms.exceptions.GateNotFoundException;
import com.pms.models.Ticket;
import com.pms.services.EntryGateService;
import lombok.*;

/**
 *
 *
 * Roles of a controller
 * 1. to perform validation
 * 2. Call the correct order of services with appropriate params
 * 3. Render the response object
 */

@Getter
@Setter
@Builder
public class TicketController {

    private EntryGateService entryGateService;

    public TicketController(EntryGateService entryGateService){
        this.entryGateService = entryGateService;
    }

    public GenerateTicketResponse generateTicket(GenerateTicketRequest request) throws IllegalAccessException {
        //Validation
        if(request.getGate() == null){
            throw new GateNotFoundException("No gate found");
        }

        Ticket ticket =entryGateService.createTicket(request.getGate(), request.getVehicle());

        // rendering the reponse


        return GenerateTicketResponse.builder().ticket(ticket).build();
    }
}
