package simplyFactory20180416.abstractFactoryMode;

import simplyFactory20180416.abstractFactoryMode.Pizza.*;

/**
 * 芝加哥披萨商店，继承自披萨商店
 */
public class ChicagoPizzaStore extends PizzaStore {
    /**
     * 重写披萨商店的创建过程
     * @param type 类型
     * @return 披萨接口
     */
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactoryImpl();
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("芝加哥风味的奶酪披萨");
        } else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("芝加哥风味的蛤蜊披萨");
        } else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("芝加哥风味的腊肠披萨");
        } else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("芝加哥风味的蔬菜披萨");
        }
        return pizza;
    }
}
