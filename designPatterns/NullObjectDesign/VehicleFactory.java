package designPatterns.NullObjectDesign;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicle) {
        if (vehicle.equalsIgnoreCase("car")) {
            return new Car();
        }

        return new NullObject();
    }
}