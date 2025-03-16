package factory;

import model.*;

public class CoffeeFactory {
    public static Coffee createCoffee(String coffeeType) {
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "americano":
                return new Americano();
            default:
                throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}
