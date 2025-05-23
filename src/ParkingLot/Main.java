package ParkingLot;

import ParkingLot.enums.VehicleType;
import ParkingLot.gate.EntranceGate;
import ParkingLot.gate.ExitGate;
import ParkingLot.manager.FourWheelerManager;
import ParkingLot.manager.ParkingSpotManager;
import ParkingLot.manager.TwoWheelerManager;
import ParkingLot.manager.factory.ParkingSpotManagerFactory;
import ParkingLot.model.ParkingSpot;
import ParkingLot.model.Ticket;
import ParkingLot.model.Vehicle;
import ParkingLot.model.spot.FourWheelerSpot;
import ParkingLot.model.spot.TwoWheelerSpot;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Ticket> ticketMap = new HashMap<Integer, Ticket>();
        int ticketCounterId = 1;

        List<ParkingSpot> twoWheelerSpot = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            twoWheelerSpot.add(new TwoWheelerSpot(i, 10));
        }

        List<ParkingSpot> fourWheelerSpot = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            fourWheelerSpot.add(new FourWheelerSpot(i, 20));
        }

        ParkingSpotManager twoWheelerManager = new TwoWheelerManager(twoWheelerSpot);
        ParkingSpotManager fourWheelerManager = new FourWheelerManager(fourWheelerSpot);

        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory(twoWheelerManager, fourWheelerManager);
        EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);

        while (true) {
            System.out.println("\n==== Parking Lot System ====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Parking Status");
            System.out.println("0. Exit Program");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter vehicle number");
                    int vehicleNumber = sc.nextInt();
                    System.out.print("Enter vehicle type (1 for TWO_WHEELER, 2 for FOUR_WHEELER): ");
                    int vt = sc.nextInt();

                    VehicleType vehicleType = (vt == 1) ? VehicleType.TWO_WHEELER : VehicleType.FOUR_WHEELER;
                    Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);

                    try {
                        Ticket ticket = entranceGate.bookSpot(vehicle);
                        int ticketId = ticketCounterId++;
                        ticketMap.put(ticketId, ticket);
                        System.out.println("Vehicle parked at spot " + ticket.getParkingSpot().getId() + ". Ticket ID: " + ticketId);
                    } catch (Exception e) {
                        System.out.println("Parking failed");
                    }
                }
                case 2 -> {
                    System.out.println("Enter ticket Id");
                    int ticketId = sc.nextInt();
                    if (!ticketMap.containsKey(ticketId)) {
                        System.out.println("Invalid ticket Id");
                        break;
                    }

                    Ticket ticket = ticketMap.get(ticketId);
                    ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle().getVehicleType());
                    ExitGate exitGate = new ExitGate(ticket, parkingSpotManager);
                    int amount = exitGate.calculateCost();
                    exitGate.removeVehicle();
                    System.out.println("Vehicle " + ticket.getVehicle().getVehicleNumber() + " has exited. Fee: ₹" + amount);
                    ticketMap.remove(ticketId);
                }
                case 0 -> {
                    System.out.println("Exiting");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
