package SOLID.LiskovSubstitutionPrinciple.controller;

import SOLID.LiskovSubstitutionPrinciple.interfaces.PaymentMethod;

/*
    This class is responsible for handling payment, it follows Liskov substitution principle
 */

public class PaymentsController {

    public void makePayment(PaymentMethod paymentMethod) {
        /*
         We can get the payment method implementation at runtime using Factory
         or Strategy design pattern
         */
        paymentMethod.pay(100);
    }
}
