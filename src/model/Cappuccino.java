package model;

public class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 2.7;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}
