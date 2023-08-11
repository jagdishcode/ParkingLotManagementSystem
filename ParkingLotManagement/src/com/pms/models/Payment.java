package com.pms.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class Payment {


    private String reference;
    private Double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private Date time;
    private Ticket ticket;
}
