// Creating a singleton class since we are creating a SINGLE parking lot.
// So it makes sense to create a singleton class

public class ParkingLot {
    //* private, so it's not accessible from the outside
    private ParkingLot() {} //* initialize the parking lot features like levels and spots inside here

    private static class SingletonHelper {
        //* Since this code static it will be executed when this class is loaded
        //* And since the class is loaded by the JAVA Class Loading mechanism which ensure thread safety inherently
        //* That's why the below code is thread safe and creates the instance only once
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public ParkingLot getInstance() {
        //* This Initiates the
        return SingletonHelper.INSTANCE;
    }
}
