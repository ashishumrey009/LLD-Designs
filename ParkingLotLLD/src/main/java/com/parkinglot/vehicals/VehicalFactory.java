package com.parkinglot.vehicals;

public class VehicalFactory {

    public static Vehical createVehical(String vehicalType, String licensePlate) {
        switch (vehicalType) {
            case "Car":
                return new CarVehical(licensePlate);
            case "Bike":
                return new BikeVehical(licensePlate);
            default:
                return null;
        }
    }
}
