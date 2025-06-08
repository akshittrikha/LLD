package designPatterns.BridgeDesign;

public class WaterBreathingTechnique implements BreathTechniqueInterface {
    @Override
    public void breath() {
        System.out.println("Inhaling Oxygen from gills");
        System.out.println("Exhaling CO2 from gills");
    }
}