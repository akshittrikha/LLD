package designPatterns.BridgeDesign;

public class Human extends LivingBeingAbstractClass {
    public Human(BreathTechniqueInterface breathTechniqueInterface) {
        super(breathTechniqueInterface);
    }
}