package instanceObject20180317;

import java.util.Calendar;
import java.util.Locale;

/**
 * 20个类，每个3个属性3个方法
 * @author tangweijr
 * @since 20180318
 */
public class ClassCreater20180317 {
    public static void main(String[] args) {

    }
}

/**
 * 0.手机
 */
class Phone {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;
    private double inchSize;

    public String getIoSystem() {
        return ioSystem;
    }

    public void setIoSystem(String ioSystem) {
        this.ioSystem = ioSystem;
    }

    private String ioSystem;

    /**
     * 打电话
     * @param phoneNumber
     */
    public void call(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            System.out.println("Dial phone " + phoneNumber);
        }
    }

    /**
     * 接电话
     * @param phoneNumber
     */
    public void answer(String phoneNumber) {
        System.out.println(phoneNumber + " 's coming call");
    }

    /**
     * 查看系统信息
     */
    public void showSystem() {
        System.out.println("this phone's system is " + ioSystem);
    }
}

/**
 * 1.空调
 */
class AirConditioner {
    public int getWorkVote() {
        return workVote;
    }

    public void setWorkVote(int workVote) {
        this.workVote = workVote;
    }

    private int workVote;
    private String color;
    private double temperatureSet;

    /**
     * 根据区域设定空调的电压
     * @param locale
     */
    public void setWorkVote(Locale locale) {
        if (locale == Locale.CHINA) {
            this.workVote = 220;
        } else if (locale == Locale.JAPAN) {
            this.workVote = 110;
        }
    }

    /**
     * 获得当前设定温度
     * @return
     */
    public double getTemperatureSet() {
        return temperatureSet;
    }

    /**
     * 设定温度，并包含有范围
     * @param temperatureSet
     */
    public void setTemperatureSet(double temperatureSet) {
        if (temperatureSet <= 16) {
            this.temperatureSet = 16;
        } else if (temperatureSet >= 30) {
            this.temperatureSet = 30;
        } else {
            this.temperatureSet = temperatureSet;
        }
    }


}

/**
 * 2.电脑
 */
class Computer {
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    private String operatingSystem;
    private int batteryCapacity;

    public double getScreenInch() {
        return screenInch;
    }

    public void setScreenInch(double screenInch) {
        this.screenInch = screenInch;
    }

    private double screenInch;

    /**
     * 开机
     * @return 是否正常开机
     */
    public boolean open() {
        try {
            System.out.println("Opening");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 关机
     */
    public void close() {
        System.out.println("Closing");
    }

    /**
     * 延迟关机
     * @param delayTimeMillSec
     */
    public void close(long delayTimeMillSec) {
        try {
            System.out.println("System will close ");
            Thread.sleep(delayTimeMillSec);
            System.out.println("Closing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 3.QQ账户
 */
class QQAccount {
    private final long UID;

    private String nickname;

    public String[] getFriendList() {
        return friendList;
    }

    public void setFriendList(String[] friendList) {
        this.friendList = friendList;
    }

    private String[] friendList;

    /**
     * 构造器
     * @param UID 一旦初始化，不能再改变
     */
    public QQAccount(long UID) {
        this.UID = UID;
    }

    /**
     * 获得QQ号码
     * @return
     */
    public long getUID() {
        return UID;
    }

    /**
     * 展示列表里所有的好友
     */
    public void showAllFriends() {
        for (String s : friendList) {
            System.out.println(s);
        }
    }

}

/**
 * 4.门锁
 */
class DoorLocker {
    private String passWord;
    private String keyType;
    private String securityLevel;
    private double price;

    /**
     * 是否可以用卡片开门
     * @return
     */
    public boolean canOpenByCard() {
        if (keyType.equals("Card") || keyType.equals("Fingerprint")) {
            return true;
        } else {
            return false;
        }
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
}

/**
 * 5.智能充电宝
 */
class PhoneCharger {
    private int mAh;
    private double inputVote;
    private double outputVote;

    /**
     * 构造函数，输入容量
     * @param mAh 毫安时
     */
    public PhoneCharger(int mAh) {
        this.mAh = mAh;
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

/**
 * 6.耳机
 */
class Headset {
    private String type;
    private boolean isWireControl;

    public String getFunctionOfUpKey() {
        return functionOfUpKey;
    }

    public void setFunctionOfUpKey(String functionOfUpKey) {
        this.functionOfUpKey = functionOfUpKey;
    }

    public String getFunctionOfDownKey() {
        return functionOfDownKey;
    }

    public void setFunctionOfDownKey(String functionOfDownKey) {
        this.functionOfDownKey = functionOfDownKey;
    }

    private String functionOfUpKey;
    private String functionOfDownKey;

    /**
     * 构造函数
     * @param s 耳机的种类
     * @param b 是否可以线控
     */
    public Headset(String s, boolean b) {
        this.type = s;
        this.isWireControl = b;
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
            System.out.println("using up key for " + functionOfUpKey + "using down key for " + functionOfDownKey);
            return true;
        } else {
            return false;
        }
    }
}

/**
 * 7.汽车
 */
class Car {
    private String brand;
    private double price;
    private String color;
    public double mileage;

    /**
     * 点火
     * @return 返回点火方式
     */
    public String switchOnType() {
        if (brand.equals("BMW") || brand.equals("AUDI") || price > 40) {
            return "Electronic ignition";
        } else {
            return "Key ignition";
        }
    }

    /**
     * 喇叭声
     * @return
     */
    public String beepSound() {
        return "di~~~di~~~";
    }

    /**
     * 按照里程判断车的新旧程度
     * @return 判断结果
     */
    public String isNewCar() {
        if (mileage <= 0) {
            return "just buy, not run";
        }else if (mileage > 0 && mileage < 100) {
            return "just buy";
        } else if (mileage < 500) {
            return "using several times";
        } else if (mileage < 10000) {
            return "using one year";
        } else if (mileage < 30000) {
            return "using almost two years, attention to maintenance";
        } else if (mileage < 50000) {
            return "need first repair";
        } else if (mileage < 10000) {
            return "ennnnn, not easy to sell";
        } else {
            return "driving about 5-10 years";
        }
    }
}

/**
 * 8.青霉素
 */
class Penicillin {
    public String[] commonName;
    public String formulation;
    public double contentGram;

    /**
     * 显示所有商品名
     */
    public void showCommonName() {
        for (int i = 0; i < commonName.length; i++) {
            String s = commonName[i];
            System.out.println("No " + i + " common name is " + commonName[i]);
        }
    }

    /**
     * 剂型
     * @return 返回剂型
     */
    public String getFormulation() {
        return formulation;
    }

    /**
     * 输入年龄，返回计量
     * @param age 年龄
     * @return 计量
     */
    public double dose(int age) {
        if (age < 1) {
            return -1;
        } else if (age < 3) {
            return contentGram/12;
        } else if (age < 12) {
            return contentGram / 6;
        } else if (age < 18) {
            return contentGram / 2;
        } else {
            return contentGram;
        }
    }
}

/**
 * 9.电饭锅
 */
class RiceCooker {
    public final String[] functions={"正常","快煮","粥","稀饭","锅巴"};
    private double countDownTime;
    private int vote;
    public String light;

    /**
     * 是否已经煮好饭
     * @return
     */
    public boolean remind() {
        if (countDownTime == 0) {
            System.out.println("di~~~di~~~ and light " + light + " is on");
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
}

/**
 * 10.天气
 */
class Weather {
    public final String[] WEATHER = {"晴天", "多云", "雨", "雪"};
    public String todayWeather;
    public double temperature;
    public double humidity;
    public String city;
    public Calendar day;

    /**
     * 构造器，输入数据
     * @param city 城市
     * @param temperature 温度
     * @param humidity 湿度
     */
    public Weather(String city, double temperature, double humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
        if (temperature > 0 && humidity < 20) {
            this.todayWeather = WEATHER[0];
        } else if (temperature > 0 && humidity < 40) {
            this.todayWeather = WEATHER[1];
        } else if (temperature > 0 && humidity < 100) {
            this.todayWeather = WEATHER[2];
        } else if (temperature < 0) {
            this.todayWeather = WEATHER[3];
        }
    }

    public Weather(Calendar instance) {
        this.day = instance;
    }

    /**
     * 显示当前时间和日期
     * @return 返回天气
     */
    public String showTodayWeather() {
        String today = "todoy is " + day.getTime().toLocaleString() + ", in city " + city + " the temperature is " + temperature
                + " and the humidity is " + humidity;
        if (temperature > 0) {
            System.out.println(today);
        } else {
            System.err.println(today);
        }
        return today;
    }

    /**
     * 雨雪天气警报
     */
    public boolean weatherWarning() {
        if (temperature < 0 && humidity > 60) {
            System.err.println("today may snowing, be careful");
            return true;
        } else {
            return false;
        }
    }
}

/**
 * 11.学校
 */
class School {
    private String schoolName;
    private String schoolAddress;
    private String schoolPhoneNumber;

    /**
     * 今天是否上课
     * @param weather 天气
     * @return
     */
    public boolean isOpen(Weather weather) {
        if (weather.weatherWarning()) {
            System.out.println("because of weather warning, school may not be open today");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 选课人数是否达到要求
     * @param selectedNumber 选课人数
     * @return
     */
    public boolean courseOpen(int selectedNumber) {
        if (selectedNumber < 40) {
            System.out.println("sorry, this course don't have enough student select, will not open");
            return false;
        } else {
            System.out.println("now " + selectedNumber + "student select this course,it  will not open");
            return false;
        }
    }

    /**
     * 当期日期是否在假期
     * @return
     */
    public boolean isHoliday() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getTime().getMonth() == Calendar.JULY && calendar.getTime().getMonth() == Calendar.AUGUST) {
            System.out.println("in summer holiday");
            return false;
        } else if (calendar.getTime().getMonth() == Calendar.JANUARY && calendar.getTime().getMonth() == Calendar.FEBRUARY) {
            System.out.println("in winter holiday");
            return false;
        } else {
            return true;
        }
    }
}

/**
 * 12.老师
 */
class Teacher {
    private String type;
    public int teachingAge;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String level;

    /**
     * 上课
     */
    public void duringClass() {
        if (teachingAge < 2) {
            System.out.println("照着书本上课");
        } else if (teachingAge < 5) {
            System.out.println("照着ppt上课");
        } else if (teachingAge < 10) {
            System.out.println("无书胜有书，基本不用看就能上课");
        }
    }

    /**
     * 职称
     */
    public void jobTitle() {
        if (!type.equals("语文") || !type.equals("数学") || !type.equals("英语")) {
            if (teachingAge < 3) {
                level = "初级";
            } else if (teachingAge < 5) {
                level = "中级";
            } else if (teachingAge < 8) {
                level = "高级";
            } else if (teachingAge > 10 && type.equals("主任")) {
                level = "特级";
            }
        } else {
            if (teachingAge < 2) {
                level = "初级";
            } else if (teachingAge < 5) {
                level = "中级";
            }
        }
    }

    /**
     * 出试卷
     * @return
     */
    public boolean editPapers() {
        if (level.equals("中级") || level.equals("高级") || level.equals("特级")) {
            if (teachingAge < 2) {
                System.out.println("只允许核对考卷");
            } else if (teachingAge < 5) {
                System.out.println("可以单独出试卷");
            } else {
                System.out.println("可以审核试卷");
            }
            return true;
        } else {
            return false;
        }
    }
}

/**
 * 13.灯
 */
class Light {
    private boolean isOn;
    private int brightLevel;
    private String lightColor;
    private int powermAh;

    /**
     * 开、关
     * @param state 目前状态
     */
    public void setOn(boolean state) {
        isOn = !state;
    }

    /**
     * 状态
     * @return 返回状态
     */
    public boolean isOn() {
        return isOn;
    }

    /**
     * 亮度等级
     * @return
     */
    public int level() {
        if (powermAh < 300 && brightLevel == 1) {
            return -1;
        } else {
            return brightLevel;
        }
    }

    /**
     * 构造器
     * @param state 开/关
     * @param brightLevel 亮度等级
     * @param lightColor 颜色
     * @param powermAh 电池容量
     */
    public Light(boolean state, int brightLevel, String lightColor, int powermAh) {
        this.isOn = state;
        this.brightLevel = brightLevel;
        this.lightColor = lightColor;
        this.powermAh = powermAh;
    }
}

/**
 * 14.大肠杆菌
 */
class Ecoli {
    private boolean gramNegative;
    private double[] size;
    private boolean isPathogenicBacteria;

    /**
     * 构造器
     * @param g 革兰氏阴性菌
     * @param size 大小
     * @param isPB 致病菌
     */
    public Ecoli(boolean g, double[] size, boolean isPB) {
        this.gramNegative = g;
        for (int i = 0; i < size.length; i++) {
            this.size[i] = size[i];
        }
        this.isPathogenicBacteria = isPB;
    }

    /**
     * 倍增时间
     * @return
     */
    public int multiplicationTime() {
        System.out.println("every 20 mins Multiplication one generation");
        return 20;
    }

    /**
     * 是否含有质粒
     * @param type 菌种类型
     * @return
     */
    public boolean hasPlasmids(String type) {
        if (type.equals("Engineering bacteria")) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * 15.动物
 */
class Animal {
    private String name;
    private int maxAge;
    private boolean isMammal;

    /**
     * 最大年龄
     * @return
     */
    public int getMaxAge() {
        return maxAge;
    }

    /**
     * 设定最大年龄范围
     * @param maxAge 该动物的最大年龄
     * @return
     */
    public int setMaxAge(int maxAge) {
        if (maxAge < 0) {
            return 1;
        } else if (maxAge > 200) {
            return 200;
        } else {
            return maxAge;
        }
    }

    /**
     * 默认构造器
     */
    public Animal() {
        this.name = "";
        this.maxAge = setMaxAge(1);
        this.isMammal = true;
    }

    /**
     * 构造器
     * @param name 名称
     * @param maxage 最大年龄
     * @param b 是否是哺乳动物
     */
    public Animal(String name, int maxage, boolean b) {
        this.name = name;
        this.maxAge = setMaxAge(maxage);
        this.isMammal = b;
    }

    public void bark(){};

    public void run(){};
}

/**
 * 16.哺乳动物
 */
class Dog extends Animal {
    private int babyMaxAge;
    private int bornMaxNumber;
    private String livingEnvironment;

    /**
     * 默认构造器
     */
    public Dog() {
        super();
    }

    /**
     * 传递参数，调用父类构造器
     * @param name 名称
     * @param maxage 最大年龄
     */
    public Dog(String name, int maxage) {
        super(name, maxage, true);
    }

    public void bark() {

    }

    public void run() {

    }

    public void sleep() {

    }

    public void eat() {

    }

    public void liveAt() {

    }

    public void viviparous() {
        System.out.println("哺乳动物都是胎生:");
    }

    public void breastFeeding() {
        System.out.println("哺乳动物都会哺乳:");
    }
}

/**
 * 17.猫，继承哺乳动物
 */
class Cat extends Dog{
    private String foodType;
    private boolean isHouseCat;
    private String sex;

    public Cat() {
        super("", 1);
    }

    public Cat(String name, String foodType, boolean isHouseCat, String sex) {
        super(name, 10);
        this.foodType = foodType;
        this.isHouseCat = isHouseCat;
        this.sex = sex;
    }

    public void bark() {
        System.out.println("喵喵");
    }

    public void sleep() {
        System.out.println("喜欢睡在暖和的地方，经常缩成一团，一天中有14～15小时在睡眠中度过");
    }

    public void eat() {
        System.out.println("要吃猫粮和小鱼干");
    }

    public void viviparous() {
        super.viviparous();
        System.out.println("母猫一胎最多能生12个，最少能生2个，一般都是3～6个，体力好的猫一年能生2次");
    }

    public void breastFeeding() {
        super.breastFeeding();
        System.out.println("幼猫从4周龄之前都在吃奶");
    }
}

/**
 * 18.鱼，继承动物
 */
class Salmon extends Animal {
    private String type;
    private boolean isLiveInOcean;
    private boolean isMammal;//比如鲸鱼
    /**
     * 默认构造器
     */
    public Salmon() {
        super("", 1, false);
    }

    /**
     * 构造器
     *
     * @param name   名称
     * @param maxage 最大年龄
     */
    public Salmon(String name, int maxage, boolean b) {
        super(name, maxage, b);
    }

    public void run() {
        System.out.println("鱼都会游泳");
    }

    public void sleep() {
        System.out.println("鱼都在水中睡觉");
    }

    public void eat() {
        System.out.println("鱼在水里吃东西");
    }

    public void bark() {
        // TODO Auto-generated method stub
        System.out.println("鱼不会叫");
    }

    public void liveAt() {
        // TODO Auto-generated method stub
        System.out.println("鱼生活在水中");
    }

    public void viviparous() {
        // TODO Auto-generated method stub
        System.out.println("No!鱼是卵生");
    }

    public void breastFeeding() {
        // TODO Auto-generated method stub
        System.out.println("No!鱼不会哺乳");
    }
}

/**
 * 19.酵母
 */
class PichiaPastoris {
    private String strainName;
    private boolean isMethanolUtilizationPlus;
    private String colorInPlant;

    /**
     * 构造器
     * @param s 名称
     * @param isMUP 利用甲醇的类型
     * @param colorInPlant 菌落的颜色
     */
    public PichiaPastoris(String s, boolean isMUP, String colorInPlant) {
        this.strainName = s;
        this.isMethanolUtilizationPlus = isMUP;
        this.colorInPlant = colorInPlant;
    }

    /**
     * 发酵的方式
     * @param oxygenLevel 氧气含量
     */
    public void fermentation(int oxygenLevel) {
        System.out.println("可以用来做面包");
        if (oxygenLevel < 20) {
            System.out.println("产生酒精，面包酸酸的");
        } else {
            System.out.println("产生乳酸，降解成糖，面包甜甜的");
        }
    }

    /**
     * 用处
     */
    public void usage() {
        if (strainName.equals("甜酒型")) {
            System.out.println("用于酿酒酿");
        } else if (strainName.equals("酒精型")) {
            System.out.println("用于酿米酒");
        }
    }
}