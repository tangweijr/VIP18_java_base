package inherit20180402;

/**
 * 升级为有线连接音箱
 * @author tangweijr
 * @since 20180402
 */
public class LinkedSpeaker extends Speaker {
    public int index = 1;
    /**
     * 通过按键设定音量
     * @param volume 音量
     */
    public void setVolume(int volume) {
        System.out.println("通过上下按键设定音量");
        while (this.volume != volume) {
            if (this.volume > volume) {
                System.out.println("减小音量" + Math.abs(index--) + "次");
                this.volume--;
            } else {
                System.out.println("增大音量" + index++ + "次");
                this.volume++;
            }
        }
        index = 1;
    }

    /**
     * 通过开关设定开关机
     */
    public void setOpen() {
        System.out.println("通过开关开关");
        if (!open) {
            System.out.println("打开电源");
            open = true;
        } else {
            System.out.println("关闭电源");
            open = false;
        }
    }

    /**
     * 返回连接方式
     * @return
     */
    public String linkType() {
        return "microUSB";
    }
}
