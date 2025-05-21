package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.processor.PaymentProcessor;
import AbstractFactoryPattern.processor.RazorpayPaymentProcessor;

public class RazorpayPaymentFactory implements PaymentGatewayFactory {

    @Override
    public PaymentProcessor createProcessor() {
        return new RazorpayPaymentProcessor();
    }
}
