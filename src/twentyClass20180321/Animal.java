package twentyClass20180321;

import twentyClass20180321.twentyClassException.AgeOutOfRangeException;

/**
 * 15.动物
 * @author tangweijr
 * @since 20180321
 */
public class Animal {
    public static int animalMaxAge = 150;
    private String name;
    private int age;
    private boolean isMammal;

    public static void drink() {
        System.out.println("Each animal drink water");
    }

    public void bark() {
    }

    public void run() {
    }

    /**
     * 年龄
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * 设定最大年龄范围
     *
     * @param age 该动物的最大年龄
     * @return
     */
    public int setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else if (age > animalMaxAge) {
            this.age = animalMaxAge;
            throw new AgeOutOfRangeException();
        } else {
            this.age = age;
        }
        return this.age;
    }

    /**
     * 默认构造器，转发
     */
    public Animal() {
        this("", 1, true);
    }

    /**
     * 构造器
     * @param name   名称
     * @param age 年龄
     * @param b      是否是哺乳动物
     */
    public Animal(String name, int age, boolean b) {
        this.name = name;
        this.age = setAge(age);
        this.isMammal = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Animal) {
            Animal that = (Animal) o;
            return this.name.equals(that.name) && this.age == that.age && this.isMammal == that.isMammal;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Animal's " +
                "name is '" + name + '\'' +
                ", age is" + age +
                ", isMammal?(true or false)" + isMammal;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + (age * 31) * 31 + (isMammal ? 0 : 1);
    }

    public void show() {
        System.out.println("This animal name is " + name + ", and maxAge is " + age + ", amd is Dog? " + isMammal);
    }

    public static void main(String[] args) {
        Animal.animalMaxAge = 100;
        Animal.drink();

        Animal dog = new Animal();
        dog.animalMaxAge = 150;
        dog.show();
        dog.drink();

        Animal cat = new Animal("xiaohuang", 10, true);
        cat.animalMaxAge = 200;
        cat.show();
        cat.drink();

    }
}
