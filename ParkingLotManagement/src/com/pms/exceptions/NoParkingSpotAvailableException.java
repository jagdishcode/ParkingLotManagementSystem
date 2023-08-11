package com.pms.exceptions;

public class NoParkingSpotAvailableException extends RuntimeException{

    public NoParkingSpotAvailableException(){
        super("No parking spots left in this parking lot");
    }
}
