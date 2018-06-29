package inherit20180402;

/**
 * 测试类
 */
public class TestInstrument {
    public static void main(String[] args) {
        System.out.println("----------测试第一层结构----------");
        Instrument instrument = new Instrument();
        instrument.play();
        instrument.tune(instrument);

        System.out.println("----------测试第二层结构----------");
        instrument = new StringedInstrument("hardwood","cold",new String[]{"a","g"});
        instrument.play();
        instrument.tune(instrument);

        System.out.println("----------测试第三层结构----------");
        instrument = new Violin();
        instrument.play();
        instrument.tune(instrument);
    }
}
