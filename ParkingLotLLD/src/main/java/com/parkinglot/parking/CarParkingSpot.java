package com.parkinglot.parking;

import com.parkinglot.vehicals.Vehical;

public class CarParkingSpot extends ParkingSpot {

    public CarParkingSpot(int spotNumber) {
        super(spotNumber,"Car");
    }

    @Override
    public boolean canParkVehical(Vehical vehical) {
        return "Car".equals(vehical.getVehicleType());
    }
}
