package twentyClass20180321;

import twentyClass20180321.twentyClassException.NameFormatException;

import java.util.Calendar;
import java.util.Objects;

/**
 * 11.学校
 * @author tangweijr
 * @since 20180326
 */
public class School {
    public static double playgroundSize = 600;
    private String schoolName;
    private String schoolAddress;
    private String schoolPhoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(schoolAddress, school.schoolAddress) &&
                Objects.equals(schoolPhoneNumber, school.schoolPhoneNumber);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolPhoneNumber='" + schoolPhoneNumber + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        School school = new School();
        school.schoolAddress = schoolAddress;
        school.schoolName = schoolName;
        school.schoolPhoneNumber = schoolPhoneNumber;
        return school;
    }

    @Override
    public int hashCode() {
        return (schoolAddress.hashCode() * 31 + schoolName.hashCode()) * 31 + schoolPhoneNumber.hashCode();
    }

    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置学习名称
     * @param schoolName 学校名字
     */
    public void setSchoolName(String schoolName) throws NameFormatException {
        if (schoolName.matches("[\\u4e00-\\u9fa5]+[大学|学院]")) {
            this.schoolName = schoolName;
        } else {
            throw new NameFormatException();
        }
    }

    public static void show() {
        System.out.println("Playground size is " + playgroundSize);
    }

    /**
     * 无参数构造器
     */
    public School() {
        this("南京市第一中学","鼓楼区","025-XXXXXXXX");
    }

    /**
     * 全参数构造器
     * @param schoolName 学校名称
     * @param schoolAddress 地址
     * @param schoolPhoneNumber 学校电话
     */
    public School(String schoolName, String schoolAddress, String schoolPhoneNumber) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolPhoneNumber = schoolPhoneNumber;
    }

    /**
     * 今天是否上课
     *
     * @param weather 天气
     * @return
     */
    public boolean isOpen(Weather weather) {
        if (weather.weatherWarning()) {
            System.out.println("Because of weather warning, school may not be open today");
            return false;
        } else {
            System.out.println("The weather is fine, school will open today");
            return true;
        }
    }

    /**
     * 选课人数是否达到要求
     *
     * @param selectedNumber 选课人数
     * @return
     */
    public boolean courseOpen(int selectedNumber) {
        if (selectedNumber < 40) {
            System.out.println("sorry, this course don't have enough student select, will not open");
            return false;
        } else {
            System.out.println("now " + selectedNumber + "student select this course,it  will not open");
            return false;
        }
    }

    /**
     * 当期日期是否在假期
     *
     * @return
     */
    public boolean isHoliday() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getTime().getMonth() == Calendar.JULY && calendar.getTime().getMonth() == Calendar.AUGUST) {
            System.out.println("in summer holiday");
            return false;
        } else if (calendar.getTime().getMonth() == Calendar.JANUARY && calendar.getTime().getMonth() == Calendar.FEBRUARY) {
            System.out.println("in winter holiday");
            return false;
        } else {
            return true;
        }
    }
}