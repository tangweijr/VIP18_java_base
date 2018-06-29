package constructorUsage20180324;

/**
 * Question4
 * 创建一个乘法口诀表类，使用构造器传递打印层数，9-12层，最大为12层，最小为9层，其他的数值传递进去将按照9层打印，在设计一个方法进行打印
 */
public class MultiplicationFormulas {
    public int row;

    /**
     * 构造器
     * @param row 层数
     */
    public MultiplicationFormulas(int row) {
        if (row > 9 && row <= 12) {
            this.row = row;
        } else {
            this.row = 9;
        }
    }

    /**
     * 打印乘法口诀表
     */
    public void print() {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MultiplicationFormulas mf = new MultiplicationFormulas(9);
        mf.print();
        MultiplicationFormulas mf2 = new MultiplicationFormulas(12);
        mf2.print();
    }
}
