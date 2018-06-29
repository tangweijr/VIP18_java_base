package simplyFactory20180416.simplyFactoryMode;

/**
 * 披萨的种类
 */
enum PizzaType {
    CHEESE, PEPPERONI, CLAM, VEGGIE;
}

/**
 * 简单工厂对象
 */
public class SimplyPizzaFactory {
    /**
     * 创建pizza对象的过程
     * @param type 类型
     * @return 披萨对象
     */
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
