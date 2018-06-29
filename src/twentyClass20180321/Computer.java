package twentyClass20180321;

import twentyClass20180321.twentyClassException.OSException;
import twentyClass20180321.twentyClassException.ScreenInchTooSmallException;

import java.util.Locale;

/**
 * 2.电脑
 * @author tangweijr
 * @since 20180326
 */
public class Computer {
    public static int powerVote = 220;
    private String operatingSystem;
    private int batteryCapacity;
    private double screenInch;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Computer) {
            Computer that = (Computer) o;
            return this.batteryCapacity == that.batteryCapacity && this.screenInch == that.screenInch && this.operatingSystem.equals(that.operatingSystem);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Computer's " +
                "operatingSystem is" + operatingSystem + '\'' +
                ", batteryCapacity is" + batteryCapacity +
                ", screenInch is" + screenInch +
                "inch";
    }

    @Override
    public int hashCode() {
        return operatingSystem.hashCode() * 13 + batteryCapacity * 31 + (int) screenInch * 31;
    }

    /**
     * 无参数构造器，转发
     */
    public Computer() {
        this("windows", 5000, 14.5);
    }

    /**
     * 全参数构造器
     * @param operatingSystem 操作系统
     * @param batteryCapacity 电池容量
     * @param screenInch 屏幕尺寸
     */
    public Computer(String operatingSystem, int batteryCapacity, double screenInch) {
        this.operatingSystem = operatingSystem;
        this.batteryCapacity = batteryCapacity;
        this.screenInch = screenInch;
    }

    /**
     * 设置操作系统
     * @param operatingSystem 操作系统
     */
    public void setOperatingSystem(String operatingSystem) {
        if (operatingSystem.equalsIgnoreCase("windows") || operatingSystem.equalsIgnoreCase("macos")
                || operatingSystem.equalsIgnoreCase("linux")) {
            this.operatingSystem = operatingSystem;
        } else {
            throw new OSException(" 没有这个操作系统");
        }
    }

    public void setScreenInch(double screenInch) {
        if (screenInch > 8) {
            this.screenInch = screenInch;
        } else {
            throw new ScreenInchTooSmallException();
        }
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getScreenInch() {
        return screenInch;
    }

    /**
     * 开机
     * @return 是否正常开机
     */
    public boolean open() {
        try {
            System.out.println("This "+screenInch+" inch screen PC is opening, powered by " + operatingSystem);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 关机
     */
    public static void close() {
        System.out.println("Closing");
    }

    /**
     * 延迟关机
     * @param delayTimeMillSec
     */
    public static void close(long delayTimeMillSec) {
        try {
            System.out.println("System will close ");
            Thread.sleep(delayTimeMillSec);
            System.out.println("Closing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setPowerVote(Locale locale) {
        if (locale == Locale.JAPAN) {
            powerVote = 110;
        } else if (locale == Locale.KOREA) {
            powerVote = 180;
        }
    }

    public static void main(String[] args) {
        Computer.powerVote = 200;
        Computer.close(10000);

        Computer lianxiang = new Computer();
        lianxiang.setOperatingSystem("Windows10");
        lianxiang.setScreenInch(15.7);
        lianxiang.open();
        lianxiang.setPowerVote(Locale.KOREA);
        System.out.println(lianxiang.powerVote);

        Computer mac = new Computer("mac",5000,13.5);
        mac.open();
        mac.setPowerVote(Locale.JAPAN);
        System.out.println(mac.powerVote);
    }
}
