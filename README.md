# Coffee Shop Simulator

## Brief Overview
The Coffee Shop Simulator is a console-based application that allows users to select a coffee base (e.g., Espresso, Cappuccino, Latte, Americano) and dynamically add toppings (such as milk, caramel syrup, whipped cream, and chocolate syrup) to customize their coffee order. The application calculates and displays the total cost of the customized coffee based on the base price and selected toppings.

This project demonstrates the application of the **Factory Method** and **Decorator** design patterns to implement a flexible and extensible coffee ordering system.

---

## Design Patterns Implemented

### 1. Factory Method Pattern

#### **Purpose**:
The Factory Method Pattern is used to create different types of coffee objects (e.g., Espresso, Cappuccino, Latte, Americano) based on user input. The Factory provides an abstract way of creating objects, allowing the system to be easily extended with new coffee types without modifying the main application logic.

#### **Implementation**:
- The `CoffeeFactory` class is responsible for creating instances of specific coffee types (such as `Espresso`, `Cappuccino`, etc.).
- The `createCoffee()` method in the `CoffeeFactory` class takes a coffee type as input (e.g., "latte" or "espresso") and returns the corresponding coffee object.
- This allows users to select a coffee base without needing to instantiate the specific coffee class directly.

```
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
```

2. Decorator Pattern

Purpose:

The Decorator Pattern is used to add new functionality (i.e., toppings) to an existing coffee object without altering its structure. This allows for flexible and dynamic additions to a coffee order, such as adding milk, caramel syrup, or whipped cream, by “decorating” the base coffee object with additional behavior.

Implementation:
	•	The Topping interface defines methods for adding cost and description.
	•	Each topping, such as MilkDecorator, CaramelDecorator, WhippedCreamDecorator, and ChocolateDecorator, implements the Topping interface.
	•	The Decorator classes wrap around the Coffee object and modify its behavior, updating the cost and description based on the topping added.

```
public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;  // Adding cost of milk
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";  // Adding milk to the description
    }
}
```

Each decorator class adds a specific topping (e.g., milk, caramel syrup) and modifies the getCost() and getDescription() methods of the base Coffee object.

How the Decorator Pattern is Applied:
	•	The CoffeeShopSimulator class allows the user to select a base coffee and add multiple toppings.
	•	Each topping is represented by a decorator class, and when a topping is added, it wraps the existing Coffee object, modifying its description and cost.

⸻

How to Use the Application
	1.	Run the Application: Start the CoffeeShopSimulator class.
	2.	Select Coffee Base: The user will be prompted to choose a coffee base from the following options:
	•	Espresso
	•	Cappuccino
	•	Latte
	•	Americano
	3.	Add Toppings: The user can add multiple toppings, such as:
	•	Milk
	•	Caramel Syrup
	•	Whipped Cream
	•	Chocolate Syrup
	4.	Final Order: Once the user is done adding toppings, the application will display the final description and the total cost of the customized coffee.

Example Interaction:

Welcome to the Coffee Shop Simulator!
Choose your coffee base (Espresso, Cappuccino, Latte, Americano): 
latte
Choose an ingredient to add (Milk, Caramel, Whipped Cream, Chocolate, or 'done' to finish): 
milk
Current coffee: Latte + Milk | Total cost: $4.5
Choose an ingredient to add (Milk, Caramel, Whipped Cream, Chocolate, or 'done' to finish): 
caramel
Current coffee: Latte + Milk + Caramel Syrup | Total cost: $5.0
Choose an ingredient to add (Milk, Caramel, Whipped Cream, Chocolate, or 'done' to finish): 
done
Your coffee: Latte + Milk + Caramel Syrup
Total cost: $5.0



⸻

Project Structure

The project is organized into the following directories:

```
CoffeeShopSimulator/
│
├── model/
│   ├── Coffee.java           // Coffee interface
│   ├── Espresso.java         // Espresso class
│   ├── Cappuccino.java       // Cappuccino class
│   ├── Latte.java            // Latte class
│   └── Americano.java        // Americano class
│
├── decorator/
│   ├── Topping.java          // Topping interface
│   ├── MilkDecorator.java    // Milk topping decorator
│   ├── CaramelDecorator.java // Caramel topping decorator
│   ├── WhippedCreamDecorator.java  // Whipped Cream topping decorator
│   └── ChocolateDecorator.java     // Chocolate topping decorator
│
├── factory/
│   └── CoffeeFactory.java    // Factory for creating coffee objects
│
└── app/
    └── CoffeeShopSimulator.java // Main class for user interaction
```

⸻

Conclusion

This Coffee Shop Simulator project demonstrates how design patterns (Factory Method and Decorator) can be used to create a flexible and extensible system. By using these patterns, the system is easy to maintain and extend with new coffee types and toppings, providing a solid foundation for further development or real-world applications.

⸻

Future Enhancements
	•	GUI: Convert the console application to a graphical user interface (GUI) using frameworks like JavaFX or Swing.
	•	Database Integration: Integrate a database to store coffee types and toppings for persistent storage.
	•	User Authentication: Allow users to save their favorite coffee orders by adding authentication and user profiles.

---

### Explanation of Sections:
- **Project Overview**: Gives a brief description of the coffee shop simulator.
- **Design Patterns**: Detailed explanation of how the Factory Method and Decorator patterns are implemented, including code snippets.
- **Usage Instructions**: Provides step-by-step instructions for how to interact with the application.
- **Project Structure**: Lists the folder and file structure of the project for better organization.
- **Conclusion**: Wraps up the document and explains the future scope of the project.
