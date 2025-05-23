package ParkingLot.manager.factory;

import ParkingLot.enums.VehicleType;
import ParkingLot.manager.ParkingSpotManager;

public class ParkingSpotManagerFactory {
    private ParkingSpotManager twoWheelerManager;
    private ParkingSpotManager fourWheelerManager;

    public ParkingSpotManagerFactory(ParkingSpotManager twoWheelerManager, ParkingSpotManager fourWheelerManager) {
        this.twoWheelerManager = twoWheelerManager;
        this.fourWheelerManager = fourWheelerManager;
    }

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER -> {
                return twoWheelerManager;
            }
            case FOUR_WHEELER -> {
                return fourWheelerManager;
            }
            default -> throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
