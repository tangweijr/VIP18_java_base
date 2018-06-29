package twentyClass20180321;

import twentyClass20180321.twentyClassException.PassWordFormatException;

/**
 * 4.门锁
 * @author tangweijr
 * @since 20180326
 */
public class DoorLocker {
    private static String keyType;
    private String passWord;
    private String securityLevel;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof DoorLocker) {
            DoorLocker that = (DoorLocker) o;
            return this.price == that.price && this.passWord.equals(that.passWord) && this.securityLevel.equals(that.securityLevel);
        }
        return false;
    }

    @Override
    public String toString() {
        return "DoorLocker's " +
                "passWord is" + passWord + '\'' +
                ", securityLevel was" + securityLevel + '\'' +
                ", price is about " + price + "yuan";
    }

    @Override
    public int hashCode() {
        return (passWord.hashCode() * 7) + securityLevel.hashCode() * (int) price;
    }

    /**
     * 构造器，转发
     * @param passWord 密码
     */
    public DoorLocker(String passWord) {
        this(passWord, "B+", 2000);
    }

    /**
     * 全参数构造器
     * @param passWord 密码
     * @param securityLevel 锁芯级别
     * @param price 价格
     */
    public DoorLocker(String passWord, String securityLevel, double price) {
        this.passWord = passWord;
        this.securityLevel = securityLevel;
        this.price = price;
    }

    /**
     * 是否可以用卡片开门
     *
     * @return
     */
    public static boolean canOpenByCard() {
        if (keyType.equals("Card") || keyType.equals("Fingerprint")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 输入密码是否正确
     * @param psw
     */
    public void openByPassWord(String psw) {
        if (passWord.equals(psw)) {
            System.out.println("Password right, opening");
        } else {
            System.out.println("Password wrong, please enter again");
        }
    }

    /**
     * 密码必须是6位数字
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        if (passWord.matches("\\d{6}")) {
            this.passWord = passWord;
        } else {
            throw new PassWordFormatException();
        }
    }

    public String getPassWord() {
        return passWord;
    }

    /**
     * 是否需要电池
     * @return
     */
    public boolean useBattery() {
        if (securityLevel.equals("B") || securityLevel.equals("C")) {
            return true;
        } else {
            return false;
        }
    }
}
