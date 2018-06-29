package singleton20180418;

public class EHSingleton {
    private EHSingleton() {

    }

    private static EHSingleton ehSingleton = new EHSingleton();

    public static EHSingleton getInstance() {
        return ehSingleton;
    }
}
