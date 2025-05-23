package ParkingLot.pricing.strategy;

import ParkingLot.model.Ticket;

public class HourlyPricing implements PricingStrategy {

    @Override
    public int price(Ticket ticket) {
        long duration = (System.currentTimeMillis() - ticket.getEntryTime()) / 1000 * 60 * 60;
        return (int) Math.max(1, duration) * ticket.getParkingSpot().getPrice();
    }
}
