package twentyClass20180321;

/**
 * 18.鱼，继承动物
 * @author tangweijr
 * @since 20180326
 */
public class Fish extends Animal {
    public String type;
    private static boolean isLiveInOcean;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Fish) {
            Fish that = (Fish) o;
            return this.isMammal == that.isMammal && this.type.equals(that.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Salmon's " +
                "type is" + type + '\'' +
                ", isMammal?(true or false)" + isMammal;
    }

    @Override
    public int hashCode() {
        return type.hashCode() * 37 + (isMammal ? -1 : 1);
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    private boolean isMammal;//比如鲸鱼


    /**
     * 默认构造器
     */
    public Fish() {
        super("", 1, false);
    }

    /**
     * 构造器
     * @param name   名称
     * @param maxage 最大年龄
     */
    public Fish(String name, int maxage, boolean b) {
        super(name, maxage, b);
    }

    public void run() {
        System.out.println("鱼都会游泳");
    }

    public void sleep() {
        if (type.equals("淡水鱼")) {
            System.out.println("在江河中睡觉");
        } else {
            System.out.println("在海中睡觉");
        }
    }

    public void eat() {
        if (type.equals("淡水鱼")) {
            sleep();
            System.out.println("鱼在河里吃东西");
        } else {
            sleep();
            System.out.println("鱼在海里吃东西");
        }
    }

    public void bark() {
        System.out.println("鱼不会叫");
    }

    public static void liveAt() {
        System.out.println("鱼生活在水中");
    }
}