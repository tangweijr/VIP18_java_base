package abstractClass20180413;

/**
 * 哈士奇
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public class Husky extends Dog {
    public Husky(String name) {
        super(name);
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void run() {
        System.out.println("哈士奇跑起来一阵风");
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void eat() {
        System.out.println("哈士奇喜欢吃狗粮");
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void bark() {
        System.out.println("二哈叫起来像狼");
    }
}
