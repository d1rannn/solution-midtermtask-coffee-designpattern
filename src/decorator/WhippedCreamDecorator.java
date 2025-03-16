package decorator;

import model.Coffee;

public class WhippedCreamDecorator implements Topping, Coffee {
    private Coffee coffee;

    public WhippedCreamDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Whipped Cream";
    }
}
