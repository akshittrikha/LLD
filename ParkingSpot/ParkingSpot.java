package ParkingSpot;

import VehicleType.Vehicle;

import java.util.Date;
import java.util.UUID;

public class ParkingSpot {
    private UUID id;
    private Boolean occupied;
    private Vehicle vehicle;
    private Date inTime;

    public ParkingSpot() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return this.id;
    }

    //* parks the vehicle
    public Boolean park(Vehicle vehicle) {
        if(this.occupied) return false;

        this.occupied = true;
        this.vehicle = vehicle;
        this.inTime = new Date();

        return true;
    }

    //* unparks the vehicle
    public Date unPark() {
        if(!this.occupied) return null;

        Date inTime = this.inTime;

        this.occupied = false;
        this.vehicle = null;
        this.inTime = null;

        return inTime;
    }

    //* returns the vehicle parked at the spot
    public Vehicle getVehicle() {
        if(!this.occupied) return null;

        return this.vehicle;
    }
}
