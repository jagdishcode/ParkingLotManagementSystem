package com.pms.repositories;

import com.pms.exceptions.GateNotFoundException;
import com.pms.models.ParkingSpot;
import com.pms.models.SpotStatus;
import com.pms.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

/**
 * ParkingSpotRepository will interact with Parking spot DB table
 * in this project I am using in-memory DB
 *
 *
 */


public class ParkingSpotRepository {

    List<ParkingSpot> parkingSpotsList = new ArrayList<>();

    public void useParkingSpot(ParkingSpot parkingSpot) throws IllegalAccessException {
        if(!parkingSpotsList.contains(parkingSpot)){
            throw new GateNotFoundException("No such slot");
        }
        parkingSpot.setSpotStatus(SpotStatus.BLOCKED);

    }



    public ParkingSpot findAvailableSlot(VehicleType vehicleType){
        for (ParkingSpot parkingSpot: parkingSpotsList){
            if(parkingSpot.getSupportedVehicleType() == vehicleType
            && parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE ){
                return parkingSpot;
            }
        }
        return null;
    }

    public ParkingSpotRepository(){
        ParkingSpot car1 = ParkingSpot.builder()
                .spotNumber(1)
                .floorNumber(1)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.CAR)
                .build();

        ParkingSpot car2 = ParkingSpot.builder()
                .spotNumber(2)
                .floorNumber(2)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.CAR)
                .build();

        ParkingSpot bike1 = ParkingSpot.builder()
                .spotNumber(3)
                .floorNumber(1)
                .spotStatus(SpotStatus.AVAILABLE)
                .supportedVehicleType(VehicleType.BIKE)
                .build();

        parkingSpotsList.add(car1);
        parkingSpotsList.add(car2);
        parkingSpotsList.add(bike1);
    }
}
