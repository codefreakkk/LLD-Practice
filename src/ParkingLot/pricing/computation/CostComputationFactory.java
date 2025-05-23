package ParkingLot.pricing.computation;

import ParkingLot.enums.VehicleType;

public class CostComputationFactory {
    public static CostComputation getCostComputation(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER -> {
                return new TwoWheelerCostComputation();
            }
            case FOUR_WHEELER -> {
                return new FourWheelerCostComputation();
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
