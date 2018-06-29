package interfaceExercise20180414;

/**
 * 小提琴类
 * @author tangweijr
 * @since 20180414
 */
public class Violin extends Stringed {
    @Override
    public String toString() {
        return "Violin";
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("小提琴的音调比较高");
    }
}
