package com.pms.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Invoice {


    private int invoiceId;
    private Date exitTime;
    private Ticket ticket;
    private double amount;
    private Payment payment;
    private Gate exitGate;
    private ParkingAttendant parkingAttendant;

}
