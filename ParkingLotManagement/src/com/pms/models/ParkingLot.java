package com.pms.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ParkingLot {

    private List<ParkingFloor> parkingFloors;
    private List<Gate> entryGate;
    private List<Gate> exitGate;
    private String name;
    private String address;
}
