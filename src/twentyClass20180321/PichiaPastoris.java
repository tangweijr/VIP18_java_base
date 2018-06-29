package twentyClass20180321;

import twentyClass20180321.twentyClassException.NameFormatException;

import java.util.Objects;

/**
 * 19.酵母
 * @author tangweijr
 * @since 20180326
 */
public class PichiaPastoris {
    public static double[] size = {2.0, 2.0};
    private String strainName;
    private boolean isMethanolUtilizationPlus;
    private String colorInPlant;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PichiaPastoris that = (PichiaPastoris) o;
        return isMethanolUtilizationPlus == that.isMethanolUtilizationPlus &&
                Objects.equals(strainName, that.strainName) &&
                Objects.equals(colorInPlant, that.colorInPlant);
    }

    @Override
    public String toString() {
        return "PichiaPastoris{" +
                "strainName='" + strainName + '\'' +
                ", isMethanolUtilizationPlus=" + isMethanolUtilizationPlus +
                ", colorInPlant='" + colorInPlant + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PichiaPastoris pichiaPastoris = new PichiaPastoris();
        pichiaPastoris.colorInPlant = colorInPlant;
        pichiaPastoris.isMethanolUtilizationPlus = isMethanolUtilizationPlus;
        pichiaPastoris.strainName = strainName;
        return pichiaPastoris;
    }

    @Override
    public int hashCode() {
        return (colorInPlant.hashCode() * 17 + (isMethanolUtilizationPlus ? 0 : 1)) * 17 + strainName.hashCode();
    }

    public String getStrainName() {
        return strainName;
    }

    /**
     * 设置菌株名称
     * @param strainName 菌株名称
     */
    public void setStrainName(String strainName) throws NameFormatException {
        if (strainName.matches("\\w+")) {
            this.strainName = strainName;
        } else {
            throw new NameFormatException();
        }
    }

    public static void microscopeWatch() {
        if (size[0] * size[0] < 3) {
            System.out.println("Use oil(X100)");
        } else {
            System.out.println("Use common(X40)");
        }
    }

    /**
     * 无参数构造器
     */
    public PichiaPastoris() {
        this("甜酵母",false,"White");
    }

    /**
     * 全参数构造器
     * @param s 名称
     * @param isMUP 利用甲醇的类型
     * @param colorInPlant 菌落的颜色
     */
    public PichiaPastoris(String s, boolean isMUP, String colorInPlant) {
        this.strainName = s;
        this.isMethanolUtilizationPlus = isMUP;
        this.colorInPlant = colorInPlant;
    }

    /**
     * 发酵的方式
     * @param oxygenLevel 氧气含量
     */
    public void fermentation(int oxygenLevel) {
        System.out.println("可以用来做面包");
        if (oxygenLevel < 20) {
            System.out.println("产生酒精，面包酸酸的");
        } else {
            System.out.println("产生乳酸，降解成糖，面包甜甜的");
        }
    }

    /**
     * 用处
     */
    public void usage() {
        if (strainName.equals("甜酒型")) {
            System.out.println("用于酿酒酿");
        } else if (strainName.equals("酒精型")) {
            System.out.println("用于酿米酒");
        }
    }
}
