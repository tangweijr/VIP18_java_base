package inherit20180402;

/**
 * 升级为蓝牙音箱
 * @author tangweijr
 * @since 20180402
 */
public class BlueToothSpeaker extends LinkedSpeaker{
    public boolean phoneLink = false;

    public void setPhoneLink() {
        this.phoneLink = true;
    }

    /**
     * 通过按键、或手机连接设定音量
     * @param volume 音量
     */
    public void setVolume(int volume) {
        if (!phoneLink) {
            super.setVolume(volume);
        } else {
            System.out.println("通过手机设定音量");
            if (this.volume > volume) {
                System.out.println("减小音量至" + volume);
            } else {
                System.out.println("增大音量至" + volume);
            }
            this.volume = volume;
        }
    }

    /**
     * 通过开关设定开关机
     */
    public void setOpen() {
        if (!phoneLink) {
            super.setOpen();
        } else {
            System.out.println("通过手机进行");
            if (!open) {
                System.out.println("打开电源");
                open = true;
            } else {
                System.out.println("关闭电源");
                open = false;
            }
        }
    }

    /**
     * 返回连接方式
     * @return
     */
    public String linkType() {
        return "BlueTooth";
    }
}
