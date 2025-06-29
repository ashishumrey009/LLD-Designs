package com.parkinglot.payment;

public class CashPayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash Payment of " + amount);
        //
    }
}
