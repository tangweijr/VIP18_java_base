package simplyFactory20180416.simplyFactoryMode;

/**
 * 腊肠披萨
 */
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.name = "Pepperoni";
        this.toppings.add("Pepperoni");
        this.toppings.add("Pepper");
        this.toppings.add("Salt");
    }
}
