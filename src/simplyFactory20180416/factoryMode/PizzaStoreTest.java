package simplyFactory20180416.factoryMode;

/**
 * 测试类
 */
public class PizzaStoreTest {
    public static void main(String[] args) {
        // new PizzaStore的子类对象，直接调用
        PizzaStore nyps = new NYPizzaStore();
        nyps.orderPizza(PizzaType.CHEESE);
        nyps.orderPizza(PizzaType.PEPPERONI);
        nyps.orderPizza(PizzaType.CLAM);
        nyps.orderPizza(PizzaType.VEGGIE);
        // new PizzaStore的子类对象，直接调用
        PizzaStore chps = new ChicagoPizzaStore();
        chps.orderPizza(PizzaType.CHEESE);
        chps.orderPizza(PizzaType.PEPPERONI);
        chps.orderPizza(PizzaType.CLAM);
        chps.orderPizza(PizzaType.VEGGIE);
    }
}
