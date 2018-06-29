package twentyClass20180321;

import java.util.Arrays;

/**
 * 9.电饭锅
 * @author tangweijr
 * @since 20180321
 */
public class RiceCooker {
    public static boolean hasLight = true;
    public static String light;
    public final String[] functions ={"正常","快煮","粥","稀饭","锅巴"};
    private double countDownTime;
    private int vote;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiceCooker that = (RiceCooker) o;
        return Double.compare(that.countDownTime, countDownTime) == 0 &&
                vote == that.vote &&
                Arrays.equals(functions, that.functions);
    }

    @Override
    public String toString() {
        return "RiceCooker{" +
                "functions=" + (functions == null ? null : Arrays.asList(functions)) +
                ", countDownTime=" + countDownTime +
                ", vote=" + vote +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        RiceCooker riceCooker = new RiceCooker();
        riceCooker.countDownTime = countDownTime;
        System.arraycopy(functions, 0, riceCooker.functions, 0, functions.length);
        riceCooker.vote = vote;
        return riceCooker;
    }

    @Override
    public int hashCode() {
        return (int) (countDownTime * 31 + Arrays.hashCode(functions)) * 17 + vote;
    }

    public static void getLight(String l) {
        if (hasLight) {
            light = l;
        } else {
            light = "";
        }
    }

    /**
     * 无参数构造器，转发
     */
    public RiceCooker() {
        this(90,220);
    }

    /**
     * 全参数构造器
     * @param countDownTime 设定时间
     * @param vote 电压
     */
    public RiceCooker(double countDownTime, int vote) {
        this.countDownTime = countDownTime;
        this.vote = vote;
    }

    /**
     * 是否已经煮好饭
     * @return
     */
    public boolean remind() {
        if (countDownTime <= 0) {
            System.out.println("di~~~di~~~ and light is on");
            return true;
        } else {
            return false;
        }
    }

    /**
     * 选择功能
     * @param s 功能
     */
    public void setFunctions(String s) {
        if (s.equals("正常")) {
            this.countDownTime = 120;
        } else if (s.equals("快煮")) {
            this.countDownTime = 60;
        } else if (s.equals("粥")) {
            this.countDownTime = 150;
        } else if (s.equals("稀饭")) {
            this.countDownTime = 60;
        } else if (s.equals("锅巴")) {
            this.countDownTime = 180;
        }
    }

    /**
     * 煮好饭后，通知手机
     */
    public void noticePhone() {
        if (remind()) {
            System.out.println("sent a message to your phone");
        }
    }

    public void cook() {
        countDownTime -= 30;
    }
}
