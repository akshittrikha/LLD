package designPatterns.DecoratorDesign.Decorators;

import designPatterns.DecoratorDesign.BasePizza;

public class ExtraCorn extends BasePizza {
    private final BasePizza basePizza;

    public ExtraCorn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 5;
    }
}