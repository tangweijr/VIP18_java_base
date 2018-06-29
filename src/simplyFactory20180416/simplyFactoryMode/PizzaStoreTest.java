package simplyFactory20180416.simplyFactoryMode;

/**
 * 测试类
 */
public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore njps = new PizzaStore(new SimplyPizzaFactory());
        njps.orderPizza(PizzaType.CHEESE);
        njps.orderPizza(PizzaType.PEPPERONI);
        njps.orderPizza(PizzaType.CLAM);
        njps.orderPizza(PizzaType.VEGGIE);
    }
}
