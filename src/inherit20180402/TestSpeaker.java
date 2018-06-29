package inherit20180402;

/**
 * 测试类
 */
public class TestSpeaker {
    public static void main(String[] args) {
        System.out.println("----------测试第一层结构----------");
        Speaker speaker = new Speaker();
        speaker.setVolume(80);
        speaker.setOpen();
        System.out.println("使用" + speaker.linkType() + "连接");
        speaker.printInfo();
        speaker.open = false;

        System.out.println("----------测试第二层结构----------");
        speaker = new LinkedSpeaker();
        speaker.setOpen();
        speaker.setVolume(20);
        speaker.setVolume(15);
        System.out.println("使用" + speaker.linkType() + "连接");
        speaker.printInfo();
        speaker.open = false;

        System.out.println("----------测试第三层结构----------");
        BlueToothSpeaker blueToothSpeaker = new BlueToothSpeaker();
        blueToothSpeaker.setPhoneLink();
        blueToothSpeaker.setOpen();
        blueToothSpeaker.setVolume(20);
        blueToothSpeaker.setVolume(15);
        System.out.println("使用" + blueToothSpeaker.linkType() + "连接");
        blueToothSpeaker.printInfo();
        blueToothSpeaker.open = false;

    }
}
