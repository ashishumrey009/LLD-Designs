package com.parkinglot.gate;

import com.parkinglot.parking.ParkingLot;
import com.parkinglot.parking.ParkingSpot;
import com.parkinglot.payment.PaymentService;
import com.parkinglot.vehicals.Vehical;

public class ExitGate {
    private ParkingLot parkingLot;

    private PaymentService paymentService;

    public ExitGate(ParkingLot parkingLot, PaymentService paymentService) {
        this.parkingLot = parkingLot;
        this.paymentService = paymentService;
    }

    public void processExit(int spotNumber,int hourStayed){

        ParkingSpot spot = parkingLot.getSpotByNumber(spotNumber);
        if(spot == null || !spot.isOccupied()){
            System.out.println("invalid spot number or Vacant Spot");
            return;
        }
        Vehical vehical = spot.getVehical();
        if(vehical == null){
            System.out.println("no vehical found in parking spot");
            return;
        }

        double fee = vehical.calculateFee(hourStayed);

        paymentService.payByCreditCard(fee);

        parkingLot.vacateSpot(spot,vehical);

        System.out.println("spot paid by credit card and vacated");
    }
}
