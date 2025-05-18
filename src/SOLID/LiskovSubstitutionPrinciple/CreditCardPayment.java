package SOLID.LiskovSubstitutionPrinciple;

import SOLID.LiskovSubstitutionPrinciple.interfaces.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paying via credit card " + amount);
    }
}
