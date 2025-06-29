package com.parkinglot.parking;

import com.parkinglot.vehicals.Vehical;

import java.time.LocalDateTime;

public class Ticket {
    private ParkingSpot parkingSpot;

    private Vehical vehical;

    private LocalDateTime startTime;

    public Ticket(ParkingSpot parkingSpot, Vehical vehical, LocalDateTime startTime) {
        this.parkingSpot = parkingSpot;
        this.vehical = vehical;
        this.startTime = startTime;
    }
}
