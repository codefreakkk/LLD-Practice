package ParkingLot.pricing.strategy;

import ParkingLot.model.Ticket;

public class MinutePricing implements PricingStrategy {

    @Override
    public int price(Ticket ticket) {
        long duration = (System.currentTimeMillis() - ticket.getEntryTime()) / (1000 * 60); // minutes
        return (int) Math.max(1, duration) * ticket.getParkingSpot().getPrice();
    }
}
