package com.parkinglot.payment;

public class CreditCardPayment implements  PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of " + amount);
    }
}
