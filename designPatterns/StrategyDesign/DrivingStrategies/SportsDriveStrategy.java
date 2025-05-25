package designPatterns.StrategyDesign.DrivingStrategies;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("\tDrives in Sports Mode");
    }
}