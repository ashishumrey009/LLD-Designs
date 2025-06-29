package com.parkinglot.payment;

public class PaymentService {
    private Payment payment;

   public void  payByCreditCard(double amount) {
        payment = new Payment(amount, new CreditCardPayment());
        payment.processPayment();
    }

    public void payByCash(double amount) {
        payment = new Payment(amount, new CashPayment());
        payment.processPayment();
    }

    public void payByUPI(double amount) {
        payment = new Payment(amount, new UPIPayment());
        payment.processPayment();
    }
   
}
