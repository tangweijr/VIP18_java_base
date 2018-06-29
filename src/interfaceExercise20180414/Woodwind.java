package interfaceExercise20180414;

/**
 * 木管乐器类
 * @author tangweijr
 * @since 20180414
 */
public class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("木管的调子比较轻");
    }
}
