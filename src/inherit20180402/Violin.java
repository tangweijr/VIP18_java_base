package inherit20180402;

/**
 * 小提琴类
 * @author tangweijr
 * @since 20180402
 */
public class Violin extends StringedInstrument{
    public Violin() {
        super("wood", "warm", new String[]{"a", "c", "g"});
    }

    public void useBow() {
        super.useBow();
        System.out.println("弓长不超过1米");
    }

    public void play() {
        super.play();
        System.out.println("需要下巴托着演出");
    }

    public void tune(Instrument instrument) {
        super.tune(instrument);
    }
}
