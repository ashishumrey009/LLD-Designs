package com.parkinglot.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private List<ParkingSpot> parkingSpots;

    private int floorNumber;

    public ParkingFloor(int floorNumber, int numberOfCarSpots, int numberOfBikeSpots) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();

        for (int i = 0; i < numberOfCarSpots; i++) {
            this.parkingSpots.add(new CarParkingSpot(i+1));
        }
        for (int i = 0; i < numberOfBikeSpots; i++) {
            this.parkingSpots.add(new BikeParkingSpot(i+1));
        }
    }

    public ParkingSpot findAvailableSpot(String VechicalType) {
        for(ParkingSpot spot : parkingSpots) {
            if(!spot.isOccupied() && spot.getSpotType().equals(VechicalType)) {
                return spot;
            }
        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots() {return parkingSpots;}
}
