package simplyFactory20180416.abstractFactoryMode;

import simplyFactory20180416.abstractFactoryMode.Cheese.CaesarCheese;
import simplyFactory20180416.abstractFactoryMode.Cheese.Cheese;
import simplyFactory20180416.abstractFactoryMode.Clams.Clams;
import simplyFactory20180416.abstractFactoryMode.Clams.FrozenClams;
import simplyFactory20180416.abstractFactoryMode.Dough.Dough;
import simplyFactory20180416.abstractFactoryMode.Dough.LargeDough;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.Pepperoni;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.SlicedPepperoni;
import simplyFactory20180416.abstractFactoryMode.Sauce.LaoGanMaSauce;
import simplyFactory20180416.abstractFactoryMode.Sauce.Sauce;
import simplyFactory20180416.abstractFactoryMode.Veggies.Olives;
import simplyFactory20180416.abstractFactoryMode.Veggies.Onion;
import simplyFactory20180416.abstractFactoryMode.Veggies.Veggies;

/**
 * 芝加哥原料工厂，实现原料工厂接口
 * 重写接口方法，返回芝加哥风格的原料
 */
public class ChicagoPizzaIngredientFactoryImpl implements PizzaIngredientFactory {
    @Override
    public Dough createDouge() {
        return new LargeDough();
    }

    @Override
    public Sauce createSauce() {
        return new LaoGanMaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new CaesarCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Onion(), new Olives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
