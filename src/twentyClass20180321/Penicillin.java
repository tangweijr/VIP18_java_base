package twentyClass20180321;

import twentyClass20180321.twentyClassException.DrugContentOutOfRangeException;

import java.util.Arrays;
import java.util.Objects;

/**
 * 8.青霉素
 * @author tangweijr
 * @since 20180326
 */
public class Penicillin {
    public static String casNumber = "61-33-6";
    public static double molecularWeight = 334.39;
    public String[] commonName;
    private String formulation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Penicillin that = (Penicillin) o;
        return Double.compare(that.contentGram, contentGram) == 0 &&
                Arrays.equals(commonName, that.commonName) &&
                Objects.equals(formulation, that.formulation);
    }

    @Override
    public String toString() {
        return "Penicillin{" +
                "commonName=" + (commonName == null ? null : Arrays.asList(commonName)) +
                ", formulation='" + formulation + '\'' +
                ", contentGram=" + contentGram +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Penicillin penicillin = new Penicillin();
        penicillin.commonName = commonName.clone();
        penicillin.contentGram = contentGram;
        penicillin.formulation = formulation;
        return penicillin;
    }

    @Override
    public int hashCode() {
        return (Arrays.hashCode(commonName) * 17 + (int) contentGram) * 17 + formulation.hashCode();
    }

    public double getContentGram() {
        return contentGram;
    }

    /**
     * 设置药品含量
     * @param contentGram 每片含量
     */
    public void setContentGram(double contentGram) throws DrugContentOutOfRangeException {
        if (contentGram > 0 && contentGram <= 2) {
            this.contentGram = contentGram;
        } else {
            throw new DrugContentOutOfRangeException();
        }
    }

    private double contentGram;

    public static void showBaseInfo() {
        System.out.println("CAS: " + casNumber + "\nMolecular Weight: " + molecularWeight);
    }

    /**
     * 无参数构造器，转发
     */
    public Penicillin() {
        this(new String[]{"青霉素","盘尼西林"},null,0.1);
    }

    /**
     * 全参数构造器
     * @param commonName 通用名
     * @param formulation 剂型
     * @param contentGram 含量
     */
    public Penicillin(String[] commonName, String formulation, double contentGram) {
        this.commonName = commonName;
        this.formulation = formulation;
        this.contentGram = contentGram;
    }

    /**
     * 显示所有商品名
     */
    public void showCommonName() {
        for (int i = 0; i < commonName.length; i++) {
            String s = commonName[i];
            System.out.println("No " + i + " common name is " + commonName[i]);
        }
    }

    /**
     * 剂型
     * @return 返回剂型
     */
    public String getFormulation() {
        return formulation;
    }

    /**
     * 输入年龄，返回计量
     * @param age 年龄
     * @return 计量
     */
    public double dose(int age) {
        System.out.print("The grams of content(one bag) is " + contentGram + ", and age " + age + " need ");
        if (age < 1) {
            return -1;
        } else if (age < 3) {
            return contentGram/12;
        } else if (age < 12) {
            return contentGram / 6;
        } else if (age < 18) {
            return contentGram / 2;
        } else {
            return contentGram;
        }
    }

    public static void main(String[] args) {
        Penicillin p = new Penicillin();
    }
}
