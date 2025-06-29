package com.parkinglot;

import com.parkinglot.gate.EntranceGate;
import com.parkinglot.gate.ExitGate;
import com.parkinglot.parking.ParkingFloor;
import com.parkinglot.parking.ParkingLot;
import com.parkinglot.parking.ParkingSpot;
import com.parkinglot.payment.PaymentService;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Setup parking lot with 1 floor, 2 car spots, 2 bike spots
        ParkingFloor floor = new ParkingFloor(1, 2, 2);
        ArrayList<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(floor);
        ParkingLot parkingLot = new ParkingLot(parkingFloors);

        PaymentService paymentService = new PaymentService();
        EntranceGate entranceGate = new EntranceGate(parkingLot);
        ExitGate exitGate = new ExitGate(parkingLot, paymentService);

        // Park a car
        ParkingSpot carSpot = entranceGate.parkVehicle("Car", "CG07LX123");
        // Park a bike
        ParkingSpot bikeSpot = entranceGate.parkVehicle("Bike", "CG07LX456");

        // Simulate exit for car after 3 hours
        if (carSpot != null) {
            exitGate.processExit(carSpot.getSpotNumber(), 3);
        }
        // Simulate exit for bike after 2 hours
        if (bikeSpot != null) {
            exitGate.processExit(bikeSpot.getSpotNumber(), 2);
        }
    }
}