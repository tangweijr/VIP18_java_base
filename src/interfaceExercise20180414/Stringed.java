package interfaceExercise20180414;

/**
 * 弦乐器类
 * @author tangweijr
 * @since 20180414
 */
public class Stringed implements Instrument {

    @Override
    public void play() {
        System.out.println(this + " play()");
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust()");
    }
}
