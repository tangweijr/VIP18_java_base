package simplyFactory20180416.simplyFactoryMode;

/**
 * 披萨商店
 */
public class PizzaStore {
    // 定义一个简单工厂的引用
    SimplyPizzaFactory factory;

    /**
     * 构造器
     * @param simplyPizzaFactory 简单工厂对象
     */
    public PizzaStore(SimplyPizzaFactory simplyPizzaFactory) {
        this.factory = simplyPizzaFactory;
    }

    /**
     * 通用过程
     * @param type 类型
     * @return 披萨类
     */
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = null;
        // 通过工厂的createPizza方法返回披萨对象
        pizza = factory.createPizza(type);
        // 披萨的基本方法
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
