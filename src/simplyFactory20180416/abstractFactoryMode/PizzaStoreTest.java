package simplyFactory20180416.abstractFactoryMode;

/**
 * 测试类
 */
public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore nyps = new NYPizzaStore();
        nyps.orderPizza(PizzaType.CHEESE);
        nyps.orderPizza(PizzaType.CLAM);
        nyps.orderPizza(PizzaType.PEPPERONI);
        nyps.orderPizza(PizzaType.VEGGIE);
        PizzaStore chps = new ChicagoPizzaStore();
        chps.orderPizza(PizzaType.CHEESE);
        chps.orderPizza(PizzaType.CLAM);
        chps.orderPizza(PizzaType.PEPPERONI);
        chps.orderPizza(PizzaType.VEGGIE);
    }
}
