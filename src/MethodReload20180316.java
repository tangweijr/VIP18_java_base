/**
 * 方法重载、方法递归和汉罗塔的练习
 * @author tangweijr
 * @since 20180316
 */
public class MethodReload20180316 {

    /**
     * 辗转相除逻辑语句
     * @param numA 第一个数
     * @param numB 第二个数
     * @return
     */
    static long gCD(long numA, long numB) {
        if (numA % numB == 0) {
            return numB;
        } else {
            // 如果不能整除，递归计算直至出现整除
            return greatestCommonDivisor(numB, numA % numB);
        }
    }

    /**
     * <a href="https://www.sogou.com/web?ie=UTF-8&query=%E8%BE%97%E8%BD%AC%E7%9B%B8%E9%99%A4%E6%B3%95">辗转相除</a>
     * 辗转相除法求最大公约数
     * @param numA 第一个数
     * @param numB 第二个数
     * @return
     */
    static long greatestCommonDivisor(long numA, long numB) {
        // 数字相等，直接返回
        if (numA == numB) {
            return numA;
        } else if (numA < numB) {// 小数在前，交换顺序
            long temp = numB;
            numB = numA;
            numA = temp;
            // 如果整除，B为最大公约数
            return gCD(numA, numB);
        } else {// 大数在前的情况
            return gCD(numA, numB);
        }
    }


    /**
     * 用于计算步数
     */
    private static int totalHanoiSteps = 0;
    /**
     * <a href="http://baike.sogou.com/v112111.htm?fromTitle=%E6%B1%89%E8%AF%BA%E5%A1%94">汉诺塔</a>
     * 其实算法非常简单，当盘子的个数为n时，移动的次数应等于2^n–1（有兴趣的可以自己证明试试看）。
     * 后来一位美国学者发现一种出人意料的简单方法，只要轮流进行两步操作就可以了。
     * 首先把三根柱子按顺序排成品字型，把所有的圆盘按从大到小的顺序放在柱子A上，根据圆盘的数量确定柱子的排放顺序：
     * 若n为偶数，按顺时针方向依次摆放ABC；若n为奇数，按顺时针方向依次摆放ACB。
     * ⑴按顺时针方向把圆盘1从现在的柱子移动到下一根柱子，即当n为偶数时，若圆盘1在柱子A，则把它移动到B；若圆盘1在柱子B，则把它移动到C；若圆盘1在柱子C，则把它移动到A。
     * ⑵接着，把另外两根柱子上可以移动的圆盘移动到新的柱子上。即把非空柱子上的圆盘移动到空柱子上，当两根柱子都非空时，移动较小的圆盘。这一步没有明确规定移动哪个圆盘，你可能以为会有多种可能性，其实不然，可实施的行动是唯一的。
     * ⑶反复进行⑴⑵操作，最后就能按规定完成汉诺塔的移动。
     * 开始模拟：
     * 层数==1：排列ACB，
     * A-C
     * 层数==2：排列ABC
     * 最大的盘移动步骤为A-C，上半部分的移动，将除了最大盘的部分，从A，通过辅助柱子C，移动到B
     * 下半部分的移动，将除了最大盘的部分，从B，通过辅助柱子A，移动到C
     * A-B, A-C, B-C
     * 层数==3：排列ACB
     * A-C, A-B, C-B, A-C, B-A, B-C, A-C
     * 层数==4：排列ABC
     * A-B, A-C, B-C, A-B, C-A, C-B, A-B, A-C, B-C, B-A, C-A, B-C, A-B, A-C, B-C
     * @param number 层数
     * @param start 开始柱子的名称
     * @param middle 中间柱子的名称
     * @param end 结束柱子的名称
     */
    static void towerOfHanoi(int number, char start, char middle, char end) {
        if (number == 1) {
            move(start, end);
        } else {
            // 将除了最大盘的部分，从A，通过辅助柱子C，移动到B
            towerOfHanoi(number - 1, start, end, middle);
            // 调用number==1的方法，将最大的盘子从A-C
            move(start, end);
            // 将除了最大盘的部分，从B，通过辅助柱子A，移动到C
            towerOfHanoi(number - 1, middle, start, end);
        }
//        if (totalHanoiSteps > Math.pow(2, number)) {
//            totalHanoiSteps = 1;
//        }
    }

    static void move(char start, char end) {
            System.out.println("Step " + ++totalHanoiSteps + "\t: from " + start + " to " + end);
    }

    public static void main(String[] args) {
        System.out.println("Question 2:");
        System.out.println(greatestCommonDivisor(25,15));
        System.out.println(greatestCommonDivisor(15,15));
        System.out.println(greatestCommonDivisor(21,56));
        System.out.println("Question 3:");
        System.out.println("Number 1:");
        towerOfHanoi(1,'A','B','C');
        System.out.println("Number 2:");
        towerOfHanoi(2,'A','B','C');
        System.out.println("Number 3:");
        towerOfHanoi(3,'A','B','C');
        System.out.println("Number 4:");
        towerOfHanoi(4,'A','B','C');
    }
}
