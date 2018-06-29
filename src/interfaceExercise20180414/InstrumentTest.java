package interfaceExercise20180414;

/**
 * 测试类
 */
public class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[4];
        instruments[0] = new Woodwind();
        instruments[1] = new Brass();
        instruments[2] = new Drum();
        instruments[3] = new Violin();
        for (int i = 0; i < instruments.length; i++) {
            System.out.println("第" + (i + 1) + "个是：");
            instruments[i].play();
            instruments[i].adjust();
        }
    }
}
