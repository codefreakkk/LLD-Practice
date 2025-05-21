package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.PaymentGatewayFactory;
import AbstractFactoryPattern.factory.RazorpayPaymentFactory;
import AbstractFactoryPattern.factory.StripePaymentGatewayFactory;
import AbstractFactoryPattern.processor.PaymentProcessor;
import AbstractFactoryPattern.processor.RazorpayPaymentProcessor;
import AbstractFactoryPattern.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        PaymentGatewayFactory paymentGatewayFactory = new StripePaymentGatewayFactory();
        PaymentService paymentService = new PaymentService(paymentGatewayFactory);

        paymentService.makePayment(100);
    }
}
