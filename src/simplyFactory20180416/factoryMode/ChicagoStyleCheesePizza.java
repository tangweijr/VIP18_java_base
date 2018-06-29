package simplyFactory20180416.factoryMode;

/**
 * 芝加哥奶酪披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "ChicagoStyleCheese";
        this.toppings.add("ChicagoCheese");
    }

    @Override
    void cut() {
        System.out.println("切成4块正方形");
    }
}
