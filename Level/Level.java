package Level;

//* The Level.Level class represents a level in the parking lot and contains a list of parking spots.

import ParkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.HashSet;

public class Level {
    private final ArrayList<ParkingSpot> parkingSpots;
    private final HashSet<ParkingSpot> vacantSpots;
    private final HashSet<ParkingSpot> occupiedSpots;
    private int floor;

    public Level(int level, Integer spots) {
        this.floor = level;
        parkingSpots = new ArrayList<ParkingSpot>(spots);
        vacantSpots = new HashSet<ParkingSpot>(parkingSpots);
        occupiedSpots = new HashSet<ParkingSpot>();
    }

    public ParkingSpot getSpot() {

    }
}
