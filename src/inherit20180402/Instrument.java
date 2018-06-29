package inherit20180402;

/**
 * 乐器类，用于书写结构派生
 * @author tangweijr
 * @since 20180402
 */
public class Instrument {
    //材质
    public String material;
    //音调
    public String tone;
    //音阶
    public String[] scale;

    /**
     * 演奏
     */
    public void play() {

    }

    /**
     * 调音，不同乐器调音方式不同
     * @param instrument 乐器
     */
    public void tune(Instrument instrument) {

    }
}
