package ParkingLot.manager;

import ParkingLot.model.ParkingSpot;

import java.util.List;

public abstract class ParkingSpotManager {
    protected List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpace() {
        for (ParkingSpot spot : parkingSpotList) {
            if (spot.isAvailable()) {
                return spot;
            }
        }
        return null;
    }

    public void addParkingSpace(ParkingSpot parkingSpot) {
        parkingSpotList.add(parkingSpot);
    }

    public void removeParkingSpace(ParkingSpot parkingSpot) {
        parkingSpotList.remove(parkingSpot);
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
