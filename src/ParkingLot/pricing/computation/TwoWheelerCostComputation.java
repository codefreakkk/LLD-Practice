package ParkingLot.pricing.computation;

import ParkingLot.pricing.strategy.HourlyPricing;
import ParkingLot.pricing.strategy.PricingStrategy;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new HourlyPricing());
    }
}
