package SOLID.LiskovSubstitutionPrinciple;

import SOLID.LiskovSubstitutionPrinciple.interfaces.PaymentMethod;

public class StripePayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying amount via stripe " + amount);
    }
}
