package com.parkinglot.vehicals;

public class CarVehical extends  Vehical {

    private static final double FEE_PER_HOUR = 10.0;

    public CarVehical(String licensePlate){
        super(licensePlate,"Car");
    }

    @Override
    public double calculateFee(int hoursStayed) {
        return FEE_PER_HOUR*hoursStayed;
    }
}
