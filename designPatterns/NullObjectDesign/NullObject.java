package designPatterns.NullObjectDesign;

public class NullObject implements Vehicle {
    @Override
    public int getFuelCap() {
        return 0;
    }

    @Override
    public int getSeatCap() {
        return 0;
    }
}