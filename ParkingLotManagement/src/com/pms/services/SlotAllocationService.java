package com.pms.services;

import com.pms.models.ParkingSpot;
import com.pms.models.VehicleType;
import com.pms.repositories.ParkingSpotRepository;

public class SlotAllocationService {
    public ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
    public ParkingSpot findSpot(VehicleType vehicleType) {

        return parkingSpotRepository.findAvailableSlot(vehicleType);
    }

    public void allocateSpot(ParkingSpot parkingSpot) throws IllegalAccessException {
        parkingSpotRepository.useParkingSpot(parkingSpot);
    }
}
