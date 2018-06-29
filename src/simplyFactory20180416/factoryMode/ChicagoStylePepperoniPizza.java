package simplyFactory20180416.factoryMode;

/**
 * 芝加哥腊肠披萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "ChicagoPepperoni";
        this.toppings.add("ChicagoPepperoni");
    }

    @Override
    void cut() {
        System.out.println("切成4块正方形");
    }
}
