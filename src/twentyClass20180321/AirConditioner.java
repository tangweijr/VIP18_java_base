package twentyClass20180321;

import twentyClass20180321.twentyClassException.TemperatureOutOfRangeException;

import java.util.Locale;
import java.util.Objects;

/**
 * 1.空调
 * @author tangweijr
 * @since 20180321
 */
public class AirConditioner {
    public static double roomTemperature;
    public int workVote;
    public String color;
    private double temperatureSet;

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof AirConditioner) {
            AirConditioner that = (AirConditioner) o;
            return this.temperatureSet == that.temperatureSet && this.workVote == that.workVote && this.color.equals(that.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "AirConditioner's " +
                "workVote is " + workVote +
                ", color is" + color + '\'' +
                ", temperatureSet is" + temperatureSet;
    }

    @Override
    public int hashCode() {
        return (int)(31 * workVote + color.hashCode() + 31 * temperatureSet);
    }

    /**
     * 空参数构造器，转发
     */
    public AirConditioner() {
        this(220, "Red", 26);
    }

    /**
     * 一个参数的构造器，转发
     * @param workVote 空调电压
     */
    public AirConditioner(int workVote) {
        this(workVote, "Red", 26);
    }

    /**
     * 全参数构造器
     * @param workVote 空调电压
     * @param color 空调颜色
     * @param temperatureSet 设定空调温度
     */
    public AirConditioner(int workVote, String color, double temperatureSet) {
        this.workVote = workVote;
        this.color = color;
        this.temperatureSet = temperatureSet;
    }

    public static void cool() {
        System.out.println("Now room temperature is " + roomTemperature + ", start cooling the room!");
    }
    /**
     * 根据区域设定空调的电压
     * @param locale
     */
    public void setWorkVote(Locale locale) {
        if (locale == null) {
            throw new NullPointerException();
        }
        if (locale == Locale.CHINA) {
            this.workVote = 220;
        }
    }

    /**
     * 获得当前设定温度
     * @return
     */
    public double getTemperatureSet() {
        return temperatureSet;
    }

    /**
     * 设定温度，并包含有范围
     * @param temperatureSet 设定温度
     */
    public void setTemperatureSet(double temperatureSet) {
        if (temperatureSet <= 16) {
            this.temperatureSet = 16;
            throw new TemperatureOutOfRangeException();
        } else if (temperatureSet >= 30) {
            this.temperatureSet = 30;
            throw new TemperatureOutOfRangeException();
        } else {
            this.temperatureSet = temperatureSet;
        }
    }

    public void showInformation() {
        System.out.println("This air conditioner's work vote is " + workVote + ", and temperature is set to " + this.getTemperatureSet());
    }

    public static void main(String[] args) {
        //静态方法调用
        AirConditioner.roomTemperature = 35;
        AirConditioner.cool();

        //实例调用静态属性、方法
        AirConditioner chunlan = new AirConditioner();
        chunlan.roomTemperature = 40;
        chunlan.cool();
        chunlan.setTemperatureSet(25);
        chunlan.showInformation();

        //实例调用静态属性、方法
        AirConditioner geli = new AirConditioner();
        geli.roomTemperature = 28;
        geli.cool();
        geli.setTemperatureSet(16);
        geli.showInformation();

    }
}
