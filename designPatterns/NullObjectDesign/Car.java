package designPatterns.NullObjectDesign;

public class Car implements Vehicle {
    @Override
    public int getFuelCap() {
        return 40;
    }

    @Override
    public int getSeatCap() {
        return 5;
    }
}