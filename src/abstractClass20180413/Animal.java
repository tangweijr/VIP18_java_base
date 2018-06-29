package abstractClass20180413;

/**
 * 抽象类
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public abstract class Animal {
    public String name;

    /**
     * 构造器
     * @param name 小动物的名字
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * 抽象方法，留给子类实现
     */
    public abstract void run();

    /**
     * 抽象方法，留给子类实现
     */
    public abstract void eat();

    /**
     * 抽象方法，留给子类实现
     */
    public abstract void bark();

    /**
     * 子类实现后，调用子类的具体方法
     */
    public void show() {
        System.out.println("-----------------------");
        System.out.println(name+"的类型是"+this.getClass().getSimpleName());
        run();
        eat();
        bark();
    }
}
