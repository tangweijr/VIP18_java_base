package simplyFactory20180416.abstractFactoryMode.Pizza;

import simplyFactory20180416.abstractFactoryMode.PizzaIngredientFactory;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {
    // 保存原料工厂接口的引用
    PizzaIngredientFactory ingredientFactory;

    /**
     * 构造器，传入原料工厂接口，不同地区原料工厂的实现是不同的
     * @param ingredientFactory 原料工厂接口
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 重写准备方法，通过具体原料工厂的实现类，调用创造方法
     * 不同地区，使用不同的原料，产生不同的奶酪披萨
     */
    @Override
    public void prepare() {
        System.out.println("准备：" + name);
        dough = ingredientFactory.createDouge();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
