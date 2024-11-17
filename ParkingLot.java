package ParkingLot;

class ParkingLot {
    private ParkingLot() {}

    private static ParkingLot instance;

    public static synchronized ParkingLot getInstance() {
        if (instance == null)
            instance = new ParkingLot();

        return instance;
    }
}