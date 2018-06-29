package simplyFactory20180416.factoryMode;

/**
 * 芝加哥蛤蜊披萨
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        this.name = "ChicagoStyleClam";
        this.toppings.add("ChicagoClam");
    }

    @Override
    void cut() {
        System.out.println("切成4块正方形");
    }
}
