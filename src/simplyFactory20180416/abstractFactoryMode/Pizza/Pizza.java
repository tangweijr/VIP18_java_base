package simplyFactory20180416.abstractFactoryMode.Pizza;

import simplyFactory20180416.abstractFactoryMode.Cheese.Cheese;
import simplyFactory20180416.abstractFactoryMode.Clams.Clams;
import simplyFactory20180416.abstractFactoryMode.Dough.Dough;
import simplyFactory20180416.abstractFactoryMode.Pepperoni.Pepperoni;
import simplyFactory20180416.abstractFactoryMode.Sauce.Sauce;
import simplyFactory20180416.abstractFactoryMode.Veggies.Veggies;

import java.util.ArrayList;

/**
 * 披萨的抽象类，定义了披萨的属性和方法
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    /**
     * 准备方法
     * 具体实现交由子类，不同种类的披萨，需要有不同的准备方法
     */
    public abstract void prepare();

    /**
     * 烘焙方法
     */
    public void bake() {
        System.out.println("350℃烘烤25分钟");
    }

    /**
     * 切割方法
     */
    public void cut() {
        System.out.println("平均切成6块");
    }

    /**
     * 装盒方法
     */
    public void box() {
        System.out.println("装进披萨盒里\n");
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 打印名字方法
     */
    public String getName() {
        return name;
    }
}
