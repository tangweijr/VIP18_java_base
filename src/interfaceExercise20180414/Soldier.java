package interfaceExercise20180414;

/**
 * 士兵类，继承演员类，实现驾驶、战斗接口
 * @author tangweijr
 * @since 20180414
 */
public class Soldier extends MovieActer implements Fightable, Driveable {
    public Soldier(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "'s " + super.toString() + ", he/she can shoot and drive tank";
    }

    @Override
    public void drive() {
        System.out.println(this + ".\nNow is driving tank in battlefield");
    }

    @Override
    public void fight() {
        System.out.println(this + ".\nNow is shooting to kill enemy");
    }

    public void cover(Soldier soldier) {
        System.out.println("Now is cover you team: " + soldier.name + ", go fight them all!");
    }
}
