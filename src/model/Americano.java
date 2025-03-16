package model;

public class Americano implements Coffee {
    @Override
    public double getCost() {
        return 3.2;
    }

    @Override
    public String getDescription() {
        return "Americano";
    }
}