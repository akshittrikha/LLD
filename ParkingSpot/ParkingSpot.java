package ParkingSpot;

import VehicleType.VehicleType;
import VehicleType.Vehicle;

public class ParkingSpot {
    private final VehicleType vehicleType;
    private final Integer id;
    private Vehicle parkedVehicle;

    public ParkingSpot(Integer id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.parkedVehicle = null;
    }

    public Boolean isAvailable() {
        return this.parkedVehicle == null;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public Integer getId() {
        return this.id;
    }

    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }

    public synchronized Integer park(Vehicle vehicle) throws Exception {
        if (!isAvailable()) {
            throw new Exception("This Parking Spot is already occupied.");
        } else if (this.vehicleType != vehicle.getType()) {
            throw new Exception("Invalid Vehicle Type");
        }

        this.parkedVehicle = vehicle;

        return this.id;
    }

    public synchronized Integer unPark() throws Exception {
        if (isAvailable()) {
            throw new Exception("Parking spot is already empty");
        }

        this.parkedVehicle = null;

        return this.id;
    }
}