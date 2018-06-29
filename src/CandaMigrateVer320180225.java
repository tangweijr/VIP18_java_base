import java.util.Scanner;

/**
 * 加拿大移民评分系统第三版本
 * @author tangweijr
 * @since 20180225
 */
public class CandaMigrateVer320180225 {
    public static int englishLevel(int level) {
        if (level == 1) {
            return  4;
        } else if (level == 2) {
            return  2;
        } else if (level == 3) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int franceLevel(int level) {
        if (level == 1) {
            return  2;
        } else if (level == 2) {
            return  2;
        } else if (level == 3) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int totalScore=0;

        Scanner input = new Scanner(System.in);
        System.out.println("\n-----------------------\n欢迎来到加拿大移民评分系统\n-----------------------\n");

        System.out.println("第一阶段——教育：");
        System.out.println("\t1.博士/硕士（至少17年全日制教育）");
        System.out.println("\t2.双学士，或三年制大专/职业技术/学徒证书（至少15年全日制教育）");
        System.out.println("\t3.两年大学学士或两年制大专/职业技术/学徒证书 （至少14年全日制教育）");
        System.out.println("\t4.一年大学学士 （至少13年全日制教育）");
        System.out.println("\t5.一年制专科/职业技术/学徒证书 （至少12年全日制教育）");
        System.out.println("\t6.高中学历");
        System.out.print("\t请输入您的学历：");
        int xueli = input.nextInt();
        if (xueli == 1) {
            totalScore += 25;
        } else if (xueli == 2) {
            totalScore += 22;
        } else if (xueli == 3) {
            totalScore +=20;
        } else if (xueli == 4) {
            totalScore += 15;
        } else if (xueli == 5) {
            totalScore += 12;
        } else if (xueli == 6) {
            totalScore += 5;
        }

        System.out.println("第二阶段——语言：");
        System.out.print("\t请问你会英语吗？(Y/N)：");
        String langAble=input.next();
        if (langAble.equals("Y") || langAble.equals("y") || langAble.equals("Yes") || langAble.equals("yes")) {
            System.out.println("\t1.精通");
            System.out.println("\t2.中等熟练");
            System.out.println("\t3.基本熟练");
            System.out.println("\t4.不会");
            System.out.print("\t请问听说读写分别属于上面哪一类？输入例如\"3214\"：");
            int levels=input.nextInt();
            int level;
            for (int i = 0; i < 4; i++) {
                level=levels%10;
                totalScore += englishLevel(level);
                levels=levels/10;
            }
        }
        System.out.print("\t请问你会法语吗？(Y/N)：");
        langAble=input.next();
        if (langAble.equals("Y") || langAble.equals("y") || langAble.equals("Yes") || langAble.equals("yes")) {
            System.out.println("\t1.精通");
            System.out.println("\t2.中等熟练");
            System.out.println("\t3.基本熟练");
            System.out.println("\t4.不会");
            System.out.print("\t请问听说读写分别属于下面哪一类？输入例如\"3214\"：");
            int levels=input.nextInt();
            int level;
            for (int i = 0; i < 4; i++) {
                level=levels%10;
                totalScore += franceLevel(level);
                levels=levels/10;
            }
        }

        System.out.println("第三阶段——工作经历：");
        System.out.print("\t请输入你的工作时间（年）：");
        int workYear = input.nextInt();
        totalScore += workYear < 4 ? 21 - (4 - workYear) * 2 : 21;

        System.out.println("第四阶段——在加拿大就业安排：");
        System.out.print("\t获得经加拿大HRDC核准的加拿大的工作职位(Y/N)：");
        String workPosition=input.next();
        if (workPosition.equals("Y") || workPosition.equals("y") || workPosition.equals("Yes") || workPosition.equals("yes")) {
            totalScore+=10;
        }

        System.out.println("第五阶段——年龄：");
        System.out.print("\t请输入年龄：");
        int age=input.nextInt();
        if (age >= 21 && age <= 49) {
            totalScore+=10;
        } else if (age>=16 && age<21) {
            totalScore+=10-(21-age)*2;
        } else if (age <= 54 && age>49) {
            totalScore+=10-(age-49)*2;
        }

        System.out.println("第六阶段——适应能力：");
        String select;
        int tempScore=0;
        System.out.print("\t有配偶吗？(Y/N)");
        select=input.next();
        if (select.equals("Y") || select.equals("y") || select.equals("Yes") || select.equals("yes")) {
            System.out.println("\t1.配偶或同居伴侣的教育程度");
            System.out.println("\t\t1.博士/硕士");
            System.out.println("\t\t2.本科");
            System.out.println("\t\t3.高中及以下");
            System.out.print("\t\t请选择：");
            select=input.next();
            if (select.equals("1")) {
                tempScore += 5;
            } else if (select.equals("2")) {
                tempScore += 4;
            } else if (select.equals("3")) {
                tempScore += 3;
            }
        }
        System.out.print("\t2.在加拿大至少1年经批准的全职工作经历？（持有工作签证）(Y/N)");
        select = input.next();
        if (select.equals("Y") || select.equals("y") || select.equals("Yes") || select.equals("yes")) {
            tempScore += 5;
        }
        if (tempScore <= 10) {
            System.out.print("\t3.在加拿大完成至少2年全日制高中以上受教育经历？(Y/N)");
            select = input.next();
            if (select.equals("Y") || select.equals("y") || select.equals("Yes") || select.equals("yes")) {
                tempScore += 5;
            }
        } else {
            System.out.println("加分已满");
        }
        if (tempScore <= 10) {
            System.out.print("\t4.加拿大亲属关系（适用于主或附属申请人）？(Y/N)");
            select = input.next();
            if (select.equals("Y") || select.equals("y") || select.equals("Yes") || select.equals("yes")) {
                tempScore += 5;
            }
        } else {
            System.out.println("加分已满");
        }
        if (tempScore <= 10) {
            System.out.print("\t5.有就业安排？(Y/N)");
            select = input.next();
            if (select.equals("Y") || select.equals("y") || select.equals("Yes") || select.equals("yes")) {
                tempScore += 5;
            }
        } else {
            System.out.println("加分已满");
        }
        totalScore+= tempScore>10? 10:tempScore;
        System.out.println("\n-----------------------");
        System.out.println(totalScore >= 67 ? "恭喜你通过移民申请，你的分数是" : "没有通过，你的分数是" + totalScore);
        System.out.println("-----------------------");
    }
}