package twentyClass20180321;

import twentyClass20180321.twentyClassException.SizeRangeException;

/**
 * 13.灯
 * @author tangweijr
 * @since 20180326
 */
public class Light {
    private static boolean isOn;
    private int brightLevel;
    private String lightColor;
    private int powermAh;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Light) {
            Light that = (Light) o;
            return this.brightLevel == that.brightLevel && this.powermAh == that.powermAh && this.lightColor.equals(that.lightColor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Light's " +
                "brightLevel is" + brightLevel +
                ", lightColor is" + lightColor + '\'' +
                ", powermAh is" + powermAh +
                "mAh";
    }

    @Override
    public int hashCode() {
        return (brightLevel * 17 + lightColor.hashCode()) * 17 + powermAh;
    }

    public int getBrightLevel() {
        return brightLevel;
    }

    /**
     * 仅有5级亮度
     * @param brightLevel 亮度级别
     */
    public void setBrightLevel(int brightLevel) throws SizeRangeException {
        if (brightLevel <= 5) {
            this.brightLevel = brightLevel;
        } else {
            System.out.println("仅有5级亮度");
            throw new SizeRangeException();
        }
    }

    /**
     * 开、关
     * @param state 目前状态
     */
    public static void setOn(boolean state) {
        isOn = !state;
    }

    /**
     * 状态
     * @return 返回状态
     */
    public static boolean isOn() {
        return isOn;
    }

    /**
     * 亮度等级
     * @return
     */
    public int level() {
        if (powermAh < 300 && brightLevel == 1) {
            System.out.println("Not enough power");
            return -1;
        } else {
            System.out.println("Enough power for lighting a lot of time");
            return brightLevel;
        }
    }

    /**
     * 无参数构造器，转发
     */
    public Light() {
        this(true,3,"White",35);
    }

    /**
     * 全参数构造器
     * @param state 开/关
     * @param brightLevel 亮度等级
     * @param lightColor 颜色
     * @param powermAh 电池容量
     */
    public Light(boolean state, int brightLevel, String lightColor, int powermAh) {
        this.isOn = state;
        this.brightLevel = brightLevel;
        this.lightColor = lightColor;
        this.powermAh = powermAh;
    }
}
