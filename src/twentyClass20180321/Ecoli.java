package twentyClass20180321;

import twentyClass20180321.twentyClassException.SizeRangeException;

import java.util.Arrays;

/**
 * 14.大肠杆菌
 * @author tangweijr
 * @since 20180326
 */
public class Ecoli {
    public static String type = "Prokaryotes";
    private boolean gramNegative;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Ecoli) {
            Ecoli that = (Ecoli) o;
            return this.gramNegative == that.gramNegative && this.isPathogenicBacteria == that.isPathogenicBacteria && Arrays.equals(this.size, that.size);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ecoli is" +
                "gramNegative " + gramNegative +
                ", size is" + size +
                ", isPathogenicBacteria?(true or false)" + isPathogenicBacteria;
    }

    @Override
    public int hashCode() {
        return (gramNegative ? 100 : 300) + Arrays.hashCode(size) + (isPathogenicBacteria ? 100 : 300);
    }

    /**
     * 返回细菌的大小
     * @return 大小
     */
    public double getSize() {
        if (size != null) {
            return size[0] * size[1];
        } else {
            return 0;
        }
    }

    public void setSize(double[] size) throws SizeRangeException {
        if (size.length != 2 && size[0] < 0 && size[1] < 0) {
            throw new SizeRangeException();
        }
        this.size = size;
    }

    private double[] size;
    public boolean isPathogenicBacteria;

    /**
     * 无参数构造器
     */
    public Ecoli() {
        this(true, new double[]{1, 1}, false);
    }

    /**
     * 全参数构造器
     * @param g 革兰氏阴性菌
     * @param size 大小
     * @param isPB 致病菌
     */
    public Ecoli(boolean g, double[] size, boolean isPB) {
        this.gramNegative = g;
        this.size = new double[size.length];
        for (int i = 0; i < size.length; i++) {
            this.size[i] = size[i];
        }
        this.isPathogenicBacteria = isPB;
    }

    /**
     * 倍增时间
     * @return
     */
    public static int multiplicationTime() {
        System.out.println("The type is " + type + "Every 20 mins Multiplication one generation");
        return 20;
    }

    /**
     * 是否含有质粒
     * @param name 菌种
     * @return
     */
    public boolean hasPlasmids(String name) {
        if (type.equals("BL21(DE3)") || type.equals("DH5A")) {
            return true;
        } else {
            return false;
        }
    }
}
