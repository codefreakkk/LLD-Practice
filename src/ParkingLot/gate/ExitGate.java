package ParkingLot.gate;

import ParkingLot.manager.ParkingSpotManager;
import ParkingLot.model.Ticket;
import ParkingLot.pricing.computation.CostComputation;
import ParkingLot.pricing.computation.CostComputationFactory;

public class ExitGate {
    private ParkingSpotManager parkingSpotManager;
    private CostComputation costComputation;
    private Ticket ticket;

    public ExitGate(Ticket ticket, ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
        this.costComputation = CostComputationFactory.getCostComputation(ticket.getVehicle().getVehicleType());
        this.ticket = ticket;
    }

    public int calculateCost() {
        return costComputation.price(ticket);
    }

    public void removeVehicle() {
        parkingSpotManager.removeVehicle(ticket.getParkingSpot());
    }
}
