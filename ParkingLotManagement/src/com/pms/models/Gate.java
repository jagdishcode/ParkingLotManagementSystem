package com.pms.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Gate {
    private int gateNumber;
    private ParkingAttendant parkingAttendant;

    private GateType gateType;

}
