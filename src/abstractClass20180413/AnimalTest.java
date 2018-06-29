package abstractClass20180413;

import java.util.ArrayList;

/**
 * 测试类
 * @author tangweijr
 * @since 20180413
 * @version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        /*
        通过ArrayList加入子类对象，多态调用方法
         */
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Salmon("小丑"));
        animalArrayList.add(new Salmon("大王八"));
        animalArrayList.add(new Husky("二哈"));
        animalArrayList.add(new Husky("小汪"));
        for (Animal animal : animalArrayList) {
            animal.show();
        }
    }
}
