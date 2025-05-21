package AbstractFactoryPattern.service;

import AbstractFactoryPattern.factory.PaymentGatewayFactory;
import AbstractFactoryPattern.processor.PaymentProcessor;

public class PaymentService {
    private final PaymentGatewayFactory paymentGatewayFactory;
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentGatewayFactory = paymentGatewayFactory;
        this.paymentProcessor = paymentGatewayFactory.createProcessor();
    }

    public void makePayment(double amount) {
        paymentProcessor.processPayment(amount);
    }
}
