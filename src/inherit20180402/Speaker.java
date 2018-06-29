package inherit20180402;

/**
 * 音箱，用于书写派生
 * @author tangweijr
 * @since 20180402
 */
public class Speaker {
    public int volume;
    public double[] size;
    public boolean open = false;

    /**
     * 设定音量的方式
     * @param volume
     */
    public void setVolume(int volume) {
        System.out.println("通过旋钮设定音量");
        if (volume < 0) {
            this.volume = volume;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
    }

    /**
     * 设定开关方式
     */
    public void setOpen() {
        System.out.println("通过旋钮开关");
        if (this.volume == 0) {
            open = false;
        } else {
            open = true;
        }
    }

    /**
     * 返回连接方式
     * @return
     */
    public String linkType() {
        return "lines";
    }

    /**
     * 打印基本信息
     */
    public void printInfo() {
        System.out.println("Volume is " + volume);
        System.out.println("Open state is " + open);
    }
}
