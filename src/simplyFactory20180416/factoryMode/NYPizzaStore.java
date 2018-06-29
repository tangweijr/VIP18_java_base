package simplyFactory20180416.factoryMode;

/**
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {
    /**
     * 创建pizza对象的过程
     * @param type 类型
     * @return 披萨对象
     */
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new NYStyleCheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new NYStylePepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new NYStyleClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
