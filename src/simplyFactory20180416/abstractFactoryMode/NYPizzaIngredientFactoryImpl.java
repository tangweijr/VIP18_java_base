package simplyFactory20180416.abstractFactoryMode;

import simplyFactory20180416.abstractFactoryMode.Cheese.Cheese;
import simplyFactory20180416.abstractFactoryMode.Cheese.ReggianoCheese;
import simplyFactory20180416.abstractFactoryMode.Clams.Clams;
import simplyFactory20180416.abstractFactoryMode.Clams.FreshClams;
import simplyFactory20180416.abstractFactoryMode.Dough.Dough;
import simplyFactory20180416.abstractFactoryMode.Dough.ThinCrustDough;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.Pepperoni;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.SlicedPepperoni;
import simplyFactory20180416.abstractFactoryMode.Sauce.MarinaraSauce;
import simplyFactory20180416.abstractFactoryMode.Sauce.Sauce;
import simplyFactory20180416.abstractFactoryMode.Veggies.Cabbage;
import simplyFactory20180416.abstractFactoryMode.Veggies.Tomato;
import simplyFactory20180416.abstractFactoryMode.Veggies.Veggies;

/**
 * 纽约原料工厂，实现原料工厂接口
 * 重写接口方法，返回纽约风格的原料
 */
public class NYPizzaIngredientFactoryImpl implements PizzaIngredientFactory {
    @Override
    public Dough createDouge() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Tomato(), new Cabbage()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
