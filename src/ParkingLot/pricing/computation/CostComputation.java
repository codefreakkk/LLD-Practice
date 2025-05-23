package ParkingLot.pricing.computation;

import ParkingLot.model.Ticket;
import ParkingLot.model.Vehicle;
import ParkingLot.pricing.strategy.PricingStrategy;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public int price(Ticket ticket) {
        return pricingStrategy.price(ticket);
    }
}
