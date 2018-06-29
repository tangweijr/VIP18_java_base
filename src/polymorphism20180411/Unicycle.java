package polymorphism20180411;

/**
 * 独轮车
 */
public class Unicycle extends Cycle {
	@Override
	public String toString() {
		return "Unicycle";
	}
	
	public void balance() {
		super.balance();
	}
}
