package designPatterns.StrategyDesign;

import designPatterns.StrategyDesign.DrivingStrategies.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super (new NormalDriveStrategy());
    }
}