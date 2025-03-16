package decorator;

import model.Coffee;

public class ChocolateDecorator implements Topping, Coffee {
    private Coffee coffee;

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Chocolate";
    }
}
