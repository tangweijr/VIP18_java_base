package interfaceExercise20180414;

/**
 * 英雄类，继承演员类，实现飞、战斗接口
 * @author tangweijr
 * @since 20180414
 */
public class Hero extends MovieActer implements Fightable, Flyable, Laserable {
    public Hero(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "'s " + super.toString() + ", he/she can fly and fight";
    }

    @Override
    public void fight() {
        System.out.println(this + ".\nNow is fighting with bad guy");
    }

    @Override
    public void fly() {
        System.out.println(this + ".\nNow is flying around the world");
    }

    @Override
    public void laser() {
        System.out.println("Now is shoot laser attract people");
    }
}
