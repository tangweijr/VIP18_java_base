package simplyFactory20180416.factoryMode;

/**
 * 芝加哥蔬菜披萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "ChicagoStyleVeggie";
        this.toppings.add("ChicagoVeggie");
    }

    @Override
    void cut() {
        System.out.println("切成4块正方形");
    }
}
