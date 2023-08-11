package com.pms.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Vehicle {

    private String regNumber;
    private VehicleType vehicleType;
}
