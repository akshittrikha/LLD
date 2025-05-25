package designPatterns.StrategyDesign;

public class Main {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle sportsVehicle = new SportsVehicle();

        System.out.print("Goods vehicle drives:");
        goodsVehicle.drive();

        System.out.print("Sports vehicle drives:");
        sportsVehicle.drive();
    }
}
