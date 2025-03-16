package decorator;

import model.Coffee;

public class CaramelDecorator implements Topping, Coffee {
    private Coffee coffee;

    public CaramelDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Caramel";
    }
}
