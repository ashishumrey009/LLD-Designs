package com.parkinglot.vehicals;

public abstract class Vehical {

    private String licensePlate;

    private String vehicleType;

    public Vehical(String licensePlate, String vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {return licensePlate;}

    public String getVehicleType() {return vehicleType;}

    public abstract double calculateFee(int hoursStayed);
}
