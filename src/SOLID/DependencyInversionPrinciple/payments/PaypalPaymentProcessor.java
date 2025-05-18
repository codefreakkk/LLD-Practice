package SOLID.DependencyInversionPrinciple.payments;

import SOLID.DependencyInversionPrinciple.interfaces.PaymentProcessor;

public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment() {
        // logic here
    }
}
