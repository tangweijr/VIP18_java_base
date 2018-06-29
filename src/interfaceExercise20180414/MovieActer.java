package interfaceExercise20180414;

/**
 * 演员类，有名字，重写打印方法
 * @author tangweijr
 * @since 20180414
 */
public class MovieActer {
    String name;

    public MovieActer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name is " + this.name;
    }
}
