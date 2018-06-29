import java.util.Random;
import java.util.Scanner;

/**
 * 数组练习
 * @author tangweijr
 * @since 20180305
 */
public class ShuZu20180305 {
    // 获取最大与最小值
    private static void MaxAndMin(int[] ints){
        int min, max;
        if (ints.length == 1) {
            min = max = ints[0];
        } else {
            min = max = ints[0];
            for (int temp : ints) {
                min = min > temp ? temp : min;
                max = max < temp ? temp : max;
            }
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
    // 获取被5整除数字的下标
    private static void ZhengChuByNumberFive(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 5 == 0) {
                System.out.println("ints["+i+"]="+ints[i]);
            }
        }
    }

    // 被3整除的值替换成100
    private static void ChangeByNumberThree(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                System.out.println("ints["+i+"] change from "+ints[i]+" to 100");
                ints[i]=100;
            }
        }
    }

    public static void main(String[] args) {
        // 产生随机数，填充数组
        Random random=new Random(47);
        int[] randInt=new int[20];
        for (int i = 0; i < randInt.length; i++) {
            randInt[i]=random.nextInt(1000);
        }
        System.out.println("Question 2:");
        MaxAndMin(randInt);
        System.out.println("Question 3:");
        ZhengChuByNumberFive(randInt);
        System.out.println("Question 4:");
        ChangeByNumberThree(randInt);
        System.out.println("Question 5 please enter number:");
        // 改成手动输入
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < randInt.length; i++) {
            randInt[i]=in.nextInt();
        }
        MaxAndMin(randInt);
        ZhengChuByNumberFive(randInt);
        ChangeByNumberThree(randInt);
    }
}
