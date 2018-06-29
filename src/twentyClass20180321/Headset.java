package twentyClass20180321;

/**
 * 6.耳机
 * @author tangweijr
 * @since 20180326
 */
public class Headset {
    public static String caizhi="编织线";
    private static String type;
    public boolean isWireControl;
    private String functionOfUpKey;
    private String functionOfDownKey;

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Headset) {
            Headset headset = (Headset) o;
            return this.isWireControl == headset.isWireControl && this.functionOfUpKey.equals(headset.functionOfUpKey) && this.functionOfDownKey.equals(headset.functionOfDownKey);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Headset is " +
                "isWireControl?(true or false)" + isWireControl +
                ", functionOfUpKey's function is " + functionOfUpKey + '\'' +
                ", functionOfDownKey's function is " + functionOfDownKey;
    }

    @Override
    public int hashCode() {
        return (isWireControl ? -1 : 1) + functionOfDownKey.hashCode() + functionOfUpKey.hashCode();
    }

    /**
     * 构造器，转发
     */
    public Headset() {
        this(true,"上一首","下一首");
    }

    /**
     * 全参数构造器
     * @param isWireControl 是否可以线控
     * @param functionOfUpKey 上键功能
     * @param functionOfDownKey 下键功能
     */
    public Headset(boolean isWireControl, String functionOfUpKey, String functionOfDownKey) {
        this.isWireControl = isWireControl;
        this.functionOfUpKey = functionOfUpKey;
        this.functionOfDownKey = functionOfDownKey;
    }

    public static void speek() {
        if (type.equals("听筒式")) {
            System.out.println("可以用来打电话");
        }
    }

    /**
     * 返回上键的功能
     * @return
     */
    public String getFunctionOfUpKey() {
        return functionOfUpKey;
    }

    /**
     * 设定上键的功能
     * @return
     */
    public void setFunctionOfUpKey(String functionOfUpKey) {
        if (functionOfUpKey == null) {
            throw new NullPointerException();
        }
        this.functionOfUpKey = functionOfUpKey;
    }

    /**
     * 返回下键的功能
     * @return
     */
    public String getFunctionOfDownKey() {
        return functionOfDownKey;
    }

    /**
     * 返回下键的功能
     * @return
     */
    public void setFunctionOfDownKey(String functionOfDownKey) {
        if (functionOfDownKey == null) {
            throw new NullPointerException();
        }
        this.functionOfDownKey = functionOfDownKey;
    }

    /**
     * 查找是否可以线控
     * @return
     */
    public boolean isWireControl() {
        return isWireControl;
    }

    /**
     * 是否可以播放下一首，可以就是true，否则是false
     * @return
     */
    public boolean playNext() {
        if (isWireControl) {
            System.out.println("Using up key for " + functionOfUpKey + ", using down key for " + functionOfDownKey);
            return true;
        } else {
            return false;
        }
    }
}
