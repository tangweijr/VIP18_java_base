package simplyFactory20180416.simplyFactoryMode;

/**
 * 蔬菜披萨
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.name = "Veggie";
        this.toppings.add("apple");
        this.toppings.add("banana");
    }
}
