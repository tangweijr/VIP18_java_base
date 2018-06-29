package constructorUsage20180324;

import java.util.Scanner;

/**
 * Question5
 * 创建一个个人所得税类，构造器中给入 基本税收门槛，然后设计一个方法用来计算个人所得税
 * 再设计一个空参数的构造器，默认为3500元
 */
public class PersonalIncomeTax {
    public int lowLimit;

    /**
     * 默认构造器，3500元
     */
    public PersonalIncomeTax() {
        this.lowLimit = 3500;
    }

    /**
     * 构造器
     * @param lowLimit 扣税金额
     */
    public PersonalIncomeTax(int lowLimit) {
        this.lowLimit = lowLimit;
    }

    /**
     * 计税
     * @param salary 工资收入
     */
    public void taxCounter(double salary) {
        if (salary < 0) {
            System.err.println("salary is error!");
        }
        double deduction = salary - lowLimit;
        if (deduction < 0) {
            System.out.println("no tex!");
        } else if (deduction <= 1500) {
            System.out.println("tex: " + deduction * 0.03);
        } else if (deduction <= 4500) {
            System.out.println("tex: " + (deduction * 0.1 - 105));
        } else if (deduction <= 9000) {
            System.out.println("tex: " + (deduction * 0.2 - 555));
        } else if (deduction <= 35000) {
            System.out.println("tex: " + (deduction * 0.25 - 1055));
        } else if (deduction <= 55000) {
            System.out.println("tex: " + (deduction * 0.3 - 2755));
        } else {
            System.out.println("tex: " + (deduction * 0.45 - 13505));
        }
    }

    public static void main(String[] args) {
        PersonalIncomeTax pit = new PersonalIncomeTax();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your salary:");
        pit.taxCounter(in.nextDouble());
        PersonalIncomeTax pit2 = new PersonalIncomeTax(7000);
        System.out.println("Please enter your salary:");
        pit2.taxCounter(in.nextDouble());
    }
}
