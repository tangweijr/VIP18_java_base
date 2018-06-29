package hospital20180330;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 医院系统的测试类
 */
public class HospitalTest {
    public static void printFunction() {
        System.out.println("请选择功能：");
        System.out.print("1.挂号\t");
        System.out.print("2.问诊\t");
        System.out.print("3.缴费\t");
        System.out.print("4.取药\t");
        System.out.println("其他数字.退出");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //创建医院对象
        Hospital gulou = new Hospital("鼓楼", Hospital.LEVEL[0]);
        System.out.println("Welcome to GuLou hospital, this is helping system:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //获取基本信息
            System.out.println("Please enter information:");
            System.out.print("Name:");
            String name=scanner.next();
            System.out.print("Sex(male/female):");
            String sex=scanner.next();
            Sex tempSex = null;
            if (sex.equals("male")) {
                tempSex = Sex.MALE;
            } else if (sex.equals("female")) {
                tempSex = Sex.FEMALE;
            }
            System.out.print("Age:");
            int age=scanner.nextInt();
            System.out.print("Department:"+ Arrays.asList(Hospital.departmentPool).toString());
            String department=scanner.next();
            Patient patient = new Patient(name, tempSex, age, department,500);
            PatientCard patientCard = null;

            //选择功能
            printFunction();
            int select = scanner.nextInt();
            while (select != 5) {
                //挂号
                if (select == 1) {
                    if (patientCard != null) {
                        System.out.println("Already have doctor");
                    } else {
                        patientCard = gulou.registration(patient);
                        System.out.println("Registration success");
                    }
                    //问诊
                } else if (select == 2) {
                    if (patientCard != null) {
                        patientCard.doctor.diagnose(patientCard);
                    }else {
                        System.out.println("Please registration first");
                    }
                    //缴费
                } else if (select == 3) {
                    if (patientCard != null) {
                        gulou.payment(patientCard, patient);
                    }else {
                        System.out.println("Please registration first");
                    }
                    //取药
                } else if (select == 4) {
                    if (patientCard != null) {
                        gulou.drugTaken(patientCard);
                        System.out.println("病人姓名：" + patientCard.name);
                        System.out.println("病人性别：" + patientCard.sex);
                        System.out.println("病人年龄：" + patientCard.age);
                        System.out.println("病人挂号科室：" + patientCard.department);
                        System.out.println("医生姓名：" + patientCard.doctor.name);
                        patientCard.drug.showInfo();
                        System.out.println("取药后还剩：" + patient.money);
                    }else {
                        System.out.println("Please registration first");
                    }
                } else {
                    break;
                }
                printFunction();
                select = scanner.nextInt();
            }
        }
    }
}
