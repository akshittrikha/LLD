package designPatterns.StrategyDesign;

import designPatterns.StrategyDesign.DrivingStrategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

    Vehicle(DriveStrategy strategy) {
        this.driveObject = strategy;
    }

    public void drive() {
        this.driveObject.drive();
    }
}