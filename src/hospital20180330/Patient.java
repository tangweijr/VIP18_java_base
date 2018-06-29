package hospital20180330;

/**
 * 患者类
 */
public class Patient {
    public String name;
    public Sex sex;
    public int age;
    public String department;
    public double money;

    /**
     * 构造器，转发
     * @param name       姓名
     * @param sex        性别
     * @param age        年龄
     * @param department 科室
     */
    public Patient(String name, Sex sex, int age, String department) {
        this(name, sex, age, department, 100);
    }

    /**
     * 构造器
     * @param name       姓名
     * @param sex        性别
     * @param age        年龄
     * @param department 科室
     * @param money 预算
     *
     */
    public Patient(String name, Sex sex, int age, String department, double money) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.department = department;
        this.money = money;
    }
}
