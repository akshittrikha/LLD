package designPatterns.BridgeDesign;

public class LandBreathingTechnique implements BreathTechniqueInterface {
    @Override
    public void breath() {
        System.out.println("*** This is the land breathing technique ***");
        System.out.println("Inhaling Oxygen through nose and mouth");
        System.out.println("Exhaling CO2 through nose and mouth");
    }
}