package Level;

import java.util.ArrayList;
import ParkingSpot.ParkingSpot;
import VehicleType.VehicleType;
import VehicleType.Vehicle;

class Level {
    private final Integer floor;
    private final ArrayList<ParkingSpot> parkingSpotList;

    public Level(Integer floor, Integer capacity) {
        this.floor = floor;
        parkingSpotList = new ArrayList<ParkingSpot>(capacity);

        double spotsForCars = 0.4;
        double spotsForBikes = 0.5;

        int numBikes = (int) (spotsForBikes * capacity);
        int numCars = (int) (spotsForCars * capacity);
        int numTrucks = capacity - numBikes - numCars;

        for (int i = 1; i <= numBikes; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.MOTORCYCLE));
        } for(int i = numBikes+1; i <= numBikes+numCars; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.CAR));
        } for(int i = numBikes+numCars+1; i <= capacity; i++) {
            parkingSpotList.add(new ParkingSpot(i, VehicleType.TRUCK));
        }
    }

    public synchronized Boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot:parkingSpotList) {
            if (spot.isAvailable() && spot.getVehicleType() == vehicle.getType()) {
                try {
                    int spotId = spot.park(vehicle);
                    System.out.println("Vehicle parked at the spot " + spotId);
                    return true;
                } catch (Exception e) {
                    System.out.println("Ran into an exception while parking the vehicle at " + spot.getId());
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Did not find any available slot to park");
        return false;
    }

    public synchronized Boolean unParkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot:parkingSpotList) {
            if (!spot.isAvailable() && spot.getParkedVehicle() == vehicle) {
                try {
                    int spotId = spot.unPark();
                    System.out.println("Vehicle un-parked from the spot at " + spotId);
                    return true;
                } catch (Exception e) {
                    System.out.println("Ran into an exception while un-parking the vehicle at " + spot.getId());
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Could not find the parked vehicle");
        return false;
    }
}