/**
 * 用于练习循环语句
 * @author tangweijr
 * @since 20180228
 */
public class XunHuan20180228 {
    /*
    用于打印下列图形：
     *
     **
     ***
     ****
     */
    static void ZhiJiaoSanJiao(int row) {
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
    static void SanJiaoZuHe(int row) {
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
    static void LingXing(int row) {
        int newrow = (row + 1) / 2;
        // 调用函数打印上半部分
        SanJiao(newrow);
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
    static void KongXinLingXing(int row) {
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

    public static void main(String[] args) {
        System.out.println("Question2:");
        ZhiJiaoSanJiao(6);
        System.out.println("Question3:");
        SanJiaoZuHe(7);
        System.out.println("Question4:");
        SanJiao(6);
        System.out.println("Question5:");
        LingXing(9);
        System.out.println("Question6:");
        KongXinLingXing(5);
    }
}
