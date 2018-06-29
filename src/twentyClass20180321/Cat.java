package twentyClass20180321;

/**
 * 17.猫，继承哺乳动物
 * @author tangweijr
 * @since 20180326
 */
public class Cat extends Mammal {
    public static String type = "maoke";
    public static double[] maxBody = {1,0.5};
    private String foodType;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Cat) {
            Cat that = (Cat) o;
            return this.isHouseCat == that.isHouseCat && this.sex.equals(that.sex) && this.foodType.equals(that.foodType);
        }
        return false;
    }

    @Override
    public String toString() {
        return "This Cat's " +
                "foodType was" + foodType + '\'' +
                ", isHouseCat?(true or false)" + isHouseCat +
                ", sex is " + sex + '\'';
    }

    @Override
    public int hashCode() {
        return foodType.hashCode() + (isHouseCat ? 0 : 111) + sex.hashCode();
    }

    public boolean isHouseCat() {
        return isHouseCat;
    }

    public void setHouseCat(boolean houseCat) {
        isHouseCat = houseCat;
    }

    private boolean isHouseCat;
    private String sex;

    public static void showInfo() {
        System.out.println("Cat is "+type+", and the size is "+maxBody[0]+"*"+maxBody[1]);
    }

    /**
     * 构造器转发
     */
    public Cat() {
        super("", 1);
    }

    /**
     * 全参数构造器
     * @param name 名字
     * @param foodType 食物累心
     * @param isHouseCat 是否是家猫
     * @param sex 性别
     */
    public Cat(String name, String foodType, boolean isHouseCat, String sex) {
        super(name, 10);
        this.foodType = foodType;
        this.isHouseCat = isHouseCat;
        this.sex = sex;
    }

    public void bark() {
        System.out.println("喵喵");
    }

    public void sleep() {
        System.out.println("喜欢睡在暖和的地方，经常缩成一团，一天中有14～15小时在睡眠中度过");
    }

    public void eat() {
        System.out.println("要吃猫粮和小鱼干");
    }

    public void viviparous() {
        super.viviparous();
        System.out.println("母猫一胎最多能生12个，最少能生2个，一般都是3～6个，体力好的猫一年能生2次");
    }

    public void breastFeeding() {
        super.breastFeeding();
        System.out.println("幼猫从4周龄之前都在吃奶");
    }

    public static void main(String[] args) {
        Cat.showInfo();
        Cat.maxBody = new double[]{1, 2};
        Cat.showInfo();

        Cat xiaohua = new Cat("xiaohua", "fish", true, "male");
        xiaohua.maxBody = new double[]{0.8, 0.4};
        xiaohua.showInfo();

        Cat dahua = new Cat("dahua", "fish", false, "female");
        dahua.maxBody = new double[]{1.2, 0.4};
        dahua.showInfo();
    }
}
