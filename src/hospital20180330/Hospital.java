package hospital20180330;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * 医院，加载类的时候，确定科室和药品
 */
public class Hospital {
    //医院的等级
    public static final String[] LEVEL = {"三甲", "三乙", "三丙", "二甲", "二乙", "二丙", "一甲", "一乙", "一丙"};
    //医院的科室
    public static ArrayList<String> departmentPool = new ArrayList<>();

    //静态块，类初始化的时候添加所有科室到科室池
    static {
        String[] temp=new String[]{"内科","外科","妇产科","儿科","肿瘤科","五官科","皮肤性病科","中医科",
                "传染病科","骨科","精神心理科","男科","营养科","医技科","医学影像科","麻醉医学科","介入医学科","其他科室"};
        departmentPool.addAll(Arrays.asList(temp));
    }

    public String hospitalName;
    public String hospitalLevel;
    public ArrayList<Doctor> doctorsPool = new ArrayList<>();

    //实例块，随机生成一些医生
    {
        Random random = new Random();
        //填充与科室数量相同的医生
        for (int i = 0; i < departmentPool.size(); i++) {
            //随机生成中文姓名
            String name = Character.toString((char) (random.nextInt(Integer.parseInt("4E00", 16)) + 19968)) + Character.toString((char) (random.nextInt(Integer.parseInt("4E00", 16)) + 19968));
            //每个科室一个医生，进行填充
            doctorsPool.add(new Doctor(name, departmentPool.get(i)));
        }
    }

    /**
     * 构造器
     * @param hospitalName 医院名称
     * @param hospitalLevel 医院等级
     */
    public Hospital(String hospitalName, String hospitalLevel) {
        this.hospitalName = hospitalName;
        this.hospitalLevel = hospitalLevel;
    }

    /**
     * 输入患者，返回病历卡，包含患者的基本信息、医生的基本信息
     * @param patient 患者
     * @return
     */
    public PatientCard registration(Patient patient) {
        Random random = new Random();
        //选择对应的科室
        Doctor tempDoctor = null;
        for (int i = 0; i < doctorsPool.size(); i++) {
            if (patient.department.equals(doctorsPool.get(i).department)) {
                tempDoctor = doctorsPool.get(i);
                break;
            }
        }
        PatientCard temp = new PatientCard(patient, tempDoctor);
        return temp;
    }

    /**
     * 交费，要患者和病历卡同时带着
     * @param patientCard 病历卡
     * @param patient 患者
     */
    public void payment(PatientCard patientCard, Patient patient) {
        //对比名字和科室，确认病历卡与病人一一对应
        if (patient.name.equals(patientCard.name) && patient.department.equals(patientCard.department)) {
            //如果初始值为false，扣款后改为true
            if (!patientCard.drug.hasPay) {
                if (patient.money >= patientCard.drug.price) {
                    patient.money = patient.money - patientCard.drug.price;
                    patientCard.drug.hasPay = true;
                    System.out.println("Payment success");
                } else {
                    System.out.println("Don't have enough money to buy drugs");
                }
                //否则告诉系统，已经付钱
            } else {
                System.out.println("Already pay");
            }
            //必须本人付款，否则不知道如何扣费
        } else {
            System.out.println("Sorry, must payment yourself");
        }
    }

    /**
     * 拿药
     * @param patientCard 病历卡
     */
    public void drugTaken(PatientCard patientCard) {
        //如果初始值为false，拿药后改为true
        if (!patientCard.drug.hasTake) {
            patientCard.drug.hasTake = true;
            System.out.println("Drug take success");
        } else {
            System.out.println("Already take your drugs");
        }
    }
}
