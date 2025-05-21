package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.processor.PaymentProcessor;
import AbstractFactoryPattern.processor.StripePaymentProcessor;

public class StripePaymentGatewayFactory implements PaymentGatewayFactory {

    @Override
    public PaymentProcessor createProcessor() {
        return new StripePaymentProcessor();
    }
}
