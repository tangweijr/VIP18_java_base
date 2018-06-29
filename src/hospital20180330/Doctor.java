package hospital20180330;

import java.util.Random;

/**
 * 医生
 */
public class Doctor {
    public String name;
    public String department;

    /**
     * 构造器
     * @param name 姓名
     * @param department 科室
     */
    public Doctor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    /**
     * 诊断过程，如果有医生，就返回false，如果没有医生，就分配一个医生
     * @param patientCard 病历卡
     * @return
     */
    public void diagnose(PatientCard patientCard) {
        if (patientCard.drug != null) {
            System.out.println("Already have drugs");
        } else {
            Random random = new Random();
            //随机选择一个药品
            //只要发生诊断过程，就会触发药品类的加载，初始化药品对象
            patientCard.drug=Drug.drugArrayList.get(random.nextInt(Drug.drugArrayList.size()));
            System.out.println("Drug success");
        }
    }
}
