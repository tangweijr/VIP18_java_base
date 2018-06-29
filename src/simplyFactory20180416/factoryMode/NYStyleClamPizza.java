package simplyFactory20180416.factoryMode;

/**
 * 纽约蛤蜊披萨
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        this.name = "NYStyleClam";
        this.toppings.add("NYClam");
    }
}
