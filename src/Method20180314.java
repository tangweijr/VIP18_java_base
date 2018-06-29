import java.util.Arrays;

/**
 * 方法重载的练习
 * @author tangweijr
 * @since 20180315
 */
public class Method20180314 {
    /**
     * 创建一个基本的double类型的最大
     * @param doubles 输入double[]类型的数组
     * @return 返回doubleMax
     */
    static double getMax(double[] doubles) {
        double max = doubles[0];
        for (double aDouble : doubles) {
            max = max > aDouble ? max : aDouble;
        }
        return max;
    }

    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param floats 输入float[]类型的数组
     * @return 返回floatMax
     */
    static float getMax(float[] floats) {
        double[] d = new double[floats.length];
        for (int i = 0; i < floats.length; i++) {
            d[i] = floats[i];
        }
        return (float) getMax(d);
    }
    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param chars 输入char[]类型的数组
     * @return 返回charMax
     */
    static char getMax(char[] chars) {
        double[] d = new double[chars.length];
        for (int i = 0; i < chars.length; i++) {
            d[i] = chars[i];
        }
        return (char) getMax(d);
    }
    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param bytes 输入byte[]类型的数组
     * @return 返回byteMax
     */
    static byte getMax(byte[] bytes) {
        double[] d = new double[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            d[i] = bytes[i];
        }
        return (byte) getMax(d);
    }
    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param shorts 输入short[]类型的数组
     * @return 返回shortMax
     */
    static short getMax(short[] shorts) {
        double[] d = new double[shorts.length];
        for (int i = 0; i < shorts.length; i++) {
            d[i] = shorts[i];
        }
        return (short) getMax(d);
    }
    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param ints 输入int[]类型的数组
     * @return 返回intMax
     */
    static int getMax(int[] ints) {
        double[] d = new double[ints.length];
        for (int i = 0; i < ints.length; i++) {
            d[i] = ints[i];
        }
        return (int) getMax(d);
    }
    /**
     * 通过调用getMax，重载其他类型，boolean类型无法比较
     * @param longs 输入long[]类型的数组
     * @return 返回longMax
     */
    static long getMax(long[] longs) {
        double[] d = new double[longs.length];
        for (int i = 0; i < longs.length; i++) {
            d[i] = longs[i];
        }
        return (long) getMax(d);
    }

    /**
     * 创建一个基本的double类型的最小
     * @param doubles 输入double[]类型的数组
     * @return 返回doubleMin
     */
    static double getMin(double[] doubles) {
        double min = doubles[0];
        for (double aDouble : doubles) {
            min = min < aDouble ? min : aDouble;
        }
        return min;
    }

    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param floats 输入float[]类型的数组
     * @return 返回floatMin
     */
    static float getMin(float[] floats) {
        double[] d = new double[floats.length];
        for (int i = 0; i < floats.length; i++) {
            d[i] = floats[i];
        }
        return (float) getMin(d);
    }
    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param chars 输入char[]类型的数组
     * @return 返回charMin
     */
    static char getMin(char[] chars) {
        double[] d = new double[chars.length];
        for (int i = 0; i < chars.length; i++) {
            d[i] = chars[i];
        }
        return (char) getMin(d);
    }
    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param bytes 输入byte[]类型的数组
     * @return 返回byteMin
     */
    static byte getMin(byte[] bytes) {
        double[] d = new double[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            d[i] = bytes[i];
        }
        return (byte) getMin(d);
    }
    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param shorts 输入short[]类型的数组
     * @return 返回shortMin
     */
    static short getMin(short[] shorts) {
        double[] d = new double[shorts.length];
        for (int i = 0; i < shorts.length; i++) {
            d[i] = shorts[i];
        }
        return (short) getMin(d);
    }
    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param ints 输入int[]类型的数组
     * @return 返回intMin
     */
    static int getMin(int[] ints) {
        double[] d = new double[ints.length];
        for (int i = 0; i < ints.length; i++) {
            d[i] = ints[i];
        }
        return (int) getMin(d);
    }
    /**
     * 通过调用getMin，重载其他类型，boolean类型无法比较
     * @param longs 输入long[]类型的数组
     * @return 返回longMin
     */
    static long getMin(long[] longs) {
        double[] d = new double[longs.length];
        for (int i = 0; i < longs.length; i++) {
            d[i] = longs[i];
        }
        return (long) getMin(d);
    }

    /**
     * 创建一个基本的double类型的冒泡排序
     * @param nums 输入double[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回double[]数组
     */
    static double[] maoPaoSort(double[] nums, boolean reverse) {
        if (nums.length == 1) {
            return nums;
        } else {
            // i初始值是0，则外循环循环5次，最后一次j=nums.length-1, i=nums.length-1，二者相等，不进入内循环
            // i初始值是0，则外循环循环5次，没有上述的判断过程
            for (int i = 0; i < nums.length ; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (!reverse) {
                        if (nums[j] > nums[j - 1]) {
                            double t = nums[j];
                            nums[j] = nums[j - 1];
                            nums[j - 1] = t;
                        }
                    } else {
                        if (nums[j] < nums[j - 1]) {
                            double t = nums[j];
                            nums[j] = nums[j - 1];
                            nums[j - 1] = t;
                        }
                    }
                }
            }
            return nums;
        }
    }

    /**
     * 默认方法调用上一个版本，将reverse设定为false，即从大到小排序
     * @param nums 输入double[]类型的数组
     * @return 返回double[]数组
     */
    static double[] maoPaoSort(double[] nums){
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入float[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回float[]数组
     */
    static float[] maoPaoSort(float[] nums,boolean reverse){
        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d,reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (float) d[i];
        }
        return nums;
    }
    /**
     * 调用float[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入float[]类型的数组
     * @return 返回float[]数组
     */
    static float[] maoPaoSort(float[] nums) {
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入char[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回char[]数组
     */
    static char[] maoPaoSort(char[] nums, boolean reverse) {

        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d, reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (char) d[i];
        }
        return nums;
    }
    /**
     * 调用char[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入char[]类型的数组
     * @return 返回char[]数组
     */
    static char[] maoPaoSort(char[] nums){
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入byte[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回byte[]数组
     */
    static byte[] maoPaoSort(byte[] nums, boolean reverse){
        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d, reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (byte) d[i];
        }
        return nums;
    }
    /**
     * 调用byte[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入byte[]类型的数组
     * @return 返回byte[]数组
     */
    static byte[] maoPaoSort(byte[] nums){
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入short[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回short[]数组
     */
    static short[] maoPaoSort(short[] nums, boolean reverse){
        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d, reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (short) d[i];
        }
        return nums;
    }
    /**
     * 调用short[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入short[]类型的数组
     * @return 返回short[]数组
     */
    static short[] maoPaoSort(short[] nums){
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入int[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回int[]数组
     */
    static int[] maoPaoSort(int[] nums, boolean reverse){
        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d, reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) d[i];
        }
        return nums;
    }
    /**
     * 调用int[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入int[]类型的数组
     * @return 返回int[]数组
     */
    static int[] maoPaoSort(int[] nums){
        return maoPaoSort(nums, false);
    }
    /**
     * 调用double[]版本冒泡排序
     * @param nums 输入long[]类型的数组
     * @param reverse 输入顺序，true从小到大，false从大到小
     * @return 返回long[]数组
     */
    static long[] maoPaoSort(long[] nums, boolean reverse){
        double[] d = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            d[i] = nums[i];
        }
        maoPaoSort(d, reverse);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (long) d[i];
        }
        return nums;
    }
    /**
     * 调用long[]版本冒泡排序，将reverse设定为false，即从大到小排序
     * @param nums 输入long[]类型的数组
     * @return 返回long[]数组
     */
    static long[] maoPaoSort(long[] nums){
        return maoPaoSort(nums, false);
    }

    public static void main(String[] args) {
        System.out.println("Question 3: getMax");
        double[] d = {Double.MAX_VALUE, 2.0, 3.0, 4.0};
        float[] f = {Float.MAX_VALUE, 2.0F, 3.0F, 5.0F};
        char[] c = {Character.MAX_VALUE, 2, 3, 5};
        byte[] b = {Byte.MAX_VALUE, 2, 3, 5};
        short[] s = {Short.MAX_VALUE, 20, 30, 50};
        int[] i = {Integer.MAX_VALUE, 200, 300, 500};
        long[] l = {Long.MAX_VALUE, 2000, 30000, 5000000, -1000000000};
        System.out.println("Get Max double\t" + getMax(d) + "\nGet Max float\t" + getMax(f) + "\nGet Max char\t" + getMax(c) + "\nGet Max byte\t" + getMax(b));
        System.out.println("Get Max short\t" + getMax(s) + "\nGet Max int\t\t" + getMax(i) + "\nGet Max long\t" + getMax(l));
        System.out.println("Question 3: getMin");
        d[1] = Double.MIN_VALUE;
        f[1] = Float.MIN_VALUE;
        b[1] = Byte.MIN_VALUE;
        s[1] = Short.MIN_VALUE;
        i[1] = Integer.MIN_VALUE;
        l[1] = Long.MIN_VALUE;
        System.out.println("Get Min double\t" + getMin(d) + "\nGet Min float\t" + getMin(f) + "\nGet Min char\t" + getMin(c) + "\nGet Min byte\t" + getMin(b));
        System.out.println("Get Min short\t" + getMin(s) + "\nGet Min int\t\t" + getMin(i) + "\nGet Min long\t" + getMin(l));

        System.out.println();
        System.out.println("Question 4:");
        System.out.println("maoPaoSort for double[] reverse\t"+Arrays.toString(maoPaoSort(d,true)));
        System.out.println("maoPaoSort for float[]\t\t\t"+Arrays.toString(maoPaoSort(f)));
        System.out.println("maoPaoSort for char[] reverse\t"+Arrays.toString(maoPaoSort(c,true)));
        System.out.println("maoPaoSort for byte[]\t\t\t"+Arrays.toString(maoPaoSort(b)));
        System.out.println("maoPaoSort for short[] reverse\t"+Arrays.toString(maoPaoSort(s,true)));
        System.out.println("maoPaoSort for int[]\t\t\t"+Arrays.toString(maoPaoSort(i)));
        System.out.println("maoPaoSort for long[] reverse\t"+Arrays.toString(maoPaoSort(l,true)));
    }
}
