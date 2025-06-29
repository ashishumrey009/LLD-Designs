package com.parkinglot.parking;

import com.parkinglot.vehicals.Vehical;

public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumbder){
        super(spotNumbder,"Bike");
    }

    @Override
    public boolean canParkVehical(Vehical vehical) {
        return "Bike".equals(vehical.getVehicleType());
    }
}
