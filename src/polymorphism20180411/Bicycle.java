package polymorphism20180411;

/**
 * 两轮车
 */
public class Bicycle extends Cycle {
	@Override
	public String toString() {
		return "Bicycle";
	}
	
	public void balance() {
		super.balance();
	}

	public void speed() {
        System.out.println("bicycle max speed is 20 kmh");
    }
}
