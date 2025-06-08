package designPatterns.BridgeDesign;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new LandBreathingTechnique());

        human.breath();
    }
}