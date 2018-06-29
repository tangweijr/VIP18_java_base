/**
 * 用于练习for && do while循环语句
 *
 * @author tangweijr
 * @since 20180228
 */
public class ForXunHuan20180303 {
    /*
    用于打印下列图形：
     *
     **
     ***
     ****
     */
    static void ZhiJiaoSanJiao(int row) {
        // 外循环控制行，内循环控制列
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
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
    static void SanJiaoZuHe(int row) {
        // 先将图形分割成一半
        int newrow = (row + 1) / 2;
        // 打印上半部分，实际减少1行
        for (int i = newrow; i > 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 调用函数打印下半部分
        ZhiJiaoSanJiao(newrow);
    }

    /*
    用于打印下列图形：
       *
      ***
     *****
    *******
     */
    static void SanJiao(int row) {
        for (int i = 0; i < row; i++) {
            // 打印空格，起始数字比行数少1
            for (int j = row - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
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
    static void LingXing(int row) {
        int newrow = (row + 1) / 2;
        // 调用函数打印上半部分
        SanJiao(newrow);
        // 打印一个倒过来的三角形，行数为newrow-1
        for (int i = 0; i < newrow - 1; i++) {
            // 打印空格，第n行打印n个
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = (newrow - 1 - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
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
    static void KongXinLingXing(int row) {
        int newrow = (row + 1) / 2;
        // 打印上半部分，行数为newrow
        for (int i = 0; i < newrow; i++) {
            // 打印空格，起始打印newrow-1个
            for (int j = newrow - 1 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = 0; k < (i * 2 + 1); k++) {
                // 选择只打印边界
                if (k == 0 || k == i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 打印一个倒过来的三角形，比上面的三角形少一行
        for (int i = 0; i < newrow - 1; i++) {
            // 打印空格，第n行有n个空格
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = (newrow - 1 - i) * 2 - 1; k > 0; k--) {
                if (k == (newrow - 1 - i) * 2 - 1 || k == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
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
    static void DoWhileLingXing(int row) {
        // 首先确定行数
        int newrow = (row + 1) / 2;
        int i = 0;
        do {
            int j = newrow - i;
            // 打印空格，由于必须执行一次，因此，必第一列始终多一个空格
            do {
                System.out.print(" ");
                j--;
            } while (j >= 1);
            int k = 0;
            do {
                System.out.print("*");
                k++;
            } while (k < (i * 2 + 1));
            System.out.println();
            i++;
        } while (i <= newrow - 1);// 先执行后判断，所以比while循环，for循环少1
        // 打印下半部分
        i = 0;
        do {
            // 打印空格，由于必须执行一次，因此，必第一列始终多一个空格
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j <= i + 1);
            // 打印*
            int k = (newrow - 1 - i) * 2 - 1;
            do {
                System.out.print("*");
                k--;
            } while (k > 0);
            System.out.println();
            i++;
        } while (i < newrow - 1);// 先执行后判断，所以比while循环，for循环少1
    }

    public static void main(String[] args) {
        System.out.println("Question 2-1, finish by for loop:");
        ZhiJiaoSanJiao(5);
        System.out.println("Question 2-2, finish by for loop:");
        SanJiaoZuHe(5);
        System.out.println("Question 2-3, finish by for loop:");
        SanJiao(5);
        System.out.println("Question 2-4, finish by for loop:");
        LingXing(7);
        System.out.println("Question 2-5, finish by for loop:");
        KongXinLingXing(7);
        System.out.println("Question 3, finish by do while loop:");
        DoWhileLingXing(9);
        System.out.println("Questuon 4:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nQuestuon 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 10 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}
