package com.parkinglot.parking;

import com.parkinglot.vehicals.Vehical;

public abstract class ParkingSpot {

    private int spotNumber;

    private  boolean isOccupied;

    private Vehical vehical;

    private String spotType;

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.spotType = spotType;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehical(Vehical vehical);

    public void  parkVehical(Vehical vehical){
        if(isOccupied){
            throw  new IllegalStateException("Parking Spot is already occupied");
        }
        if(!canParkVehical(vehical)){
            throw  new IllegalStateException("Parking Spot is not suitable"+vehical.getVehicleType());
        }
        this.vehical = vehical;
        this.isOccupied = true;
    }

    public void vacate(){
        if(!isOccupied){
            throw  new IllegalStateException("Parking Spot is already vacated");
        }
        this.isOccupied = false;
        this.vehical = null;
    }

    public Vehical getVehical() {
        return vehical;
    }
    public int getSpotNumber() {
        return spotNumber;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + (vehical != null ? vehical.getLicensePlate() : "None") +
                '}';
    }

    public String getSpotType() {return spotType;}
}
