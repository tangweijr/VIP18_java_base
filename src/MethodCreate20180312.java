import java.util.Arrays;
import java.util.Scanner;

public class MethodCreate20180312 {
    /*
    加拿大移民评分系统
     */
    public static String candaMigrate() {
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
                if (level == 1) {
                    totalScore += 4;
                } else if (level == 2) {
                    totalScore += 2;
                } else if (level == 3) {
                    totalScore += 1;
                }
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
                if (level == 1) {
                    totalScore += 2;
                } else if (level == 2) {
                    totalScore += 2;
                } else if (level == 3) {
                    totalScore += 1;
                }
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
        String result=totalScore >= 67 ? "恭喜你通过移民申请，你的分数是":"没有通过，你的分数是";
        return result+totalScore;
    }

    /*
    用于打印下列图形：
    *
    **
    ***
    ****
    */
    static void zhiJiaoSanJiao(int row) {
        int i=0;
        while(i<row) {
            int j=0;
            while (j <=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    /*
    用于打印下列图形：
    ***
    **
    *
    **
    ***
    */
    static void sanJiaoZuHe(int row) {
        int newrow = (row + 1) / 2;
        int i = newrow;
        while (i > 1) {
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
        // 调用函数打印下半部分
        zhiJiaoSanJiao(newrow);
    }

    /*
    用于打印下列图形：
       *
      ***
     *****
    *******
     */
    static void sanJiao(int row) {
        int i=0;
        while (i < row) {
            // 打印空格
            int j=row-i;
            while (j > 1) {
                System.out.print(" ");
                j--;
            }
            // 打印*
            int k=0;
            while (k < (i * 2 + 1)) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    /*
    用于打印下列图形：
      *
     ***
    *****
     ***
      *
     */
    static void lingXing(int row) {
        int newrow = (row + 1) / 2;
        // 调用函数打印上半部分
        sanJiao(newrow);
        // 打印一个倒过来的三角形
        int i = 0;
        while (i < newrow-1) {
            // 打印空格
            int j = 0;
            while (j <= i) {
                System.out.print(" ");
                j++;
            }
            // 打印*
            int k = (newrow-1-i)*2-1;
            while (k > 0) {
                System.out.print("*");
                k--;
            }
            System.out.println("");
            i++;
        }
    }

    /*
    用于打印下列图形：
       *
      * *
     *   *
      * *
       *
     */
    static void kongXinLingXing(int row) {
        int newrow = (row + 1) / 2;
        // 打印上半部分
        int i=0;
        while (i < newrow) {
            // 打印空格
            int j=newrow-i;
            while (j > 1) {
                System.out.print(" ");
                j--;
            }
            // 打印*
            int k=0;
            while (k < (i * 2 + 1)) {
                // 选择只打印边界
                if (k == 0 || k == i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k++;
            }
            System.out.println();
            i++;
        }
        // 打印一个倒过来的三角形
        int ii = 0;
        while (ii < newrow-1) {
            // 打印空格
            int j = 0;
            while (j <= ii) {
                System.out.print(" ");
                j++;
            }
            // 打印*
            int k = (newrow-1-ii)*2-1;
            while (k > 0) {
                if (k == (newrow - 1 - ii) * 2-1 || k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                k--;
            }
            System.out.println("");
            ii++;
        }
    }

    static void anZhi(int a) {
        a=10000;
    }

    static void anYinYong(int[] a) throws NullPointerException {
        a[0] = 10000;
    }

    static void printJiHe(String... strings) {
        for (String s : strings) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        System.out.println("Question 2:");
        int a=100;
        anZhi(a);
        System.out.println(a);
        int[] b={100};
        anYinYong(b);
        System.out.println(b[0]);
        String[] command={"java","c:\\program files\\java\\jdk9\\bin","java.exe","javac.exe"};
        printJiHe(command);
        System.out.println("Question 3:");
        System.out.println("----------");
        zhiJiaoSanJiao(6);
        System.out.println("----------");
        sanJiao(7);
        System.out.println("----------");
        sanJiao(6);
        System.out.println("----------");
        lingXing(9);
        System.out.println("----------");
        kongXinLingXing(7);
        System.out.println("----------");
        System.out.println("Question 4:");
        System.out.println(candaMigrate());
    }
}
