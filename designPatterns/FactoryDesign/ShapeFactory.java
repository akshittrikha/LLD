package designPatterns.FactoryDesign;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null; // or throw an exception if needed
        }
    }
}