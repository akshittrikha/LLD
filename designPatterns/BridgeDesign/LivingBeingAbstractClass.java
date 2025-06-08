package designPatterns.BridgeDesign;

public abstract class LivingBeingAbstractClass {
    BreathTechniqueInterface breathingTechnique;

    public LivingBeingAbstractClass(BreathTechniqueInterface breathingTechnique) {
        this.breathingTechnique = breathingTechnique;
    }

    public void breath() {
        this.breathingTechnique.breath();
    }
}