import java.util.Arrays;
import java.util.Random;

/**
 * 简单一维数组排序方案
 * @author tangweijr
 * @since 20180307
 */
public class MaoPao20180307 {

    /*
    从大到小的冒泡排序法
     */
    public static int[] MaoPao(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else {
            // i初始值是0，则外循环循环5次，最后一次j=nums.length-1, i=nums.length-1，二者相等，不进入内循环
            // i初始值是0，则外循环循环5次，没有上述的判断过程
            for (int i = 0; i < nums.length ; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] > nums[j - 1]) {
                        int t = nums[j];
                        nums[j] = nums[j - 1];
                        nums[j - 1] = t;
                    }
                }
            }
            return nums;
        }
    }

    /*
    从大到小的插入排序法
     */
    public static int[] ChaRu(int[] nums) {
        if (nums.length == 1) {
            return nums;
        } else {
            for (int i = 1; i < nums.length; i++) {
                for (int j = i; j >0 ; j--) {
                    if (nums[j] < nums[j - 1]) {
                        break;
                    }
                    int t=nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = t;
                }
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 3:");
        int[] t1={123,456};
        int[] t2=t1;
        int[] t3=t1;
        int[] t4={1,2};
        t1=t4;
        t2[0]=0;
        System.out.println(t3[0]+" "+t3[1]);

        // 随机数填充数组
        Random random = new Random();
        int[] a=new int[20000];
        for (int i = 0; i < a.length; i++) {
            a[i]=random.nextInt(1000);
        }
        System.out.println("Question 4:");

        long ptime = System.currentTimeMillis();
        MaoPao(a);
        long sum=0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            System.out.print(a[i]+"\t");
//            if (i % 100 == 0) {
//                System.out.println();
//            }
//        }
        System.out.println("\nMaoPao consume "+ (System.currentTimeMillis()-ptime)+" ms");
        // 重新填充
        for (int i = 0; i < a.length; i++) {
            a[i]=random.nextInt(1000);
        }
        ptime=System.currentTimeMillis();
        ChaRu(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+"\t");
//            if (i % 100 == 0) {
//                System.out.println();
//            }
//        }
        System.out.println("\nChaRu consume "+ (System.currentTimeMillis()-ptime)+" ms");
        // 重新填充
        for (int i = 0; i < a.length; i++) {
            a[i]=random.nextInt(1000);
        }
        ptime=System.currentTimeMillis();
        Arrays.sort(a);
        System.out.println("Arrays.sort consume "+ (System.currentTimeMillis()-ptime)+" ms");
        System.out.println("Question 5: sum of a[] is " + sum);

//        用20000个数据测试，在不打印的情况下，DualPivotQuicksort>简单插入排序>冒泡排序
    }
}
