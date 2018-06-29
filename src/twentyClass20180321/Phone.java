package twentyClass20180321;

import twentyClass20180321.twentyClassException.OSException;

import java.util.Objects;

/**
 * 0.手机
 * @author tangweijr
 * @since 20180326
 */
public class Phone {
    public static String powerButterFunction = "open/close";
    private String brand;
    private double inchSize;
    private String ioSystem;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.inchSize, inchSize) == 0 &&
                Objects.equals(brand, phone.brand) &&
                Objects.equals(ioSystem, phone.ioSystem);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", inchSize=" + inchSize +
                ", ioSystem='" + ioSystem + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Phone phone = new Phone(this.brand,this.inchSize,this.ioSystem);
        return phone;
    }

    @Override
    public int hashCode() {
        return (brand.hashCode() * 31 + (int) inchSize) * 31 + ioSystem.hashCode();
    }

    /**
     * 构造器转发
     * @param brand 品牌
     */
    public Phone(String brand) {
        this(brand,5.5,"Android");
    }

    /**
     * 全参数构造器
     * @param brand 品牌
     * @param inchSize 屏幕尺寸
     * @param ioSystem 操作系统
     */
    public Phone(String brand, double inchSize, String ioSystem) {
        this.brand = brand;
        this.inchSize = inchSize;
        this.ioSystem = ioSystem;
    }

    public static void setPowerButterFunction(String s) {
        powerButterFunction = s;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            throw new NullPointerException();
        }
        this.brand = brand;
    }

    /**
     * 设置手机操作系统
     * @param ioSystem 操作系统
     */
    public void setIoSystem(String ioSystem) {
        if (ioSystem.equalsIgnoreCase("android") || ioSystem.equalsIgnoreCase("iso")) {
            this.ioSystem = ioSystem;
        } else {
            throw new OSException(" ：sorry, other system is too rare");
        }
    }

    /**
     * 打电话
     *
     * @param phoneNumber
     */
    public void call(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            System.out.println("Dial phone " + phoneNumber);
        }
    }

    /**
     * 接电话
     *
     * @param phoneNumber
     */
    public void answer(String phoneNumber) {
        System.out.println(phoneNumber + " 's coming call");
    }

    /**
     * 查看系统信息
     */
    public void showSystem() {
        System.out.println("this phone's system is " + ioSystem);
    }
}
