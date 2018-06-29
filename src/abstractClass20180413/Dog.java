package abstractClass20180413;

/**
 * 狗
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public abstract class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    /**
     * 重写父类方法，加入狗的特征
     */
    @Override
    public void show() {
        super.show();
        System.out.println(name+"的特点是忠心耿耿");
    }
}
