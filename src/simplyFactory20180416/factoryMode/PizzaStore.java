package simplyFactory20180416.factoryMode;

/**
 * 披萨的种类
 */
enum PizzaType {
    CHEESE, PEPPERONI, CLAM, VEGGIE;
}

/**
 * 披萨商店
 */
public abstract class PizzaStore {

    /**
     * 通用过程，final关键字，防止类子类重写
     * @param type 类型
     * @return 披萨类
     */
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza = null;
        // 通过工厂的createPizza方法返回披萨对象
        pizza = createPizza(type);
        // 披萨的基本方法
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 抽象方法，用于创建披萨对象，子类必须重写
     * @param type 类型
     * @return 披萨对象
     */
    protected abstract Pizza createPizza(PizzaType type);
}
