package com.parkinglot.vehicals;

public class BikeVehical extends Vehical {
    private static final double FEE_PER_HOUR = 24;

    public BikeVehical(String licensePlate){
        super(licensePlate,"Bike");
    }

    @Override
    public double calculateFee(int hoursStayed) {
        return FEE_PER_HOUR*hoursStayed;
    }
}
