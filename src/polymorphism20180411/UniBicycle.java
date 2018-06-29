package polymorphism20180411;

/**
 * 独特的两轮车，继承两轮车
 */
public class UniBicycle extends Bicycle {
	public String toString() {
		return "Bicycle";
	}
	
	public void balance() {
		super.balance();
	}

	public void speed() {
		System.out.println("unibicycle max speed is more than 20 kmh");
	}
}
