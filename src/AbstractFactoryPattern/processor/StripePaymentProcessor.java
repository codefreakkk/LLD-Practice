package AbstractFactoryPattern.processor;

public class StripePaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment amount Processing " + amount);
    }
}
