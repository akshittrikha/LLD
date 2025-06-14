import VehicleType.Car;
import VehicleType.Motorcycle;
import VehicleType.Truck;
import VehicleType.Vehicle;
import Level.Level;
import ParkingLot.ParkingLot;

public class ParkingLotDemo {
    public static void main(String args[]) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);


        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);
        parkingLot.unparkVehicle(truck);
        parkingLot.unparkVehicle(car);
    }
}