package simplyFactory20180416.factoryMode;

/**
 * 纽约奶酪披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.name = "NY Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Cheese");
    }
}
