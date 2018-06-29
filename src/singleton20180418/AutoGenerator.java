package singleton20180418;

public class AutoGenerator {
    private static AutoGenerator ourInstance = new AutoGenerator();

    public static AutoGenerator getInstance() {
        return ourInstance;
    }

    private AutoGenerator() {
    }
}
