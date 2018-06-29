package interfaceExercise20180414;

import java.sql.JDBCType;

/**
 * 测试类
 * @author tangweijr
 * @since 20180414
 */
public class MovieActorTest {
    public static void main(String[] args) {
        Hero gangtiexia = new Hero("钢铁侠");
        gangtiexia.fly();
        gangtiexia.fight();
        gangtiexia.laser();
        Soldier leien = new Soldier("大兵雷恩");
        leien.drive();
        leien.fight();
        leien.cover(new Soldier("琼斯"));
    }
}
