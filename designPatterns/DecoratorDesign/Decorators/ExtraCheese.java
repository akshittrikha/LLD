package designPatterns.DecoratorDesign.Decorators;

import designPatterns.DecoratorDesign.BasePizza;

public class ExtraCheese extends BasePizza {
    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
