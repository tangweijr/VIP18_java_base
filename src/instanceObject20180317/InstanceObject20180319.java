package instanceObject20180317;//import twentyClass20180321.*;

import java.util.Calendar;

/**
 * new对象，并测试API
 */
public class InstanceObject20180319 {
    public static void main(String[] args) {
        int index = 0;

        System.out.println("No. "+index++ +" class");
        Phone xiaomi = new Phone();
        xiaomi.setIoSystem("miui");
        xiaomi.showSystem();

        System.out.println("No. "+index++ +" class");
        AirConditioner geli = new AirConditioner();
        geli.setWorkVote(220);
        geli.setTemperatureSet(26);

        System.out.println("No. "+index++ +" class");
        Computer lianxiang = new Computer();
        lianxiang.setOperatingSystem("Windows10");
        lianxiang.setScreenInch(15.7);
        lianxiang.open();

        System.out.println("No. "+index++ +" class");
        QQAccount myqq = new QQAccount(982743544);
        myqq.setFriendList(new String[]{"老板", "老婆", "丈母娘"});
        myqq.showAllFriends();

        System.out.println("No. "+index++ +" class");
        DoorLocker ruyimensuo = new DoorLocker();
        ruyimensuo.openByPassWord("loveYourHome");
        ruyimensuo.openByPassWord("loveMyHome");

        System.out.println("No. "+index++ +" class");
        PhoneCharger kuaichong = new PhoneCharger(4000);
        kuaichong.charger(xiaomi);

        System.out.println("No. "+index++ +" class");
        Headset akg = new Headset("buletooth",false);
        akg.setFunctionOfUpKey("上一曲");
        akg.setFunctionOfDownKey("下一曲");
        akg.playNext();

        System.out.println("No. "+index++ +" class");
        Car ford = new Car();
        ford.mileage = 5000;
        System.out.println(ford.isNewCar());
        ford.mileage = 30000;
        System.out.println(ford.isNewCar());

        System.out.println("No. "+index++ +" class");
        Penicillin toubao = new Penicillin();
//        toubao.contentGram = 2;
        System.out.println(toubao.dose(14));

        System.out.println("No. "+index++ +" class");
        RiceCooker meidi = new RiceCooker();
        meidi.light="red!!!";
        meidi.setFunctions("正常");
//        meidi.cook();
//        meidi.cook();
//        meidi.cook();
//        meidi.cook();
        meidi.noticePhone();

        System.out.println("No. "+index++ +" class");
        Weather njWeather = new Weather(Calendar.getInstance());
        njWeather.showTodayWeather();

        System.out.println("No. "+index++ +" class");
        School njau = new School();
        njau.isOpen(njWeather);

        System.out.println("No. "+index++ +" class");
        Teacher yuwen = new Teacher();
        yuwen.setLevel("高级");
        yuwen.teachingAge = 4;
        yuwen.editPapers();

        System.out.println("No. "+index++ +" class");
        Light taideng = new Light(true, 3, "white", 4000);
        taideng.level();

        System.out.println("No. "+index++ +" class");
        Ecoli o157 = new Ecoli(false, new double[]{2.0, 2.0}, true);
        o157.multiplicationTime();

//        System.out.println("No. "+index++ +" class");
//        Animal wugui = new Animal("乌龟", 120, false);
//        wugui.show();
//
//        System.out.println("No. "+index++ +" class");
//        Mammal tuzi = new Mammal("小白兔", 10);
//        tuzi.viviparous();
//
//        System.out.println("No. "+index++ +" class");
//        Cat mimi = new Cat();
//        mimi.breastFeeding();
//
//        System.out.println("No. "+index++ +" class");
//        Fish daiyu = new Fish("", 10, false);
//        daiyu.type = "海鱼";
//        daiyu.eat();

        System.out.println("No. "+index++ +" class");
        PichiaPastoris gs115 = new PichiaPastoris("酒精型", false, "white");
        gs115.usage();

    }
}