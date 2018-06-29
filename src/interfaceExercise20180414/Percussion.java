package interfaceExercise20180414;

/**
 * 打击乐器类
 * @author tangweijr
 * @since 20180414
 */
public class Percussion implements Instrument {
    @Override
    public void play() {
        System.out.println(this + " play()");
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust()");
    }
}
