package designPatterns.StrategyDesign;

import designPatterns.StrategyDesign.DrivingStrategies.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}