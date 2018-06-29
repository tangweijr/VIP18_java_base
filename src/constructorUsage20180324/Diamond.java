package constructorUsage20180324;

/**
 * Question3
 * 创建一个菱形输出类，要求使用构造器传递打印符号和打印行数，然后设计一个方法专门用来打印
 */
public class Diamond {
    public char singal;
    public int row;

    /**
     * 构造器
     * @param singal 符号
     * @param row 行数
     */
    public Diamond(char singal, int row) {
        this.singal = singal;
        this.row = row;
    }

    /**
     * 打印菱形
     */
    public void print() {
        if (row % 2 == 0) {
            System.out.println("打印" + (row - 1) + "行的菱形");
        } else {
            System.out.println("打印" + row + "行的菱形");
        }
        int newrow = (row + 1) / 2;
        // 调用函数打印上半部分
        for (int i = 0; i < newrow; i++) {
            // 打印空格，起始数字比行数少1
            for (int j = newrow - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print(singal);
            }
            System.out.println();
        };
        // 打印一个倒过来的三角形，行数为newrow-1
        for (int i = 0; i < newrow - 1; i++) {
            // 打印空格，第n行打印n个
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            // 打印*
            for (int k = (newrow - 1 - i) * 2 - 1; k > 0; k--) {
                System.out.print(singal);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond d = new Diamond('A', 7);
        d.print();
        Diamond d2 = new Diamond('$', 10);
        d2.print();
    }
}
