package simplyFactory20180416.factoryMode;

import java.util.ArrayList;

/**
 * 披萨的抽象类，定义了披萨的属性和方法
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList();

    /**
     * 准备方法
     */
    void prepare() {
        System.out.println("准备披萨：" + name);
        System.out.println("揉面中...");
        System.out.println("抹酱中...");
        System.out.println("撒料中...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("\t" + toppings.get(i));
        }
    }

    /**
     * 烘焙方法
     */
    void bake() {
        System.out.println("350℃烘烤25分钟");
    }

    /**
     * 切割方法
     */
    void cut() {
        System.out.println("平均切成6块");
    }

    /**
     * 装盒方法
     */
    void box() {
        System.out.println("装进披萨盒里");
    }

    /**
     * 打印名字方法
     */
    public String getName() {
        return name;
    }
}
