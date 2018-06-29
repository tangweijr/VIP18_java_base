package twentyClass20180321;

import twentyClass20180321.twentyClassException.UseTypeErrorException;

/**
 * 5.智能充电宝
 * @author tangweijr
 * @since 20180326
 */
public class PhoneCharger {
    public static boolean useMicroUSB = true;
    private int mAh;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneCharger that = (PhoneCharger) o;
        return mAh == that.mAh &&
                Double.compare(that.inputVote, inputVote) == 0 &&
                Double.compare(that.outputVote, outputVote) == 0;
    }

    @Override
    public String toString() {
        return "PhoneCharger{" +
                "mAh=" + mAh +
                ", inputVote=" + inputVote +
                ", outputVote=" + outputVote +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PhoneCharger charger = new PhoneCharger(this.mAh, this.inputVote, this.outputVote);
        return charger;
    }

    @Override
    public int hashCode() {
        return (int) ((mAh * 31 + inputVote) * 31 + outputVote);
    }

    public double getInputVote() {
        return inputVote;
    }

    /**
     * 设置输入电压
     * @param inputVote 输入电压
     */
    public void setInputVote(double inputVote) {
        if (inputVote == 9 || inputVote == 12) {
            this.inputVote = inputVote;
        }
    }

    private double inputVote;
    private double outputVote;

    public static void setUseMicroUSB(String s) {
        if (s.equals("useTypeC") || s.equals("useLighting")) {
            useMicroUSB = false;
        } else {
            throw new UseTypeErrorException();
        }
    }

    /**
     * 构造器，转发
     * @param mAh 毫安时
     */
    public PhoneCharger(int mAh) {
        this(mAh,9.0,5.0);
    }


    /**
     * 全参数构造器
     * @param mAh 充电电流，单位毫安时
     * @param inputVote 输入电压
     * @param outputVote 输出电压
     */
    public PhoneCharger(int mAh, double inputVote, double outputVote) {
        this.mAh = mAh;
        this.inputVote = inputVote;
        this.outputVote = outputVote;
    }

    /**
     * 充电
     * @param phone 手机种类
     * @return 是否开始充电
     */
    public boolean charger(Phone phone) {
        if (phone.getBrand().equals("xiaomi")) {
            this.inputVote = 9.0;
            System.out.println("using " + inputVote + " for charge");
            return true;
        } else if (phone.getBrand().equals("huawei")) {
            this.inputVote = 6.0;
            System.out.println("using " + inputVote + " for charge");
            return true;
        } else {
            return false;
        }
    }

    /**
     * 放点
     * @return 是否开始放电
     */
    public boolean outPut() {
        if (mAh > 500) {
            System.out.println("using " + mAh / inputVote + "mA for charge");
            return true;
        } else {
            System.out.println("mAh is too low, please recharged");
            return false;
        }
    }
}
