package inherit20180402;

/**
 * 弦乐器类
 * @author tangweijr
 * @since 20180402
 */
public class StringedInstrument extends Instrument {
    //琴弓
    public String bow;

    public StringedInstrument(String material, String tone, String[] scale) {
        this.material = material;
        this.tone = tone;
        this.scale = scale;
    }

    public void useBow() {
        System.out.println("使用琴弓");
    }

    public void play() {
        useBow();
        System.out.println("演奏弦乐器");
    }

    public void tune(Instrument instrument) {
        super.tune(instrument);
        useBow();
        System.out.println("给弦乐器调音");
    }
}
