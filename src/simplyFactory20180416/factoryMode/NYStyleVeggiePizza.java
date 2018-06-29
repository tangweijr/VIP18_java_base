package simplyFactory20180416.factoryMode;

/**
 * 纽约蔬菜披萨
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.name = "NYStyleVeggie";
        this.toppings.add("NYVeggie");
    }
}
