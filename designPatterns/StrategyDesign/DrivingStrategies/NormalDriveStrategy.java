package designPatterns.StrategyDesign.DrivingStrategies;;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("\tDrives in Normal Mode");
    }
}