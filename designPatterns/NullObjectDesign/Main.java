package designPatterns.NullObjectDesign;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("car");
        System.out.println(vehicle);

        System.out.println(vehicle.getFuelCap());
    }
}