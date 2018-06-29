package singleton20180418;

public class LHSingleton {
    private LHSingleton() {

    }

    private static LHSingleton lhSingleton;

    public synchronized static LHSingleton getInstence() {
        if (lhSingleton == null) {
            lhSingleton = new LHSingleton();
        }
        return lhSingleton;
    }
}
