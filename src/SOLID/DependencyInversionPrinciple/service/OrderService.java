package SOLID.DependencyInversionPrinciple.service;

import SOLID.DependencyInversionPrinciple.interfaces.PaymentProcessor;

public class OrderService {

    private final PaymentProcessor paymentProcessor;

    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder() {
        paymentProcessor.processPayment();
    }
}
