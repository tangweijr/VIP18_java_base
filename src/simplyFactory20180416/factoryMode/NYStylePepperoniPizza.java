package simplyFactory20180416.factoryMode;

/**
 * 纽约腊肠披萨
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.name = "NYStylePepperoni";
        this.toppings.add("NYPepperoni");
    }
}
