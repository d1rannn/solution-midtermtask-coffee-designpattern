package app;

import decorator.CaramelDecorator;
import decorator.ChocolateDecorator;
import decorator.MilkDecorator;
import decorator.WhippedCreamDecorator;
import factory.CoffeeFactory;
import model.Coffee;

import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Coffee Shop Simulator!");

        // Coffee Selection
        System.out.println("Choose your coffee base (Espresso, Cappuccino, Latte, Americano): ");
        String coffeeType = scanner.nextLine();
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        // Topping/Ingredient Selection
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Choose an ingredient to add (Milk, Caramel, Whipped Cream, Chocolate, or 'done' to finish): ");
            String topping = scanner.nextLine().toLowerCase();

            switch (topping) {
                case "milk":
                    coffee = new MilkDecorator(coffee);
                    break;
                case "caramel":
                    coffee = new CaramelDecorator(coffee);
                    break;
                case "whipped cream":
                    coffee = new WhippedCreamDecorator(coffee);
                    break;
                case "chocolate":
                    coffee = new ChocolateDecorator(coffee);
                    break;
                case "done":
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid topping. Please try again.");
            }
            
        }

        // Final Output
        System.out.println("Your coffee: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());

        scanner.close();
    }
}
