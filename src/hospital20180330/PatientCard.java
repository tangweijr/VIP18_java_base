package hospital20180330;

/**
 * 枚举，性别类
 */
enum Sex {
    MALE, FEMALE,
}

/**
 * 病例卡类
 */
public class PatientCard {
    public String name;
    public Sex sex;
    public String department;
    public int age;
    public Doctor doctor;
    public Drug drug;

    /**
     * 构造器，按照对象传入
     * @param patient 患者对象
     * @param doctor 医生对象
     */
    public PatientCard(Patient patient, Doctor doctor) {
        this.name = patient.name;
        this.sex = patient.sex;
        this.age = patient.age;
        this.department = patient.department;
        this.doctor = doctor;
    }

    /**
     * 构造器，按照基本类型传入
     * @param name 患者姓名
     * @param sex 患者性别
     * @param department 患者要看的科室
     * @param age 患者年龄
     * @param doctor 分配的医生
     */
    public PatientCard(String name, Sex sex, String department, int age, Doctor doctor) {
        this.name = name;
        this.sex = sex;
        this.department = department;
        this.age = age;
        this.doctor = doctor;
    }
}
