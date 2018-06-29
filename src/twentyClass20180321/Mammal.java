package twentyClass20180321;

import java.util.Objects;

/**
 * 16.哺乳动物
 * @author tangweijr
 * @since 20180325
 */
public class Mammal extends Animal {
    public static double tiwen = 37;
    private int babyMaxAge;
    private int bornMaxNumber;
    private String livingEnvironment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return babyMaxAge == mammal.babyMaxAge &&
                bornMaxNumber == mammal.bornMaxNumber &&
                Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "babyMaxAge=" + babyMaxAge +
                ", bornMaxNumber=" + bornMaxNumber +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mammal mammal=new Mammal();
        mammal.babyMaxAge = babyMaxAge;
        mammal.bornMaxNumber = bornMaxNumber;
        mammal.livingEnvironment = livingEnvironment;
        return mammal;
    }

    @Override
    public int hashCode() {
        return (babyMaxAge * 17 + bornMaxNumber) * 17 + livingEnvironment.hashCode();
    }

    public static void changeTiwen(double wendu) {
        if (wendu > tiwen) {
            System.out.println("sweet for cooling");
        } else {
            System.out.println("sun shine for warm up");
        }
    }

    /**
     * 默认构造器
     */
    public Mammal() {
        super();
    }

    /**
     * 传递参数，调用父类构造器
     * @param name 名称
     * @param maxage 最大年龄
     */
    public Mammal(String name, int maxage) {
        super(name, maxage, true);
    }

    public void bark() {

    }

    public void run() {

    }

    public void sleep() {

    }

    public void eat() {

    }

    public void liveAt() {

    }

    public void viviparous() {
        System.out.println("哺乳动物都是胎生:");
    }

    public void breastFeeding() {
        System.out.println("哺乳动物都会哺乳:");
    }
}
