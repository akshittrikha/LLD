# Parking Lot

## Requirements

1. The Parking Lot should have multiple levels
    1. Each level should have a certain number of parking spots.
    2. Ability to increate/decrease the number of levels.
    3. Ability to increase/decrease the number of parking spots per levels.
    4. Ability to prioritise a level?

2. The parking lot should support different types of vehicles.
    1. Different parking spots / levels for each type of vehicle.
    2. Ability to get the list of all parking spots with a particular type of vehicle?

3. Each parking spot should be available to accomodate a particular type of vehicle

4. The system should assign a particular spot to a vehicle upon entry and release it upon exit

5. The system should track the availability of parking spots and provide real time information to the user

6. The system should handle multiple entry and exit points and support concurrent access.
    1. Ability to add the entry / exit gates


## Implementation

1. The ParkingLot class follows the Singleton pattern to ensure only one instance of the parking lot exists. It maintains a list of levels and provides methods to park and unpark vehicles.

2. The Level.Level class represents a level in the parking lot and contains a list of parking spots. It handles parking and unparking of vehicles within the level.

3. The ParkingSpot.ParkingSpot class represents an individual parking spot and tracks the availability and the parked vehicle.
