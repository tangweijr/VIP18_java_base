package abstractClass20180413;

/**
 * 三文鱼
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public class Salmon extends Fish {
    public Salmon(String name) {
        super(name);
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + "在水里游");
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + "吃浮游生物");
    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public void bark() {
        System.out.println(this.getClass().getSimpleName() + "不会叫，只会吐泡泡");
    }
}
