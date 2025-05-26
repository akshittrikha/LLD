package designPatterns.DecoratorDesign.Decorators;

import designPatterns.DecoratorDesign.BasePizza;

public class Mushroom extends BasePizza {
    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
