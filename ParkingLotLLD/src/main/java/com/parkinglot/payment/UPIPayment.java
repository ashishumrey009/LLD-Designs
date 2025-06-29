package com.parkinglot.payment;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of " + amount);
    }
}
