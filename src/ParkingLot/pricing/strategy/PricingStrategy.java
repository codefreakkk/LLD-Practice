package ParkingLot.pricing.strategy;

import ParkingLot.model.Ticket;

public interface PricingStrategy {
    int price(Ticket ticket);
}
