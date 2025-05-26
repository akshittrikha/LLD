package designPatterns.DecoratorDesign;

import designPatterns.DecoratorDesign.Decorators.ExtraCheese;
import designPatterns.DecoratorDesign.Decorators.Mushroom;
import designPatterns.DecoratorDesign.Decorators.ExtraCorn;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCorn(new ExtraCheese(new Mushroom(new ExtraCheese(new VeggiePizza()))));

        System.out.println("You cost is: " + pizza.cost());
    }
}