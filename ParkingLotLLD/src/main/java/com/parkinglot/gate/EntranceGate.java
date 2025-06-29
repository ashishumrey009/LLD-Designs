package com.parkinglot.gate;

import com.parkinglot.parking.ParkingLot;
import com.parkinglot.parking.ParkingSpot;
import com.parkinglot.vehicals.Vehical;
import com.parkinglot.vehicals.VehicalFactory;

public class EntranceGate {
    private ParkingLot parkingLot;

    public EntranceGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    // New method for flexible parking
    public ParkingSpot parkVehicle(String vehicleType, String licensePlate) {
        Vehical vehical = VehicalFactory.createVehical(vehicleType, licensePlate);
        if (vehical == null) {
            System.out.println("Invalid vehicle type: " + vehicleType);
            return null;
        }
        ParkingSpot spot = parkingLot.parkVehicle(vehical);
        if (spot != null) {
            System.out.println(vehicleType + " parked successfully at spot " + spot.getSpotNumber());
        } else {
            System.out.println("No available spot found for " + vehicleType);
        }
        return spot;
    }
}