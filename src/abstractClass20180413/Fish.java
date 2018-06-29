package abstractClass20180413;

/**
 * 鱼
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    /**
     * 重写父类的方法，加入鱼类特征
     */
    @Override
    public void show() {
        super.show();
        System.out.println(name+"的特点是用腮呼吸");
    }
}
