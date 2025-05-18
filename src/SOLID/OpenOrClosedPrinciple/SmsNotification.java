package SOLID.OpenOrClosedPrinciple;

/*
    This class follows open/close principle
 */

import SOLID.OpenOrClosedPrinciple.interfaces.Notification;

public class SmsNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
