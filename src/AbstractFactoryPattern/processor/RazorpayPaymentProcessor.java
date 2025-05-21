package AbstractFactoryPattern.processor;

public class RazorpayPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Razorpay Payment amount is " + amount);
    }
}
