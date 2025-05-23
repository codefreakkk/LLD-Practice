package ParkingLot.model;

public abstract class ParkingSpot {
    int id;
    protected boolean isEmpty;
    protected Vehicle vehicle;
    protected int price;

    public ParkingSpot(int id, int price) {
        this.id = id;
        this.price = price;
        this.isEmpty = true;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isEmpty;
    }
}
