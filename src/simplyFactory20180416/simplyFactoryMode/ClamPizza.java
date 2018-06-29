package simplyFactory20180416.simplyFactoryMode;

/**
 * 蛤蜊披萨
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.name = "Clam";
        this.toppings.add("Clam");
        this.toppings.add("Sager");
    }
}
