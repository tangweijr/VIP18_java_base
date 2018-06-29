package interfaceExercise20180414;

/**
 * 管乐器类
 * @author tangweijr
 * @since 20180414
 */
public class Wind implements Instrument {
    @Override
    public void play() {
        System.out.println(this + " play()");
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust()");
    }
}
