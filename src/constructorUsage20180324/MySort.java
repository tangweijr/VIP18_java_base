package constructorUsage20180324;

import java.util.Arrays;

/**
 * Question2
 * 创建一个排序类，先把数组从构造器参数中传递进去（再传递一个升序还是降序参数），然后通过方法进行排序
 */
public class MySort {
    public boolean reverse;
    public Object[] nums;

    /**
     * double类型数组的构造器
     * @param nums 数组
     * @param reverse 是否是倒序，倒序是true，顺序是false
     */
    public MySort(double[] nums, boolean reverse) {
        this.nums = new Object[nums.length];
        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = nums[i];
        }
        this.reverse = reverse;
    }

    /**
     * int类型数组的构造器
     * @param nums 数组
     * @param reverse 是否是倒序，倒序是true，顺序是false
     */
    public MySort(int[] nums, boolean reverse) {
        this.nums = new Object[nums.length];
        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = nums[i];
        }
        this.reverse = reverse;
    }

    /**
     * 排序
     * 调用Arrays.sort()
     * 倒序把数组反向复制一遍
     */
    public void sort() {
        Arrays.sort(nums);
        if (reverse) {
            Object[] temp = new Object[nums.length];
            for (int i = 0; i < temp.length; i++) {
                temp[nums.length - i - 1] = nums[i];
            }
            nums = temp;
        }
    }

    /**
     * 打印排序后的结果
     */
    public void print() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] test = new double[]{3, 1, -6, -1, 9, 0};
        MySort mySort = new MySort(test, false);
        mySort.sort();
        mySort.print();
        MySort mySort2 = new MySort(test, true);
        mySort2.sort();
        mySort2.print();
        int[] test2 = new int[]{1, -1, 0, 2, 6, -3};
        MySort mySort3 = new MySort(test2, false);
        mySort3.sort();
        mySort3.print();
        MySort mySort4 = new MySort(test2, true);
        mySort4.sort();
        mySort4.print();
    }
}
