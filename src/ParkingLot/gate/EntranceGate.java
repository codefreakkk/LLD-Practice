package ParkingLot.gate;

import ParkingLot.manager.ParkingSpotManager;
import ParkingLot.manager.factory.ParkingSpotManagerFactory;
import ParkingLot.model.ParkingSpot;
import ParkingLot.model.Ticket;
import ParkingLot.model.Vehicle;

public class EntranceGate {
    private final ParkingSpotManagerFactory parkingManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingManagerFactory) {
        this.parkingManagerFactory = parkingManagerFactory;
    }

    public Ticket bookSpot(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingSpotManager.findParkingSpace();
        if (parkingSpot == null) {
            throw new RuntimeException("ParkingSpot not found");
        }
        parkingSpot.parkVehicle(vehicle);
        return new Ticket(vehicle, parkingSpot);
    }
}
