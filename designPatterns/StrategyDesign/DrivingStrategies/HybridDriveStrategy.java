package designPatterns.StrategyDesign.DrivingStrategies;

public class HybridDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("\tDrives in Hybrid Mode");
    }
}