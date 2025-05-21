package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.processor.PaymentProcessor;

public interface PaymentGatewayFactory {
    PaymentProcessor createProcessor();
}
