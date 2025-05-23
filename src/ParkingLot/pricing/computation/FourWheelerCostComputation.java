package ParkingLot.pricing.computation;

import ParkingLot.pricing.strategy.MinutePricing;
import ParkingLot.pricing.strategy.PricingStrategy;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new MinutePricing());
    }
}
