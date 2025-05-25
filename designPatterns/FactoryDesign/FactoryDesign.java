package designPatterns.FactoryDesign;

public class FactoryDesign {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
    }
}