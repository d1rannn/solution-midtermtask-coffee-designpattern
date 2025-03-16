package model;

public class Latte implements Coffee {
    @Override
    public double getCost() {
        return 2.8;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
