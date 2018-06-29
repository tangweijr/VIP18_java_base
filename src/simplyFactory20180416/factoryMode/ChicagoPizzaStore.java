package simplyFactory20180416.factoryMode;

/**
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 创建pizza对象的过程
     * @param type 类型
     * @return 披萨对象
     */
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type == PizzaType.CLAM) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type == PizzaType.VEGGIE) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
