package interfaceExercise20180414;

/**
 * 黄铜管类
 * @author tangweijr
 * @since 20180414
 */
public class Brass extends Wind {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("黄铜管的调子比较沉");
    }
}
