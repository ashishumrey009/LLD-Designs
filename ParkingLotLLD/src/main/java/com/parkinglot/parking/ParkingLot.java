package com.parkinglot.parking;

import com.parkinglot.vehicals.Vehical;

import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> parkingFloors;

    public ParkingLot(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingSpot findAvailableSpot(String vehicalType) {
        for (ParkingFloor floor : parkingFloors) {
            ParkingSpot parkingSpot = floor.findAvailableSpot(vehicalType);
            if (parkingSpot != null) {
                return parkingSpot;
            }

        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehical vehical) {
        ParkingSpot spot = findAvailableSpot(vehical.getVehicleType());
        if (spot != null) {
            spot.parkVehical(vehical);
            System.out.println("Vehicle Parked Successfully");
            return spot;
        }
        System.out.println("No parking spot found");
        return null;

    }

    public void vacateSpot(ParkingSpot spot,Vehical vehical) {
        if (spot != null && spot.isOccupied() && spot.getVehical().equals(vehical)) {
            spot.vacate();
            System.out.println(vehical.getVehicleType() + " Vacated Successfully"+spot.getSpotNumber());
        }else{
            System.out.println("Invalid Spot!Either spot is already vacated or Vehical doeesnot match ");
        }
    }

    public ParkingSpot getSpotByNumber(int spotNumber) {
        for (ParkingFloor floor : parkingFloors) {
            for(ParkingSpot spot:floor.getParkingSpots()){
                if(spot.getSpotNumber() == spotNumber){
                    return spot;
                }
            }
        }
        return null;
    }

}
