package simplyFactory20180416.abstractFactoryMode;

import simplyFactory20180416.abstractFactoryMode.Cheese.Cheese;
import simplyFactory20180416.abstractFactoryMode.Clams.Clams;
import simplyFactory20180416.abstractFactoryMode.Dough.Dough;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.Pepperoni;
import simplyFactory20180416.abstractFactoryMode.Sauce.Sauce;
import simplyFactory20180416.abstractFactoryMode.Veggies.Veggies;

/**
 * 抽象的原料工厂接口
 */
public interface PizzaIngredientFactory {
    /**
     * 创造面团
     * @return 面团接口
     */
    Dough createDouge();

    /**
     * 创造酱汁
     * @return 酱汁接口
     */
    Sauce createSauce();

    /**
     * 创造奶酪
     * @return 奶酪接口
     */
    Cheese createCheese();

    /**
     * 创造蔬菜
     * @return 蔬菜接口
     */
    Veggies[] createVeggies();

    /**
     * 创造腊肠
     * @return 腊肠接口
     */
    Pepperoni createPepperoni();

    /**
     * 创造蛤蜊
     * @return 蛤蜊接口
     */
    Clams createClam();
}
