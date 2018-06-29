package polymorphism20180411;

/**
 * 车类，用于扩展
 */
public class Cycle {
    /**
     * 返回轮子的数量
     * @param c 车的类型
     * @return 轮子数量
     */
	private static int wheels(Cycle c) {
		if(c instanceof Bicycle) {
			return 2;
		}else if(c instanceof Unicycle) {
			return 1;
		}else if(c instanceof Tricycle) {
			return 3;
		}
		return 0;
	}

    /**
     * 骑车方法
     * @param c 车的类型
     */
	static void ride(Cycle c) {
		System.out.println("Class is: " + c + ". It has " + wheels(c) + " wheels");
	} 
	
	public void balance() {
		System.out.println(this + " balance");
	}

	private void show() {

	}
}
